public class Aluno extends Pessoa {
    private String curso;

    public Aluno (String nome, Integer matricula, String curso) {
        super(nome, matricula);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
