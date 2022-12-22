import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int u = scn.nextInt();
        
        if(u<=50){
            System.out.println(u*1);
        }
        else if(u>50 && u<=150){
            System.out.println(u + (u-50)*2);
        }
        else if(u>150 && u<=250){
            System.out.println(u + 100*2 + (u-150)*3);
        }
        else if(u>250){
            System.out.println(u + 100*2 + 100*3+ (u-250)*5);
        }
    }
}