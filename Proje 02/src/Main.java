import Sabitler.OdemeYontemleri;
import finalDesc.Aslan;

import java.util.*;

public class Main implements Diller{
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*

        Bilgisayar bilgisayar = new Bilgisayar();
        System.out.println("pcrenk: " +bilgisayar.getRenk());

        Kasa kasa = new Kasa();
        kasa.setKasaAdi("Lonovo");
        kasa.setKasaTipi(2005);

        Ekran ekran = new Ekran();
        ekran.setEkranBuyuklugu(14);
        ekran.setEkranTipi("HD");

        bilgisayar.setKasa(kasa);
        bilgisayar.setEkran(ekran);


        System.out.println("pc ekran tipi: " + bilgisayar.getEkran().getEkranTipi());
        bilgisayar.getEkran().setEkranTipi("4K");
        System.out.println("pc ekran tipi: " + bilgisayar.getEkran().getEkranTipi());



        List hayvanlar1 = new ArrayList<>();
        hayvanlar1.add("zurafa1");
        hayvanlar1.add("kedi1");
        hayvanlar1.add("kopek1");
        hayvanlar1.add(2,"tavsan1");

        List hayvanlar = new ArrayList<>();
        hayvanlar.add("zurafa");
        hayvanlar.add("kedi");
        hayvanlar.add("kopek");
        hayvanlar.add("kedi");
        hayvanlar.add(2,"tavsan");
        hayvanlar.remove(2);

        System.out.println(hayvanlar);

        List hayvanAlemi = new ArrayList<>(hayvanlar1);
        System.out.println("hayvanAlemi:" + hayvanAlemi);

        hayvanlar.addAll(hayvanlar1);
        System.out.println("hayvanlar:" + hayvanlar);
        System.out.println("hayvanlar get:" + hayvanlar.get(0));
        hayvanlar.set(2,"maymun");
        System.out.println("hayvanlar:" + hayvanlar);
        hayvanlar.remove(2);
        System.out.println("hayvanlar:" + hayvanlar);
        System.out.println("hayvanlar size:" + hayvanlar.size());
        System.out.println("hayvanlar contains:" + hayvanlar.contains("kedi"));
        System.out.println("hayvanlar isEmpty:" + hayvanlar.isEmpty());
        System.out.println("hayvanlar indexOf:" + hayvanlar.indexOf("kedi"));
        System.out.println("hayvanlar indexOf:" + hayvanlar.lastIndexOf("kedi"));

        Iterator<String> hayvanciklar = hayvanlar.iterator();
        while (hayvanciklar.hasNext()){
            String adi = hayvanciklar.next();
            System.out.println("hayvanAdi: " + adi);
        }

        ListIterator<String> yeniHayvan = hayvanlar.listIterator(hayvanlar.size());
        System.out.println("---- -- -- - - - - -- - - - -");
        while (yeniHayvan.hasPrevious()){
            String adi = yeniHayvan.previous();
            System.out.println("hayvanAdi: " + adi);
        }

        System.out.println("---- -- -- - - - - -- - - - -");
        for (Object hayvan: hayvanAlemi) {
            System.out.println("hayvan: " + hayvan.toString());
        }



        List<Kullanici> kisiListe = new ArrayList<>();
        Kullanici k1 = new Kullanici("ahmet",10);
        kisiListe.add(k1);
        kisiListe.add(new Kullanici("mehmet",5));
        kisiListe.add(new Kullanici("can",15));
        kisiListe.add(new Kullanici("ali",1));

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(1);
        sayilar.add(20);
        sayilar.add(12);
        sayilar.add(8);

        Collections.sort(sayilar);
        System.out.println("sayilar: " + sayilar);

        List<String> isimler = new ArrayList<>();
        isimler.add("ahmet");
        isimler.add("ali");
        isimler.add("can");
        isimler.add("mahmut");
        isimler.add("ayse");
        isimler.add("fatma");

        Collections.sort(isimler);

        System.out.println("isimler: " + isimler);

        isimler.sort(new Comparator<String>() {
            @Override
            public int compare(String isim1, String isim2) {
                return isim2.compareTo(isim1);
            }
        });

        System.out.println("isimler: " + isimler);

        for (Kullanici user: kisiListe) {
            System.out.println("user getAdi: " + user.getAdi());
            System.out.println("user getYas: " + user.getYas());
        }
        System.out.println("kisiListe get 2 adi: " + kisiListe.get(2).getAdi());



        //lambda kisi kullanim saglar,
        Diller diller = isim -> System.out.println("en secdigim dil JAVA");



        Aslan aslan = new Aslan();
        aslan.hayvanBasla();


        Map<String,Integer> kisiler = new HashMap<>();
        kisiler.put("ahmet",123);
        kisiler.put("ali",20);
        kisiler.put("ayse",10);
        kisiler.put("fatma",1);
        kisiler.put("merve",50);
        kisiler.put("ayse",101);

        System.out.println("kisiler bosmu? " +kisiler.isEmpty());
        System.out.println("kisiler size? " +kisiler.size());
        System.out.println("kisiler get? " +kisiler.get("ahmet"));
        System.out.println("kisiler keySet? " +kisiler.keySet());
        kisiler.remove("ahmet");
        System.out.println("kisiler keySet? " +kisiler.keySet());
        System.out.println("kisiler values? " +kisiler.values());
        System.out.println("kisiler values? " +kisiler.containsKey("ali"));
        kisiler.clear();
        System.out.println("kisiler keySet? " +kisiler.keySet());


        Map<String,Integer> kisiler1 = new HashMap<>();
        kisiler1.put("ahmet",123);
        kisiler1.put("ali",20);
        kisiler1.put("ayse",10); // gecersiz
        kisiler1.put("fatma",1);
        kisiler1.put("merve",50);
        kisiler1.put("ayse",101); //son eleman gecerli olur eger ayni
        System.out.println("kisiler value? " +kisiler1.values());


        Aslan aslan = new Aslan();
        aslan.setAd("kanon");
        aslan = null;

         */

        OdemeYontemleri anlikOdeme = OdemeYontemleri.EFT;

        System.out.println("anlik odeme "+ anlikOdeme);

        if (anlikOdeme == OdemeYontemleri.PAYPAL){
            System.out.println("paypal odeme");
        } else {
            System.out.println("paypal odeme degildir");
        }
    }

    @Override
    public void isim(String ad) {
        System.out.println("Mainden en sevdigim dil " + ad);
    }
}