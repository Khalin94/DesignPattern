import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class SwingObserver{
	JFrame frame;

	public static void main(String[] args){
		SwingObserver observer = new SwingObserver();
		observer.go();

	}

	public void go(){
		frame = new JFrame();
		JButton button = new JButton("Click!");

		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);

		frame.setSize(200, 200);
		frame.setVisible(true);
	}

	class AngelListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			System.out.println("angle");
		}
	}

	class DevilListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			System.out.println("devil");
		}
	}
}
