package com.dojo.kata.java.database;

import java.sql.*;
import java.util.ArrayList;


public class DbOperations {

    /*

    //Category
    private static final String INSERT_CATEGORIES = "INSERT INTO category" + "  (type) VALUES "+ " (?);";
    private static final String SELECT_CATEGORY_WITH_ID = "SELECT * FROM category WHERE id = ?";
    private static final String SELECT_CATEGORY = "SELECT * FROM category";
    private static final String SELECT_ID_WITH_CATEGORY = "SELECT * FROM category WHERE type = ?";

    //Products

    private static final String INSERT_PRODUCTS = "INSERT INTO product" + "  (name, price, category_id) VALUES "
            + " (?, ?, ?);";
    private static final String SELECT_PRODUCT_WITH_ID = "SELECT * FROM product WHERE id = ?";
    private static final String SELECT_PRODUCT = "SELECT * FROM product";
    //Orders

    public boolean insertCategory(String type) throws SQLException {
        Connection connection = DbUtil.getConnection();
        if(type!=null&&type.length()<25) {
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CATEGORIES);
                preparedStatement.setString(1, type);
                System.out.println(preparedStatement);
                preparedStatement.executeUpdate();
                DbUtil.closeConnection(connection);
                return true;
            }catch(SQLException exception) {
                DbUtil.closeConnection(connection);
                return false;
            }
        }
        DbUtil.closeConnection(connection);
        return false;
    }
    public ArrayList getCategoryById(int id) throws SQLException {
        ArrayList categories = new ArrayList();
        Connection connection = DbUtil.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CATEGORY_WITH_ID);
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String id_retirieved = rs.getString("id");
                categories.add(Integer.parseInt(id_retirieved));
                String type = rs.getString("type");
                categories.add(type);
            }
            DbUtil.closeConnection(connection);
            return categories;
        }catch(SQLException exception) {
            DbUtil.closeConnection(connection);
            return null;
        }
    }
    public ResultSet getAllCategory() throws SQLException {
        Connection connection = DbUtil.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CATEGORY);
            ResultSet rs = preparedStatement.executeQuery();
            return rs;
        }catch(SQLException exception) {
            DbUtil.closeConnection(connection);
            return null;
        }
    }

    private int getCategoryIdByType(String type){
        Connection connection = DbUtil.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ID_WITH_CATEGORY);
            preparedStatement.setString(1,type);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                return rs.getInt("id");
            }
        }catch(SQLException exception) {
            DbUtil.closeConnection(connection);
            return 0;
        }
        return 0;
    }

    public boolean insertProduct(String name, float price, String type) throws SQLException {
        Connection connection = DbUtil.getConnection();
        if(type!=null&&type.length()<25) {
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCTS);
                preparedStatement.setString(1, name);
                preparedStatement.setFloat(2, price);
                preparedStatement.setInt(3, getCategoryIdByType(type));
                System.out.println(preparedStatement);
                preparedStatement.executeUpdate();
                DbUtil.closeConnection(connection);
                return true;
            }catch(SQLException exception) {
                DbUtil.closeConnection(connection);
                return false;
            }
        }
        DbUtil.closeConnection(connection);
        return false;
    }
    public ArrayList getProductById(int id) throws SQLException {
        ArrayList categories = new ArrayList();
        Connection connection = DbUtil.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_WITH_ID);
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id_retirieved = rs.getInt("id");
                categories.add(id_retirieved);
                String name = rs.getString("name");
                categories.add(name);
                float price = rs.getFloat("price");
                categories.add(price);
                int categoryId = rs.getInt("category_id");
                categories.add(categoryId);
            }
            DbUtil.closeConnection(connection);
            return categories;
        }catch(SQLException exception) {
            DbUtil.closeConnection(connection);
            return null;
        }
    }
    public ResultSet getAllProduct() throws SQLException {
        Connection connection = DbUtil.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT);
            ResultSet rs = preparedStatement.executeQuery();
            return rs;
        }catch(SQLException exception) {
            DbUtil.closeConnection(connection);
            return null;
        }
    }
    public boolean insertOrder(String product_name, Date date) throws SQLException {
        return false;
    }
    public ArrayList getOrderById(int id) throws SQLException {
        return null;
    }
    public ResultSet getAllOrder() throws SQLException {
        return null;
    }

     */
}
