package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Student;
import model.StudentData;

public class CreateStudentsWindow implements Initializable{

	 @FXML
	    private Button addStudentBTN;

	    @FXML
	    private TextField codeTF;

	    @FXML
	    private TextField idTF;

	    @FXML
	    private TextField nameTF;

		
	    void pressBTN(ActionEvent event) {
	    	if(event.getSource() == addStudentBTN) {
	    		StudentData.data.add(new Student(nameTF.getText(), Integer.parseInt(idTF.getText()), codeTF.getText()));
	    	}
	    }
	    
	    @Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}
	    
	    
}
