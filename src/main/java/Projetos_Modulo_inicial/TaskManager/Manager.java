package Projetos_Modulo_inicial.TaskManager;

import java.util.ArrayList;

public class Manager {

    ArrayList<Task> taskLists = new ArrayList<>();

    public void listarTarefas() {

        for (Task item : taskLists) {

            if (item instanceof PersonalTask ) {
                PersonalTask p = (PersonalTask) item;

                System.out.print(p.getLocal());
            } else {
                System.out.print(item);
            }
        }

    }

}
