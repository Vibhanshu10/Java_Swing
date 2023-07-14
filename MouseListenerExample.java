import java.awt.*;  
import java.awt.event.*;  
public class MouseListenerExample extends Frame implements MouseListener{  
    Label l;  
    MouseListenerExample(){  
        addMouseListener(this);  
          
        l=new Label();  
        l.setBounds(20,50,100,20);  
        add(l);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) {  
        l.setBounds(40,40,100,20);  
    }  
    public void mouseEntered(MouseEvent e) {  
         l.setBounds(40,40,200,20);  
    } 
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");
          l.setBounds(40,40,200,20);    
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  
public static void main(String[] args) {  
    new MouseListenerExample();  
}  
}  