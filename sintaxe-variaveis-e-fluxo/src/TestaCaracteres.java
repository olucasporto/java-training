
public class TestaCaracteres {

	public static void main(String[] args) {
		//char é uma variável primitiva queguarda um - e apenas um - caracter de 16bits
		//se colocarmos 'ab' ou até mesmo "a", ele não vai compilar. Ele só aceita aspas simples
		//o char guarda em si um único código que é um número da tabela Unicode - como a ASCII, porém muito maior e sem limite
		//definido
		//a variável letra  vai  ser, portanto, um número. 
		//é uma variável do tipo numérica equivalente ao short. Porém possui apenas valores positivos
		char letra = 'a';
		System.out.println(letra);
		
		//no momento, é interessante saber que ele é um número convertido em uma letra, como no exemplo a seguir:
		char valor = 66;
		System.out.println(valor);
		
		//aqui, se fizessemos valor = valor + 1, o Java não iria compilar.
		//de novo, por causa da regra de promoção Java. sendo valor um char e 1 um int
		//a soma dos dois acaba virando int (que é mais brabo que o char) e isso não
		//cabe na nossa variavel char. se fosse um char querendo ser int, tudo bem. mas
		//direito adquirido não pode ser retirado
		//porém, se quisermos que seja possível, faremos novamente o casting, passando
		//o resultado da soma como casting, como podemos ver abaixo:
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		//bom, aqui a gente já muda pra outro tipo. Só que esse tipo não é mais uma 
		//variável primitiva básica do Java. Ela não guarda valor
		//na verdade, ela é um tipo de referência. Tudo  vai ficar mais claro quando
		//formos entender melhor sobre orientação a objetos
		String palavra = "alura cursos online de tecnlogia";
		System.out.println(palavra);
		//o funcionamento de uma String exige aspas duplas. Elas podem inclusive ficar 
		//vazias (diferente do char). Fora isso, para declararmos a String vamos sempre
		//ter que chamala com o S maiúsculo
		
		//e aqui em Java, para concatenar usaremos o +. Nesse caso, ele sempre vai 
		//entender como concatenar. caso queira somar, tem que botar entre parenteses
		//enfim, em breve veremos que ela faz referência a um objeto e possui vários 
		//métodos.
		palavra = palavra + 2000;
		System.out.println(palavra);
		
	}
	
}
