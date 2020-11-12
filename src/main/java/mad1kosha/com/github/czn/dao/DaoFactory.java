package mad1kosha.com.github.czn.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
@Component
public class DaoFactory {
    private static DaoFactory daoFactory = new DaoFactory();
    private static JdbcTemplate jdbcTemplate;
    private static DataSource source;

    @Autowired
    public void setDataSource(@Qualifier("dataSource") DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        source = dataSource;
    }

    public static DaoFactory getFactory() {
        return daoFactory;
    }

    public static DataSource getDataSource() {
        return source;
    }

}
