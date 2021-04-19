package packet;	
	public class Factura implements PorPagar{
	
		private String numeroPieza;
		private String descripcionPieza;
		private int cantidad;
		private double precioPorArticulo;
	
	public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
			super();
			this.numeroPieza = numeroPieza;
			this.descripcionPieza = descripcionPieza;
			this.setCantidad(cantidad);
			this.setPrecioPorArticulo(precioPorArticulo);
		}

	public String getNumeroPieza() {
		return numeroPieza;
	}

	public void setNumeroPieza(String numeroPieza) {
		this.numeroPieza = numeroPieza;
	}

	public String getDescripcionPieza() {
		return descripcionPieza;
	}

	@Override
	public String toString() {
		return "Piezas No. :" + this.numeroPieza + ", \ndescripcionPieza=" + this.descripcionPieza + ", cantidad: t"
				+ this.cantidad + ", \nPrecio: " + this.precioPorArticulo
				+ "\nMonto a pagar:\t " +this.obtenerMontoPago();
	}

	public void setDescripcionPieza(String descripcionPieza) {
		this.descripcionPieza = descripcionPieza;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		if (cantidad > 0)
			this.cantidad = cantidad;
		else
			this.cantidad = 0;
	}

	public double getPrecioPorArticulo() {
		return precioPorArticulo;
	}

	public void setPrecioPorArticulo(double precioPorArticulo) {
		if (precioPorArticulo > 0)
			this.precioPorArticulo = precioPorArticulo;
		else
			this.precioPorArticulo = 0;
	}

	public double obtenerMontoPago() {
		return 0;
	}
}
