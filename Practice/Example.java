package Practice;

import java.util.*;
public class Example {

    public static int ar[] = new int[1000];
    public static int way(int currIdx, int n){
        if(currIdx==n){
            return 1;
        }
        if(currIdx>n){
            return 0;
        }

        if(ar[currIdx]!=-0){
            return ar[currIdx];
        }

        int val1 = way(currIdx+1,n)+way(currIdx+2,n)+way(currIdx+3,n);
        return ar[currIdx]=val1;
    }

    public static void main(String[] args){

        System.out.println(way(0,20));
    }
    
}
