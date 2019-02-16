 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;


public class Application
{



	public static void main(String[] args)
	{

		String[] list = {"hey","bye"};

		SwingUtilities.invokeLater(new Runnable()
		{
			public void run() 
			{


				
				JFrame frame = new JFrame("DND Simulation");
				JList characters = new JList(list);
				characters.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				characters.setLayoutOrientation(JList.HORIZONTAL_WRAP);
				characters.setVisibleRowCount(-1);
				JScrollPane listScroller = new JScrollPane(characters);
				frame.setSize(500,500);
				frame.getContentPane().add(characters, "West");

				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
}