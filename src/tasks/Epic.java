package tasks;

import Status.StatusEnum;
import java.util.ArrayList;

public class Epic extends Task {
    private ArrayList<Long> subtaskIDs;

    public Epic(String name, String description) {
        super(0L, name, description);
        subtaskIDs = new ArrayList<>();
    }

    public Epic(Long id, String name, String description, StatusEnum status) {
        super(id, name, description, status);
        subtaskIDs = new ArrayList<>();
    }

    public Epic(Long id, String name, String description) {
        super(id, name, description);
        subtaskIDs = new ArrayList<>();
    }

    public ArrayList<Long> getSubtaskIDs() {
        return subtaskIDs;
    }

    public void setSubtaskIDs(ArrayList<Long> subtaskIDs) {
        this.subtaskIDs = subtaskIDs;
    }

    @Override
    public String toString() {
        return "Epic{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + "'" +
                ", subtaskIDs=" + subtaskIDs +
                ", status='" + getStatus() + "'" +
                '}';
    }
}