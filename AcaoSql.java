package omdcad;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class AcaoSql {

    private Conexao conexao;
    private Qa qa;
    private boolean result;

    public AcaoSql(Conexao con, Qa qa) {
        setConexao(con);
        this.qa = qa;
    }

    public Conexao getConexao() {
        return conexao;
    }

    public final void setConexao(Conexao con) {
        conexao = con;
    }

    private String QuotedStr(String Item) {
        return "\'" + Item + "\'";
    }

    public void Salvar() {
        if (qa.getConsistencia()) {
            String Colunas = "(" + qa.getCampos().get(1) + ","
                    + qa.getCampos().get(2) + "," + qa.getCampos().get(3)
                    + "," + qa.getCampos().get(4)
                    + "," + qa.getCampos().get(5)
                    + "," + qa.getCampos().get(6)
                    + "," + qa.getCampos().get(7)
                    + "," + qa.getCampos().get(8) 
                    + "," + qa.getCampos().get(9) 
                    + "," + qa.getCampos().get(10) + ")";
            String Valores = "(" + QuotedStr(qa.getNomeJob()) + ","
                    + QuotedStr(qa.getNomeProjeto()) + ","
                    + QuotedStr(qa.getNomeAmbiente()) + ","
                    + QuotedStr(qa.getDurExecucao()) + ","
                    + QuotedStr(qa.getDataIni()) + ","
                    + QuotedStr(qa.getDataFim()) + "," 
                    + QuotedStr(qa.getStatusExecucao()) + ","
                    + QuotedStr(qa.getDataEnvio()) + "," 
                    + QuotedStr(qa.getAnalista()) + ","
                    + QuotedStr(qa.getStatusQA()) + ")";
            String Comando = "Insert into omdcad.tb_qa" + Colunas + " values" + Valores;
            getConexao().ExpressaoSQL(Comando);
            try {
            } catch (Exception sqle) {
                JOptionPane.showMessageDialog(null, "Os dados não foram salvos!", "", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

    public void Remover() {
        try {
            getConexao().ExpressaoSQL(" Delete from omdcad.tb_qa where IdQa = " + qa.getIdQa());
            result = getConexao().getDados().rowDeleted();

        } catch (Exception sql) {
            JOptionPane.showMessageDialog(null, "Os dados não foram removidos!", "", JOptionPane.WARNING_MESSAGE);
        }
    }
    
     public List<Qa> Consulta() {
        String clauWhere = montaClauWhere();
        boolean retorno = false;
        List<Qa> qalist = new ArrayList<>();
        try {
            String comando = "Select * from omdcad.tb_qa " + clauWhere;
            getConexao().ExpressaoSQL(comando);
            ResultSet rs = getConexao().getDados();
            int contar = 0;
            if (rs != null) {
                while (rs.next()) {
                    retorno = true;
                    contar++;
                    Qa qa2 = new Qa();
                    int Id = rs.getInt("IdQa");
                    String NomeJob = rs.getString("NomeJob");
                    String NomeProjeto = rs.getString("NomeProjeto");
                    String NomeAmbiente = rs.getString("NomeAmbiente");
                    String DurExecucao = rs.getString("DurExecucao");
                    String DataIni = rs.getString("DataIni");
                    String DataFim = rs.getString("DataFim");
                    String StatusExecucao = rs.getString("StatusExecucao");
                    String DataEnvio = rs.getString("DataEnvio");
                    String Analista = rs.getString("Analista");
                    String StatusQA = rs.getString("StatusQA");
                    qa2.setIdQa(Id);
                    qa2.setNomeJob(NomeJob);
                    qa2.setNomeProjeto(NomeProjeto);
                    qa2.setNomeAmbiente(NomeAmbiente);
                    qa2.setDurExecucao(DurExecucao);
                    qa2.setDataIni(DataIni);
                    qa2.setDataFim(DataFim);
                    qa2.setStatusExecucao(StatusExecucao);
                    qa2.setDataEnvio(DataEnvio);
                    qa2.setAnalista(Analista);
                    qa2.setStatusQA(StatusQA);
                    qalist.add(qa2);
                }
                if (!retorno) {
                    JOptionPane.showMessageDialog(null, "Nenhum registro selecionado!", "", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Os dados não foram listados!", "", JOptionPane.WARNING_MESSAGE);
        }
      return qalist;
    }

    private String montaClauWhere() {
        String clauWhere = new String();
        ArrayList<String> arrayWhere = new ArrayList<>();
        if (qa.getNomeJob().length() > 0 || ! qa.getNomeJob().contains("")) {
            arrayWhere.add(" " + qa.getCampos().get(1) + "=" + "'" + qa.getNomeJob().toString() + "'");
        }
        if (qa.getNomeProjeto().length() > 0 || ! qa.getNomeProjeto().contains("")) {
            arrayWhere.add(" " + qa.getCampos().get(2) + "=" + "'" + qa.getNomeProjeto().toString() + "'");
        }
        if (qa.getNomeAmbiente().length() > 0 || ! qa.getNomeAmbiente().contains("")) {
            arrayWhere.add(" " + qa.getCampos().get(3) + "=" + "'" + qa.getNomeAmbiente().toString() + "'");
        }
        if (qa.getDurExecucao().length() > 0 || ! qa.getDurExecucao().contains("")) {
            arrayWhere.add(" " + qa.getCampos().get(4) + "=" + "'" + qa.getDurExecucao().toString()+ "'");
        }
        if (qa.getDataIni().length() > 0 || ! qa.getDataIni().contains("")) {
            arrayWhere.add(" " + qa.getCampos().get(5) + "=" + "'" + qa.getDataIni().toString() + "'");
        }
        if (qa.getDataFim().length() > 0 || ! qa.getDataFim().contains("")) {
            arrayWhere.add(" " + qa.getCampos().get(6) + "=" + "'" + qa.getDataFim().toString() + "'");
        }
        if (qa.getStatusExecucao().length() > 0 || ! qa.getStatusExecucao().contains("")) {
            arrayWhere.add(" " + qa.getCampos().get(7) + "=" + "'" + qa.getStatusExecucao().toString() + "'");
        }
        if (qa.getDataEnvio().length() > 0 || ! qa.getDataEnvio().contains("")) {
            arrayWhere.add(" " + qa.getCampos().get(8) + "=" + "'" + qa.getDataEnvio().toString() + "'");
        }
        if (qa.getAnalista().length() > 0 || ! qa.getAnalista().contains("")) {
            arrayWhere.add(" " + qa.getCampos().get(9) + "=" + "'" + qa.getAnalista().toString() + "'");
        }
        if (qa.getStatusQA().length() > 0 || ! qa.getStatusQA().contains("")) {
            arrayWhere.add(" " + qa.getCampos().get(10) + "=" + "'" + qa.getStatusQA().toString() + "'");
        }

        if (arrayWhere.size() > 0) {
            for (int i = 0; i < arrayWhere.size(); i++) {
                if ( i != arrayWhere.size()-1)
                clauWhere = clauWhere + arrayWhere.get(i) + " and ";
                else
                clauWhere = clauWhere + arrayWhere.get(i) ;   
            }
            clauWhere = "Where " + clauWhere;
        } else {
            clauWhere = "";
        }
        return clauWhere;
    }

    public void Atualizar() { 
         String Comando = " Update omdcad.tb_qa SET "; 
         for (int i = 1; i < qa.getCampos().size(); i++) { 
                 switch (i) {
                       case 1: Comando += ((String) qa.getCampos().get(i)) + "=" + "'" + qa.getNomeJob().toString() + "'" + ","; 
                       break; 
                       case 2: Comando += ((String) qa.getCampos().get(i)) + "=" + "'" + qa.getNomeProjeto().toString() + "'" + ","; 
                       break; 
                       case 3: Comando += ((String) qa.getCampos().get(i)) + "=" + "'" + qa.getNomeAmbiente().toString() + "'" + ","; 
                       break; 
                       case 4: Comando += ((String) qa.getCampos().get(i)) + "=" + "'" + qa.getDurExecucao().toString() + "'" + ",";
                       break; 
                       case 5: Comando += ((String) qa.getCampos().get(i)) + "=" + "'" + qa.getDataIni().toString() + "'" + ",";
                       break;
                       case 6: Comando += ((String) qa.getCampos().get(i)) + "=" + "'" + qa.getDataFim().toString() + "'" + ",";
                       break;
                       case 7: Comando += ((String) qa.getCampos().get(i)) + "=" + "'" + qa.getStatusExecucao().toString() + "'" + ",";
                       break;
                       case 8: Comando += ((String) qa.getCampos().get(i)) + "=" + "'" + qa.getDataEnvio().toString() + "'" + ",";
                       break;
                       case 9: Comando += ((String) qa.getCampos().get(i)) + "=" + "'" + qa.getAnalista().toString() + "'" + ",";
                       break;
                       case 10: Comando += ((String) qa.getCampos().get(i)) + "=" + "'" + qa.getStatusQA().toString() + "'" + ",";
                       break;
                            } 
             } 
            if (Comando.length() > 0 && Comando.charAt(Comando.length() - 1) == ',') { 
                Comando = Comando.substring(0, Comando.length() - 1); 
            } 
            Comando += " where IdQa = " + qa.getIdQa(); 
            try {
               getConexao().ExpressaoSQL(Comando); 
            } catch (Exception sqle) {
                   JOptionPane.showMessageDialog(null, Comando, "Comando", JOptionPane.WARNING_MESSAGE);
                   JOptionPane.showMessageDialog(null, "Os dados não foram atualizados!","", JOptionPane.WARNING_MESSAGE); }
	}
}
