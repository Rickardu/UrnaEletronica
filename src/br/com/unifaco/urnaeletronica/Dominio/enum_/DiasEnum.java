package Dominio.enum_;

public enum DiasEnum {
	Segunda("Segunda-feira"),Terca("Terça-feira"),;
	private String descricao;

	DiasEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

	public static DiasEnum getEnum(String value) {
		if (value == null)
			throw new IllegalArgumentException();
		for (DiasEnum v : values())
			if (value.equalsIgnoreCase(v.getDescricao()))
				return v;
		throw new IllegalArgumentException();
	}

}
