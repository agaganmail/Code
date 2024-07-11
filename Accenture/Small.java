import java.util.*;
public class Small {

    public static void main(String args[]){
        int arr[]={12,18,3,1,10};
        int min= arr[0];
    for(int i=0;i<arr.length;i++){
        if(min>arr[i]){
            min= arr[i];
        }
    }
    System.out.println(min);
    }
}