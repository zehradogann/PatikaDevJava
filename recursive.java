import java.util.Scanner;

public class RecursiveMethod {

    static void azalt(int n,int kopya){
        System.out.print(n+" ");
        if(n==0 || n<0){
            arttir(n+5,kopya);
        }
        else{
            azalt(n-5,kopya);
        }
    }

    static void arttir(int n,int kopya){
         System.out.print(n+" ");
        if(n==kopya){
            return ;
        }
        else{
           
            arttir(n+5,kopya);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int N=inp.nextInt();
        int kopya = N;
        azalt(N, kopya);
       
        

    }
}
