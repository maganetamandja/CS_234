import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;
public abstract class window extends JFrame implements ActionListener {
	
	//images
	static ImageIcon img = new ImageIcon("bgimage.jpg");
	 
	
	
	public static void main(String [] args){
		
	
	
	
		 
		
		JFrame frame = new JFrame("Main window");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	
	
	//create a menubar
	 JMenuBar mb = new JMenuBar();
	//create a menu 
	 JMenu x = new JMenu("Menu");
	
	//menu items
	 JMenuItem create = new JMenuItem("create");
	 
	 create.setMnemonic(KeyEvent.VK_C);
	 create.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent e){
			 System.out.println("create window");
			 newclient anewclient = new newclient();
			 anewclient.findClient();
			 
		 }
	 });
	 
	 JMenuItem report = new JMenuItem("report");
	 report.setMnemonic(KeyEvent.VK_C);
	 report.addActionListener(new ActionListener(){
		 
		 @Override
		 public void actionPerformed(ActionEvent e){
			 System.out.println("report window");
			 report areport = new report();
			 areport.fullReport();
			  }
	 });
	 //report
	 //action listner
	
	 //action taken
	
	 //
	 JMenuItem find = new JMenuItem("find");
	 find.setMnemonic(KeyEvent.VK_C);
	 find.addActionListener(new ActionListener(){
		 @Override
		 public void actionPerformed(ActionEvent e){
			 System.out.println("find window");
			 
			 find afind = new find() ;
			 
			 afind.findClient();
			  }
	 });
	
	//add menu items to menu
	
	x.add(create);
	x.add(report);
	x.add(find);
	
	//add menu to menu bar
	
	mb.add(x);
	
	//add menubar to frame.
	
	frame.setJMenuBar(mb);
	
	//add image
	frame.add(new JLabel(img));
	
	
	
	//texts
	//JLabel textLabel = new JLabel("Am A label", SwingConstants.CENTER);
	//textLabel.setPreferredSize(new Dimension(300, 100));
	//frame.getContentPane().add(textLabel, BorderLayout.CENTER);
	
	//Display the window
	frame.setLocationRelativeTo(null);
	frame.pack();
	frame.setVisible(true);
		
		
		//createwindow();
	}
}