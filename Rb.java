/* This is my try on creating GUI in Java.
   I created two radio buttons here to select gender.
   The code i found on stack overflow and optimized 
   it with Google Ai Tool. */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JFrame;

public class Rb extends JFrame
{
    Rb()
    {
        //Set window title & close behaviour
        this.setTitle("Gender Selection");                     // Gave by Google Ai
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Gave by Google Ai

        //Creation of radio button
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        //Group the radio buttons so only one can be selected
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        
        //Set layout & add Components
        this.setLayout(new FlowLayout());
        this.add(male);
        this.add(female);

        //Initial State
        male.setSelected(true);

        //Size & visibility
        this.setSize(250, 100);
        this.setVisible(true);
    }

    public static void main(String A[])
    {
        Rb j = new Rb();
    }
}