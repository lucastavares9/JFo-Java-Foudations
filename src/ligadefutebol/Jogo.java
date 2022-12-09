package ligadefutebol;

public class Jogo {
    private int id;
    private String equipe1;
    private String equipe2;
    private int golsEquipe1;
    private int golsEquipe2;
    private double temperatura;

    public String getEquipe1() {
        return equipe1;
    }
    public void setEquipe1(String equipe1) {
        this.equipe1 = equipe1;
    }
    public String getEquipe2() {
        return equipe2;
    }
    public void setEquipe2(String equipe2) {
        this.equipe2 = equipe2;
    }
    public int getGolsEquipe1() {
        return golsEquipe1;
    }
    public void setGolsEquipe1(int golsEquipe1) {
        this.golsEquipe1 = golsEquipe1;
    }
    public int getGolsEquipe2() {
        return golsEquipe2;
    }
    public void setGolsEquipe2(int golsEquipe2) {
        this.golsEquipe2 = golsEquipe2;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

}
