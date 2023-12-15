package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.ItemDTO;
import com.example.layeredarchitecture.view.tdm.ItemTM;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemDAO {

    public ArrayList<ItemTM> getAllItems() throws SQLException, ClassNotFoundException;

    public void deleteItem(ItemDTO dto) throws SQLException, ClassNotFoundException;

    public void saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException;

    public void updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException;

    public boolean existItems(ItemDTO dto) throws SQLException, ClassNotFoundException;

    public String generateNewId() throws SQLException, ClassNotFoundException;

}
