package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.FormLayout;
import com.example.bankmanagment_version02.ui.viewmodel.LoginViewModel;
import com.example.bankmanagment_version02.utils.LayoutUtil;
import com.example.bankmanagment_version02.utils.Snackbar;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class LoginView extends VBox {
    private final LoginViewModel viewModel;
    private final VBox vbox;

    public LoginView() {
        this.viewModel = new LoginViewModel();
        createView();
        vbox = this;
        getStylesheets().add("login_page_style.css");

        //  setStyle("-fx-background-color: #29ACD4;");
    }

    private void createView() {
        FormLayout customLayout = new FormLayout();
        customLayout.getChildren().addAll(
                new Label("User Name"),
                new TextField(),
                new Label("Password"),
                new TextField()
        );
        Button button = new Button("Login");
        button.setOnAction(event -> {
            TextField userNameTextField = (TextField) customLayout.getChildren().get(1);
            TextField passwordTextField = (TextField) customLayout.getChildren().get(3);
            viewModel.setUserName(userNameTextField.getText());
            viewModel.setPassword(passwordTextField.getText());
            if (viewModel.isValidUser()) {
                // Navigate to the next screen or perform some other action
                Snackbar.show("Successfully", this);
            } else {
                Snackbar.show("User Name or Password is wrong", this);
            }
        });
        this.getChildren().addAll(customLayout, button);
        this.getStyleClass().add("login-view");
        this.setAlignment(Pos.CENTER);
    }

    public VBox getLayout() {
        return vbox;
    }

    @Override
    public void resize(double width, double height) {
        double padding = 5;
        double layoutHeight = 0;
        double layoutWidth = 0;
        for (Node child : getChildren()) {
            layoutHeight = layoutHeight + child.getBoundsInParent().getHeight()+padding;
            layoutWidth = Math.max(layoutWidth, child.getBoundsInParent().getWidth())+padding;
        }

        super.resize(layoutWidth, layoutHeight); // set fixed width and height
        LayoutUtil.alignCenter(this, getChildren());
    }

    @Override
    protected void layoutChildren() {
        super.layoutChildren();
        LayoutUtil.alignCenter(this, getChildren());
    }
}