import static org.junit.Assert.*;

import org.junit.Test;


public class GeradorTest {

	@Test
	public void deveGerarSqlDelete() {
		String sqlGerado = Gerador.delete("nome_tabela");
		assertEquals("DELETE FROM nome_tabela", sqlGerado );
	}
	
	@Test
	public void deveGerarSqlDeleteParaOutraTabela() {
		String sqlGerado = Gerador.delete("outra_tabela");
		assertEquals("DELETE FROM outra_tabela", sqlGerado );
	}
	
	@Test
	public void deveGerarSqlUpdate() {
		String nomeTabela = "nome_tabela";
		String nomeColuna = "coluna1";
		String valor = "30";
		String sqlGerado = Gerador.update(nomeTabela , nomeColuna , valor );
		assertEquals("UPDATE nome_tabela SET coluna1 = 30;", sqlGerado );
	}
	
	@Test
	public void deveGerarSqlUpdateParaOutraColuna() {
		String nomeTabela = "nome_tabela";
		String nomeColuna = "coluna60";
		String valor = "30";
		String sqlGerado = Gerador.update(nomeTabela , nomeColuna , valor );
		assertEquals("UPDATE nome_tabela SET coluna60 = 30;", sqlGerado );
	}
	
	
	
	
	
	
	
	
	
	
	

	
}
