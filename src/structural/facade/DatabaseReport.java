package structural.facade;

public interface DatabaseReport {
	
	public DatabaseReport getDatabaseReportConnection();
	
	public void generatePdfReport();
	
	public void generateHtmlReport();
}
