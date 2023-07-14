import java.util.Arrays;
import java.util.Scanner;
public class Prefix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of the array element : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("array Element : ");
        for(int j=0;j<size;j++){
            arr[j] = sc.nextInt();
        }
        int[] p =new int[size];
        int j=0;
        while(j<size){
            if(j==0){
                p[0] = arr[j];
            }
            else {
                p[j] = p[j-1]+arr[j];
            }
            j++;
        }
        System.out.println(Arrays.toString(p));
    }
}