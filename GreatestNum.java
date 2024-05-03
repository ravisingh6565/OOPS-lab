import java.io.*;
public class GreatestNum {
    public static void main(String args[]) {
        System.out.println("hello Ravi sir!!");
        Console c= System.console();
        // int arr[3];
        int[] arr = new int[3];
        for(int i=0;i<3;i++){
             String num=c.readLine("enter "+(i+1)+" the number : ");
            arr[i]= Integer.parseInt(num);

        }
     
     if(arr[0]>arr[1]){
        if(arr[0]>arr[2]){
            System.out.println(arr[0]+" is greater ");
        }else{
            System.out.println(arr[2]+" is greater ");
        }
     }
    else if(arr[1]>arr[2]){
        System.out.println(arr[1]+" is greater ");
    }
    else{
        System.out.println(arr[2]+" is greater ");
    }

   }
}

