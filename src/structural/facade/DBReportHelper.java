package structural.facade;

public class DBReportHelper {
	DatabaseReport dbReport;
	public void generateReport(String connection, String reportType) {
		if(connection.equalsIgnoreCase("oracle")) {
			dbReport = new OracleDBReports();
			if(reportType.equalsIgnoreCase("pdf")) {
				dbReport.generatePdfReport();
			}if(reportType.equalsIgnoreCase("html")) {
				dbReport.generateHtmlReport();
			}
		}if(connection.equalsIgnoreCase("mysql")) {
			dbReport = new MySqlDBReports();
			if(reportType.equalsIgnoreCase("pdf")) {
				dbReport.generatePdfReport();
			}if(reportType.equalsIgnoreCase("html")) {
				dbReport.generateHtmlReport();
			}
		}
		
	}
}
