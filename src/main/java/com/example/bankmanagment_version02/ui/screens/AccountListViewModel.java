package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.data.model.AccountListModel;
import com.example.bankmanagment_version02.data.model.AccountModel;
import com.example.bankmanagment_version02.data.model.AddBoxModel;
import com.example.bankmanagment_version02.data.model.BoxListModel;
import javafx.collections.ObservableList;

public class AccountListViewModel implements ViewInfoViewModelI<AccountModel> {

    @Override
    public ObservableList<AccountModel> getTableData() {
        return new AccountListModel().getAccounts();
    }

    @Override
    public String[] getTableColumnName() {
        return new String[]{"Name", "Email", "Phone No", "Address", "Firm", "Eye Color", "Hair Color", "Height", "Weight"};
    }
}
