package wbs.selbstlerntag.exceptions_uebungen;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.lang.ArithmeticException;
import java.lang.NullPointerException;


interface I151 {
//	void m() throws Exception;
//	void m() throws ArithmeticException;
	void m() throws IOException;
//	void m() throws IOException,SQLException;
}

interface I152 {
//	void m() throws Exception;
//	void m() throws NullPointerException;
	void m() throws SQLException;
//	void m() throws IOException,SQLException;
}

public class C15 implements I151, I152 {
	@Override
	public void m() throws ArithmeticException, NullPointerException {}		// yup		unchecked	unchecked
//	public void m() throws ArithmeticException, SQLException {}				// nope		unchecked	checked
//	public void m() throws IOException, NullPointerException {}				// nope		checked		unchecked	
//	public void m() throws IOException, SQLException {}						// nope		checked		checked
}
