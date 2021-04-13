import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String []names=new String[n];
        for(int i=0;i<n;i++){
            names[i]=sc.next();
        }
        int q=sc.nextInt();
        String[] name=new String[q];
        for(int j=0;j<q;j++){
            name[j]=sc.next();
        }
        String temp,temp1;

        for(int w=0;w<q;w++){
            int c=0;
            temp=name[w];
            for(int e=0;e<n;e++) {
                temp1 = names[e];
                if (temp1.equals(temp)) {
                    c++;
                }
            }
            System.out.println(c);
        }
        }

    }

