package Projetos_Modulo_inicial.TaskManager;

public class Task {

    private long id;
    private String descricao;
    private boolean concluida;

    public Task(long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.concluida = false;
    }

    public long getId() {
        return this.id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public boolean getConcluida() {
        return this.concluida;
    }
    
    public void setConcluida(boolean status) {
    this.concluida = status;
}

}
