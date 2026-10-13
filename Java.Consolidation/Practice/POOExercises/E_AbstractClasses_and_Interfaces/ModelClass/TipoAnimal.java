package POOExercises.E_AbstractClasses_and_Interfaces.ModelClass;

public enum TipoAnimal {
    MAMIFERO("Mamifero", 1000),
    AMFIBIO("Anfíbio",  250),
    AVE("Ave", 120),
    REPTIL("Reptil", 890),
    PEIXE("Peixe", 500);

    private final String tipoAnimal;
    private final int pontosDeVida;

    TipoAnimal(String tipoAnimal, int pontosDeVida) {
        this.tipoAnimal = tipoAnimal;
        this.pontosDeVida = pontosDeVida;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }


}
