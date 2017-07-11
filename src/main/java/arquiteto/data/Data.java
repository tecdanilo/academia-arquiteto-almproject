package arquiteto.data;

public class Data {
	int dia, mes,ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}

	//ano divisível por 4 e não por 100 ou por 400
	public boolean anoBissexto() {
		return (ano%4==0 && ano%100!=0) || (ano%400==0);
	}
}
