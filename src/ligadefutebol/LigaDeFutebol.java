package ligadefutebol;

import java.util.ArrayList;

import ligadefutebol.Jogo;

public class LigaDeFutebol {
    
    private int [][] tabelaDeClassificação;

    ArrayList<Jogo> tabelaJogos;


    public LigaDeFutebol(){
        tabelaDeClassificação = new int[4][6];
        tabelaJogos = new ArrayList<Jogo>();
    }

    public int[][] getTabelaDeClassificação() {
       return tabelaDeClassificação;
    }
    public void setTabelaDeClassificação(int[][] tabelaDeClassificação) {
        this.tabelaDeClassificação = tabelaDeClassificação;
    }


}
