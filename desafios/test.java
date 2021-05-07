import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {

	public static void main(String[] args) {
		
		String result;
		int tentativa = 0, pass = 0, vidas =0;
		boolean ok = false;
		
		Scanner entrada = new Scanner(System.in);
		do {
			
		do {
			
			System.out.println("V� at� a mesa de alquimia para descobrir o ant�doto antes que o veneno fa�a efeito! Depressa!");
			System.out.println("� preciso solucionar a equa��o para encontrar a mistura exata dos ingredientes! Misture o p� de sil�cio com as pepitas de ouro e hidr�xido de c�lcio!");
			
		List<String> urna = Arrays.asList("19", "21", "6", " 23", "12");
			
		Collections.shuffle(urna);
		
		String certo = "21";
		
		System.out.println("Qual o resultado da equa��o: ");
		System.out.println("10y - 5 (1 + y) = 3 (2y - 2) - 20");
		
		System.out.println("(A)" + urna.get(0));
		System.out.println("(B)" + urna.get(1));
		System.out.println("(C)" + urna.get(2));
		System.out.println("(D)" + urna.get(3));
		System.out.println("(E)" + urna.get(4));
		
		System.out.println("Digite a alternativa correta: ");
		result = entrada.next();
		
		switch (result.toLowerCase()) {
		
		case "a":
			tentativa++;
			if (urna.get(0).equals(certo)) {
				ok = true;
			} else {
				vidas++;
				System.out.println("Mistura incorreta, a cor n�o coincide com a esperada");
				System.out.println("*-------------------------------*");
			} break;
			
		case "b":
			tentativa++;
			if (urna.get(1).equals(certo)) {
				ok = true;
			} else {
				vidas++;
				System.out.println("Mistura incorreta, n�o deve acontecer uma pequena explos�o");
				System.out.println("*-------------------------------*");
			} break;
			
		case "c":
			tentativa++;
			if (urna.get(2).equals(certo)) {
				ok = true;
			} else {
				vidas++;
				System.out.println("Mistura incorreta, a f�rmula certa n�o possui n�voa roxa");
				System.out.println("*-------------------------------*");
			} break;
			
		case "d":
			tentativa++;
			if (urna.get(3).equals(certo)) {
				ok = true;
			} else {
				vidas++;
				System.out.println("Mistura incorreta, talvez te transforme em um sapo");
				System.out.println("*-------------------------------*");
			} break;
			
		case "e":
			tentativa++;
			if (urna.get(4).equals(certo)) {
				ok = true;
			} else {
				vidas++;
				System.out.println("Mistura incorreta, n�o � normal sair fa�scas");
				System.out.println("*-------------------------------*");
			} break;
		
		default:
			System.out.println("Opera��o �nvalida!");
			System.out.println("*-------------------------------*");
		}
		
		} while (!ok && tentativa < 3);
		
		if (ok) {
			pass++;	
			System.out.println("Resposta correta! Voc� acertou as medidas exatas da f�rmula!");
		} else {
			System.out.println("Resposta incorreta nas 3 tentativas");
		}
		
		tentativa = 0;
		ok = false;
		System.out.println("Os iluministas n�o usam a mesma lingua e sistema n�meral que n�s, fa�a a conver��o para saber qual � o frasco com reagente certo!");
		
		do {
			
			List<String> urna = Arrays.asList("1 0100", "1 1010", "1 0000", "1 0101", "1 0010");
			
			Collections.shuffle(urna);
			
			String certo = "1 0101";
			
			System.out.println("Converta o n�mero de y para saber qual  reagente correto: ");
			System.out.println("y = 21");
			
			System.out.println("(A)" + urna.get(0));
			System.out.println("(B)" + urna.get(1));
			System.out.println("(C)" + urna.get(2));
			System.out.println("(D)" + urna.get(3));
			System.out.println("(E)" + urna.get(4));
			
			System.out.println("Digite a alternativa correta: ");
			result = entrada.next();
			
			switch (result.toLowerCase()) {
			
			case "a":
				tentativa++;
				if (urna.get(0).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Reagente incorreto, este n�o � o aspecto correto");
					System.out.println("*-------------------------------*");
				} break;
				
			case "b":
				tentativa++;
				if (urna.get(1).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Reagente incorreto, a cor n�o bate com a certa");
					System.out.println("*-------------------------------*");
				} break;
				
			case "c":
				tentativa++;
				if (urna.get(2).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Reagente incorreto, quantidade � menor do que desejada");
					System.out.println("*-------------------------------*");
				} break;
				
			case "d":
				tentativa++;
				if (urna.get(3).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Reagente incorreto, o correto n�o possui partes de animais na composi��o");
					System.out.println("*-------------------------------*");
				} break;
				
			case "e":
				tentativa++;
				if (urna.get(4).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Reagente incorreto, o cheiro deste n�o me parece muito bom");
					System.out.println("*-------------------------------*");
				} break;
			
			default:
				System.out.println("Opera��o �nvalida!");
			}
			
			} while (!ok && tentativa < 3);
		
		if (ok) {
			pass++;	
			System.out.println("Resposta correta!");
		} else {
			System.out.println("Resposta incorreta nas 3 tentativas");
		}
		
		tentativa = 0;
		ok = false;
		System.out.println("�timo... �timo... Agora � preciso que voc� descubra a dosagem exata do ant�doto!");
do {
			
			List<String> urna = Arrays.asList("4,5", "5", "4,4", "4", "6");
			
			Collections.shuffle(urna);
			
			String certo = "4,5";
			
			System.out.println("Extraia a raiz quadrada do n�mero para saber a dosagem correta: ");
			System.out.println("21");
			
			System.out.println("(A)" + urna.get(0));
			System.out.println("(B)" + urna.get(1));
			System.out.println("(C)" + urna.get(2));
			System.out.println("(D)" + urna.get(3));
			System.out.println("(E)" + urna.get(4));
			
			System.out.println("Digite a alternativa correta: ");
			result = entrada.next();
			
			switch (result.toLowerCase()) {
			
			case "a":
				tentativa++;
				if (urna.get(0).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Resposta incorreta!");
					System.out.println("*-------------------------------*");
				} break;
				
			case "b":
				tentativa++;
				if (urna.get(1).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Resposta incorreta!");
					System.out.println("*-------------------------------*");
				} break;
				
			case "c":
				tentativa++;
				if (urna.get(2).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Resposta incorreta!");
					System.out.println("*-------------------------------*");
				} break;
				
			case "d":
				tentativa++;
				if (urna.get(3).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Resposta incorreta!");
					System.out.println("*-------------------------------*");
				} break;
				
			case "e":
				tentativa++;
				if (urna.get(4).equals(certo)) {
					ok = true;
				} else {
					vidas++;
					System.out.println("Resposta incorreta!");
					System.out.println("*-------------------------------*");
				} break;
			
			default:
				System.out.println("Opera��o �nvalida!");
			}
			
			} while (!ok && tentativa < 3);

			if (ok) {
				pass++;	
				System.out.println("Resposta correta!");
				System.out.println("Parab�ns, voc� conseguiu formular o ant�doto");
			} else {
				System.out.println("Voc� fracassou!");
			}
					System.out.println(pass);
		} while (pass < 3 || vidas < 5);
		
		}

	}


