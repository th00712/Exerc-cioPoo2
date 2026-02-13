
public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Thiago",715756221,"TropadoMengao");

        Aluno aluno = new Aluno("Thiago",715756221,"Engenharia de Software");

        Professor professor = new Professor("Professor Thiago", 715756221,"A,B,C.");

        System.out.println("O funcionário possui o nome :" + funcionario.getNome(aluno));
        System.out.println("O funcionário possui a matricula : " + funcionario.getMatricula(aluno));



    }

}