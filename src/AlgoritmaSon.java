import java.util.Scanner;

public class AlgoritmaSon {


    public static void main(String[] args) {

 calistir();
 		System.out.println("Fırat Mızraklı");
        
        AlgoritmaSon m = new AlgoritmaSon();// private olan metoda direk eriÅŸemeyiz bu yÃ¼zden nesnesini oluÅŸturduk.. 
        m.yenidogum();
    }
    public static void calistir() {
        Scanner tarayici = new Scanner(System.in);

        System.out.print("HayvanÄ±n Ã§ene gÃ¼cÃ¼nÃ¼ girin: ");
        double cenegucu1 = tarayici.nextDouble();
       
        
        System.out.print("HayvanÄ±n aÄŸÄ±rlÄ±ÄŸÄ± kaÃ§ kgdir : ");
        int kg = 0;
        kg = tarayici.nextInt();
        
        System.out.print("HayvanÄ±n yaÅŸÄ±nÄ± girin : ");
        int yasii = tarayici.nextInt();

        System.out.print("HayvanÄ±n ayak sayÄ±sÄ±nÄ± girin: ");
        int ayaksayisi_ = tarayici.nextInt();

        System.out.print("HayvanÄ±n kas kÃ¼tlesi: ");
        int kaskutlesi_ = tarayici.nextInt();

        System.out.println("");
        kediler yenidogan = new kediler(cenegucu1, yasii, ayaksayisi_, kaskutlesi_);
        double gucu;
        if (kg > 0) {
            gucu = yenidogan.gucu(cenegucu1, yasii, ayaksayisi_, kaskutlesi_, kg);
        } else {
            gucu = yenidogan.gucu(cenegucu1, yasii, ayaksayisi_, kaskutlesi_);
        }

        yenidogan.azotsal(gucu);

        arslan ozellik = new arslan(4.6 , 10 ,4,400);
        ozellik.kediGenelOzellikleri();

        yenidogan.ozellikgoster_();

    }
     private void yenidogum(){
        System.out.println("Yeni doÄŸum meydana geldi!");
        
        //private fonksiyon bÃ¶lÃ¼mÃ¼
    }
}
