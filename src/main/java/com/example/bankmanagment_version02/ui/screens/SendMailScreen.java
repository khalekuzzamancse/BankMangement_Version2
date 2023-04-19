package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.viewmodel.LoginViewModel;
import com.example.bankmanagment_version02.ui.viewmodel.SendEmailViewModel;
import com.example.bankmanagment_version02.utils.Window;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import library.*;

public class SendMailScreen {
    private final Stage window;
    private final HeterogeneousFormViewModel viewModel;
    private final Button submitButton;


    public SendMailScreen() {
        submitButton = new Button("Send");
        viewModel = new SendEmailViewModel();
        CommonFormLayout leaseForm = new CommonFormLayout(
                viewModel.getLabelList(),
                submitAction,
                viewModel.getInputFieldWidths(),
                viewModel.getInputFieldHeights()
        );
        window = new Window(leaseForm, "Send Mail Screen", 500, 600).getWindow();
    }

    public Stage getWindow() {
        return window;
    }

    private void getFormData(DynamicSizeFromLayout form) {
        for (int i = 1; i < form.getChildren().size(); i = i + 2) {
            String label = ((Label) form.getChildren().get(i - 1)).getText();
            if (form.getChildren().get(i) instanceof TextField) {
                String input = ((TextField) form.getChildren().get(i)).getText();
                viewModel.saveFormData().put(label, input);
            } else if (form.getChildren().get(i) instanceof TextArea) {
                String input = ((TextArea) form.getChildren().get(i)).getText();
                viewModel.saveFormData().put(label, input);
            }
        }

    }

    private final CustomAction submitAction = new CustomAction() {
        @Override
        public Node getButton() {
            return submitButton;
        }

        @Override
        public void setListener(DynamicSizeFromLayout form) {
            submitButton.setOnAction(event -> {
                getFormData(form);
                //after getting the data,pass the data to the viewModel
                viewModel.onDone();
            });

        }
    };
}