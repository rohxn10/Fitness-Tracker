import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class HomePageUI extends JFrame {

    public HomePageUI(String username) {
        setTitle("Fitness Tracker - Home Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600); // Set a larger window size
        setLayout(new BorderLayout());

        JPanel contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set background color
                g.setColor(new Color(240, 0, 240)); // Light gray color
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        contentPane.setLayout(new BorderLayout());
        add(contentPane, BorderLayout.CENTER);

        JLabel welcomeLabel = new JLabel("Welcome, " + username + "!");
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24)); // Increase font size
        contentPane.add(welcomeLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton statisticsButton = new JButton("Check Statistics");
        statisticsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open StatisticsUI
                openStatisticsUI();
            }
        });
        buttonPanel.add(statisticsButton);

        JButton activitiesButton = new JButton("Check Activities");
        activitiesButton.addActionListener(e -> openActivityUI());
        buttonPanel.add(activitiesButton);

        JButton setGoalsButton = new JButton("Set Goals");
        setGoalsButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Setting goals..."));
        buttonPanel.add(setGoalsButton);

        JButton historyButton = new JButton("Check History");
        historyButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Checking history..."));
        buttonPanel.add(historyButton);

        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(e -> logout());
        logoutButton.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // Add padding
        JPanel logoutPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        logoutPanel.add(logoutButton);
        contentPane.add(logoutPanel, BorderLayout.NORTH);

        setVisible(true);
    }

    private void logout() {
        dispose(); // Close the home page window
        // Add your code here to return to the login page
    }

    private void openStatisticsUI() {
        // Create a Statistics object (for demo purpose)
        Statistics statistics = new Statistics(120, 500.5, 7.5, 2500);
        // Open StatisticsUI
        SwingUtilities.invokeLater(() -> new StatisticsUI(statistics));
    }

    private void openActivityUI() {
        // Create instances for different activities
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity("Running", 60, 5, 300));
        activities.add(new Activity("Swimming", 45, 1.5, 200));
        activities.add(new Activity("Walking", 30, 3, 150));
        activities.add(new Activity("Cycling", 90, 10, 400));

        // Open ActivityUI
        SwingUtilities.invokeLater(() -> new ActivityUI(activities));
    }

    public static void main(String[] args) {
        // Example usage: Display home page for a user "JohnDoe"
        SwingUtilities.invokeLater(() -> new HomePageUI("JohnDoe"));
    }
}
