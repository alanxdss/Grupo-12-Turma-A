import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MeuAndar {
	static int temp_dialog = 65, temp_questions = 15, temp_dialogSlow = 200, temp_dialogFast = 80,
			temp_dialogFaster = 30, ultra_Speed = 10, temp_dotsSlow = 400, temp_dots = 200;

	// As vari�veis em cima s�o para a velocidadae que voc� quer da letra. Quanto
	// menor o n�mero, mais r�pida. Quanto maior, mais lenta.
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String resp1 = "2021", ex1;
		int cont = 0;
		boolean resp1v = false;

		Digita("Ao subir o 3� Andar da torre voc� se depara com uma Caverna!!", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		System.out
				.printf("        ____\r\n" + "       /    /\\____/ \\    /\\\r\n" + "      /\\   /   \\/    \\  / /\r\n"
						+ "     / /   \\   /  / \\ \\/  \\\r\n" + "    /  \\   /   / /   \\     \\\r\n"
						+ "    \\  /  /\\   \\/  \\  \\     \\\r\n" + "    /  \\/ \\ \\  / \\  \\/ \\    / \r\n"
						+ "    \\     /  \\/   \\/   /   / \r\n" + "    /    /            /    \\\r\n"
						+ "   /     /           /      \\\r\n" + "  /_____/____________\\_______\\");
		System.out.println();
		System.out.println();
		Digita("Ent�o voc� resolve adentra-la.", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("Ap�s alguns metros de caminhada voc� se vira para tr�s e para sua surpresa!!! n�o h� mais a entrada que voc� passou, logo em seguida se depara com um beco sem sa�da. ",
				TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("Observando um pouco as paredes voc� percebe que ali h� algumas pedras ametista, voc� decide analisar as pedras ametistas que est�o pr�ximas a voc�.",
				TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("Ap�s analisa-las, percebe que h� n�meros e letras, ao voc� juntar as pedras elas come�am a emitir um brilho roxo e sinalizando que acima de voc� h� um painel.",
				TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("Nesse painel diz: Para continuar o caminho voc� ter� que decifrar o c�digo '7E5'16 para sua lingua e recitar a resposta!"
				+ "se voc� falhar 3 vezes essa caverna ira desmoronar.", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println();
		Digita("Para descobrir a resposta voc� ter� que fazer convers�o de bases de hexadecimal para decimal!.",
				TimeUnit.MILLISECONDS, temp_questions);
		System.out.println();
		do {
			System.out.println("Digite o c�digo para recita-lo: ");
			ex1 = sc.next();
			if (ex1.equals(resp1)) {
				resp1v = true;
				cont++;
			} else if (cont == 0) {
				Digita("Voc� sente um leve tremor e nada acontece.\n", TimeUnit.MICROSECONDS, temp_dialogSlow);
				cont++;
			} else if (cont == 1) {
				Digita("Voc� sente denovo o tremor mas est� mais forte\n", TimeUnit.MICROSECONDS, temp_dialog);
				cont = cont + 1;
			} else if (cont == 2) {
				Digita("A caverna treme muito agora e est� prestes a cair... �ltima tentativa\n", TimeUnit.MICROSECONDS,
						temp_dialogFast);
				cont = cont + 1;
			} else if (cont == 3) {

				System.err.println(
						"Tudo come�a cair aos peda�os, voc� j� n�o enxerga mais apenas sente a dor de pedras caindo em seu corpo � uma dor agoniante... ");
				System.err.println("VOC� MORREU");
				System.exit(0);

			}

		} while (!resp1v );
		System.out.println("Parabens voc� respondeu corretamente");
		Digita("Ap�s recitar a reposta correta a caverna come�a a se mover e um caminho se abre para voc�....", TimeUnit.MICROSECONDS, temp_dialog);
		
		
	}

	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}

	}

}