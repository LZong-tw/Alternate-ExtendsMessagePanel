/**
 * Name: Yun-Chung Lin
 * ID: U1010425
 * Ex: Alternate Two Messages - Extends MessagePanel
 * Information: 
 *      
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Alternate extends JFrame {
  public Alternate() {
    Panel p = new Panel();
    add(p);
  }

  public static void main(String[] args) {
    Alternate frame = new Alternate();
    frame.setTitle("Alternate");
    frame.setSize(200, 100);
    frame.setLocationRelativeTo(null); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  class Panel extends MessagePanel {
    private String message1="Java is fun.", message2="Java is powerful.";
    private int x=20, y=20;
    private boolean boo=true;    //Save to judge the phase whether it's "Fun" or "Powerful"
    
    public Panel() {
      this.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          setMessage(boo==true?message1:message2);
          boo=!boo;            //Change the value of boo
        }
      });
    }
  }
}
