
import java.util.ArrayList;

public class TaskList implements ITask {
    ArrayList<String> tasks = new ArrayList<String>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public double getWorkingHours(String place) {
        double totalHours = 0;
        for (String task : tasks) {
            if (task.toLowerCase().contains(place.toLowerCase())) {
                if (place.equalsIgnoreCase("HCM")) {
                    totalHours += 5;
                } else {
                    totalHours += 2;
                }
            }
        }

        return totalHours;
    }

    public String getTaskName(String place) {
        String taskNames = "";

        for (String task : tasks) {
            if (task.toLowerCase().contains(place.toLowerCase())) {
                int index = task.indexOf('@');
                taskNames += task.substring(0, index) + ";";
            }
        }

        return taskNames;
    }
}