class persona{
    private String cognome;
    private String nome;
    
    persona(){
        this.nome = "non lo so";
        this.cognome = "non lo so";
    }

    persona(String cognome, String nome){
        this.cognome = cognome;
        this.nome = nome;
    }
    
    void impostaNome(String nome){
        this.nome = nome;
    }
    
    void impostaCognome(String cognome){
        this.cognome = cognome;
    }
    
    String ottieniNome(){
        return this.nome;
    }
    
    String ottieniCognome(){
        return this.cognome;
    }
    
    void stampa(){
        System.out.println("\nnome : " + this.nome);
        System.out.println("cognome : " + this.cognome);
    }
}