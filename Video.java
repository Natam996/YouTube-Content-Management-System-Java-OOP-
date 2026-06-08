package ProjekatOOP;

public class Video {

    private String naziv;
    private int duzinaTrajanja;
    private int brojPregleda;
    private int brojLajkova;
    private int brojDislajkova;


    public Video(String naziv, int duzinaTrajanja, int brojPregleda, int brojLajkova, int brojDislajkova) {
        this.naziv = naziv;
        this.duzinaTrajanja = duzinaTrajanja;
        this.brojPregleda = brojPregleda;
        this.brojLajkova = brojLajkova;
        this.brojDislajkova = brojDislajkova;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getDuzinaTrajanja() {
        return duzinaTrajanja;
    }

    public void setDuzinaTrajanja(int duzinaTrajanja) {
        this.duzinaTrajanja = duzinaTrajanja;
    }

    public int getBrojPregleda() {
        return brojPregleda;
    }

    public void setBrojPregleda(int brojPregleda) {
        this.brojPregleda = brojPregleda;
    }

    public int getBrojLajkova() {
        return brojLajkova;
    }

    public void setBrojLajkova(int brojLajkova) {
        this.brojLajkova = brojLajkova;
    }

    public int getBrojDislajkova() {
        return brojDislajkova;
    }

    public void setBrojDislajkova(int brojDislajkova) {
        this.brojDislajkova = brojDislajkova;
    }

    @Override
    public String toString() {
        return "Video{" +
                "naziv='" + naziv + '\'' +
                ", duzinaTrajanja=" + duzinaTrajanja + " minuta" +
                ", brojPregleda=" + brojPregleda  +
                ", brojLajkova=" + brojLajkova +
                ", brojDislajkova=" + brojDislajkova  +
                '}';
    }

    public boolean popularan(){
        return getBrojPregleda()>1000000;
    }
}
