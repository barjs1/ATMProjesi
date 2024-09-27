import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int bakiye=10,input,miktar;
        Scanner scan = new Scanner(System.in);
        System.out.println("YAREN BANKA HOŞGELDİNİZ !!!");
        System.out.println("GÜNCEL BAKİYENİZ: "+bakiye+"TL");

        while(bakiye>0){
            System.out.println();
            System.out.println("1-)PARA YATIR");
            System.out.println("2-)PARA ÇEK");
            System.out.println("3-)BAKİYE SORGULA");
            System.out.println("4-)ÇIKIŞ YAP");
            input = scan.nextInt();

            if(input==1){
                System.out.println("KAÇ PARA YATIRMAK İSTİYORSUN ?: ");
                miktar= scan.nextInt();
                bakiye+=miktar;
                System.out.println("GÜNCEL BAKİYENİZ: "+bakiye);

            }else if(input==2){
                System.out.println("KAÇ PARA ÇEKECEN ?: ");
                miktar=scan.nextInt();
                if(miktar>bakiye){
                    System.out.println("O KADAR PARAN YOK");
                }else{
                bakiye-=miktar;
                    System.out.println("GÜNCEL BAKİYENİZ: "+bakiye);
                }

            }else if (input==3){
                System.out.println("GÜNCEL BAKİYEN: "+bakiye);
            }else if (input==4){
                System.out.println("ÇIKIŞ YAPTIN BB");
            }else{
                System.out.println("GEÇERSİZ İŞLEM YAPTIN SG");
            }

        }
        System.out.println("GÜLE GÜLE TEKRAR BEKLERİZ");
    }

}
