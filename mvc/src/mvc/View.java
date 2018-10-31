package mvc;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class View extends JFrame{
	public JTextField txtInput;
	public JTextField txtOutput;
	public JButton btnCalc;
	public View(){
		getContentPane().setLayout(new MigLayout("", "[grow]", "[][][]"));
		
		txtInput = new JTextField();
		getContentPane().add(txtInput, "cell 0 0,growx");
		txtInput.setColumns(10);
		
		btnCalc = new JButton("New button");
		getContentPane().add(btnCalc, "cell 0 1");
		
		txtOutput = new JTextField();
		getContentPane().add(txtOutput, "cell 0 2,growx");
		txtOutput.setColumns(10);
		this.pack();
		
	}
	
	public void setListener(ActionListener l){
		this.btnCalc.addActionListener(l);
	}
	
	public void setOutput(String output){
		this.txtOutput.setText(output);
	}
}
