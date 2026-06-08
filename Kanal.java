package ProjekatOOP;

import java.util.ArrayList;

public class Kanal {

    private ArrayList<Video> VideoKlip;
    private int brojPretlatnika;


    public Kanal(ArrayList<Video> videoKlip, int brojPretlatnika) {
        VideoKlip = videoKlip;
        this.brojPretlatnika = brojPretlatnika;
    }

    public ArrayList<Video> getVideoKlip() {
        return VideoKlip;
    }

    public void setVideoKlip(ArrayList<Video> videoKlip) {
        VideoKlip = videoKlip;
    }

    public int getBrojPretlatnika() {
        return brojPretlatnika;
    }

    public void setBrojPretlatnika(int brojPretlatnika) {
        this.brojPretlatnika = brojPretlatnika;
    }

    @Override
    public String toString() {
        return "Kanal{" +
                "VideoKlip=" + VideoKlip +
                ", brojPretlatnika=" + brojPretlatnika +
                '}';
    }

    public int zarada(){
        int suma = 0;
        for(Video element:getVideoKlip()){
            suma += element.getBrojPregleda() * 1;
        }
        return suma;
    }

    public Video najgori(){
        int maxDislajk = getVideoKlip().get(0).getBrojDislajkova();
        Video najgori = getVideoKlip().get(0);
        for(Video element:getVideoKlip()){
            if(element.getBrojDislajkova() > maxDislajk){
                maxDislajk = element.getBrojDislajkova();
                najgori = element;
            }
        }
        return najgori;
    }

    public int ukupno(){
        int duzina = 0;
        for(Video element:getVideoKlip()){
            duzina += element.getDuzinaTrajanja();
        }
        return duzina;
    }

    public boolean platinum(){
        return getBrojPretlatnika()>10000;
    }

}
