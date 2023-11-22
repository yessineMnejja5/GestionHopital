public class Test {
    public static void main(String[] args) {
        // Création de patients
        Patient patient1 = new Patient(1115576, "ahmed", "ahmed", 45878);
        Patient patient2 = new Patient(1111233, "yessine", "yessine", 98752);

        // Création de médecins
        Medecin medecin1 = new Medecin(11154785, "mahmoud", "mahmoud", 8888);
        Medecin medecin2 = new Medecin(11178555, "ali", "ali", 7777);

        // Création d'un hôpital
        Hopital hopital = new Hopital();

        // Ajout de médecins à l'hôpital
        hopital.ajouterMedecin(medecin1);
        hopital.ajouterMedecin(medecin2);

        // Ajout de patients aux médecins
        hopital.ajouterPatient(medecin1, patient1);
        hopital.ajouterPatient(medecin2, patient2);

        // Affichage de la carte médecin-patients
        System.out.println("Liste des médecins et de leurs patients:");
        hopital.afficherMap();

        // Affichage des patients d'un médecin spécifique
        System.out.println("Patients du médecin Johnson:");
        hopital.afficherMedecinPatients(medecin1);

        // Création d'une liste de patients
        ListPatients listePatients = new ListPatients();
        listePatients.ajouterPatient(patient1);
        listePatients.ajouterPatient(patient2);

        // Affichage de la liste de patients
        System.out.println("Liste de patients:");
        listePatients.afficherPatients();
    }
}