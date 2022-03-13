package Dominio.enum_;

public enum PartidoEnum {
	enviandoDocumentos("Enviando de Documentos"),analisaDocumentos("Documentos em Análise"),
	documentosRejeitados("Documentos Rejeitados"),documentosAprovados("Documentos Aprovados"),
	registroImpugnado("Registro Impugnado"),registroAprovado("Registro Aprovado");
	private String descricao;

	PartidoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

	public static PartidoEnum getEnum(String value) {
		if (value == null)
			throw new IllegalArgumentException();
		for (PartidoEnum v : values())
			if (value.equalsIgnoreCase(v.getDescricao()))
				return v;
		throw new IllegalArgumentException();
	}

}
