package managers;

import tasks.Task;

import java.util.ArrayList;

public class Managers {

    public TaskManager getDefault() {
        return new InMemoryTaskManager();
    }

    public static ArrayList<Task> getDefaultHistory() {
        return new InMemoryHistoryManager().getHistory();
    }
}