package heap;

import org.jetbrains.annotations.NotNull;

import java.util.PriorityQueue;

/**
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k,
 * return the k closest points to the origin (0, 0).
 * The distance between two points on the X-Y plane is the Euclidean distance
 * (i.e., √(x1 - x2)2 + (y1 - y2)2).
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in)
 */
public class NearbyKElements {

    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSq;

        public Point(int x, int y, int distSq) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
        }

        @Override
        public int compareTo(Point p2){
            return this.distSq - p2.distSq;
        }

    }
    public int[][] kClosest(int[][] points, int k) {
        int [][] result = new int[k][2];

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for(int i = 0; i<points.length; i++){
            int distSq = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            pq.add( new Point(points[i][0], points[i][1], distSq));
        }

        for( int i = 0; i<k; i++){
            Point p = pq.remove();
            result[i][0] = p.x;
            result[i][1] = p.y;
        }

        return result;
    }
}
