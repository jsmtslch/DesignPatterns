package structural.facade;

public class Client {
	public static void main(String[] args) {
		DBReportHelper reportHelper = new DBReportHelper();
		reportHelper.generateReport("oracle", "html");
		reportHelper.generateReport("mysql", "pdf");
	}
}
