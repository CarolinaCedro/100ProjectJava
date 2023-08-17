package application;

import java.util.*;

public interface Todo {

    void createTask(Tarefa tarefa);

    Tarefa getTask(String title);

    void removeTask(Tarefa tituloTarefa);

    List<Tarefa> getAll();

    Tarefa marcarConcluida(Tarefa tarefa);
}
