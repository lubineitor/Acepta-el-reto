package aceptaelreto;

import java.io.*;
import java.util.*;

public class ElAbueloCentenario_782 {

	  static class Obstacle {
	        long x, x2, y;
	        public Obstacle(long x, long y, long x2) {
	            this.x = x;
	            this.y = y;
	            this.x2 = x2;
	        }
	    }
	    
	    public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter out = new PrintWriter(System.out);
	        String line;
	        
	        while ((line = br.readLine()) != null) {
	            line = line.trim();
	            if(line.isEmpty()) continue;
	            String[] parts = line.split("\\s+");
	            long W = Long.parseLong(parts[0]);
	            long H = Long.parseLong(parts[1]);
	            int n = Integer.parseInt(parts[2]);
	            if(W == 0 && H == 0 && n == 0) break;
	            
	            Obstacle[] obstacles = new Obstacle[n];
	            for (int i = 0; i < n; i++) {
	                line = br.readLine().trim();
	                parts = line.split("\\s+");
	                char type = parts[0].charAt(0);
	                if (type == 'G') {
	                    long x = Long.parseLong(parts[1]);
	                    long y = Long.parseLong(parts[2]);
	                    obstacles[i] = new Obstacle(x, y, x);
	                } else if (type == 'V') {
	                    long x = Long.parseLong(parts[1]);
	                    long y = Long.parseLong(parts[2]);
	                    long ancho = Long.parseLong(parts[3]);
	                    obstacles[i] = new Obstacle(x, y, x + ancho);
	                }
	            }
	            Arrays.sort(obstacles, new Comparator<Obstacle>() {
	                public int compare(Obstacle a, Obstacle b) {
	                    if(a.x != b.x) return Long.compare(a.x, b.x);
	                    return Long.compare(a.x2, b.x2);
	                }
	            });
	            
	            TreeSet<Long> candSet = new TreeSet<>();
	            candSet.add(H);
	            for (int i = 0; i < n; i++) {
	                long candidate = H - obstacles[i].y;
	                candSet.add(candidate);
	            }
	            long[] candidates = new long[candSet.size()];
	            int idx = 0;
	            for (long cand : candSet) {
	                candidates[idx++] = cand;
	            }
	            
	            long bestArea = 0;
	            for (long d : candidates) {
	                long T = H - d;
	                long safeGap = 0;
	                long currentEnd = 0;
	                boolean anyActive = false;
	                for (int i = 0; i < n; i++) {
	                    if (obstacles[i].y > T) {
	                        if (!anyActive) {
	                            anyActive = true;
	                            safeGap = Math.max(safeGap, obstacles[i].x - 0);
	                            currentEnd = obstacles[i].x2;
	                        } else {
	                            if (obstacles[i].x > currentEnd) {
	                                safeGap = Math.max(safeGap, obstacles[i].x - currentEnd);
	                                currentEnd = obstacles[i].x2;
	                            } else {
	                                if (obstacles[i].x2 > currentEnd) {
	                                    currentEnd = obstacles[i].x2;
	                                }
	                            }
	                        }
	                    }
	                }
	                if (!anyActive) {
	                    safeGap = W;
	                } else {
	                    safeGap = Math.max(safeGap, W - currentEnd);
	                }
	                long area = d * safeGap;
	                if (area > bestArea) bestArea = area;
	            }
	            
	            out.println(bestArea);
	        }
	        out.flush();
	        out.close();
	    }
	}
