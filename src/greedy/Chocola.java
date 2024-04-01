package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Chocola {
    public void ChocolaMain(){
        int n = 4,m = 6;
        Integer[] costVer = {2,1,3,1,4};
        Integer[] costHor = {4,1,2};

        Arrays.sort(costVer, Comparator.reverseOrder());
        Arrays.sort(costHor, Comparator.reverseOrder());


        int h =0, v =0;
        int hp = 1,vp = 1;
        int cost = 0;

        while (h<costHor.length && v<costVer.length){

            if(costVer[v] > costHor[h]){
                //  cost += (h + 1) * costHor[h];
                cost += (hp * costVer[v]);
                vp++;
                v++;
            }else{
                //cost += (v + 1) * costVer[v];
                cost += (vp * costHor[h]);
                hp++;
                h++;
            }
        }

        while (h<costHor.length){
            cost += (vp * costHor[h]);
            hp++;
            h++;
        }

        while (v<costVer.length){
            cost += (hp * costVer[v]);
            vp++;
            v++;
        }

        System.out.println(cost);
    }
}
