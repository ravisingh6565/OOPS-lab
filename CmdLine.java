import java.io.*;
public class CmdLine {
    public static void main(String args[]) {
        System.out.println("hello Ravi sir!!");
        Console c= System.console();
        // int arr[3];
        int[] arr = new int[3];
        int i=0;
        for(String num:args ){
            //  String num=c.readLine("enter "+(i+1)+" the number : ");

            arr[i]= Integer.parseInt(num);
            i++;

        }
     
     if(arr[0]>arr[1]){
        if(arr[0]>arr[2]){
            System.out.println(arr[0]+" is greaterr ");
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

