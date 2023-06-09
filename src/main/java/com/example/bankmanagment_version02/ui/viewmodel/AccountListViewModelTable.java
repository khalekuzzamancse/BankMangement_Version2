package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.AccountListModel;
import com.example.bankmanagment_version02.data.model.AddAccountModel;
import com.example.bankmanagment_version02.data.model.AddBoxModel;
import com.example.bankmanagment_version02.repository.Reposititory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import library.TableViewInfoViewModel;

import java.util.List;

public class AccountListViewModelTable implements TableViewInfoViewModel<AddAccountModel> {

    @Override
    public ObservableList<AddAccountModel> getTableData() {
        List<AddAccountModel> boxes = Reposititory.getAccounts();
        return FXCollections.observableList(boxes);
    }

    @Override
    public String[] getTableColumnName() {
        return new String[]{"Name", "Email", "Phone No", "Address", "Firm", "Eye Color", "Hair Color", "Height", "Weight"};
    }
}
