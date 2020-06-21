package ec.edu.ups.Modelo;

public class Reporte {

	private int report_id;
	private String Datos;
	private String Diario;
	private double balances;
	private LibroDiario libroDiario;
	
	public Reporte() {
		super();
	}
	

	public void setBalances(double balances) {
		this.balances = balances;
	}


	@Override
	public String toString() {
		return "Reporte [report_id=" + report_id + ", Datos=" + Datos + ", Diario=" + Diario + ", balances=" + balances
				+ ", libroDiario=" + libroDiario + "]";
	}
	
}
