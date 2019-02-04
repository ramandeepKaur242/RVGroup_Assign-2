import javax.swing.*;
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(" gurveer Hello world");
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button = new JButton("Press");
        frame.getContentPane().add(button); 
        frame.setVisible(true);
     }
 
	}


