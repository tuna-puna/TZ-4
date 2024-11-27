package tasks;

import status.StatusEnum;
import java.util.ArrayList;
import java.util.List;

public class Epic extends Task {
    private List<Long> subtaskIDs;

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

    public List<Long> getSubtaskIDs() {
        return subtaskIDs;
    }

    public void setSubtaskIDs(List<Long> subtaskIDs) {
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