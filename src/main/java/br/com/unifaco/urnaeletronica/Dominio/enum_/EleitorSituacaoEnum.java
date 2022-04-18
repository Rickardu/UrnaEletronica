package br.com.unifaco.urnaeletronica.Dominio.enum_;

public enum EleitorSituacaoEnum {
	ativo("ATIVO"),inativo("INATIVO"),suspendo("SUSPENSO");
	private String descricao;

	EleitorSituacaoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

	public static EleitorSituacaoEnum getEnum(String value) {
		if (value == null)
			throw new IllegalArgumentException();
		for (EleitorSituacaoEnum v : values())
			if (value.equalsIgnoreCase(v.getDescricao()))
				return v;
		throw new IllegalArgumentException();
	}
}
