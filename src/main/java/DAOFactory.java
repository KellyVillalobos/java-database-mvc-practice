

public class DAOFactory {
private static Employees employeesDao;
private static Config config = new Config();

public static Employees getEmployeesDao(){
    if (employeesDao == null){
        employeesDao = new MySQLEmployeesDao(config);
    }
    return employeesDao;
}
}
