package finalDesc;

public class Aslan extends Hayvanlar {

    public final int aslanYasi = 10;
    private String ad;
    public void hayvanBasla(){
        konus();
    }

    public int getAslanYasi() {
        return aslanYasi;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
