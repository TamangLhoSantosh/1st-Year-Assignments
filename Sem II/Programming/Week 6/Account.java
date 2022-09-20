import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Account{

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Account Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 700);
        JLabel label = new JLabel("Name");
        label.setBounds(100, 100, 40, 20);
        JTextField text = new JTextField();
        text.setBounds(200, 100, 100, 50);
        JButton submit = new JButton("Submit");
        submit.setBounds(200, 300, 80, 60);
        frame.add(label);
        frame.add(text);
        frame.add(submit);
        frame.setVisible(true);
    }
}