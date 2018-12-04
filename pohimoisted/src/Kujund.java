public class Kujund {
    // tüübi omadused - klassi muutujad
    private String nimetus;
    private Double pindala;
    private Boolean nurkadeOlemasolu;
    private Integer nurkadeArv;

    // klassi konstruktor
    public Kujund(String nimi) {
        this.nimetus = nimi;
    }
// setterid
    public void setNimetus(String nimi) {
        this.nimetus = nimi;
    }

    public void setNurkadeOlemasolu(Boolean nurkadeOlemasolu) {
        this.nurkadeOlemasolu = nurkadeOlemasolu;
    }

    public void setNurkadeArv(Integer nurkadeArv) {
        this.nurkadeArv = nurkadeArv;
    }

    public void setPindala(Double pindala) {
        this.pindala = pindala;
    }
//getterid


    public String getNimetus() {
        return nimetus;
    }

    public Boolean getNurkadeOlemasolu() {
        return nurkadeOlemasolu;
    }

    public Integer getNurkadeArv() {
        return nurkadeArv;
    }

    public Double getPindala() {
        return pindala;
    }

    // tüüpi tegevused - klassi meetodid
    public void arvutaPindala() {
        System.out.println("Kujund klassi arvutaPindala() meetod");
    }

    public void valjastaKirjeldus() {
        System.out.println(this.nimetus);
        this.arvutaPindala();
        System.out.println();
    }


}


