package com.example.layeredarchitecture.dao;



import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO<T> {
    ArrayList<T> getAll() throws SQLException, ClassNotFoundException;
    boolean save(T dto) throws SQLException, ClassNotFoundException;
    boolean update(T dto) throws SQLException, ClassNotFoundException;
    boolean delete(String c) throws SQLException, ClassNotFoundException ;
    String generateNewId() throws SQLException, ClassNotFoundException;
    boolean exist(String c) throws SQLException, ClassNotFoundException;
    public T search(String c) throws SQLException, ClassNotFoundException;
}
