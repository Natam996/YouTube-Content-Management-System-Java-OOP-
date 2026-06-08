package ProjekatOOP;

import java.util.ArrayList;

public class YouTube {

    private ArrayList<Kanal> kanali;


    public YouTube(ArrayList<Kanal> kanali) {
        this.kanali = kanali;
    }

    public ArrayList<Kanal> getKanali() {
        return kanali;
    }

    public void setKanali(ArrayList<Kanal> kanali) {
        this.kanali = kanali;
    }

    @Override
    public String toString() {
        return "YouTube{" +
                "kanali=" + kanali +
                '}';
    }

    public void sveVevo(){
        for(Kanal element: getKanali()){
            if(element instanceof MusicVevo){
                for(Video element1: element.getVideoKlip()){
                    System.out.println("Video od Music Vevo je: " + element1);
                }
            }
        }
    }

    public int ukupnoLajkova(){
        int suma = 0;
        for(Kanal element:getKanali()){
            for(Video element1: element.getVideoKlip()){
                suma += element1.getBrojLajkova();
            }
        }
        return suma;
    }

    public void izbaciVideo(Kanal k, Video v){
        if(k.getVideoKlip().contains(v)){
            k.getVideoKlip().remove(v);
            System.out.println("Da, kanal sadrzi ovaj video. Kanal bez unetog videa je: " + k);
        } else {
            System.out.println("Ne, ovaj video se ne nalazi na ovom kanalu");
        }

    }

}
