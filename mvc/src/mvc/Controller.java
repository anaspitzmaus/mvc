package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	View myView;
	Model myModel;
	
	public Controller(View myView, Model myModel){
		this.myView = myView;
		this.myModel = myModel;
		addListener();
	}

	private void addListener() {
		this.myView.setListener(new TestListener());
		
	}

	class TestListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {			
			myModel.setInput(myView.txtInput.getText());
			myModel.calculateStringComp();
			myView.setOutput(myModel.getOutput());			
		}
		
	}
}
