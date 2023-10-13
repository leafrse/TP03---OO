package Model;

public class main {

	static Seringa teste01;
	static ToxinaButolinica teste02;

	public static void main(String[] args) {
		System.out.println("Seringa para botox: \n");
		teste01 = new Seringa("Injex-Seringa descartavel ", "Seringa descartavel média", 123456789, 45.70, 898, 09.95,
				98.02);
		System.out.println(teste01.toString());
		System.out.println("Toxina Butolinica: \n");
		teste02 = new ToxinaButolinica("CLift", "Botox redutor de Volume", 777877778, 90.71, 150,
				"Redução de volume e cabelos bem tratados. Tira totalmente o friz dos cabelos deixando-os com brilho intenso, compatível com qualquer química.",
				0.028);
		System.out.println(teste02.toString());

	}

}