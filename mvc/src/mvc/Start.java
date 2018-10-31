package mvc;

public class Start {
static Controller control;
static View view;
static Model model;
	public static void main(String[] args) {
		model = new Model();
		view = new View();
		control = new Controller(view, model);
		view.setVisible(true);
	}

}
