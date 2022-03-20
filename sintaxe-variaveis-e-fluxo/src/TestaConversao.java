
public class TestaConversao {
	
	public static void main(String[] args) {
		
        double salario = 1270.50;
        int valor = (int) salario;      
    	System.out.println(valor);
    	//a gente já sabe que um int virando double é possível, certo? academicamente falando, esse valor está
    	//sendo promovido
    	//no entanto, o contrário não é feito de forma automática. o java é rígido e não quer que vc perca o valor
    	//depois do ponto flutuante. vc precisar colocar o (int) pra avisar pro compilador que você vai perder 
    	//aquele valor. Isso a gente chama de "casting"
    	
    	//int só cabe 32 bits. cabe sinal só consegue guardar até 2 bilhões. vai de 2 elevado a 31 negativo
        //até 2 elevado a 31 positivo menos 1 (por ter o 0 no meio) >> -2147483648 até 2147483647 (passando pelo 0)
        int numeroIntMaximoNegativo = -2147483648;
        System.out.println(numeroIntMaximoNegativo);
        int numeroIntMaximoPositivo = 2147483647;
        System.out.println(numeroIntMaximoPositivo);

        //long é o tipo de número que vai caber até 64 bits
        //inclusive, ao usarmos um número maior que 32 bits na parte direita, devemos usar o "l" ou "L" logo depois
        //dele (ou o casting (long). isso porque, por padrão, quando um número não é double, o java considera como 
        //int
        long numeroGrandePositivo = 4611686018427387904l; //2 elevado a 62 
        System.out.println(numeroGrandePositivo);    
        numeroGrandePositivo *= 2; //2 elevado a 63 (overflow - restart)
        System.out.println(numeroGrandePositivo);
        numeroGrandePositivo -= 1; //2 elevado a 63 - 1 (limite)
        System.out.println(numeroGrandePositivo);
        long numeroGrandeNegativo = -4611686018427387904l; //2 negativo elevado a 62
        System.out.println(numeroGrandeNegativo);    
        numeroGrandeNegativo *= 2; //2 negativo elevado a 63 (limite)
        System.out.println(numeroGrandeNegativo);
        
        //short vai ser uma variável usada para números menores, com o máximo de 16 bits
        short valorPequeno = 2131;

        System.out.println(valorPequeno);
        //byte vai ter o limite de 8 bits
        byte valorByte = 127;

        System.out.println(valorByte);
        
        
        //quando for um número que nem cabe na tela você não vai usar esses números primitivos e sim objtetos,
        //bibliotecas. Pra salarios, o que vai ser usado é a classe "java.math.BigDecimal"        
        
        
        //agora temos esse caso:
        //o resultado desses dois valores deveria ser 0.3 porém sai 0.3000...4
        //tem uma explicação mais engenhosa no site https://0.30000000000000004.com/        
        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1+valor2;
       
        System.out.println(total);
        
        //alem do double (que é 64 bits), temos o float, que é de 32 bits
        //nesse caso, o Java considera o 3.14 como um número de 64bits e isso não cabe no float
        //você pode tanto fazer um casting - usando um (float) no começo do número - quanto botar um "f" no final
        float pontoFlutuante = 3.14f;
        
        System.out.println(pontoFlutuante);
        
    }
	
}
