import java.util.Scanner; //serve per l'input
public class macchinetta {

    private float prezzo;
    private float resto;
    private String prodotto;
    private int prodotto_rimanente;

    public macchinetta(float prezzo, float resto, String prodotto,int prodotto_rimanente) {
        this.prezzo = prezzo;
        this.resto = resto;
        this.prodotto = prodotto;
        this.prodotto_rimanente = prodotto_rimanente;
    }

    public void inserisciDenaro(float importo, String prodotto, int prodotto_rimanente, float resto, float prezzo) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Il prezzo di" + prodotto + "è:" + importo);
      System.out.println("inserisci denaro");
      float soldi_inseriti = scanner.nextFloat();//commando per creare la variabile soldi_inseriti e inserire per l'input
      if(soldi_inseriti>=importo){
            if (prodotto_rimanente>0){
                resto=soldi_inseriti - prezzo;
                System.out.println("Hai acquistato: " + prodotto + " il tuo resto è: " + resto);
            }else{
                System.out.println("erorre prodotto finito");
            }
      }else{
        System.err.println("errore: credito insufficente");
      }
    }

    public void erogaProdotto() {

    }

    public float restituisciResto() {
        return 0.0f;
    }

    public int getProdottoRimanente() {
        return 0;
    }

    public float getPrezzo() {
        return 0.0f;
    }

    public String getProdotto() {
        return "";
    }
}