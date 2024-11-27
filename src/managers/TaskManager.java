package managers;

import tasks.Epic;
import tasks.SimpleTask;
import tasks.Subtask;

import java.util.List;

public interface TaskManager {

    List<Long> updateSubtasksInEpic(Epic epic);

    List<SimpleTask> getListSimpleTask();

    List<Subtask> getListSubtask();

    List<Epic> getListEpic();

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

    List<Subtask> getSubtaskListByEpicID(Long id);

    SimpleTask getTaskByID(Long id);

    Subtask getSubtaskByID(Long id);

    Epic getEpicByID(Long id);

    Long getNextID();

    void setNextID(Long nextID);
}
