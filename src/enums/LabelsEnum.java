package enums;

public enum LabelsEnum {
		
	TITULO("Loterias V.4"),
    NUMEROSSORTEADOS("Números Sorteados"),
    MEGASENA("Mega Sena"),
    LOTOFACIL15("Lotofácil 15"),
    LOTOFACIL16("Lotofácil 16"),
    LOTOFACIL17("Lotofácil 17"),
    LOTOFACIL18("Lotofácil 18"),
    QUINA("Quina"),
	BTNSORTEAR("Sortear"),
	BTNFECHAR("Fechar"),
	CABECALHO("Ajude o desenvolvedor do sistema"),
	DADOSPIX("PIX: CPF: 72446358187 ou emails: edu22snt@gmail.com ou Telefone: (61)98458-8881"),
	NOMEDESENVOLVEDOR("Eduardo Monteiro de Andrade");
    
    private final String descricao;
    
    private LabelsEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
