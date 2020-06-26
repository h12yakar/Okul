public class AkademikPersonel extends Kisiler implements Calisan{

    private int gunSayisi;
    private int yevmiye;
    private int maas = 0;
    private String bolum;
    private int dersUcreti;

    public AkademikPersonel(String isim, int ID, String calistiginizBolum, int calisilanGunSayisi , int dersUcreti, int gunlukYevmiye){
        setGunSayisi(calisilanGunSayisi);
        setYevmiye(gunlukYevmiye);
        setBolum(calistiginizBolum);
        setDersUcreti(dersUcreti);
        maasHesapla();
        this.bilgiYaz(isim, ID);
    }

    public void setGunSayisi(int gunSayisi) {
        this.gunSayisi = gunSayisi;
    }

    public void setYevmiye(int yevmiye) {
        this.yevmiye = yevmiye;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setDersUcreti(int dersUcreti) {
        this.dersUcreti = dersUcreti;
    }

    @Override
    public void maasHesapla() {
       maas = (gunSayisi*yevmiye)+dersUcreti;
    }

    public void bilgiYaz(String isim, int ID){
        System.out.println("Adınız : " + isim );
        System.out.println("ID : " + ID );
        System.out.println("Çalışılan gün sayısı : " + gunSayisi);
        System.out.println("Hesaplanan maaş : " + maas);
        System.out.println("Bölümünüz : " + bolum);
    }

}
