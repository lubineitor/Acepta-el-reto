package aceptaelreto;

import java.io.*;
import java.util.*;

public class ElAbueloCentenarioTLE_782 {
	
	static class Obstacle {
		char type;
		long x;
		long y;
		long x2;

		public Obstacle(char type, long x, long y, long x2) {
			this.type = type;
			this.x = x;
			this.y = y;
			this.x2 = x2;
		}
	}

	static class Interval {
		long start, end;

		public Interval(long s, long e) {
			this.start = s;
			this.end = e;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {
			line = line.trim();
			if (line.isEmpty())
				continue;
			String[] parts = line.split("\\s+");
			long W = Long.parseLong(parts[0]);
			long H = Long.parseLong(parts[1]);
			int n = Integer.parseInt(parts[2]);
			if (W == 0 && H == 0 && n == 0)
				break;

			List<Obstacle> obstacles = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				line = br.readLine().trim();
				parts = line.split("\\s+");
				char type = parts[0].charAt(0);
				if (type == 'G') {
					long x = Long.parseLong(parts[1]);
					long y = Long.parseLong(parts[2]);
					obstacles.add(new Obstacle(type, x, y, x));
				} else if (type == 'V') {
					long x = Long.parseLong(parts[1]);
					long y = Long.parseLong(parts[2]);
					long ancho = Long.parseLong(parts[3]);
					long alto = Long.parseLong(parts[4]);
					obstacles.add(new Obstacle(type, x, y, x + ancho));
				}
			}

			TreeSet<Long> candidates = new TreeSet<>();
			candidates.add(H);
			for (Obstacle obs : obstacles) {
				long dCandidate = H - obs.y;
				if (dCandidate > 0)
					candidates.add(dCandidate);
			}

			long bestArea = 0;
			for (long d : candidates) {
				long T = H - d;
				List<Interval> intervals = new ArrayList<>();
				for (Obstacle obs : obstacles) {
					if (obs.y > T) {
						if (obs.type == 'V') {
							intervals.add(new Interval(obs.x, obs.x2));
						} else if (obs.type == 'G') {
							intervals.add(new Interval(obs.x, obs.x));
						}
					}
				}

				Collections.sort(intervals, new Comparator<Interval>() {
					public int compare(Interval a, Interval b) {
						if (a.start != b.start)
							return Long.compare(a.start, b.start);
						return Long.compare(a.end, b.end);
					}
				});

				List<Interval> merged = new ArrayList<>();
				for (Interval intv : intervals) {
					if (merged.isEmpty()) {
						merged.add(new Interval(intv.start, intv.end));
					} else {
						Interval last = merged.get(merged.size() - 1);
						if (intv.start <= last.end) {
							if (intv.end > last.end)
								last.end = intv.end;
						} else {
							merged.add(new Interval(intv.start, intv.end));
						}
					}
				}

				long maxSafe = 0;
				long leftBoundary = 0;
				if (!merged.isEmpty()) {
					long gap = merged.get(0).start - leftBoundary;
					if (gap > maxSafe)
						maxSafe = gap;
					for (int i = 1; i < merged.size(); i++) {
						gap = merged.get(i).start - merged.get(i - 1).end;
						if (gap > maxSafe)
							maxSafe = gap;
					}
					gap = W - merged.get(merged.size() - 1).end;
					if (gap > maxSafe)
						maxSafe = gap;
				} else {
					maxSafe = W;
				}

				long area = d * maxSafe;
				bestArea = Math.max(bestArea, area);
			}

			System.out.println(bestArea);
		}
	}
}