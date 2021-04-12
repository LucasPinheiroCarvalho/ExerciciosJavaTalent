
public class QuestaoUm {
	
	
	public static int questaoUm(int anos, int meses, int dias) {
		int diasVividos = dias;
		diasVividos = (meses * 30) + diasVividos;
		diasVividos += anos * 365;
		return diasVividos;
	}

}