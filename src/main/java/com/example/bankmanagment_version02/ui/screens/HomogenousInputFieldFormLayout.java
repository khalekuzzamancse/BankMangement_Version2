package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.FormLayout;
import com.example.bankmanagment_version02.ui.viewmodel.FormViewModel;
import com.example.bankmanagment_version02.utils.LayoutUtil;
import com.example.bankmanagment_version02.utils.Snackbar;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class HomogenousInputFieldFormLayout extends Pane {
    private final FormViewModel viewModel;

    public HomogenousInputFieldFormLayout(FormViewModel viewModel) {
        this.viewModel = viewModel;
        createView();
    }

    private void createView() {
        FormLayout customLayout = new FormLayout();
        for (String label : viewModel.getLabelList()) {
            customLayout.getChildren().addAll(
                    new Label(label),
                    new TextField()
            );
        }
        Button button = new Button(viewModel.getDoneButtonLabel());
        button.setOnAction(event -> {

            for (int i = 1; i < customLayout.getChildren().size(); i = i + 2) {
                if (customLayout.getChildren().get(i) instanceof TextField) {
                    String input = ((TextField) customLayout.getChildren().get(i)).getText();
                    String label = ((Label) customLayout.getChildren().get(i - 1)).getText();
                    viewModel.saveFormData().put(label, input);
                }
            }
            viewModel.onDone();


        });
        this.getChildren().addAll(customLayout, button);
    }

    @Override
    protected void layoutChildren() {
        super.layoutChildren();

        FormLayout customLayout = (FormLayout) this.getChildren().get(0);
        double formHeight = customLayout.getHeight();
        double formWidth = customLayout.getWidth();
        positionChildren(customLayout, 0, 0, formWidth, formHeight);
        //

        positionChildren(this.getChildren().get(1), (formWidth - 60), formHeight, 60, 40);
        LayoutUtil.alignCenter(this, getChildren());
    }

    private void positionChildren(Node child, double x, double y, double width, double height) {
        child.setLayoutX(x);
        child.setLayoutY(y);
        child.resize(width, height);
    }
    @Override
    public void resize(double width, double height) {
        double padding = 5;
        double layoutHeight = 0;
        double layoutWidth = 0;
        for (Node child : getChildren()) {
            layoutHeight = layoutHeight + child.getBoundsInParent().getHeight() + padding;
            layoutWidth = Math.max(layoutWidth, child.getBoundsInParent().getWidth()) + padding;
        }

        super.resize(layoutWidth, layoutHeight); // set fixed width and height
        LayoutUtil.alignCenter(this, getChildren());
    }


}
