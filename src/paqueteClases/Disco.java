package paqueteClases;

public class Disco {
	private Double radioInterior;
	private Double radioExterior;
	
	public Disco() {
		radioInterior = 0.0;
		radioExterior = 0.0;
	}
	
	public Disco(Double radioInterior,Double radioExterior) {
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
	}
	
	public Double calcularPerimetroInterior() {
		Double resultadoPerimetro;
		resultadoPerimetro = 2 * Math.PI * radioInterior; 
		return resultadoPerimetro;
	}

	public Double calcularPerimetroExterior() {
		Double resultadoPerimetro;
		resultadoPerimetro = 2 * Math.PI * radioExterior; 
		return resultadoPerimetro;
	}

	public Double calcularSuperficie() {
		Double resultadoSuperficie;
		resultadoSuperficie = Math.PI(Math.pow(radioExterior,2) - Math.pow(radioInterior,2));
		return resultadoSuperficie;
	}

	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}	
	
}
