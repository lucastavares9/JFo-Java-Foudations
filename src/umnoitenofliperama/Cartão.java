package umnoitenofliperama;

public class Cartão {
    
private int saldoAtual;
private int saldoDeTiquetis;
private int númeroCartão;

public int getNumeroCartão(){
    return númeroCartão;
}
public void setNúmeroCartão(int novonúmeroCartão) {
    this.númeroCartão = novonúmeroCartão;
}
public int getSaldoAtual() {
    return saldoAtual;
}
public void setSaldoAtual(int saldoAtual) {
    this.saldoAtual = saldoAtual;
}
public int getSaldoDeTiquetis() {
    return saldoDeTiquetis;

}
}