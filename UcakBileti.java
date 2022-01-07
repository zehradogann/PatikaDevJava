import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price = 0 , perKm = 0.10;
        System.out.println("Lütfen km bilgisi girin:");
        int km = input.nextInt();
        System.out.println("Lütfen yaşınızı girin:");
        int yas=input.nextInt();
        System.out.println("1-->Tek Yön\n2-->Gidiş-Dönüş");
        System.out.println("Lütfen yolculuk tipini girin:");
        int tip = input.nextInt();
        if(km<0 || yas<0 || (tip!=1 && tip !=2)){
            System.out.println("Hatalı veri girdiniz....");
        }else{
            switch(tip){
                case 1:
                    price = km*perKm;
                    break;
                case 2:
                    price = 2*km*perKm;
                    price-=price*0.20;
                    break;
            }
            if(yas<12){
                price-=price*0.5;
            }else if(yas>=12 && yas <=24){
                price-=price*0.10;
            }else if(yas>65){
                price-=price*0.30;
            }else{
                price=price;
            }
            System.out.println("Fiyat:"+price);
        }
    }
}
