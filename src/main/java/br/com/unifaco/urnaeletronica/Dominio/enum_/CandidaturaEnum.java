package br.com.unifaco.urnaeletronica.Dominio.enum_;

public enum CandidaturaEnum {
	andamento("Em andamenmto"),ativa("Ativa"),
	inativa("Inativa"),suspensa("Suspensa") ;
	private String descricao;

	CandidaturaEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

	public static CandidaturaEnum getEnum(String value) {
		if (value == null)
			throw new IllegalArgumentException();
		for (CandidaturaEnum v : values())
			if (value.equalsIgnoreCase(v.getDescricao()))
				return v;
		throw new IllegalArgumentException();
	}

}
