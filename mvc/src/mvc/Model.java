package mvc;

public class Model {
	private String input;
	private String output;
	
	public void calculateStringComp(){
		this.output = this.input + " " + this.input;
	}
	
	public String getOutput(){
		return this.output;
	}
	
	public void setInput(String wert){
		this.input = wert;
	}
}
