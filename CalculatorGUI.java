package jp.aoyama.a5817076;

import java.awt.*;
import javax.swing.*;

public class CalculatorGUI extends JFrame{
	private static final long serialVersionUID=1L;
	
	private int frame_x=290, frame_y=370;
	private int rx=10, ry=10, rw=180, rh=35;
	private int nx=10, ny=70, nw=180, nh=240;
	private int cx=200, cy=10, cw=60, ch=300;
	private int sx=50, sy=315, sw=200, sh=10;
	protected JButton[] button;
	protected JLabel result, sign;
	
	public CalculatorGUI(){
		button = new JButton[17];
		for(int i=0; i<10; i++){
			button[i] = new JButton(Integer.toString(i));
		}
		button[10]=new JButton("00");
		button[11]=new JButton("=");
		button[12]=new JButton("C");
		button[13]=new JButton("��");
		button[14]=new JButton("�~");
		button[15]=new JButton("-");
		button[16]=new JButton("+");
		
		for(int i=0;i<17;i++){
			button[i].setFont(new Font("SansSerif", Font.BOLD, 24));
		}
		
		this.setSize(frame_x, frame_y);
		this.setLayout(null);
		
		sign=new JLabel("Calculator by Hirano", JLabel.RIGHT);
		sign.setBounds(new Rectangle(sx, sy, sw, sh));
		
		result=new JLabel("0", JLabel.RIGHT);
		result.setBounds(new Rectangle(rx, ry, rw, rh));
		result.setBackground(Color.BLACK);
		result.setForeground(Color.WHITE);
		result.setFont(new Font("Dialog", Font.PLAIN, 32));
		result.setOpaque(true);
		
		JPanel numberPanel=new JPanel();
		numberPanel.setBounds(new Rectangle(nx, ny, nw, nh));
		numberPanel.setLayout(new GridLayout(4, 3));
		numberPanel.add(button[7]);
		numberPanel.add(button[8]);
		numberPanel.add(button[9]);
		numberPanel.add(button[4]);
		numberPanel.add(button[5]);
		numberPanel.add(button[6]);
		numberPanel.add(button[1]);
		numberPanel.add(button[2]);
		numberPanel.add(button[3]);
		numberPanel.add(button[0]);
		numberPanel.add(button[10]);
		numberPanel.add(button[11]);
		
		JPanel calPanel=new JPanel();
		calPanel.setBounds(new Rectangle(cx, cy, cw, ch));
		calPanel.setLayout(new GridLayout(5, 1));
		calPanel.add(button[12]);
		calPanel.add(button[13]);
		calPanel.add(button[14]);
		calPanel.add(button[15]);
		calPanel.add(button[16]);
		
		this.add(sign);
		this.add(result);
		this.add(numberPanel);
		this.add(calPanel);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new CalculatorGUI();
	}
}
