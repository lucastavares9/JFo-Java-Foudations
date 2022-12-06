package umnoitenofliperama;

public class Terminal {
    public void transferirCredito(Cartão c1, Cartão c2, int creditos){
      int saldoDOCartãoC1 = c1.getSaldoAtual();
      int saldoDOCartãoC2 = c2.getSaldoAtual();
      if (saldoDOCartãoC1 >= creditos){
        c1.setSaldoAtual(saldoDOCartãoC1 - creditos);
        c2.setSaldoAtual(saldoDOCartãoC2 + creditos);
        System.out.format("Saldo do cartão 1: %d Saldo do cartão 2: %d ", c1.getSaldoAtual(), c2.getSaldoAtual());
      } else {
        System.out.println("Transferencia nao poder ser realizada");
      }
    }
}
