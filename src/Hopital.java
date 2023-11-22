import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Hopital {
    public Map<Medecin, ListPatients> medecinPatients;

    public Hopital() {
        medecinPatients = new TreeMap<>(Comparator.comparingInt(Medecin::getNumOrdre));
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatients.put(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatients.containsKey(m)) {
            ListPatients patients = medecinPatients.get(m);
            patients.ajouterPatient(p);
        } else {
            System.out.println("Le médecin n'est pas enregistré dans l'hôpital.");
        }
    }

    public void afficherMap() {
        medecinPatients.forEach((medecin, patients) -> {
            System.out.println("Médecin: " + medecin);
            System.out.println("Patients: ");
            patients.afficherPatients();
            System.out.println("--------------");
        });
    }

    public void afficherMedecinPatients(Medecin m) {
        if (medecinPatients.containsKey(m)) {
            ListPatients patients = medecinPatients.get(m);
            patients.afficherPatients();
        } else {
            System.out.println("Le médecin n'est pas enregistré dans l'hôpital.");
        }
    }
}
