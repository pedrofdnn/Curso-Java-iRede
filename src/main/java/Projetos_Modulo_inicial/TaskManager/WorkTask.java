package Projetos_Modulo_inicial.TaskManager;

public class WorkTask extends Task {

    private String prioridade;

    public WorkTask(int id, String descricao, String prioridade) {
        super(id, descricao);

        this.prioridade = prioridade;
    }

    public String getPrioridade() {
        return prioridade;
    }
}
