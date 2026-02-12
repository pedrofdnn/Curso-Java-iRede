package Projetos_Modulo_inicial.TaskManager;

public class WorkTask extends Task {

    private String worTask;

    public WorkTask(int id, String descricao, String worTask) {
        super(id, descricao);
        this.worTask = worTask;
    }

    public String getWorTask() {
        return worTask;
    }
}
