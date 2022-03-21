
public class TestaValores {
	
	//ao digitar "main" e apertar ctrl+espaço, aparece uma janelinha pra fazer auto complete, podendo inserir a linha abaixo
	//automaticamente
	public static void main(String[] args) {
	
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		System.out.println(segundo);
		
		//nessa brincadeira aqui, a ideia é ver como funciona a passagem por valor.
		//bom, o segundo vai  ficar com o valor 7. ele não vai alocar dinamicamente o valor para 10
		//quando fazemos uma atribuição no Java, não se diz que uma variável sempre segue a outra
		//na verdade, estamos copiando e colando os valores.
		//a variável guarda um valor e não uma referência.
		
	}
	
}
