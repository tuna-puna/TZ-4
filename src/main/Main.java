package main;

import static status.StatusEnum.*;
import managers.*;
import tasks.Epic;
import tasks.SimpleTask;
import tasks.Subtask;

public class Main {
    public static void main(String[] args) {

        Managers managers = new Managers();

        TaskManager taskManager = managers.getDefault();

        Long simpleTask1 = taskManager.add(new SimpleTask("Обычный task - 1", "", NEW_TODO));
        Long simpleTask2 = taskManager.add(new SimpleTask("Обычный task - 2", "", NEW_TODO));

        Long epic1 = taskManager.add(new Epic("Мой первый эпик", ""));
        Long subtask1 = taskManager.add(new Subtask("SubTask - 1, epic - 1", "", NEW_TODO, epic1));
        Long subtask2 = taskManager.add(new Subtask("SubTask - 2, epic - 1", "", NEW_TODO, epic1));

        Long epic2 = taskManager.add(new Epic("Epic - 2", ""));
        Long subtask3 = taskManager.add(new Subtask("SubTask - 1, epic - 2", "", NEW_TODO, epic2));

        taskManager.getTaskByID(1L);
        System.out.println("Печать истории поиска");
        System.out.println(Managers.getDefaultHistory());

        taskManager.getEpicByID(3L);
        System.out.println("Печать истории поиска");
        System.out.println(Managers.getDefaultHistory());

        taskManager.getSubtaskByID(4L);
        System.out.println("Печать истории поиска");
        System.out.println(Managers.getDefaultHistory());

        System.out.println("Печать всех задач");
        System.out.println(taskManager.getListEpic());
        System.out.println(taskManager.getListSimpleTask());
        System.out.println(taskManager.getListSubtask());

        taskManager.update(new SimpleTask(simpleTask1, "Task - 1 - новый", "", IN_PROGRESS));
        taskManager.update(new Subtask(subtask1, "Subtask - новый", "", DONE, epic1));
        taskManager.update(new Epic(epic2, "Epic - новый - 2", ""));

        System.out.println("Печать всех задач");
        System.out.println(taskManager.getListEpic());
        System.out.println(taskManager.getListSimpleTask());
        System.out.println(taskManager.getListSubtask());

        taskManager.remove(simpleTask2);
        taskManager.remove(epic2);
    }
}