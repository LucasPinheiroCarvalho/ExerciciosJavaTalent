public class Main {
	public static void main(String args[]){
		int diasVividos = QuestaoUm.questaoUm(3, 2 , 15);
		System.out.println(" Questao Um");
		System.out.println(" "+diasVividos);
		double mediaAritimetica = QuestaoDois.medias(8, 9, 7);
		double mediaAritimetica1 = QuestaoDois.medias(4, 5, 6);
		double somaMedia = mediaAritimetica + mediaAritimetica1;
		double mediaDasMedia = (mediaAritimetica + mediaAritimetica1) / 2;
		System.out.println(" Questao Dois");
		System.out.println(" Soma das Medias "+somaMedia);
		System.out.println(" Media das Medias "+mediaDasMedia);
		System.out.println(" Questão Tres");
		double saldo = QuestaoTres.saldo(1998.6);
		System.out.println(" "+ saldo);
		System.out.println(" Questão Quatro");
		double valorTotalPago = QuestaoQuatro.valorTotalPago(500, 2, 500, 2, 32);
		System.out.println(" valor total a ser pago e apresentar o resultado é: "+valorTotalPago);
		System.out.println(" Questao 5");
		System.out.println(" O usuário ganha "+QuestaoCinco.salario(788.00, 4806.80)+" salários mínimos");
		// Questão com ajuda de professor
		
		System.out.println(" Questão 6");
		int[] antecessorSucessor = QuestaoSeis.getSucessorAntecessor(10);
		for(int i = 0;i< antecessorSucessor.length; i++) {
			System.out.println(" Resultado "+antecessorSucessor[i]);
		}
		
		
	}

}