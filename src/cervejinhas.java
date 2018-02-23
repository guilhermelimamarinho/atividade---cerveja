import java.util.Scanner;


public class cervejinhas {
	public static void main(String[] args){

		int cervejas = 99;
		int opcao = 0;
		int quantidade = 0;
		Scanner leitor = new Scanner(System.in);
		
			System.out.println("Informe o numero de cervejas : ");
			cervejas = leitor.nextInt();
			cervejas = cervejas - 1;

		while (cervejas > 0){

		System.out.println(" Existem  " + cervejas + " Cervejas no freezer.  ");
		System.out.println(" Pego uma garrafa e passo pra frente ");
		cervejas = cervejas - 1;
		System.out.println(" Agora restam  "  + cervejas +  "  no freezer ");
		
	if (cervejas == 1){
		System.out.println(" As cervejas acabaram... vai mais uma ? ");
		System.out.println(" Digite 1 - para SIM ");
		System.out.println(" Digite 2 - para NAO ");
		opcao = leitor.nextInt();
		
	if (opcao == 1){
		System.out.println(" Informe o n° de cervejas ");
		quantidade = leitor.nextInt();
		cervejas = quantidade;
		System.out.println(" Cervejas reabastecidas ");
	}else{
		System.out.println(" Ta no fim ... ");
		}
		}

		}
	leitor.close();

		}

}