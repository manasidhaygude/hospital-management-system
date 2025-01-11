package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JTextField textField;
    JPasswordField jPasswordField;
    JButton b1, b2;

    Login() {
        // Username Label
        JLabel namelabel = new JLabel("Username");
        namelabel.setBounds(40, 20, 100, 30);
        namelabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        namelabel.setForeground(Color.BLACK);
        add(namelabel);

        // Password Label
        JLabel password = new JLabel("Password");
        password.setBounds(40, 70, 100, 30);
        password.setFont(new Font("Tahoma", Font.BOLD, 16));
        password.setForeground(Color.BLACK);
        add(password);

        // Username TextField
        textField = new JTextField();
        textField.setBounds(150, 20, 150, 30);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField.setBackground(new Color(255, 179, 0));
        add(textField);

        // Password Field
        jPasswordField = new JPasswordField();
        jPasswordField.setBounds(150, 70, 150, 30);
        jPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jPasswordField.setBackground(new Color(255, 179, 0));
        add(jPasswordField);

        // Image Label
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("hospital/management/system/icon/login.png"));
        if (imageIcon.getImageLoadStatus() != MediaTracker.COMPLETE) {
            System.err.println("Image not found! Check the path.");
        } else {
            Image i1 = imageIcon.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
            JLabel label = new JLabel(new ImageIcon(i1));
            label.setBounds(320, -30, 400, 300);
            add(label);
        }

        // Login Button
        b1 = new JButton("Login");
        b1.setBounds(40, 140, 120, 30);
        b1.setFont(new Font("Serif", Font.BOLD, 15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        // Cancel Button
        b2 = new JButton("Cancel");
        b2.setBounds(180, 140, 120, 30);
        b2.setFont(new Font("Serif", Font.BOLD, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        // Frame Properties
        getContentPane().setBackground(new Color(109, 164, 170));
        setSize(750, 300);
        setLocation(400, 270);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application properly
        setVisible(true);
    }

    // ActionListener method implementation
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            // Handle login logic here
            String username = textField.getText();
            String password = new String(jPasswordField.getPassword());
            // Example: Display entered credentials (Replace this with actual login logic)
            System.out.println("Username: " + username + ", Password: " + password);
        } else if (e.getSource() == b2) {
            // Handle cancel action
            System.exit(0); // Exit the application
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
