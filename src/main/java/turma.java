import java.util.List;

public class turma {

    List<aluno> alunos;

    public Double getMediaTurma(List<aluno> alunos){

        System.out.println("A turma tem " + alunos.size() + " alunos");

        Double mediaTurma = 0.0;

        for (int i = 0; i < alunos.size();i ++){

            mediaTurma += alunos.get(i).getMedia(alunos.get(i).getNota1(),alunos.get(i).getNota2(),alunos.get(i).getNota3(),alunos.get(i).getNota4());

        }
        return mediaTurma;
    }

}
