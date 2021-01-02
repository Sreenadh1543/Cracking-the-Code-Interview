package com.dojo.kata.java.database;



import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;

public class RunningScripts {
	public void runDbScript() throws Exception {

		/*
		Connection connection = DbUtil.getConnection();

		String resource = "/projects/challenge/JDBC/db.sql";
		Reader reader = new FileReader(resource);
		connection.setAutoCommit(false);


		ScriptRunner runner = new ScriptRunner(connection);
		runner.setLogWriter(null);
		runner.setErrorLogWriter(null);
		runner.setSendFullScript(false);
		runner.runScript(reader);
        runner.setDelimiter("]");
		connection.commit();
		reader.close();
		DbUtil.closeConnection(connection);
		*/
	}
}
