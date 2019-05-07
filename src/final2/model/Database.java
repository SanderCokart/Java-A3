package final2.model;

import java.sql.*;

public class Database {
    private Connection connection;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_a3_sql", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void connectionClose() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addPerson(Person person) {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO `people`(`first_name`, `last_name`, `birth_date`) VALUES ('" + person.getFirstname() + "', '" + person.getLastname() + "', '" + person.getBirthdate() + "')");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public PersonList getAll() throws SQLException {
        PersonList personList = new PersonList();
        ResultSet resultSet = null;
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM `people`");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        while(resultSet.next()){
            System.out.println(resultSet.getString("first_name") + resultSet.getString("last_name") + resultSet.getString("birth_date"));

            Person person = new Person(resultSet.getString("first_name"), resultSet.getString("last_name"), resultSet.getString("birth_date"));
            personList.addPerson(person);
        }

        return personList;
    }
}

