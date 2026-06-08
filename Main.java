package ProjekatOOP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        //Projekat:
        //
        //Napraviti klasu Video koja od atributa ima naziv, duzina trajanja, broj pregleda, lajkova i dislajkova. Napraviti metodu:
        //-popularan() -> vraca true ako video ima vise od 1000000 pregleda
        //
        //Napraviti klasu MusicVideo koji nasledjuje klasu Video
        //Napraviti klasu SkecVideo koji nasledjuje klasu Video i on je popularan ako ima vise od 500000 pregleda
        //Napraviti klasu Vlog koji nasledjuje klasu Video
        //
        //Napraviti klasu Kanal koja od atributa ima listu videa i broj preplacenih gledaoca. Napraviti metode:
        //- zarada() -> vraca kolika je zarada ako zaradjujemo 1 po pregledu
        //- najgori() -> vraca video sa najvise dislike-ova
        //- ukupno() -> koja je ukupna duzina trajanja svih video klipova
        //- platinum() -> vraca true ako je ovaj kanal Platinum korisnik (ima vise od 10000 preplatplacenih korisnika)
        //
        //Napraviti interface PlayLista koja od metoda ima:
        //- shuffle() -> Ova metoda pravi listu video-a koji imaju vise od 20000 lajkova
        //
        //Napraviti klasu MusicVevo koji nasledjuje Kanal i implementira PlayLista
        //Napraviti klasu Smosh koji nasledjuje Kanal
        //Napraviti klasu WorkDetKanal koji nasledjuje klasu Kanal i vraca da je platinum ukoliko ima vise od 200000 pretplacenih gledaoca
        //
        //Napraviti klasu YouTube koja ima listu Kanala. Napraviti metode:
        //- sveVevo() -> istampati sve video-e od MusicVevo-a
        //- ukupnoLajkova() -> koji je ukupan broj lajkova na svim snimkovima
        //- izbaciVideo(Kanal k, Video v) -> Proveriti da li prosledjeni kanal ima zadati video, ukloniti ga ukoliko nadjete

        Video video1 = new Video("Kako se spremiti za IT intervju", 23, 1100000, 53000, 1400);
        Video video2 = new MusicVideo("Uspavanke za decu", 65, 300000, 150000, 32000);
        Video video3 = new SkecVideo("Najsmesniji video klipovi kompilacija!!", 33, 400000, 31008, 2356);
        Video video4 = new Vlog("Putovanje u Grcku!!", 16, 200000, 14070, 1300);

        System.out.println(video1);
        System.out.println("Da li je video popularan? Odgovor: " + video1.popularan());
        System.out.println(video2);
        System.out.println(video3);
        System.out.println("Da li je video popularan? Odgovor: " + video3.popularan());

        ArrayList<Video> videoKlipovi = new ArrayList<>();
        videoKlipovi.add(video2);
        videoKlipovi.add(video3);
        videoKlipovi.add(video4);
        System.out.println(videoKlipovi);
        Kanal mojKanal = new Kanal(videoKlipovi, 150000);  // bitan korak, napraviti objekat tipa Kanal
        System.out.println("Zarada: " + mojKanal.zarada());
        System.out.println("Video sa najvise dislajkova je: " + mojKanal.najgori());
        System.out.println("Ukupna duzina trajanja svih video klipova je: " + mojKanal.ukupno() + " minuta");
        System.out.println("Da li je kanal Platinum korisniik? Odgovor: " + mojKanal.platinum());

        ArrayList<Video> muzickiKlipovi = new ArrayList<>();
        muzickiKlipovi.add(video2);

        Kanal mojKanal1 = new MusicVevo(muzickiKlipovi, 35000);
        Kanal mojKanal2 = new Smosh(videoKlipovi, 12000);
        Kanal mojKanal3 = new WorkDetKanal(videoKlipovi, 35000);
        System.out.println("Da li je kanal Platinum korisniik? Odgovor: " + mojKanal3.platinum());

        ArrayList<Kanal> kanali = new ArrayList<>();
        kanali.add(mojKanal1);
        kanali.add(mojKanal2);
        kanali.add(mojKanal3);

        MusicVevo music1 = new MusicVevo(videoKlipovi, 12500);
        MusicVevo music2 = new MusicVevo(videoKlipovi, 3600);
        music1.shuffle();


        YouTube youTube = new YouTube(kanali);
        youTube.sveVevo();
        System.out.println("Ukupan broj lajkova na svim snimkovima je: " + youTube.ukupnoLajkova());
        youTube.izbaciVideo(mojKanal2, video2);











    }
}
