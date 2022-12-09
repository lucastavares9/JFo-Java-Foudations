package ligadefutebol;

import java.util.Scanner;

public class TesteLiga {
    public static void main(String[] args) {
        
        LigaDeFutebol liga = new LigaDeFutebol();

        Scanner sc = new Scanner (System.in);

        int temperaturaBaixasemSequencia = 3;
        double temperaturaNosJogos;

        while (temperaturaBaixasemSequencia > 0) {
            temperaturaNosJogos = sc.nextDouble();
            if (temperaturaNosJogos > 0){
                Jogo jogo1 = new Jogo();

                jogo1.setEquipe1("Real Madrid");
                jogo1.setEquipe2("Barcelona");
                jogo1.setGolsEquipe1(4);
                jogo1.setGolsEquipe2(2);
                jogo1.setTemperatura(22.0);
        
                Jogo jogo2 = new Jogo();
                
                jogo2.setEquipe1("Atlético de Madrid");
                jogo2.setEquipe2("Real Bets");
                jogo2.setGolsEquipe1(3);
                jogo2.setGolsEquipe2(1);
                jogo2.setTemperatura(27.0);
        
                liga.tabelaJogos.add(jogo2);
                
                liga.tabelaJogos.get(1);
        
                liga.tabelaJogos.remove(0);
        
        
        
                liga.tabelaJogos.add(jogo1);

          } else{
            temperaturaBaixasemSequencia--;
          }
        }

        sc.close();
       
       


    }
}
