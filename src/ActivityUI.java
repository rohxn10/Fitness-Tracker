import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.List;

public class ActivityUI extends JFrame {

    public ActivityUI(List<Activity> activities) {
        setTitle("Activity Details");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        // Title Panel
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Activities");
        titleLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        titlePanel.add(titleLabel);
        add(titlePanel, BorderLayout.NORTH);

        JPanel activityPanel = new JPanel();
        activityPanel.setLayout(new BoxLayout(activityPanel, BoxLayout.Y_AXIS));
        activityPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        for (Activity activity : activities) {
            JPanel panel = new JPanel(new GridLayout(4, 1));
            panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            panel.setBackground(Color.WHITE);

            JLabel typeLabel = new JLabel("Type: " + activity.getType());
            JLabel durationLabel = new JLabel("Duration: " + activity.getDuration() + " minutes");
            JLabel distanceLabel = new JLabel("Distance: " + activity.getDistance() + " km");
            JLabel caloriesLabel = new JLabel("Calories Burned: " + activity.getCaloriesBurned() + " kcal");

            // Apply some styling to the labels
            typeLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            durationLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
            distanceLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
            caloriesLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));

            panel.add(typeLabel);
            panel.add(durationLabel);
            panel.add(distanceLabel);
            panel.add(caloriesLabel);

            activityPanel.add(panel);
            activityPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Add spacing between activity panels
        }

        JScrollPane scrollPane = new JScrollPane(activityPanel);
        scrollPane.setBorder(null); // Remove border from scroll pane
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        // Create instances for different activities
        List<Activity> activities = List.of(
                new Activity("Running", 60, 5, 300),
                new Activity("Swimming", 45, 1.5, 200),
                new Activity("Walking", 30, 3, 150),
                new Activity("Cycling", 90, 10, 400)
        );

        // Display activity details UI
        SwingUtilities.invokeLater(() -> new ActivityUI(activities));
    }
}
