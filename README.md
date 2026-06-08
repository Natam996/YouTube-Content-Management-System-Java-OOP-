# YouTube-Content-Management-System-Java-OOP-
Projekat:

Napraviti klasu Video koja od atributa ima naziv, duzina trajanja, broj pregleda, lajkova i dislajkova. Napraviti metodu: -popularan() -> vraca true ako video ima vise od 1000000 pregleda

Napraviti klasu MusicVideo koji nasledjuje klasu Video Napraviti klasu SkecVideo koji nasledjuje klasu Video i on je popularan ako ima vise od 500000 pregleda Napraviti klasu Vlog koji nasledjuje klasu Video

Napraviti klasu Kanal koja od atributa ima listu videa i broj preplacenih gledaoca. Napraviti metode:

    zarada() -> vraca kolika je zarada ako zaradjujemo 1 po pregledu
    najgori() -> vraca video sa najvise dislike-ova
    ukupno() -> koja je ukupna duzina trajanja svih video klipova
    platinum() -> vraca true ako je ovaj kanal Platinum korisnik (ima vise od 10000 preplatplacenih korisnika)

Napraviti interface PlayLista koja od metoda ima:

    shuffle() -> Ova metoda pravi listu video-a koji imaju vise od 20000 lajkova

Napraviti klasu MusicVevo koji nasledjuje Kanal i implementira PlayLista Napraviti klasu Smosh koji nasledjuje Kanal Napraviti klasu WorkDetKanal koji nasledjuje klasu Kanal i vraca da je platinum ukoliko ima vise od 200000 pretplacenih gledaoca

Napraviti klasu YouTube koja ima listu Kanala. Napraviti metode:

    sveVevo() -> istampati sve video-e od MusicVevo-a
    ukupnoLajkova() -> koji je ukupan broj lajkova na svim snimkovima
    izbaciVideo(Kanal k, Video v) -> Proveriti da li prosledjeni kanal ima zadati video, ukloniti ga ukoliko nadjete 
