package com.yourname.encryptionapp;
import com.dylanisensee.encryption.Coder;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainViewController {
	
	// Note that MainView.fxml is set to use this class as it's 'controller' 
	
	@FXML
	Button btnSomeButton;
	
	@FXML
	Button btnEncrypt;
	
	@FXML
	Button btnDecrypt;
	
	@FXML
	TextArea txtSomeText;
	
	Coder c = new Coder();
	
	/**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded (after all @FXML fields have been initialized).
     */
    @FXML
    private void initialize() {
    	         
    }
    
    @FXML
	public void handleSomeButtonClick(){
		System.out.println("You clicked on 'Some Button'!");
	}
   
    @FXML
    public void encryptMessage() {
    	String msg = txtSomeText.getText();
    	String encryptedMsg = c.encrypt(msg);
    	txtSomeText.setText(encryptedMsg);
    }
    
    @FXML public void decryptMessage() {
    	String msg = txtSomeText.getText();
    	String decryptedMsg = c.decrypt(msg);
    	txtSomeText.setText(decryptedMsg);
    }

}
