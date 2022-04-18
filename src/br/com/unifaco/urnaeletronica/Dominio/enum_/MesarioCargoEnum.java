package Dominio.enum_;

public enum MesarioCargoEnum {
	mesario("Mesario"),
	coordenadorMesa("Coordenador de Mesa"),
	coordenadorSecao("Coordenador de Secao"),
	coordenadorZona("Coordenador de Zona"),
	fiscalMesa("Fiscal de Mesa"),
	fiscalSecao("Fiscal de Secao"),
	fiscalZona("Fiscal de Zona");
	
	private String descricao;

	MesarioCargoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

	public static MesarioCargoEnum getEnum(String value) {
		if (value == null)
			throw new IllegalArgumentException();
		for (MesarioCargoEnum v : values())
			if (value.equalsIgnoreCase(v.getDescricao()))
				return v;
		throw new IllegalArgumentException();
	}
}

 
