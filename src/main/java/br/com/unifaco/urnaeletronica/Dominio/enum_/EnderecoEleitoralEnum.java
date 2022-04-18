package br.com.unifaco.urnaeletronica.Dominio.enum_;

public enum EnderecoEleitoralEnum {
	ativo("ATIVO"),inativo("INATIVO"),suspendo("SUSPENSO");
	private String descricao;

	EnderecoEleitoralEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

	public static EnderecoEleitoralEnum getEnum(String value) {
		if (value == null)
			throw new IllegalArgumentException();
		for (EnderecoEleitoralEnum v : values())
			if (value.equalsIgnoreCase(v.getDescricao()))
				return v;
		throw new IllegalArgumentException();
	}
}
