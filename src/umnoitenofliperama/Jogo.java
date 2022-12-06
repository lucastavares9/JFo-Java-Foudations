package umnoitenofliperama;

import java.text.Format;

public class Jogo {
    private String nomeDoJogo;
    private int quantidadeDeCreditos;
    private String monitorLCD;
    private String leitorDeCartaoMagnetico;

    public String getNomeDoJogo() {
        return nomeDoJogo;
    }
    public void setNomeDoJogo(String nomeDoJogo) {
        this.nomeDoJogo = nomeDoJogo;
    }
    public int getQuantidadeDeCreditos() {
        return quantidadeDeCreditos;
    }
    public void setQuantidadeDeCreditos(int quantidadeDeCreditos) {
        this.quantidadeDeCreditos = quantidadeDeCreditos;
    }

    public void passarCartaoParaJogar (Cartão cartão){
        int saldoDOCartão= cartão.getSaldoAtual();
        if (saldoDOCartão >= quantidadeDeCreditos){
           cartão.setSaldoAtual(saldoDOCartão - quantidadeDeCreditos);
           int tiquetisGanhos = 20;
           System.out.format("Divarta-se! %d %d %d", cartão.getNumeroCartão(),tiquetisGanhos, cartão.getSaldoAtual());
        } else {
            System.out.println("Crédtios insufientes");
        }
    }
}
