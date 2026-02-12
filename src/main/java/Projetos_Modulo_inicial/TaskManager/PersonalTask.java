package Projetos_Modulo_inicial.TaskManager;

public class PersonalTask extends Task {

    private String pTask;

    public PersonalTask(int id, String descricao, String pTask) {
        super(id, descricao);
        this.pTask = pTask;
    }

    public String getpTask() {
        return this.pTask;
    }

}
