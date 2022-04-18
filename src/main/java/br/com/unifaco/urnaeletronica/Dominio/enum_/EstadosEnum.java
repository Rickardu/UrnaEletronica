package br.com.unifaco.urnaeletronica.Dominio.enum_;

public enum EstadosEnum {
	AC("Acre"),
	AL("Alagoas"),
	AP("Amap�"),
	AM("Amazonas"),
	BA("Bahia"),
	CE("Cear�"),
	DF("Distrito Federal"),
	ES("Esp�rito Santo"),
	GO("Goi�s"),
	MA("Maranh�o"),
	MT("Mato Grosso"),
	MS("Mato Grosso do Sul"),
	MG("Minas Gerais"),
	PA("Par�"),
	PB("Para�ba"),
	PR("Paran�"),
	PE("Pernambuco"),
	PI("Piau�"),
	RJ("Rio de Janeiro"),
	RN("Rio Grande do Norte"),
	RS("Rio Grande do Sul"),
	RO("Rond�nia"),
	RR("Roraima"),
	SC("Santa Catarina"),
	SP("S�o Paulo"),
	SE("Sergipe"),
	TO("Tocantins"),;
	private String descricao;

	EstadosEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

	public static EstadosEnum getEnum(String value) {
		if (value == null)
			throw new IllegalArgumentException();
		for (EstadosEnum v : values())
			if (value.equalsIgnoreCase(v.getDescricao()))
				return v;
		throw new IllegalArgumentException();
	}

}
