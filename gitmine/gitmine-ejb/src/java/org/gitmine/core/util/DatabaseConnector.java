package org.gitmine.core.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnector {
    private static volatile DatabaseConnector mInstance;
    private String mUser;
    private String mPassword;
    private String mDbURL;
    private String mDatabaseName;
    private String mDriver;
    private Properties mProperties;
    private Connection mConnection;
    
    private DatabaseConnector(){}
    
    public static DatabaseConnector getInstance(){
        if(mInstance == null){
            synchronized(DatabaseConnector.class){
                if(mInstance == null){
                    mInstance = new DatabaseConnector();
                }
            }
        }
        return mInstance;
    }
    
    public Connection createConnection(){
        mProperties = new Properties();
        
        mUser = mProperties.getProperty("user");
        mPassword = mProperties.getProperty("password");
        mDatabaseName = mProperties.getProperty("database");
        mDbURL = mProperties.getProperty("url");
        mDriver = mProperties.getProperty("driver");
        try {
            try {
                Class.forName(mDriver).newInstance();
                try {
                    mConnection = DriverManager.getConnection(mDbURL + mDatabaseName
                            ,mUser,mPassword);
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (InstantiationException ex) {
                Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mConnection;
    }
    
    public void disposeConnection(){
        if(createConnection() != null){
            try {
                createConnection().close();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
