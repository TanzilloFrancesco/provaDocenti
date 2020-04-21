class professore extends persona{
    private String materia;
    private String scuola;
    private String ruolo;
    
    professore(){
        this.materia = "non lo so";
        this.scuola = "non lo so";
        this.ruolo = "non lo so";
    }
    
    professore(String cognome, String nome, String materia, String scuola, String ruolo){
        super(cognome, nome);
        this.materia = materia;
        this.scuola = scuola;
        this.ruolo = ruolo;
    }
    
    void stampa(){
        super.stampa();
        System.out.println("materia : " + this.materia + "\t");
        System.out.println("scuola : " + this.scuola + "\t");
        System.out.println("ruolo : " + this.scuola);
    }
}