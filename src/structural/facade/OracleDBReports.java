package structural.facade;

public class OracleDBReports implements DatabaseReport {

	@Override
	public DatabaseReport getDatabaseReportConnection() {
		OracleDBReports con = new OracleDBReports();
		return con;
	}

	@Override
	public void generatePdfReport() {
		System.out.println("Generated PDF Report from Oracle");
	}

	@Override
	public void generateHtmlReport() {
		System.out.println("Generated HTML Report from Oracle");
	}

}
