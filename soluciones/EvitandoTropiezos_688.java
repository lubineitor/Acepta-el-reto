package aceptaelreto;

import java.io.*;

public class EvitandoTropiezos_688 {

	 private static class FastReader {
	        private final int BUFFER_SIZE = 1 << 16;
	        private final DataInputStream din;
	        private final byte[] buffer;
	        private int bufferPointer, bytesRead;

	        public FastReader() {
	            din = new DataInputStream(System.in);
	            buffer = new byte[BUFFER_SIZE];
	            bufferPointer = bytesRead = 0;
	        }

	        public int nextInt() throws IOException {
	            int ret = 0;
	            byte c = read();
	            while (c <= ' ') {
	                c = read();
	            }
	            boolean neg = (c == '-');
	            if (neg) {
	                c = read();
	            }
	            do {
	                ret = ret * 10 + c - '0';
	            } while ((c = read()) >= '0' && c <= '9');
	            return neg ? -ret : ret;
	        }

	        private byte read() throws IOException {
	            if (bufferPointer == bytesRead)
	                fillBuffer();
	            return buffer[bufferPointer++];
	        }

	        private void fillBuffer() throws IOException {
	            bytesRead = din.read(buffer, 0, BUFFER_SIZE);
	            if (bytesRead == -1)
	                buffer[0] = -1;
	            bufferPointer = 0;
	        }

	        public void close() throws IOException {
	            if (din != null)
	                din.close();
	        }
	    }

	    public static void main(String[] args) throws IOException {
	        FastReader fr = new FastReader();
	        try {
	            while (true) {
	                int c = fr.nextInt();
	                int m = fr.nextInt();
	                int n = fr.nextInt();

	                int prevHeight = fr.nextInt();
	                boolean valid = true;
	                int minDiff = Integer.MAX_VALUE;
	                int maxDiff = Integer.MIN_VALUE;
	                int prevDiff = 0;

	                for (int i = 0; i < n; i++) {
	                    int currentHeight = fr.nextInt();
	                    int diff = currentHeight - prevHeight;

	                    if (i > 0 && Math.abs(diff - prevDiff) > c) {
	                        valid = false;
	                    }

	                    if (diff < minDiff) {
	                        minDiff = diff;
	                    }
	                    if (diff > maxDiff) {
	                        maxDiff = diff;
	                    }

	                    prevDiff = diff;
	                    prevHeight = currentHeight;
	                }

	                if (maxDiff - minDiff > m) {
	                    valid = false;
	                }

	                System.out.println(valid ? "Ok" : "Tropiezo");
	            }
	        } catch (Exception e) {
	        } finally {
	            fr.close();
	        }
	    }
	}