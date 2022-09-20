import javax.swing.*;

public class Gui{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gui Practice");
        JLabel label = new JLabel("Name :");
        label.setBounds(10,20,200,20);
        JTextField text = new JTextField();
        text.setBounds(70,20,300,20);
        JLabel label1 = new JLabel("Account :");
        label1.setBounds(10,70,200,20);
        JTextField text1 = new JTextField();
        text1.setBounds(70,70,300,20);
        JLabel label2 = new JLabel("Address :");
        label2.setBounds(10,120,200,20);
        JTextField text2 = new JTextField();
        text2.setBounds(70,120,300,20);
        JButton submit = new JButton("Submit");
        submit.setBounds(100,170,100,30);
        frame.setSize(400,300);
        frame.setLayout(null);
        frame.add(label);
        frame.add(text);
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(submit);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}