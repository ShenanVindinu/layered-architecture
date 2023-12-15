package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO {


    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;

    public boolean saveCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;

    public void updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public boolean existCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public void deleteCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;

    public String generateNewId() throws SQLException, ClassNotFoundException;




}
