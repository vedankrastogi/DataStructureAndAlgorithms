import java.util.Scanner;
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=d;i++){
            for(int j=0;j<arr.length;j++){
                int start=arr[j];
                int end=arr[arr.length-1];
                end=start;
                start=arr[j+1];
            }
            System.out.print(arr[i]+" ");
        }
    }
}
