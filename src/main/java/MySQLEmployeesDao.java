import java.sql.Connection;
import java.util.List;

public class MySQLEmployeesDao implements Employees {
    private Connection connection = null;

    public MySQLEmployeesDao(Config config) {

    }

    @Override
    public List<Employee> all() {
        return null;
    }

    @Override
    public Long insert(Employee employee) {
        return null;
    }
}
