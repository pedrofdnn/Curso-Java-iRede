package Projetos_Modulo_inicial.TaskManager;

public class Task {

    private int id;
    private String descricao;
    private boolean concluida;

    public Task(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.concluida = false;
    }

    public int getId() {
        return this.id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public boolean getConcluida() {
        return this.concluida;
    }

}
