import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        //Crio uma nova lista de alunos
        List<aluno> alunos = new ArrayList<aluno>();

        //Crio uma turma
        turma turma = new turma();

        Scanner scanner1= new Scanner(System.in);

        System.out.println("Quantos alunos tem na turma?");
        Integer quantidadeAlunos = scanner1.nextInt();

        for (int i = 0; i < quantidadeAlunos;i ++){

            //Inicio o scanner
            Scanner scanner= new Scanner(System.in);

            aluno aluno = new aluno();
            System.out.println("Qual o nome do aluno?");
            aluno.setNome(scanner.nextLine());

            System.out.println("Qual o RA do aluno?");
            aluno.setRa(scanner.nextInt());

            System.out.println("Digite a primeira nota");
            aluno.setNota1(scanner.nextDouble());
            System.out.println("Digite a segunda nota");
            aluno.setNota2(scanner.nextDouble());
            System.out.println("Digite a terceira nota");
            aluno.setNota3(scanner.nextDouble());
            System.out.println("Digite a quarta nota");
            aluno.setNota4(scanner.nextDouble());

            //Chamo a função que calcula media da classe aluno e salvo o resultado na variavel media.
            Double media = aluno.getMedia(aluno.getNota1(), aluno.getNota2(), aluno.getNota3(), aluno.getNota4());

            System.out.println("A media do aluno " + aluno.getNome() + " é: " + media);

            alunos.add(i,aluno);

        }

        //Chamo a função getMediaTurma que está na classe turma e guardo o resultado na variavel mediaTurma
        Double mediaTurma = turma.getMediaTurma(alunos);

        System.out.println("A media da turma é: " + mediaTurma);

    }

}
