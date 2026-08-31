package aceptaelreto;

import java.io.*;
import java.util.*;

public class LasLucesEnElRio_725 {

	private static class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1 << 16];
		private int ptr = 0;
		private int len = 0;

		private int read() throws IOException {
			if (ptr >= len) {
				len = in.read(buffer);
				ptr = 0;
				if (len <= 0) {
					return -1;
				}
			}
			return buffer[ptr++];
		}

		Integer nextInt() throws IOException {
			int c;
			do {
				c = read();
				if (c == -1) {
					return null;
				}
			} while (c <= ' ');

			int sign = 1;
			if (c == '-') {
				sign = -1;
				c = read();
			}

			int value = 0;
			while (c > ' ') {
				value = value * 10 + c - '0';
				c = read();
			}
			return value * sign;
		}
	}

	private static ArrayList<Long>[] candidates;
	private static boolean[] placed;
	private static int pairs;

	public static void main(String[] args) throws Exception {
		FastScanner in = new FastScanner();
		StringBuilder out = new StringBuilder();
		Integer next;

		while ((next = in.nextInt()) != null) {
			int n = next;
			out.append(solveCase(in, n)).append('\n');
		}

		System.out.print(out.toString());
	}

	@SuppressWarnings("unchecked")
	private static long solveCase(FastScanner in, int n) throws IOException {
		pairs = n / 2;
		int[] required = new int[n];
		long[] fixedMask = new long[pairs + 1];
		int[] fixedCount = new int[pairs + 1];
		boolean impossible = false;

		for (int i = 0; i < n; i++) {
			int color = in.nextInt();
			required[i] = color;

			if (color != 0) {
				if (color > pairs) {
					impossible = true;
				} else {
					fixedMask[color] |= 1L << i;
					fixedCount[color]++;
					if (fixedCount[color] > 2) {
						impossible = true;
					}
				}
			}
		}

		if (impossible) {
			return 0;
		}

		candidates = new ArrayList[pairs + 1];
		for (int color = 1; color <= pairs; color++) {
			candidates[color] = new ArrayList<Long>();

			for (int left = 0; left + color < n; left++) {
				int right = left + color;
				if (canUse(required[left], color) && canUse(required[right], color)) {
					long mask = (1L << left) | (1L << right);
					if ((mask & fixedMask[color]) == fixedMask[color]) {
						candidates[color].add(mask);
					}
				}
			}

			if (candidates[color].isEmpty()) {
				return 0;
			}
		}

		placed = new boolean[pairs + 1];
		return countWays(0L, 0);
	}

	private static boolean canUse(int requiredColor, int color) {
		return requiredColor == 0 || requiredColor == color;
	}

	private static long countWays(long used, int placedCount) {
		if (placedCount == pairs) {
			return 1;
		}

		int bestColor = -1;
		int bestOptions = Integer.MAX_VALUE;

		for (int color = 1; color <= pairs; color++) {
			if (!placed[color]) {
				int options = 0;
				ArrayList<Long> colorCandidates = candidates[color];
				for (int i = 0; i < colorCandidates.size(); i++) {
					if ((colorCandidates.get(i) & used) == 0) {
						options++;
					}
				}

				if (options == 0) {
					return 0;
				}
				if (options < bestOptions) {
					bestOptions = options;
					bestColor = color;
				}
			}
		}

		long ways = 0;
		placed[bestColor] = true;
		ArrayList<Long> bestCandidates = candidates[bestColor];
		for (int i = 0; i < bestCandidates.size(); i++) {
			long mask = bestCandidates.get(i);
			if ((mask & used) == 0) {
				ways += countWays(used | mask, placedCount + 1);
			}
		}
		placed[bestColor] = false;

		return ways;
	}
}
