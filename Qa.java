package omdcad;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Qa {

private int idQa;
private String NomeJob, NomeProjeto, NomeAmbiente,DurExecucao,DataIni,DataFim,StatusExecucao, DataEnvio, Analista, StatusQA ;
private boolean consistencia;

public Qa(){
    super();
setIdQa(0);
setNomeJob("");
setNomeProjeto("");
setNomeAmbiente("");
setDurExecucao("");
setDataIni("");
setDataFim("");
setStatusExecucao("");
setDataEnvio("");
setAnalista("");
setStatusQA("");
}

public void setStatusQA(String statusQA) {
	if (statusQA.length() > 0)
	    this.StatusQA = statusQA;
	else{
		this.StatusQA = "";
	setConsistencia(false);
	return;
	}
	setConsistencia(true);
	
}

public String getStatusQA() {
	return StatusQA;
}

public void setAnalista(String analista) {
	if (analista.length() > 0)
	    this.Analista = analista;
	else{
		this.Analista = "";
	setConsistencia(false);
	return;
	}
	setConsistencia(true);
	
}

public String getAnalista() {
	return Analista;
}


public void setDataEnvio(String dataEnvio) {
	if (dataEnvio.length() > 0)
	    this.DataEnvio = dataEnvio;
	else{
		this.DataEnvio = "";
	setConsistencia(false);
	return;
	}
	setConsistencia(true);
	
}

public GregorianCalendar getDataEnvioFomated() throws ParseException {
	return convStringToDate(DataEnvio);
}

public String getDataEnvio() {
	return DataEnvio;
}

public void setStatusExecucao(String statusExecucao) {
	if (statusExecucao.length() > 0)
	    this.StatusExecucao = statusExecucao;
	else{
		this.StatusExecucao = "";
	setConsistencia(false);
	return;
	}
	setConsistencia(true);
	
}

public String getStatusExecucao() {
	return StatusExecucao;
}

public void setDataFim(String dataFim) {
	if (dataFim.length() > 0)
	    this.DataFim = dataFim;
	else{
		this.DataFim = "";
	setConsistencia(false);
	return;
	}
	setConsistencia(true);
	
}

public GregorianCalendar getDataFimFomated() throws ParseException {
	return convStringToDate(DataFim);
}

public String getDataFim() {
	return DataFim;
}


public void setDataIni(String dataIni) {
	if (dataIni.length() > 0)
	    this.DataIni = dataIni;
	else{
		this.DataIni = "";
	setConsistencia(false);
	return;
	}
	setConsistencia(true);
	
}

public String getDataIni() {
	return DataIni;
}

public GregorianCalendar getDataIniFomated() throws ParseException {
	return convStringToDate(DataIni);
}


public void setDurExecucao(String durExecucao) {
	if (durExecucao.length() > 0)
	    this.DurExecucao = durExecucao;
	else{
		this.DurExecucao = "";
	setConsistencia(false);
	return;
	}
	setConsistencia(true);
	
}

public String getDurExecucao() {
	return DurExecucao;
}

public void setNomeAmbiente(String nomeAmbiente) {
	if (nomeAmbiente.length() > 0)
	    this.NomeAmbiente = nomeAmbiente;
	else{
		this.NomeAmbiente = "";
	setConsistencia(false);
	return;
	}
	setConsistencia(true);
	
}

public String getNomeAmbiente() {
	return NomeAmbiente;
}

public final void setNomeProjeto(String nomeProjeto) {
	if (nomeProjeto.length() > 0)
		this.NomeProjeto = nomeProjeto;
		else{
		this.NomeProjeto = "";
		setConsistencia(false);
		return;
		}
		setConsistencia(true);
}

public String getNomeProjeto() {
	return NomeProjeto;
}

public final void setNomeJob(String nomeJob) {
	if (nomeJob.length() > 0)
		this.NomeJob = nomeJob;
		else{
		this.NomeJob = "";
		setConsistencia(false);
		return;
		}
		setConsistencia(true);
}

public String getNomeJob() {
	return NomeJob;
}

public final void setIdQa(int IdQa) {
	this.idQa = IdQa;
}

public int getIdQa() {
	return idQa;
}


private GregorianCalendar convStringToDate(String string) throws ParseException{
	DateFormat formata = new SimpleDateFormat("dd/MM/yyyy");
	Date date = formata.parse(string);
	GregorianCalendar calendar = new GregorianCalendar();
	calendar.setTime(date);
	return calendar ;
}

public void setConsistencia (boolean consistencia){
	this.consistencia = consistencia;
}

public boolean getConsistencia() {
	return consistencia;
}

public void LeiaDados(){
	setIdQa(idQa);
    if (getConsistencia())
       setNomeJob(JOptionPane.showInputDialog("Nome Job"));
    if (getConsistencia())
       setNomeProjeto(JOptionPane.showInputDialog("Nome Projeto"));
    if (getConsistencia())
    	setNomeAmbiente(JOptionPane.showInputDialog("Nome Ambiente"));
    if (getConsistencia())
    	setDurExecucao(JOptionPane.showInputDialog("Duração Execucao"));
    if (getConsistencia())
    	setDataIni(JOptionPane.showInputDialog("Data Início QA"));
    if (getConsistencia())
    	setDataFim(JOptionPane.showInputDialog("Data Fim QA"));
    if (getConsistencia())
    	setDataEnvio(JOptionPane.showInputDialog("Data Envio QA"));
    if (getConsistencia())
    	setAnalista(JOptionPane.showInputDialog("Analista"));
    if (getConsistencia())
    	setStatusQA(JOptionPane.showInputDialog("Status QA"));
    if (!getConsistencia())
       JOptionPane.showMessageDialog(null,"Os dados não foram lidos!","",JOptionPane. WARNING_MESSAGE);
}


public void LeiaDados(boolean AUTO){
    setNomeJob(JOptionPane.showInputDialog("Nome Job"));
 if (getConsistencia())
    setNomeProjeto(JOptionPane.showInputDialog("Nome Projeto"));
 if (getConsistencia())
 	setNomeAmbiente(JOptionPane.showInputDialog("Nome Ambiente"));
 if (getConsistencia())
 	setDurExecucao(JOptionPane.showInputDialog("Duração Execucao"));
 if (getConsistencia())
 	setDataIni(JOptionPane.showInputDialog("Data Início QA"));
 if (getConsistencia())
 	setDataFim(JOptionPane.showInputDialog("Data Fim QA"));
 if (getConsistencia())
 	setDataEnvio(JOptionPane.showInputDialog("Data Envio QA"));
 if (getConsistencia())
 	setAnalista(JOptionPane.showInputDialog("Analista"));
 if (getConsistencia())
 	setStatusQA(JOptionPane.showInputDialog("Status QA"));
	if (!getConsistencia())
	JOptionPane.showMessageDialog(null,"Os dados não foram lidos!","",JOptionPane. WARNING_MESSAGE);
}

public void ShowDados(){
String Saida = "IdQa :"+getIdQa()+
"\n NomeJob :"+getNomeJob()+
"\n NomeProjeto :"+getNomeProjeto()+
"\n NomeAmbiente:"+getNomeAmbiente()+
"\n DurExecucao :"+ getDurExecucao()+
"\n DataIni :"+getDataIni()+
"\n DataFim :"+getDataFim()+
"\n StatusExecucao :"+getStatusExecucao()+
"\n DataEnvio :"+getDataEnvio()+
"\n Analista :"+getAnalista()+
"\n StatusQA :"+getStatusQA();
JOptionPane.showMessageDialog(null,Saida);
}

public Vector<String> getCampos(){
Vector<String> Campos = new Vector<String>();
Campos.add("IdQa");
Campos.add("NomeJob");
Campos.add("NomeProjeto");
Campos.add("NomeAmbiente");
Campos.add("DurExecucao");
Campos.add("DataIni");
Campos.add("DataFim");
Campos.add("StatusExecucao");
Campos.add("DataEnvio");
Campos.add("Analista");
Campos.add("StatusQA");
return Campos;
}

}