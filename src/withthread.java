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
	JButton b = new JButton("�������");
	Thread tr = new Thread(this);
// ��� ����� ����� ���� ������������ Thread (�� ����������� ����� ���� ������ ����),����� � ����� ���� ������ ������� 
//��������� ������ ������ � main (���������������� ��� ������) ��� �������� this
//� �� ���� ������������ Runnable, run() �������� ������� Thread � ����������� ������ ��� ������� start()
	
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
