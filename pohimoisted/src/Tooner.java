public class Tooner {
    private String nimetus;
    private Integer tooneriTase;


    // konstruktor

    public Tooner(String nimetus, Integer tooneriTase) {
        this.nimetus = nimetus;
        this.tooneriTase = tooneriTase;
    }

    public String getNimetus() {
        return nimetus;
    }

    public Integer getTooneriTase() {
        return tooneriTase;
    }

    public void setTooneriTase(Integer tooneriTase) {
        this.tooneriTase = tooneriTase;
    }
}
