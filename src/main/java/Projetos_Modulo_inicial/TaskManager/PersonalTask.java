package Projetos_Modulo_inicial.TaskManager;

public class PersonalTask extends Task {

    private String local;

    public PersonalTask(int id, String descricao, String local) {
        super(id, descricao);
        this.local = local;
    }

    public String getLocal() {
        return this.local;
    }

}
