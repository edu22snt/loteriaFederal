package controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import enums.LabelsEnum;

/**
 * @author eduardo.andrade
 * @since 01/09/2014
 */
public class Loterias {

	private List<Integer> listaDeNumeros;

	private String numerosSorteados;

	private String mensagemBancaria =
			LabelsEnum.CABECALHO.getDescricao() + "\n" +
			LabelsEnum.DADOSPIX.getDescricao() + "\n" +
			LabelsEnum.NOMEDESENVOLVEDOR.getDescricao();

	/**
	 * Metodo responsavel por popular a lista de numeros 
	 * mais sorteados da megasena.
	 */
	private void popularListaDeNumerosMaisSorteadosMegaSena() {
		iniciarLista();
		Integer numerosMaisSorteadosMegaSena[] = listaMegaSena();
		 for(int i = 0; i < 62; i++) {
			 listaDeNumeros.add(numerosMaisSorteadosMegaSena[i]);
		 }
	}

	/**
	 * Metodo responsavel por popular a lista de numeros
	 * mais sorteados da lotofacil.
	 */
	private void popularListaDeNumerosMaisSorteadosLotofacil() {
		iniciarLista();
		Integer numerosMaisSorteadosLotoFacil[] = listaLotoFacil();
		 for(int i = 0; i < 25; i++) {
			 listaDeNumeros.add(numerosMaisSorteadosLotoFacil[i]);
		 }
	}

	private Integer numerosSorteados(Integer numero) {
		return (int)(Math.random() * numero);
	}

	/**
	 * Metodo responsavel por popular a lista de numeros
	 * mais sorteados da Quina.
	 */
	private void popularListaDeNumerosMaisSorteadosQuina() {
		iniciarLista();
		Integer numerosMaisSorteadosQuina[] = listaQuina();

		 for(int i = 0; i < 59; i++) {
			 listaDeNumeros.add(numerosMaisSorteadosQuina[i]);
		 }
	}

	public void sortearNumerosMegaSena() {
		iniciarCampoSorteado();

		popularListaDeNumerosMaisSorteadosMegaSena();
		Random random = new Random();
		int numero = random.nextInt(listaDeNumeros.size());

		Integer valor1 = numerosSorteados(numero);
		valor1 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor2 = numerosSorteados(numero);
		valor2 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor3 = numerosSorteados(numero);
		valor3 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor4 = numerosSorteados(numero);
		valor4 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor5 = numerosSorteados(numero);
		valor5 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor6 = numerosSorteados(numero);
		valor6 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		numerosSorteados = " " + valor1 + " - " + valor2 + " - " + valor3 + " - " + valor4 + " - " + valor5 + " - " + valor6;
	}

	public void sortearNumerosQuina() {
		iniciarCampoSorteado();
		popularListaDeNumerosMaisSorteadosQuina();
		Random random = new Random();
		int numero = random.nextInt(listaDeNumeros.size());

		Integer valor1 = numerosSorteados(numero);
		valor1 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor2 = numerosSorteados(numero);
		valor2 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor3 = numerosSorteados(numero);
		valor3 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor4 = numerosSorteados(numero);
		valor4 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor5 = numerosSorteados(numero);
		valor5 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		numerosSorteados = " " + valor1 + " - " + valor2 + " - " + valor3 + " - " + valor4 + " - " + valor5;
	}

	public void sortearNumerosLotofacil(Integer tipo) {
		iniciarCampoSorteado();

		popularListaDeNumerosMaisSorteadosLotofacil();
		Random random = new Random();
		int numero = random.nextInt(listaDeNumeros.size());

		Integer valor1 = numerosSorteados(numero);
		valor1 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor2 = numerosSorteados(numero);
		valor2 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor3 = numerosSorteados(numero);
		valor3 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor4 = numerosSorteados(numero);
		valor4 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor5 = numerosSorteados(numero);
		valor5 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor6 = numerosSorteados(numero);
		valor6 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor7 = numerosSorteados(numero);
		valor7 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor8 = numerosSorteados(numero);
		valor8 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor9 = numerosSorteados(numero);
		valor9 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor10 = numerosSorteados(numero);
		valor10 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor11 = numerosSorteados(numero);
		valor11 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor12 = numerosSorteados(numero);
		valor12 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor13 = numerosSorteados(numero);
		valor13 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor14 = numerosSorteados(numero);
		valor14 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor15 = numerosSorteados(numero);
		valor15 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);
		
		numerosSorteados =  "  " + valor1 + " -"
		  		+ valor2 + " -" + valor3 + " -" + valor4 + " -" + valor5 + " -" + valor6 + " -" + valor7 + " -" + valor8 + " -"
		  		+ valor9 + " -" + valor10 + " -" + valor11 + " -" + valor12 + " -" + valor13 + " -" + valor14 + " -" + valor15;
		
		if(tipo == 16) {
			Integer valor16 = numerosSorteados(numero);
			valor16 = listaDeNumeros.remove(numero);
			Collections.shuffle(listaDeNumeros);
			
			numerosSorteados += " -" + valor16;
		}
		
		if(tipo == 17) {
			Integer valor16 = numerosSorteados(numero);
			valor16 = listaDeNumeros.remove(numero);
			Collections.shuffle(listaDeNumeros);
			
			Integer valor17 = numerosSorteados(numero);
			valor17 = listaDeNumeros.remove(numero);
			Collections.shuffle(listaDeNumeros);
			
			numerosSorteados += " -" + valor16 + " -" + valor17;
		}
		
		if(tipo == 18) {
			Integer valor16 = numerosSorteados(numero);
			valor16 = listaDeNumeros.remove(numero);
			Collections.shuffle(listaDeNumeros);
			
			Integer valor17 = numerosSorteados(numero);
			valor17 = listaDeNumeros.remove(numero);
			Collections.shuffle(listaDeNumeros);
			
			Integer valor18 = numerosSorteados(numero);
			valor18 = listaDeNumeros.remove(numero);
			Collections.shuffle(listaDeNumeros);
			
			numerosSorteados += " -" + valor16 + " -" + valor17 + " -" + valor18;
		}
	}
	
	private Integer[] listaQuina() {
		Integer numerosMaisSorteadosQuina[] = {19,7,74,51,45,76,48,68,13,37,77,75,69,22,12,34,62,46,33,70,9,41,25,80,55,36,60,50,8,2,66,78,32,63,43,30,57,11,21,47,65,24,58,35,23,67,17,3,20,6,39,4,52,49,53,16,40,44,29,73};
		return numerosMaisSorteadosQuina;
	}
	
	private Integer[] listaMegaSena() {
		Integer numerosMaisSorteadosMegaSena[] = {5,4,53,54,51,42,33,17,24,52,49,43,13,10,29,41,36,28,50,32,44,23,16,47,30,12,2,8,31,27,7,59,34,6,37,56,38,58,46,18,40,20,60,3,11,35,57,14,19,45,25,48,15,55,21,39,9,26,22,9,7,3,1};
		return numerosMaisSorteadosMegaSena;
	}
	
	private Integer[] listaLotoFacil() {
		Integer numerosMaisSorteadosLotoFacil[] = {11, 2, 24, 13, 4, 21, 1, 23, 12, 19, 6, 22, 14, 10, 25, 3, 9, 20, 17, 15, 07, 5, 18, 16, 8, 3};
		return numerosMaisSorteadosLotoFacil;
	}
	
	private void iniciarLista() {
		listaDeNumeros = new ArrayList<Integer>();
	}
	
	private void iniciarCampoSorteado() {
		numerosSorteados = new String();
	}

	public List<Integer> getListaDeNumeros() {
		return listaDeNumeros;
	}

	public String getNumerosSorteados() {
		return numerosSorteados;
	}

	public String getMensagemBancaria() {
		return mensagemBancaria;
	}

}
