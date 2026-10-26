class Traccia_Audio{

    protected String nome;
    protected double durata;

    public Traccia_Audio(String nome, double durata){
        this.nome=nome;
        this.durata=durata;
    }
    public String show(){
        return "Nome: " + nome + " Durata: " + durata;
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
    @Override
    public String show(){
        return "Nome: " + nome + " Durata: " + durata + " Autore: " + Autore + " Feat: " + feat;
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
    @Override
    public String show(){
        return "Nome: " + nome + " Durata: " + durata + " Produttore: " + produttore + " Numero Episodio: " + n_episodio;
    }
}
public class main{
    public static void main(String[] args) {
        double durata_c=1.45;
        double durata_e=1.30;
        int n_episodio=2;
        Traccia_Audio playlist[] = {
            new Canzone("Bartox", durata_c, "Pasox e la bella addormentata", "Ponnyx"),
            new Podcast("Francesco Ruta", durata_e, "Il podcast dei ritardati", n_episodio)
        };
            for(Traccia_Audio brano :playlist){
                System.out.println(brano.show());
            }
    }
}