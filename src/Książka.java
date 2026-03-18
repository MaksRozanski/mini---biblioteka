public class Książka {
    private String tytuł;
    private String autor;
    private int liczba_stron;
    private boolean dostepna;
    public Książka(String tytuł, String autor, int liczba_stron, boolean dostepna)
    {
        this.tytuł = tytuł;
        this.autor = autor;
        this.liczba_stron = liczba_stron;
        this.dostepna = dostepna;
    }
    void wpisz_info()
    {
        System.out.println(tytuł + " " + autor + " " + liczba_stron + " " + dostepna);
    }
    boolean wypozycz()
    {
        if(dostepna)
        {
            dostepna = 1;
        }
        System.out.println("Pomyślnie wypożyczono książkę: " + tytuł);
        else
        {
            dostepna = 0;
        }
        System.out.println("Niestety książka: " + tytuł " jest niedostępna");
    }
    boolean zwrot
    if(!dostepna)
    {
        dostepna = 1;
        System.out.println("Książka zwrócona");
    }
}
