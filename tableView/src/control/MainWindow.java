package control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import main.Main;
import model.Student;

public class MainWindow implements Initializable{
    
	//Anchor pane
	@FXML
    private AnchorPane mainAP;
    
    //Table columns
    @FXML
    private TableColumn<Student, String> codeTC;
    
    @FXML
    private TableColumn<Student, Integer> idTC;

    @FXML
    private TableColumn<Student, String> nameTC;

   
    //Table view
    @FXML
    private TableView<Student> mainTV;

    //Buttons
    @FXML
    private Button addBTN;
    
    void pressBTN(ActionEvent event) {
    	if(event.getSource()== addBTN) {
    		FXMLLoader loader = new FXMLLoader(Main.class.getResource("CreateStudentsWindow.fxml"));
    		loader.setController(new MainWindow());
    		Parent parent = null;
    		try {
    			parent = (Parent) loader.load();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		Stage stage = new Stage();
    		Scene scene = new Scene(parent);
    		stage.setScene(scene);
    		
    		stage.show();
    	}
    }

	@Override
	public void initialize(URL location, ResourceBundle resources){
		// TODO Auto-generated method stub
		
		
		nameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
		codeTC.setCellValueFactory(new PropertyValueFactory<>("code"));
		idTC.setCellValueFactory(new PropertyValueFactory<>("id"));
		
		
		
	}
    
    
}
