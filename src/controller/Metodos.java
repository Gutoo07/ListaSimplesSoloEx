package controller;
import model.No;
import model.ListaEncadeadaSimples;

public class Metodos {
	public Metodos() {
		super();
	}
	public void teste() throws Exception {
		ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
		
		lista.append(8);
		lista.append(4);
		lista.append(7);
		lista.append(1);
		lista.append(0);
		lista.append(3);
		lista.append(5);
		lista.append(2);
		
		System.out.println(lista.toString());		
		lista.toArray();
		
		lista.ordena();		
		
		System.out.println(lista.toString());		
		lista.toArray();		
		
		lista.appendOrdena(6);
		
		System.out.println(lista.toString());	
		lista.toArray();

		System.out.println(lista.toString());	

		}
}
