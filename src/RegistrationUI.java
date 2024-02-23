import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationUI extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField emailField;
    private JTextField nameField;
    private JTextField ageField;
    private JTextField heightField;
    private JTextField weightField;

    public RegistrationUI() {
        setTitle("Fitness Tracker - Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout(10, 10));
        JPanel panel = new JPanel(new GridLayout(8, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        panel.add(usernameLabel);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        panel.add(passwordLabel);
        panel.add(passwordField);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        panel.add(emailLabel);
        panel.add(emailField);

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        panel.add(nameLabel);
        panel.add(nameField);

        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField();
        panel.add(ageLabel);
        panel.add(ageField);

        JLabel heightLabel = new JLabel("Height (m):");
        heightField = new JTextField();
        panel.add(heightLabel);
        panel.add(heightField);

        JLabel weightLabel = new JLabel("Weight (kg):");
        weightField = new JTextField();
        panel.add(weightLabel);
        panel.add(weightField);

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
        panel.add(new JLabel()); // Placeholder for alignment
        panel.add(registerButton);

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void registerUser() {
        // Retrieve user data from input fields
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String email = emailField.getText();
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        double height = Double.parseDouble(heightField.getText());
        double weight = Double.parseDouble(weightField.getText());

        // Create a new User object
        User newUser = new User(username, password, email, age, weight, height);

        // Add the new user to the user database
        UserDatabase.addUser(newUser);

        // Display registration confirmation message
        JOptionPane.showMessageDialog(this, "Registration successful!\nWelcome, " + newUser.getUsername() + "!");

        // Close the registration window
        dispose();

        // Open the home page window
        new HomePageUI(newUser.getUsername());
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistrationUI();
            }
        });
    }
}
