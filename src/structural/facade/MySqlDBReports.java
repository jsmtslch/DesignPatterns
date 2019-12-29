package structural.facade;

public class MySqlDBReports implements DatabaseReport{

	@Override
	public DatabaseReport getDatabaseReportConnection() {
		DatabaseReport con = new MySqlDBReports();
		return con;
	}

	@Override
	public void generatePdfReport() {
		System.out.println("Generated PDF Report from MySQL");
	}

	@Override
	public void generateHtmlReport() {
		System.out.println("Generated HTML Report from MySQL");
	}
}
