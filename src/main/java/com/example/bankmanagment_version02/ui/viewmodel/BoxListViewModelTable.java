package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.CreateBoxFormModel;
import com.example.bankmanagment_version02.data.model.BoxListModel;
import javafx.collections.ObservableList;
import library.TableViewInfoViewModelI;

public class BoxListViewModelTable implements TableViewInfoViewModelI<CreateBoxFormModel> {

    @Override
    public ObservableList<CreateBoxFormModel> getTableData() {
        return new BoxListModel().getBoxes();
    }

    @Override
    public String[] getTableColumnName() {
        return new String[]{"Serial Number", "Height", "Width", "Old Price", "New Price"};
    }
}