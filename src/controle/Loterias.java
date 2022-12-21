package controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author eduardo.andrade
 * @since 01/09/2014
 */
public class Loterias {

	private List<Integer> listaDeNumeros;

	private String numerosSorteados;

	private String mensagemBancaria = "Ajude o desenvolvedor do sistema" + "\n" +
			"PIX: CPF: 72446358187 ou emails: edu22snt@gmail.com ou Telefone: (61)98458-8881" + "\n" + "Eduardo Monteiro de Andrade";

	/**
	 * Metodo responsavel por popular a lista de numeros 
	 * mais sorteados da megasena.
	 */
	private void popularListaDeNumerosMaisSorteadosMegaSena() {
		iniciarLista();

		Integer numerosMaisSorteadosMegaSena[] = listaMegaSena();
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[0]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[1]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[2]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[3]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[4]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[5]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[6]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[7]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[8]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[9]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[10]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[11]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[12]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[13]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[14]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[15]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[16]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[17]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[18]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[19]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[20]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[21]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[22]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[23]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[24]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[25]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[26]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[27]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[28]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[29]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[30]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[31]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[32]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[33]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[34]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[35]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[36]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[37]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[38]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[39]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[40]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[41]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[42]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[43]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[44]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[45]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[46]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[47]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[48]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[49]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[50]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[51]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[52]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[53]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[54]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[55]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[56]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[57]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[58]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[59]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[60]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[61]);
		listaDeNumeros.add(numerosMaisSorteadosMegaSena[62]);
	}

	/**
	 * Metodo responsavel por popular a lista de numeros
	 * mais sorteados da lotofacil.
	 */
	private void popularListaDeNumerosMaisSorteadosLotofacil() {
		iniciarLista();

		Integer numerosMaisSorteadosLotoFacil[] = listaLotoFacil();
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[0]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[1]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[2]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[3]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[4]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[5]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[6]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[7]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[8]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[9]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[10]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[11]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[12]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[13]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[14]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[15]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[16]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[17]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[18]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[19]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[20]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[21]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[22]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[23]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[24]);
		listaDeNumeros.add(numerosMaisSorteadosLotoFacil[25]);
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

		/*
		 * for(int i = 0; i < 59; i++) {
		 * listaDeNumeros.add(numerosMaisSorteadosQuina[i]); }
		 */
		listaDeNumeros.add(numerosMaisSorteadosQuina[1]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[2]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[3]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[4]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[5]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[6]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[7]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[8]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[9]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[10]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[11]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[12]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[13]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[14]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[15]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[16]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[17]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[18]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[19]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[20]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[21]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[22]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[23]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[24]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[25]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[26]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[27]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[28]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[29]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[30]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[31]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[32]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[33]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[34]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[35]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[36]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[37]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[38]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[39]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[40]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[41]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[42]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[43]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[44]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[45]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[46]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[47]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[48]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[49]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[50]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[51]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[52]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[53]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[54]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[55]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[56]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[57]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[58]);
		listaDeNumeros.add(numerosMaisSorteadosQuina[59]);
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
