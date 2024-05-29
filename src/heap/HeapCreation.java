package heap;

import java.util.ArrayList;

public class HeapCreation {

    static class Heap {
        ArrayList<Integer> arrayList = new ArrayList<>();

        public void add(int data){
            arrayList.add(data);

            int x = arrayList.size()-1; // x at child index
            int par = (x-1)/2;  //parent index

            while (arrayList.get(x) < arrayList.get(par)){  //log(n)
//                int temp = arrayList.get(par);
//                arrayList.set(par,arrayList.get(x));
//                arrayList.set(x,temp);

                //swap
                int temp = arrayList.get(x);
                arrayList.set(x, arrayList.get(par));
                arrayList.set(par,temp);
                x = par;
                par = (x-1)/2;
            }
        }
        public int peek( ){
            return arrayList.get(0);
        }

        public int remove(){
            int data = arrayList.get(0);
            int lastIndex = arrayList.size()-1;

            int temp = arrayList.get(0);
            arrayList.set(0,arrayList.get(lastIndex));
            arrayList.set(lastIndex,temp);

            arrayList.remove(lastIndex);
            
            heapify(0);
            return data;
        }

        private void heapify(int i) {
            int left = 2*i +1;
            int right = 2*i +2;
            int minIdx = i;

            if (left < arrayList.size() && arrayList.get(minIdx) > arrayList.get(left)){
                minIdx = left;
            }

            if (right < arrayList.size() && arrayList.get(minIdx) > arrayList.get(right)){
                minIdx = right;
            }

            if (minIdx != i){
                //swap
                int temp  = arrayList.get(i);
                arrayList.set(i,arrayList.get(minIdx));
                arrayList.set(minIdx,temp);
                heapify(minIdx);
            }
        }

        public boolean isEmpty(){
            return arrayList.isEmpty();
        }

    }

    public static void main(String[] args){

        Heap hp = new Heap();
        hp.add(3);
        hp.add(4);
        hp.add(1);
        hp.add(5);


        while(!hp.isEmpty()){
            System.out.println(hp.peek());
            hp.remove();
        }
    }


}
