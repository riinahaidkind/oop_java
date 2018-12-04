public class Burger {
    private String nimetus;
    private String liha;
    private String sai;
    private Double hind;
    private String lisand1;
    private Double lisand1Hind;
    private String lisand2;
    private Double lisand2Hind;
    private String lisand3;
    private Double lisand3Hind;
    private String lisand4;
    private Double lisand4Hind;


    // konstruktor
    public Burger(String nimetus, String liha, String sai, Double hind) {
        this.nimetus = nimetus;
        this.liha = liha;
        this.sai = sai;
        this.hind = hind;
    }
    // getterid burgeri kokku ladumiseks
    public String getNimetus() {
        return nimetus;
    }

    public String getSai() {
        return sai;
    }

    public String getLiha() {
        return liha;
    }

    public String getLisand1(salat) {
        return lisand1;
    }

    public String getLisand2(tomat) {
        return lisand2;
    }

    public String getLisand3(muna) {
        return lisand3;
    }

    public String getLisand4(juust) {
        return lisand4;
    }


    // setter hinna arvutamiseks
    public void setHind(Double hind) {
        System.out.println(getClass().getSimpleName() + (getSai() + getLiha() + getLisand1()));
        this.hind = hind;
    }


    // getter lisandi hinna arvutamiseks
    public Double getLisand1Hind() {
        System.out.println();
        return lisand1Hind;
    }


    // klassi meetodid


    public void setLisand2(String lisand2) {
        this.lisand2 = lisand2;
    }

    public Double getLisand2Hind() {
        return lisand2Hind;
    }

    public void setLisand2Hind(Double lisand2Hind) {
        this.lisand2Hind = lisand2Hind;
    }

    public void valilisand1 ()

}

