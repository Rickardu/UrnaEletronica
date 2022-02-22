package Dominio.enum_;

 

public enum VotoEnum {
	Nulo("Nulo"),Branco("Branco"),VALIDO("VALIDO"),;
	private String descricao;

	VotoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

	public static VotoEnum getEnum(String value) {
		if (value == null)
			throw new IllegalArgumentException();
		for (VotoEnum v : values())
			if (value.equalsIgnoreCase(v.getDescricao()))
				return v;
		throw new IllegalArgumentException();
	}

}
