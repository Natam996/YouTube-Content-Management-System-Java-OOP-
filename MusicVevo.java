package ProjekatOOP;

import java.util.ArrayList;

public class MusicVevo extends Kanal implements PlayLista {

    public MusicVevo(ArrayList<Video> videoKlip, int brojPretlatnika) {
        super(videoKlip, brojPretlatnika);
    }

    @Override
    public void shuffle() {
        ArrayList<Video> novaLista = new ArrayList<>();
        for(Video element: getVideoKlip()){
            if(element.getBrojLajkova()>20000){
                novaLista.add(element);
            }
        }
        System.out.println("Video klipovi sa vise od 20000 lajkova su: " + novaLista);
    }
}
