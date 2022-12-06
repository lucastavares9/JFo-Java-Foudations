package umnoitenofliperama;

public class Fliperama {
    public static void main(String[] args) {
        
        Jogo galaga;
        galaga = new Jogo();
        galaga.setNomeDoJogo("Galaga Nintendo");
        galaga.setQuantidadeDeCreditos(75);

        
        Cartão cartao1;
        Cartão cartao2;

        cartao1 = new Cartão();
        cartao2 = new Cartão();

        cartao1.setSaldoAtual(100);
        cartao2.setSaldoAtual(300);

        galaga.passarCartaoParaJogar(cartao1);
        System.out.print(cartao1.getSaldoAtual());

        Terminal t1 = new Terminal(); 
        t1.transferirCredito(cartao2, cartao1, 65);

    }
}
