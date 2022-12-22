package enums;

public enum LabelsEnum {
		
    TITULO("Loterias V.4"),
    NUMEROSSORTEADOS("Números Sorteados"),
    QUANTIDADENUMEROS("Quantos números?"),
    MEGASENA("Mega Sena"),
    LOTOFACIL("Lotofácil"),
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
