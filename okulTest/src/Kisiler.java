import java.util.Scanner;

public class Kisiler {
    private int id;
    private String isim;
    public static int kisiSayisi = 1;

    public Kisiler(){
        id = kisiSayisi;
        GUI();
        devamVeyaCikis();
        kisiSayisi++;
    }

    public void setIsim(String isim){
        this.isim = isim;
    }

    public void bilgiYaz(){
        System.out.println("Sistemde kayıtlı kişi sayısı : " + kisiSayisi);
    }


    public static void main(String[] args) {
        for (;;) {
            Kisiler kisi = new Kisiler();
        }
    }

    public void GUI(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Sisteme hoşgeldiniz idari personel kaydı yapmak için 1, akademik personel kaydı için 2, öğrenci kaydı yapmak için 3 giriniz");
            int user_log = scanner.nextInt();
            switch (user_log) {
                case 1:
                    System.out.println("Adınızı giriniz");
                    String idariPersonelAdi = scanner.next();

                    System.out.println("Çalıştığınız birimin adını giriniz");
                    String idariPersonelBirimi = scanner.next();

                    System.out.println("Çalıştığınız gün sayısını giriniz");
                    int idariPersonelCalisilanGunSayisi = scanner.nextInt();

                    System.out.println("Günlük aldığınız ücreti giriniz");
                    int idariPersonelGunukUcreti = scanner.nextInt();

                    IdariPersonel idariPersonel = new IdariPersonel(idariPersonelAdi, this.id, idariPersonelBirimi, idariPersonelCalisilanGunSayisi, idariPersonelGunukUcreti);
                    break;
                case 2:
                    System.out.println("Adınızı giriniz");
                    String akademikPersonelAdi = scanner.next();

                    System.out.println("Çalıştığınız birimin adını giriniz");
                    String akademikPersonelBirimi = scanner.next();

                    System.out.println("Çalıştığınız gün sayısını giriniz");
                    int akademikPersonelCalisilanGunSayisi = scanner.nextInt();

                    System.out.println("Verdiğiniz dersin ücretini giriniz");
                    int akademikPersonelDersUcreti = scanner.nextInt();

                    System.out.println("Günlük aldığınız ücreti giriniz");
                    int akademikPersonelGunukUcreti = scanner.nextInt();

                    AkademikPersonel akademikPersonel = new AkademikPersonel(akademikPersonelAdi, this.id, akademikPersonelBirimi, akademikPersonelCalisilanGunSayisi, akademikPersonelDersUcreti, akademikPersonelGunukUcreti);
                    break;

                case 3:
                    System.out.println("Adınızı giriniz");
                    String ogrenciAdi = scanner.next();

                    System.out.println("Bölümünüzü giriniz");
                    String ogrenciBolumu = scanner.next();

                    System.out.println("Sınıfınız");
                    int ogrenciSinifi = scanner.nextInt();

                    Ogrenci ogrenci = new Ogrenci(ogrenciAdi, this.id , ogrenciBolumu, ogrenciSinifi);
                    break;
            }
    }

    public void devamVeyaCikis() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çıkış yapmak için 1 devam etmek için 2 giriniz");
        int log = scanner.nextInt();
        for (; ;) {
            if (log == 1) {
                bilgiYaz();
                System.out.println("Çıkış yapılıyor");
                System.exit(5);
            } else if (log == 2) {
                break;
            } else {
                System.out.println("Hatalı giriş!");
            }
        }
    }

}

