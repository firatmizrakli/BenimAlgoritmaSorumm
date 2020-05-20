
public class kediler {
   
    private double ceneGucu;
    private int yasi;
    private int ayakSayisi;
    private int kaskutlesi;

    /**
     * @return the ceneGucu
     */
    public double getCeneGucu() {
        return ceneGucu;
    }

    /**
     * @param ceneGucu the ceneGucu to set
     */
    public void setCeneGucu(double ceneGucu) {
        this.ceneGucu = ceneGucu;
    }

    /**
     * @return the yasi
     */
    public int getYasi() {
        return yasi;
    }

    /**
     * @param yasi the yasi to set
     */
    public void setYasi(int yasi) {
        this.yasi = yasi;
    }

    /**
     * @return the ayakSayisi
     */
    public int getAyakSayisi() {
        return ayakSayisi;
    }

    /**
     * @param ayakSayisi the ayakSayisi to set
     */
    
    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }

    /**
     * @return the kaskutlesi
     */
    public int getKaskutlesi() {
        return kaskutlesi;
    }

    /**
     * @param kaskutlesi the kaskutlesi to set
     */
    public void setKaskutlesi(int kaskutlesi) {
        this.kaskutlesi = kaskutlesi;
    }
    
   
    public double gucu(double cenegucu, int yasii, int ayakSayisi, int kaskutlesii) {
        double gucuT;
        gucuT = ceneGucu*yasi*kaskutlesii;
        System.out.println("Hayvanın gücü " + gucuT + "kgdır.");
        return gucuT;
        //metod1
    }
   
    
    public double gucu(double cenegucu, int yasii, int ayakSayisi, int kaskutlesi, int hizi) {
        double gucuT;
        gucuT = ceneGucu*yasi*kaskutlesi;
        System.out.println("Hayvanın gücü : "+gucuT+" kgdır");
        return gucuT;
        //metod2 + overloading + polimorfizm

    }
    
     public void azotsal(double gucu) {
        double azotsal = gucu * yasi;
        
        System.out.println("Hayvan Havayı %" + azotsal/10000 + " oranında kirletiyor..");
        //metod3
    }
    
    
     
    public kediler(double ceneGucu, int yasi, int ayakSayisi, int kaskutlesi) {
        this.ceneGucu = ceneGucu;
        this.yasi = yasi;
        this.ayakSayisi = ayakSayisi;
        this.kaskutlesi = kaskutlesi;
        //contructor
    }

    public void ozellikgoster_() {
        System.out.println("Hayvanın çene gücü : " + this.ceneGucu);
        System.out.println("Hayvanın yaşı : " + this.yasi);
        System.out.println("Hayvanın ayak sayısı : " + this.ayakSayisi);
        System.out.println("Hayvanın kas kütlesi : " + this.kaskutlesi);
    }
    
    
    
    public String havaSicaklik;
    private String kediTuru;

    public kediler(String havaSicaklik, String kediTuru) {
        this.havaSicaklik = havaSicaklik;
        this.kediTuru = kediTuru;
        //Kalıtım bölümü
    }

    public void kediGenelOzellikleri() {
        System.out.println("Kedi türü : " + this.kediTuru);
        System.out.println("Ayak sayısı : " + this.havaSicaklik);
    }
    
}
