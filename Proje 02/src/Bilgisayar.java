public class Bilgisayar {
    private String renk = "sari";
    private int yas = 5;
    private Kasa kasa;
    private Ekran ekran;

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public Kasa getKasa() {
        return kasa;
    }

    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    public Ekran getEkran() {
        return ekran;
    }

    public void setEkran(Ekran ekran) {
        this.ekran = ekran;
    }
}
