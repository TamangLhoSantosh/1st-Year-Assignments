import javax.swing.JOptionPane;
 public class Gui{
    public static void main(String[] args) {
        
        String n = JOptionPane.showInputDialog("Enter any number:");
        int a = Integer.parseInt(n);
        System.out.println(a);
        JOptionPane.showMessageDialog(null, a);
    }
 }