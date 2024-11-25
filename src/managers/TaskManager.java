package managers;

import tasks.Epic;
import tasks.SimpleTask;
import tasks.Subtask;

import java.util.ArrayList;

public interface TaskManager {
    ArrayList<Long> updateSubtasksInEpic(Epic epic);

    ArrayList<SimpleTask> getListSimpleTask();

    ArrayList<Subtask> getListSubtask();

    ArrayList<Epic> getListEpic();

    Long add(SimpleTask task);

    Long add(Subtask task);

    Long add(Epic epic);

    void update(SimpleTask task);

    void update(Subtask subtask);

    void update(Epic epic);

    void removeAllSimpleTasks();

    void removeAllSubtasks();

    void removeAllEpics();

    void removeAll();

    void remove(Long id);

    ArrayList<Subtask> getSubtaskListByEpicID(Long id);

    SimpleTask getTaskByID(Long id);

    Subtask getSubtaskByID(Long id);

    Epic getEpicByID(Long id);

    Long getNextID();

    void setNextID(Long nextID);
}