import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.*;  
import javax.swing.JLabel;  
  
public class Label_button {  
    public static void main(String s[]) {  
        JFrame frame = new JFrame("JFrame Example");  
         
        JLabel label = new JLabel("JFrame By Example");  
        JButton button = new JButton();  
        button.setText("Button");  
        frame.add(label);  
        frame.add(button);  
     
        frame.setSize(200, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}   