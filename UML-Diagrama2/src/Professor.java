public class Professor extends Pessoa {
    private String turma;

    public Professor (String nome, Integer matricula, String turma ) {
        super(nome, matricula);
        this.turma = turma;

    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }


}
