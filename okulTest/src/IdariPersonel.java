public class IdariPersonel {
    private int gunSayisi;
    private int yevmiye;
    private int maas = 0;
    private String birim;

    public IdariPersonel(String isim, int ID, String calistiginizBirim, int calisilanGunSayisi, int gunlukYevmiye){
        setGunSayisi(calisilanGunSayisi);
        setYevmiye(gunlukYevmiye);
        setBirim(calistiginizBirim);
        maasHesapla();
        this.bilgiYaz(isim, ID);
    }

    public void setGunSayisi(int gunSayisi) {
        this.gunSayisi = gunSayisi;
    }

    public void setYevmiye(int yevmiye) {
        this.yevmiye = yevmiye;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public void maasHesapla(){
        maas = (gunSayisi*yevmiye);
    }

    public void bilgiYaz(String isim, int ID){
        System.out.println("İsim : " + isim);
        System.out.println("ID : " + ID);
        System.out.println("Çalışılan gün sayısı : " + gunSayisi);
        System.out.println("Hesaplanan maaş : " + maas);
        System.out.println("Biriminiz : " + birim);
    }
}
