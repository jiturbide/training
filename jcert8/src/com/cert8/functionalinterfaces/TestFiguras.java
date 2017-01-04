package com.cert8.functionalinterfaces;

import java.util.Date;

public class TestFiguras {

	public static void main(String[] args) {
		Factura f = new Factura("12345-6", new Date());
		Reportable <Factura> r = (m, n) -> {System.out.println("Folio: " + n.getFolio() + "\nFecha: " + n.getFhVenta());};
		r.imprimir(f,f);
	}
	
}

class Factura{
	private String folio = "0000-0";
	private Date fhVenta = new Date();
	
	public Factura() {} 
	public Factura(String folio, Date fhVenta) { this.folio = folio; this.fhVenta = fhVenta; }
	
	public String getFolio() { return folio; }
	public Date getFhVenta() { return fhVenta;
	}
}

@FunctionalInterface
interface Reportable<T>{
	public void imprimir(T comprobante, T otroParam);
}
