public class Ristkulik extends Kujund {
    // objekti omadused = klassi muutujad
    private Double pikkus;
    private Double laius;
    private Integer nurk;


    public Ristkulik(String nimi, Double p, Double l) {
        super(nimi);
        this.pikkus = p;
        this.laius = l;
        this.setNurkadeOlemasolu(true);
        this.setNurkadeArv(4);
        this.nurk = 90;
        System.out.println("Ristkuliku klassi konstruktor");
    }

        public void arvutaPindala(Boolean tapsus) {
        System.out.println("Ristküliku klassi arvutaPindala() meetod");
        this.setPindala(this.pikkus * this.laius);
        Double pindala = this.getPindala();
            System.out.print("Pindala = ");

       if (tapsus) {
            System.out.println(pindala);
        } else {
            System.out.println(Math.round(pindala));
        }
    }


    @Override
    public void valjastaKirjeldus() {
        System.out.println("Ristküliku klassi valjastaKirjeldus()");
        System.out.println(this.getNimetus());
        System.out.println("Pikkus = " + this.pikkus);
        System.out.println("Laius = " + this.laius);
        if (this.getNurkadeOlemasolu())
        System.out.println("Kokku on " + this.getNurkadeArv() + "nurka");
        System.out.println("Nurgad on " + this.nurk + " kraadi.");
    }
}

