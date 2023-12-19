package com.example.layeredarchitecture.dao;


import com.example.layeredarchitecture.model.OrderDetailDTO;


import java.sql.SQLException;

public class OrderDetailDAOImpl implements OrderDetailDAO {
    @Override
    public boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("INSERT INTO OrderDetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)",
                dto.getOid(), dto.getItemCode(), dto.getUnitPrice(), dto.getQty());
    }

}
