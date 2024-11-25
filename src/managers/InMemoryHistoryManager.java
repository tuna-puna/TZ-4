package managers;

import tasks.Task;

import java.util.ArrayList;

public class InMemoryHistoryManager implements HistoryManager {
    public static final Integer SIZE_MAX_HISTORY = 10;
    private static final ArrayList<Task> historyList = new ArrayList<>();

    @Override
    public void add(Task task) {
        if (historyList.size() < SIZE_MAX_HISTORY) {
            historyList.add(task);
        } else {
            historyList.remove(0);
            historyList.add(task);
        }
    }

    @Override
    public ArrayList<Task> getHistory() { //    public List<Task> getHistory() {
        return historyList;
    }
}