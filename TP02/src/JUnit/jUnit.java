package JUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Controle.*;

 class jUnit {
	 Controle controle = new Controle();
	 Dados dados = new Dados();
	 
	 
	 @Test
	 void testeCadastroSeringa() {
		 String[] novaP = new String[8];
	
		 
		 novaP[0] ="0";
		 novaP[1] ="A";
		 novaP[2] ="Seringa descatavel para Insulina";
		 novaP[3] ="40028922";
		 novaP[4] ="2.0";
		 novaP[5] ="0";
		 novaP[6] ="18.0";
		 novaP[7] ="0.1";
		 
		 assertTrue(controle.inserirEditarSeringa(novaP));
		 
		 
	 }
	 void testeExcluirToxina() {
		 assertTrue(controle.removerSeringa(0));
	 }
	 void testeCadastroToxina() {
		 String[] novaP = new String[8];
	
		 
		 novaP[0] ="0";
		 novaP[1] ="Butolift";
		 novaP[2] ="Toxina para musculaturas superficiais";
		 novaP[3] ="666";
		 novaP[4] ="10.0";
		 novaP[5] ="0";
		 novaP[6] ="Aplicado com agulhas mais longas para musculaturas mais profundas";
		 novaP[7] ="0.1";
		 
		 assertTrue(controle.inserirEditarToxina(novaP));
		 

}
}