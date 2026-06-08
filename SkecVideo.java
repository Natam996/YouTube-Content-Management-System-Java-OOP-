package ProjekatOOP;

public class SkecVideo extends Video {

    public SkecVideo(String naziv, int duzinaTrajanja, int brojPregleda, int brojLajkova, int brojDislajkova) {
        super(naziv, duzinaTrajanja, brojPregleda, brojLajkova, brojDislajkova);
    }

    @Override
    public boolean popularan(){
        return getBrojPregleda()>500000;
    }
}
