class Traccia_Audio{

    protected String nome;
    protected double durata;

    public Traccia_Audio(String nome, double durata){
        this.nome=nome;
        this.durata=durata;
    }

}
class Canzone extends Traccia_Audio{

    private String Autore;
    private String feat;

    public Canzone(String Autore, double durata, String nome,String feat){
        super(nome, durata);
        this.Autore=Autore;
        this.feat=feat;
    }
}
class Podcast extends Traccia_Audio{

    private String produttore;
    private int n_episodio;

    public Podcast(String produttore, double durata, String nome,int n_episodio){
        super(nome, durata);
        this.produttore=produttore;
        this.n_episodio=n_episodio;
    }
}
public class main{
    public static void main(String[] args) {
        
    }
}