import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.WindowConstants;

public class nothreads extends JFrame {
	JButton b = new JButton("—читать");
	static nothreads nt;      //в листенере если ставить this он воспринимает еЄ как описание самого листенера,но здесь нельз€ создать образ самого себ€, только в майне, чтоб юзать nt здесь, надо обь€вить еЄ здесь и сделать static
	nothreads(){
	this.setLayout(new GridLayout(2,1));
	this.add(b);
	this.add(new JTextField());
	b.addActionListener(new ActionListener(){
		public void actionPerformed(java.awt.event.ActionEvent ev){
			if (ev.getSource()==b){
				for(int i=0;i<300000;i++){
					nt.setTitle(" " + i);
				}
			}
		}
	});
	this.setBounds(900,400,0,0);
	this.pack();
	this.setVisible(true);
	this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
	public static void main(String[]args){
		nt =new nothreads();
	}
}


