package DIPsolution;

public abstract class Vehiculo {
	private String tipoVehiculo;
	public Vehiculo(String tipoVehiculo) {
		this.setTipoVehiculo(tipoVehiculo);
	}
	
	public String getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	
}
