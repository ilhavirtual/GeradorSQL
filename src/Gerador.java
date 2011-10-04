
public class Gerador {

	public static String delete(String nomeTabela) {
		return "DELETE FROM " + nomeTabela;
	}

	public static String update(String nomeTabela, String nomeColuna,
			String valor) {
		return "UPDATE " + nomeTabela + " SET " + nomeColuna + " = " + valor + ";";
	}

}
