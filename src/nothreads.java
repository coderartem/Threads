import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.WindowConstants;

public class nothreads extends JFrame {
	JButton b = new JButton("�������");
	static nothreads nt;      //� ��������� ���� ������� this �� ������������ � ��� �������� ������ ���������,�� ����� ������ ������� ����� ������ ����, ������ � �����, ���� ����� nt �����, ���� �������� � ����� � ������� static
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


