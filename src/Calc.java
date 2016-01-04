import javax.swing.*;

import java.awt.*;
import java.util.Vector;

public class Calc extends JFrame{
	
	
	//Event Object Instantiation//
	CalcEvent func = new CalcEvent(this);
	JPanel row1 = new JPanel();
	JPanel row2 = new JPanel();
	JPanel row3 = new JPanel();
	JPanel row4 = new JPanel();
	JLabel data = new JLabel("Data:");
	JTextField entry = new JTextField("       ");
	JButton decimal = new JButton(".");
	JToggleButton negative = new JToggleButton("+/-");
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton zero = new JButton("0");
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JButton mult = new JButton("*");
	JButton div = new JButton("/");
	JButton Enter = new JButton("Enter");
	JButton clear = new JButton("Clear");
	JLabel product = new JLabel("Product");
	JTextField result = new JTextField();
	
	

	
	
	
	
	
	public Calc(){
		super("CalcBeta");
		Dimension texter = new Dimension(80,20);
		entry.setPreferredSize(texter);
		result.setPreferredSize(texter);
		Font dataFont = new Font("RomanBaseline", Font.CENTER_BASELINE, 12); 
		entry.setFont(dataFont);
		result.setFont(dataFont);
		
		setSize(420,420);
		//Encompassing GridLayout
		GridLayout grid = new GridLayout(3,2,18,18);
		setLayout(grid);
		//Layout for row1.
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
	    GridLayout grid1 = new GridLayout(3,2,18,18);
	    GridLayout grid2 = new GridLayout(4,3,10,10);
		
		row1.setLayout(layout);
		row1.add(data);
		row1.add(entry);
		add(row1);
		
	
		row2.setLayout(grid1);
		
		row2.add(plus);
		row2.add(minus);
		row2.add(mult);
		row2.add(div);
		row2.add(Enter);
		row2.add(clear);
		
		
		
		
		row3.setLayout(layout);
		result.setEditable(false);
		row3.add(product);
		row3.add(result);
		
		add(row3);
		
		row4.setLayout(grid2);
		row4.add(one);
		row4.add(two);
		row4.add(three);
		row4.add(four);
		row4.add(five);
		row4.add(six);
		row4.add(seven);
		row4.add(eight);
		row4.add(nine);
		row4.add(decimal);
		row4.add(zero);
		row4.add(negative);
		
		
		add(row4);
		add(row2);
		
		setVisible(true);
		
		//ActionListeners
		
		one.addActionListener(func);
		two.addActionListener(func);
		three.addActionListener(func);
		four.addActionListener(func);
		five.addActionListener(func);
		six.addActionListener(func);
		seven.addActionListener(func);
		eight.addActionListener(func);
		nine.addActionListener(func);
		zero.addActionListener(func);
		decimal.addActionListener(func);
		negative.addChangeListener(func);
		plus.addActionListener(func);
		minus.addActionListener(func);
		mult.addActionListener(func);
		div.addActionListener(func);
		Enter.addActionListener(func);
		clear.addActionListener(func);
	}
	

		

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc CC = new Calc();
	}

}
