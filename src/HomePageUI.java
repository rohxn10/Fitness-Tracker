import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class HomePageUI extends JFrame {

    
    public HomePageUI(String username) {
        setTitle("Fitness Tracker - Home Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600); // Set a larger window size
        setLayout(new BorderLayout());
        
        
        JLabel welcomeLabel = new JLabel("Welcome, " + username + "!");
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24)); // Increase font size
        add(welcomeLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton statisticsButton = new JButton("Check Statistics");
        statisticsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add action to check statistics
                JOptionPane.showMessageDialog(null, "Checking statistics...");
            }
        });
        buttonPanel.add(statisticsButton);

        JButton activitiesButton = new JButton("Check Activities");
        activitiesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add action to open ActivityUI
                openActivityUI();
            }
        });
        buttonPanel.add(activitiesButton);

        JButton setGoalsButton = new JButton("Set Goals");
        setGoalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add action to set goals
                JOptionPane.showMessageDialog(null, "Setting goals...");
            }
        });
        buttonPanel.add(setGoalsButton);

        JButton historyButton = new JButton("Check History");
        historyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add action to check history
                JOptionPane.showMessageDialog(null, "Checking history...");
            }
        });
        buttonPanel.add(historyButton);

        add(buttonPanel, BorderLayout.SOUTH);

        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logout();
            }
        });
        add(logoutButton, BorderLayout.NORTH);

        setVisible(true);
    }

    private void logout() {
        // You can perform logout operations here, such as closing the current window and returning to the login page.
        dispose(); // Close the home page window
        // Add your code here to return to the login page
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
