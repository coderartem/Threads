import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.lang.Thread;
import javax.swing.WindowConstants;
import java.lang.Runnable;

public class withthread extends JFrame implements Runnable {
	static withthread wt;
	JButton b = new JButton("Считать");
	Thread tr = new Thread(this);
// или класс может быть продолжением Thread (но продолжение может быть только одно),тогда в майне надо просто создать 
//экземпляр нашего класса в main (инициализировать как обычно) без указания this
//и не надо имплементать Runnable, run() является методом Thread и запускается другим его методом start()
	
	withthread(){
				
	b.addActionListener(new ActionListener(){
		public void actionPerformed(java.awt.event.ActionEvent ev){
		if(ev.getSource()==b){
			tr.start();
}}});
	this.add(b);
	this.add(new JTextField());
	this.setLayout(new GridLayout(2,1,5,5));
	this.setBounds(900,400,0,0);
	this.pack();
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void run(){
		for (int i=0;i<300000;i++){
			wt.setTitle("  i="+i);
		}}
	
	public static void main (String[]args){
		wt=new withthread();
	}}
