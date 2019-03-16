package omdcad;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {

	private String Usuario, Senha, Servidor, DataBase;
	private Connection Con;
	private boolean Conectado;
	private ResultSet Dados;

	public Conexao() {
            super();
		setSenha("inf0server");
		setUsuario("xmeta");
		setServidor("is-server.ibm.com");
		setConectado(false);
		setCon(null);
		setDados(null);
		setDataBase("xmeta");
	}

	public Conexao(String SERV, String DB, String USU, String SENHA) {
                        super();
		setSenha(SENHA);
		setUsuario(USU);
		setServidor(SERV);
		setDataBase(DB);
		setConectado(false);
		setCon(null);
		setDados(null);
	}

	public final void setCon(Connection con) {
		Con = con;
	}

	public final void setConectado(boolean conectado) {
		Conectado = conectado;
	}

	public final void setSenha(String senha) {
		Senha = senha;
	}

	public final void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public final void setServidor(String servidor) {
		Servidor = servidor;
	}

	public final void setDados(ResultSet dados) {
		Dados = dados;
	}

	public final void setDataBase(String DB) {
		DataBase = DB;
	}

	public String getUsuario() {
		return Usuario;
	}

	public String getSenha() {
		return Senha;
	}

	public boolean getConectado() {
		return Conectado;
	}

	public Connection getCon() {
		return Con;
	}

	public String getServidor() {
		return Servidor;
	}

	public ResultSet getDados() {
		return Dados;
	}

	public String getDataBase() {
		return DataBase;
	}

	public void ConectarMySql() throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String URL = "jdbc:db2://"+getServidor()+"/xmeta" + getServidor() + ":3306" + "/"
					+ getDataBase();
			setCon(DriverManager.getConnection(URL, getUsuario(), getSenha()));
			setConectado(true);
		} catch ( SQLException e) {
			JOptionPane.showMessageDialog(null, "Conexção não foi realizada!",
					"", JOptionPane.WARNING_MESSAGE);
			JOptionPane.showMessageDialog(null, "Erro :" + e.getMessage(), "",
					JOptionPane.WARNING_MESSAGE);
			setConectado(false);
			return;

		}
	}
        
    public void Conectar() throws ClassNotFoundException {
        String erroMensagem;
    try {  
        
        String URL = "jdbc:db2://is-server.ibm.com:50000/xmeta";  
        Class.forName ("com.ibm.db2.jcc.DB2Driver");  
        setCon(DriverManager.getConnection(URL, getUsuario(), getSenha()));  
        setConectado(true);
    } catch (ClassNotFoundException|SQLException e) {  
      erroMensagem = "Erro na conexao com o Banco de Dados : " + e.getMessage().replace('\n','\0');  
      setConectado(false); 
    } catch (Exception e) {  
      erroMensagem = "Erro na conexao com o Banco de Dados : " + e.getMessage().replace('\n','\0');  
      setConectado(false); 
    }  
}  


	public void FecharConexao() {
		try {
			if (getConectado())
				getCon().close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Conexão não foi fechada!", "",
					JOptionPane.WARNING_MESSAGE);
			JOptionPane.showMessageDialog(null, "Erro :" + e.getMessage(), "",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	public void ExpressaoSQL(String Comando) {
		if (getConectado()) {
			try {
				Statement st = getCon().createStatement();
				if (Comando.toUpperCase().indexOf("SELECT") != -1)
					setDados(st.executeQuery(Comando));
				else {
					setDados(null);
					st.executeUpdate(Comando);
					if (Comando.toUpperCase().indexOf("UPDATE") != -1) {
						JOptionPane.showMessageDialog(null,"Dados Atualizados!", "",JOptionPane.WARNING_MESSAGE);
                                                FecharConexao();
                                        } else if (Comando.toUpperCase().indexOf("DELETE") != -1) {
						JOptionPane.showMessageDialog(null, "Dados Removidos!",	"", JOptionPane.WARNING_MESSAGE);
                                                FecharConexao();
                                        } else if (Comando.toUpperCase().indexOf("INSERT") != -1) {
						JOptionPane.showMessageDialog(null, "Dados Inseridos!","", JOptionPane.WARNING_MESSAGE);
                                                FecharConexao();
                                        }        
				}
			} catch (SQLException sqle) {
				JOptionPane.showMessageDialog(null, "SQL Inválido!", "",
						JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null,
						"Erro:" + sqle.getMessage(), "",
						JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}
