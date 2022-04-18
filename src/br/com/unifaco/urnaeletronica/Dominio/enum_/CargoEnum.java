package Dominio.enum_;

public enum CargoEnum {
	Vereador("Vereador"),VereadorSuplente("Vereador Suplente"),
	PrefeitoVice("Vice-Prefeito"),Prefeito("Prefeito"),
	Governador("Governador"),GovernadorVice("Vice-Governador"),
	DeputadoEstadual("Deputado Estadual"),DeputadoEstadualSuplente("Deputado Estadual Suplente"),
	DeputadoFederal("Deputado Federal"),DeputadoFederalSuplente("Deputado Federal Suplente"),
	Senador("Senador"),SenadorSuplente("Senador Suplente"),
	Presidente("Presidente"),PresidenteVice("Presidente");
	private String descricao;

	CargoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

	public static CargoEnum getEnum(String value) {
		if (value == null)
			throw new IllegalArgumentException();
		for (CargoEnum v : values())
			if (value.equalsIgnoreCase(v.getDescricao()))
				return v;
		throw new IllegalArgumentException();
	}

}
