package com.example.Star.repository;


import org.apache.hadoop.security.AnnotatedSecurityInfo;
import org.apache.hadoop.security.SecurityUtil;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;


import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.hadoop.security.UserGroupInformation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.IOException;
import java.sql.*;

@Configuration
public class HiveDataSourceConfig {



    @Bean(name = "hiveJdbcDataSource")
    @Qualifier("hiveJdbcDataSource")
    public DataSource dataSource() throws SQLException, IOException {
        BasicDataSource dataSource = new BasicDataSource();


        SecurityUtil.setSecurityInfoProviders(new AnnotatedSecurityInfo());


        org.apache.hadoop.conf.Configuration conf = new org.apache.hadoop.conf.Configuration();
        conf.set("hadoop.security.authentication", "Kerberos");

        UserGroupInformation.setConfiguration(conf);

        UserGroupInformation.loginUserFromKeytab("ouchouangfogoumph@CIB.NET", "C:/API/conf/ouchouangfogoumph.keytab");

        String driverClass = "org.apache.hive.jdbc.HiveDriver";
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException exception) {

            exception.printStackTrace();
            System.exit(1);
        }

        //String databaseUri = "jdbc:hive2://sldifrekxiw01.fr.intranet:10100/;transportMode=SASL;principal=indexima/_HOST@CIB.NET";
        String databaseUri = "jdbc:hive2://sldifrdwbhz01.fr.intranet:2181,sldifrdwbhz02.fr.intranet:2181,sldifrdwbhz03.fr.intranet:2181/;serviceDiscoveryMode=zooKeeper;zooKeeperNamespace=indexima;transportMode=SASL;principal=indexima/_HOST@CIB.NET";
        System.out.println("getting connection");
        Connection con = (Connection) DriverManager.getConnection(databaseUri);
        System.out.println("Connected");

        /*
       Statement sqlstatement = con.createStatement();
        ResultSet result = sqlstatement.executeQuery("select * from q30_indixisindexima.q30_rfq limit 10");
        while (result.next()) {
            System.out.println(result.getString(1));
        }

        con.close(); */

        dataSource.setUrl(databaseUri);
        dataSource.setDriverClassName("org.apache.hive.jdbc.HiveDriver");


        return dataSource;
    }

    @Bean(name = "hiveJdbcTemplate")
    public JdbcTemplate hiveJdbcTemplate(@Qualifier("hiveJdbcDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
