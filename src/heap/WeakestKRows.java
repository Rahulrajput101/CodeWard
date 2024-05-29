package heap;

import java.util.PriorityQueue;

public class WeakestKRows {
    static class Soldier implements Comparable<Soldier>{
        int soldiers;
        int index;

        public Soldier(int soldiers, int index) {
            this.soldiers = soldiers;
            this.index = index;
        }
        @Override
        public int compareTo(Soldier p2){
            if (this.soldiers != p2.soldiers) {
                return this.soldiers - p2.soldiers;
            } else {
                return this.index - p2.index;
            }
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] weakestRows = new int[k];
        int numRows = mat.length;
        PriorityQueue<Soldier> pq = new PriorityQueue<>();

        for(int i =0; i< numRows; i++){
            int totalSoldier = countSoldier(mat[i]);
            pq.add( new Soldier(totalSoldier,i));
        }

        for(int i =0; i<k; i++){
            weakestRows[i] =  pq.remove().index;
        }

        return weakestRows;
    }

    private int countSoldier(int[] row){
        int count = 0;

        for( int i : row){
            if(i ==1){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
