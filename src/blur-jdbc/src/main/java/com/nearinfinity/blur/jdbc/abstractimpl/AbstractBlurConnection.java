package com.nearinfinity.blur.jdbc.abstractimpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;

import com.nearinfinity.blur.jdbc.util.NotImplemented;

public abstract class AbstractBlurConnection implements Connection {
    
    private Connection throwExceptionDelegate;

    public AbstractBlurConnection() {
        throwExceptionDelegate = (Connection) Proxy.newProxyInstance(Connection.class.getClassLoader(),
            new Class[] { Connection.class },
            new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    throw new NotImplemented(method.getName());
                }
            });
    }

    public void clearWarnings() throws SQLException {
        throwExceptionDelegate.clearWarnings();
    }

    public void close() throws SQLException {
        throwExceptionDelegate.close();
    }

    public void commit() throws SQLException {
        throwExceptionDelegate.commit();
    }

    public Array createArrayOf(String arg0, Object[] arg1) throws SQLException {
        return throwExceptionDelegate.createArrayOf(arg0, arg1);
    }

    public Blob createBlob() throws SQLException {
        return throwExceptionDelegate.createBlob();
    }

    public Clob createClob() throws SQLException {
        return throwExceptionDelegate.createClob();
    }

    public NClob createNClob() throws SQLException {
        return throwExceptionDelegate.createNClob();
    }

    public SQLXML createSQLXML() throws SQLException {
        return throwExceptionDelegate.createSQLXML();
    }

    public Statement createStatement() throws SQLException {
        return throwExceptionDelegate.createStatement();
    }

    public Statement createStatement(int arg0, int arg1, int arg2) throws SQLException {
        return throwExceptionDelegate.createStatement(arg0, arg1, arg2);
    }

    public Statement createStatement(int arg0, int arg1) throws SQLException {
        return throwExceptionDelegate.createStatement(arg0, arg1);
    }

    public Struct createStruct(String arg0, Object[] arg1) throws SQLException {
        return throwExceptionDelegate.createStruct(arg0, arg1);
    }

    public boolean getAutoCommit() throws SQLException {
        return throwExceptionDelegate.getAutoCommit();
    }

    public String getCatalog() throws SQLException {
        return throwExceptionDelegate.getCatalog();
    }

    public Properties getClientInfo() throws SQLException {
        return throwExceptionDelegate.getClientInfo();
    }

    public String getClientInfo(String arg0) throws SQLException {
        return throwExceptionDelegate.getClientInfo(arg0);
    }

    public int getHoldability() throws SQLException {
        return throwExceptionDelegate.getHoldability();
    }

    public DatabaseMetaData getMetaData() throws SQLException {
        return throwExceptionDelegate.getMetaData();
    }

    public int getTransactionIsolation() throws SQLException {
        return throwExceptionDelegate.getTransactionIsolation();
    }

    public Map<String, Class<?>> getTypeMap() throws SQLException {
        return throwExceptionDelegate.getTypeMap();
    }

    public SQLWarning getWarnings() throws SQLException {
        return throwExceptionDelegate.getWarnings();
    }

    public boolean isClosed() throws SQLException {
        return throwExceptionDelegate.isClosed();
    }

    public boolean isReadOnly() throws SQLException {
        return throwExceptionDelegate.isReadOnly();
    }

    public boolean isValid(int arg0) throws SQLException {
        return throwExceptionDelegate.isValid(arg0);
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return throwExceptionDelegate.isWrapperFor(iface);
    }

    public String nativeSQL(String arg0) throws SQLException {
        return throwExceptionDelegate.nativeSQL(arg0);
    }

    public CallableStatement prepareCall(String arg0, int arg1, int arg2, int arg3) throws SQLException {
        return throwExceptionDelegate.prepareCall(arg0, arg1, arg2, arg3);
    }

    public CallableStatement prepareCall(String arg0, int arg1, int arg2) throws SQLException {
        return throwExceptionDelegate.prepareCall(arg0, arg1, arg2);
    }

    public CallableStatement prepareCall(String arg0) throws SQLException {
        return throwExceptionDelegate.prepareCall(arg0);
    }

    public PreparedStatement prepareStatement(String arg0, int arg1, int arg2, int arg3) throws SQLException {
        return throwExceptionDelegate.prepareStatement(arg0, arg1, arg2, arg3);
    }

    public PreparedStatement prepareStatement(String arg0, int arg1, int arg2) throws SQLException {
        return throwExceptionDelegate.prepareStatement(arg0, arg1, arg2);
    }

    public PreparedStatement prepareStatement(String arg0, int arg1) throws SQLException {
        return throwExceptionDelegate.prepareStatement(arg0, arg1);
    }

    public PreparedStatement prepareStatement(String arg0, int[] arg1) throws SQLException {
        return throwExceptionDelegate.prepareStatement(arg0, arg1);
    }

    public PreparedStatement prepareStatement(String arg0, String[] arg1) throws SQLException {
        return throwExceptionDelegate.prepareStatement(arg0, arg1);
    }

    public PreparedStatement prepareStatement(String arg0) throws SQLException {
        return throwExceptionDelegate.prepareStatement(arg0);
    }

    public void releaseSavepoint(Savepoint arg0) throws SQLException {
        throwExceptionDelegate.releaseSavepoint(arg0);
    }

    public void rollback() throws SQLException {
        throwExceptionDelegate.rollback();
    }

    public void rollback(Savepoint arg0) throws SQLException {
        throwExceptionDelegate.rollback(arg0);
    }

    public void setAutoCommit(boolean arg0) throws SQLException {
        throwExceptionDelegate.setAutoCommit(arg0);
    }

    public void setCatalog(String arg0) throws SQLException {
        throwExceptionDelegate.setCatalog(arg0);
    }

    public void setClientInfo(Properties arg0) throws SQLClientInfoException {
        throwExceptionDelegate.setClientInfo(arg0);
    }

    public void setClientInfo(String arg0, String arg1) throws SQLClientInfoException {
        throwExceptionDelegate.setClientInfo(arg0, arg1);
    }

    public void setHoldability(int arg0) throws SQLException {
        throwExceptionDelegate.setHoldability(arg0);
    }

    public void setReadOnly(boolean arg0) throws SQLException {
        throwExceptionDelegate.setReadOnly(arg0);
    }

    public Savepoint setSavepoint() throws SQLException {
        return throwExceptionDelegate.setSavepoint();
    }

    public Savepoint setSavepoint(String arg0) throws SQLException {
        return throwExceptionDelegate.setSavepoint(arg0);
    }

    public void setTransactionIsolation(int arg0) throws SQLException {
        throwExceptionDelegate.setTransactionIsolation(arg0);
    }

    public void setTypeMap(Map<String, Class<?>> arg0) throws SQLException {
        throwExceptionDelegate.setTypeMap(arg0);
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
        return throwExceptionDelegate.unwrap(iface);
    }
    
    

}
