public class provaDocenti
{
	public static void main(String[] args) {
	    int contPers = 0;
	    int contProf = 0;
	    
    persona pers1 = new persona("Sordi", "Carlo");
    contPers++;
    System.out.printf("\nPersona[%d]", contPers);
    pers1.stampa();
    
    professore prof1 = new professore("Muti", "Alberto" , "Religione", "Carlo Alberto Dalla Chiesa", "Teoria");
    contProf++;
    System.out.printf("\nProfessore[%d]", contProf);
    prof1.stampa();
    
    professore prof2 = new professore("Orizzonte", "Pasquale" , "Informatica", "Carlo Alberto Dalla Chiesa", "Pratica");
    contProf++;
    System.out.printf("\nProfessore[%d]", contProf);
    prof2.stampa();
    
    professore prof3 = new professore("Tessitore", "Fabio" , "Informatica", "Carlo Alberto Dalla Chiesa", "Teoria");
    contProf++;
    System.out.printf("\nProfessore[%d]", contProf);
    prof3.stampa();
    
	}
}