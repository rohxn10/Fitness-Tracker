import javax.swing.*;
import java.awt.*;

public class StatisticsUI extends JFrame {
    private Statistics statistics;

    public StatisticsUI(Statistics statistics) {
        this.statistics = statistics;

        setTitle("User Statistics");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300); // Set window size
        setLocationRelativeTo(null); // Center window on screen
        setLayout(new BorderLayout());

        JPanel statisticsPanel = new JPanel();
        statisticsPanel.setLayout(new GridLayout(4, 2, 10, 10)); // 4 rows, 2 columns
        statisticsPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Add padding

        // Custom fonts and colors
        Font labelFont = new Font("Arial", Font.BOLD, 16);
        Color labelColor = new Color(50, 50, 50);
        Font valueFont = new Font("Arial", Font.PLAIN, 14);
        Color valueColor = new Color(100, 100, 100);

        JLabel activeMinutesLabel = new JLabel("Active Minutes:");
        activeMinutesLabel.setFont(labelFont);
        activeMinutesLabel.setForeground(labelColor);
        JLabel activeMinutesValueLabel = new JLabel(String.valueOf(statistics.getActiveMinutes()));
        activeMinutesValueLabel.setFont(valueFont);
        activeMinutesValueLabel.setForeground(valueColor);
        JLabel caloriesBurnedLabel = new JLabel("Calories Burned:");
        caloriesBurnedLabel.setFont(labelFont);
        caloriesBurnedLabel.setForeground(labelColor);
        JLabel caloriesBurnedValueLabel = new JLabel(String.valueOf(statistics.getCaloriesBurned()));
        caloriesBurnedValueLabel.setFont(valueFont);
        caloriesBurnedValueLabel.setForeground(valueColor);
        JLabel sleepHoursLabel = new JLabel("Sleep Hours:");
        sleepHoursLabel.setFont(labelFont);
        sleepHoursLabel.setForeground(labelColor);
        JLabel sleepHoursValueLabel = new JLabel(String.valueOf(statistics.getSleepHours()));
        sleepHoursValueLabel.setFont(valueFont);
        sleepHoursValueLabel.setForeground(valueColor);
        JLabel nutritionalIntakeLabel = new JLabel("Nutritional Intake:");
        nutritionalIntakeLabel.setFont(labelFont);
        nutritionalIntakeLabel.setForeground(labelColor);
        JLabel nutritionalIntakeValueLabel = new JLabel(String.valueOf(statistics.getNutritionalIntake()));
        nutritionalIntakeValueLabel.setFont(valueFont);
        nutritionalIntakeValueLabel.setForeground(valueColor);

        // Add labels and values to the panel
        statisticsPanel.add(activeMinutesLabel);
        statisticsPanel.add(activeMinutesValueLabel);
        statisticsPanel.add(caloriesBurnedLabel);
        statisticsPanel.add(caloriesBurnedValueLabel);
        statisticsPanel.add(sleepHoursLabel);
        statisticsPanel.add(sleepHoursValueLabel);
        statisticsPanel.add(nutritionalIntakeLabel);
        statisticsPanel.add(nutritionalIntakeValueLabel);

        add(statisticsPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        // Example usage
        Statistics statistics = new Statistics(120, 500.5, 7.5, 2500);
        SwingUtilities.invokeLater(() -> new StatisticsUI(statistics));
    }
}
