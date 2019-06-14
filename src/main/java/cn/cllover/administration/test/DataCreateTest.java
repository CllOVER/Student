package cn.cllover.administration.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

//逻辑生成虚拟数据
public class DataCreateTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      Date date = new Date();
       //数据库字段编写
        String roll_id;
        Long stu_roll_id =201901011040L;
        String roll_studying_way = "Z";
        String roll_studying_date = "2017-09-01";
        String roll_studying_form = "L";
        String roll_studying_source = "北京市朝阳区";
        String roll_status = "0";
        int roll_aca_id = 4;
        int roll_grade_id =3;
        int roll_class_id = 6;
        int roll_maj_id = 3;

        //数据库连接
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/administration-system?useUnicode=true&characterEncoding=UTF-8";
        String user = "root";
        String password = "password";

        Connection connection = DriverManager.getConnection(url, user, password);
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            for (int i = 1; i < 2; i++) {
                //sql设为自增  此操作可以不用填写    不自增下 可以使用递增编号
                roll_id = "1211201901011009L" + i;
               /* stu_roll_id = 201901011040L + i;*/
                //sql语句
                String sql = "INSERT INTO roll(stu_roll_id,roll_studying_way,roll_studying_date,roll_studying_form" +
                        ",roll_studying_source,roll_status,roll_aca_id,roll_grade_id," +
                        "roll_class_id,roll_maj_id) VALUES('"+stu_roll_id+"'," +
                        "'"+roll_studying_way+"','"+roll_studying_date+"','"+roll_studying_form+"','"+roll_studying_source+"','"+roll_status+"','"+roll_aca_id+"','"+roll_grade_id+"','"+roll_class_id+"'" +
                        ",'"+roll_maj_id+"')";
//				输出(sql);
                statement.executeUpdate(sql);

            }
            //连接关闭
            connection.close();


        }
    }
}