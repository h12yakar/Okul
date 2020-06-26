public class Ogrenci {
    private String bolum;
    private int sinif;

    public Ogrenci(String isim, int ID , String bolum , int sinif){
        setBolum(bolum);
        setSinif(sinif);
        this.bilgiYaz(isim, ID);
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public void bilgiYaz(String isim, int ID){
        System.out.println("İsim : " + isim);
        System.out.println("ID : " + ID);
        System.out.println("Bölünüz : " + bolum);
        System.out.println("Sınıfınız : " + sinif);
    }
}
