package omdcad;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class QaTable extends AbstractTableModel {

    private static final long serialVersionUID = 1L;
    public List<Qa> qalist;

    public QaTable(List<Qa> listaQa) {
    super();
    qalist = listaQa;
    }

    @Override
    public Class<?> getColumnClass(int coluna) {
        return String.class;
    }

    @Override
    public int getColumnCount() {
 
        return qalist.get(0).getCampos().size();
    }

    @Override
    public String getColumnName(int coluna) {
        switch (coluna) {
            case 0:
                return "IdQA";
            case 1:
                return "NomeJob"; 
            case 2:
                return "NomeProjeto";
            case 3:
                return "NomeAmbiente";
            case 4:
                return "DurExecucao";
            case 5:
                return "DataIni";
            case 6:
                return "DataFim";
            case 7:
                return "StatusExecucao";
            case 8:
                return "DataEnvio";
            case 9:
                return "Analista";
            case 10:
                return "StatusQA";
            default:
                return ""; 
        }
    }

    @Override
    public int getRowCount() {
        return qalist.size();
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Qa a = qalist.get(linha);

        switch (coluna) {
            case 0:
                return a.getIdQa(); 
            case 1:
                return a.getNomeJob();   
            case 2:
                return a.getNomeProjeto();
            case 3:
                return a.getNomeAmbiente();
            case 4:
                return a.getDurExecucao();
            case 5:
                return a.getDataIni();
            case 6:
                return a.getDataFim();
            case 7:
                return a.getStatusExecucao();
            case 8:
                return a.getDataEnvio();
            case 9:
                return a.getAnalista();
            case 10:
                return a.getStatusQA();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        Qa c = qalist.get(linha);
        switch (coluna) {
            case 0:
                c.setIdQa(Integer.parseInt(valor.toString()));
                break;
            case 1:
                c.setNomeJob(valor.toString());
                break;
            case 2:
                c.setNomeProjeto(valor.toString());
                break;
            case 3:
                c.setNomeAmbiente(valor.toString());
                break;
            case 4:
                c.setDurExecucao(valor.toString());
                break;
            case 5:
                c.setDataIni(valor.toString());
                break;
            case 6:
                c.setDataFim(valor.toString());
                break;
            case 7:
                c.setStatusExecucao(valor.toString());
                break;
            case 8:
                c.setDataEnvio(valor.toString());
                break;
            case 9:
                c.setAnalista(valor.toString());
                break;
            case 10:
                c.setStatusQA(valor.toString());
                break;
        }

    }

    public void adiciona(Qa a) {
    	qalist.add(a);
        fireTableRowsInserted(qalist.size() - 1, qalist.size() - 1);
    }

    public void remove(int indice) {
    	qalist.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }

    public int getIndice(Qa a) {
        return qalist.indexOf(a);
    }

    public void adicionaLista(List<Qa> lista) {
        int i = qalist.size();
        qalist.addAll(lista);
        fireTableRowsInserted(i, i + lista.size());
    }

    public void limpaLista() {
        int i;
        if (qalist.size() > 0) {
            i = qalist.size();
        } else {
            i = 1;
        }
        qalist.clear();
        fireTableRowsDeleted(0, i - 1);
    }
}