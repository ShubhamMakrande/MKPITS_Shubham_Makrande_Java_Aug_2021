package com.example.spring1jdbc.dao;

import com.example.spring1jdbc.Stud;
import com.sun.deploy.security.JarSignature;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Studdaoimpl implements StudDao{
    JdbcTemplate template;
    @Override
    public void insert(Stud sob) {
        String query="insert into studemo(id,name,addr) values (?,?,?)";
        int sts = this.template.update(query,sob.getId(),sob.getName(),sob.getAddr());
        System.out.println("record inserted"+sts);
    }

    @Override
    public void displaybyid(int id) {
        String query="select *from studemo where id=?";

        Stud ob=(Stud) this.template.queryForObject(query, new Object[]{id}, new rowdemo());
        System.out.println(ob.toString());
    }





    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
}
class rowdemo implements RowMapper<Stud>
{

    @Override
    public Stud mapRow(ResultSet resultSet, int i) throws SQLException {
        Stud sob=new Stud();
      sob.setId(resultSet.getInt("id"));
       sob.setName(resultSet.getString("name"));
       sob.setAddr(resultSet.getString("addr"));
        return sob;
    }
}