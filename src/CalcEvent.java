import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Vector;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

//Add Key listeners to allow input via keyboard versus buttons.
public class CalcEvent implements ActionListener, ChangeListener {

	
	Calc gui;
	char posNeg;
	String num;
	String numText;
    Double addend1;
    Double addend2;
    Double prod;
    int val = 0;
    Object change;
    int set;
    String operant;
    
	public CalcEvent(Calc in) {
		// TODO Auto-generated constructor stub
		gui = in;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		
		// Prevent user from pressing enter without entering second set of data. Dialog Box.
	     num = e.getActionCommand();
		System.out.print(num);
	     strungOut();
	     
	     switch (num){
	     
	     case "-":
	    	 operant = "-";
	    	 addend1 = Double.parseDouble(gui.entry.getText());
	    	 clearOn();
	    	 break;
	    	 
	    	 
	     case "+":
	    
	    	 operant = "+";
	    	 
	    	 addend1 = Double.parseDouble(gui.entry.getText());
	    	 
	    	 System.out.print(addend1.toString());
	    	 
	    	 clearOn();
	    	 break;
	    	 
	     
	     case "*":
	    	 
	    	 operant = "*";
	    	 
	    	 addend1 = Double.parseDouble(gui.entry.getText());
	    	 
	    	 clearOn();
	    	 break;
	    	 
	     case "Clear":
	    	 
	    	 clearOn();
	    	 gui.result.setText("");
	    	 break;
	    	 
	     case "/":
	    	 operant = "/";
	    	 
	    	 addend1 = Double.parseDouble(gui.entry.getText());
	    	 
	    	 clearOn();
	    	 break;
	     case "Enter" :
	    	 gui.result.setEditable(true);
	    	 
	    	 switch(operant){
	    	 
	    	 case "-" :
	    		 subOn();
	    		 clearOn();
	    	
	    		 break;
	    	 case "+" :
	    		 addOn();
	    		 clearOn();
	    		 break;
	    		 
	    	 case "*":
	    		 multOn();
	    		 clearOn();
	    		 break;
	    		 
	    	 case "/":
	    		 divOn();
	    		 clearOn();
	    		 break;
	    	 }
	    	 }
	    	
	    	 
	    

	    	 
 
	
	



	
	    	 
	     }
	
	     
	     
	    
		
	
	
	public void strungOut(){
	
		
		numText = num;
		if(num != "+" && num != "Enter" && num != "+/-" && num != "-" && num != "/" && num != "*"){
		gui.entry.setText(gui.entry.getText() + numText);//Appends most recently pressed number button to current text.
		                       //Allows multiple digit numbers.
		
		
		}
}
	
		
	
	
	//Mathematical Functions:
	//Place Functions in separate class.
	public void addOn(){
		// extract numbers from vectors.
		
		
		addend2 = Double.parseDouble(gui.entry.getText());
		
		prod = (addend1 + addend2);
			
		gui.result.setText(prod.toString());
		
	}
	
	public void multOn(){
		addend2 = Double.parseDouble(gui.entry.getText());
		
		prod = (addend1 * addend2);
		
		gui.result.setText(prod.toString());
	}
	
	public void divOn(){
		
		addend2 = Double.parseDouble(gui.entry.getText());
		
		prod = (addend1 / addend2);
		
		gui.result.setText(prod.toString());
	}
		public void subOn(){
		addend2 = Double.parseDouble(gui.entry.getText());
		
		prod = (addend1 - addend2);
		
		gui.result.setText(prod.toString());
	}
	
	public void clearOn(){
		gui.entry.setText("");
		
		
		

	}

	@Override
	public void stateChanged(ChangeEvent c) {
		// TODO Auto-generated method stub

		if (gui.negative.isSelected()){
			
			gui.entry.setText("-");
		} else{
			gui.entry.setText("");
		}
	
	}
}
	



