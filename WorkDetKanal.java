package ProjekatOOP;

import java.util.ArrayList;

public class WorkDetKanal extends Kanal {

    public WorkDetKanal(ArrayList<Video> videoKlip, int brojPretlatnika) {
        super(videoKlip, brojPretlatnika);
    }

    @Override
    public boolean platinum(){
        return getBrojPretlatnika()>200000;
    }
}
