import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SocieteArrayList implements IGestion<Employe>{
    List<Employe> employees=new ArrayList<Employe>();

    @Override
    public void ajouterEmploye(Employe emp){
        employees.add(emp);
    }


    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe emp : employees) {
            if (emp.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employee) {
        return employees.contains(employee);
    }

    @Override
    public void supprimerEmploye(Employe employee) {
        employees.remove(employee);
    }

    @Override
    public void displayEmploye() {
        for (Employe emp : employees) {
            System.out.println(emp);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employees, Comparator.comparingInt(Employe::getId));
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employees.sort(Comparator.comparing(Employe::getNomDep)
                .thenComparing(Employe::getGrade));
    }
}
