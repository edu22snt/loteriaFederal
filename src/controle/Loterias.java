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

	public void sortearNumerosMegaSena(int quantidade) {
		iniciarCampoSorteado();
		popularListaDeNumerosMaisSorteadosMegaSena();
		Random random = new Random();
		int numero = random.nextInt(listaDeNumeros.size());
		int[] valor = new int[30];

		for(int i = 0; i < quantidade; i++) {
			valor[i] = numerosSorteados(numero);
			valor[i] = listaDeNumeros.remove(numero);
			Collections.shuffle(listaDeNumeros);
			numerosSorteados += " " + valor[i] + " -";
		}
		tratarNumeroSorteado();
	}

	public void sortearNumerosQuina(int quantidade) {
		iniciarCampoSorteado();
		popularListaDeNumerosMaisSorteadosQuina();
		Random random = new Random();
		int numero = random.nextInt(listaDeNumeros.size());
		int[] valor = new int[10];
		
		for(int i = 0; i < quantidade; i++) {
			valor[i] = numerosSorteados(numero);
			valor[i] = listaDeNumeros.remove(numero);
			Collections.shuffle(listaDeNumeros);
			numerosSorteados += " " + valor[i] + " -";
		}
		tratarNumeroSorteado();
	}

	public void sortearNumerosLotofacil(int quantidade) {
		iniciarCampoSorteado();
		popularListaDeNumerosMaisSorteadosLotofacil();
		Random random = new Random();
		int numero = random.nextInt(listaDeNumeros.size());
		int[] valor = new int[100];
		
		for(int i = 0; i < quantidade; i++) {
			valor[i] = numerosSorteados(numero);
			valor[i] = listaDeNumeros.remove(numero);
			Collections.shuffle(listaDeNumeros);
			numerosSorteados += " " + valor[i] + " -";
		}
		tratarNumeroSorteado();
	}
	
	private void tratarNumeroSorteado() {
		String numeros = numerosSorteados.substring(0, numerosSorteados.length() -1);
		numerosSorteados = numeros;
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
