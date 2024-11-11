import java.util.Objects;

public class Employe {
    protected int id,grade;
    protected String nom,prenom,nomDep;

    public Employe(int id, int grade, String nom, String prenom, String nomDep) {
        this.id = id;
        this.grade = grade;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDep = nomDep;
    }
    public Employe(){}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public int getGrade() {return grade;}
    public void setGrade(int grade) {this.grade = grade;}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public String getPrenom() {return prenom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}
    public String getNomDep() {return nomDep;}
    public void setNomDep(String nomDep) {this.nomDep = nomDep;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && Objects.equals(nom, employe.nom);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", grade=" + grade +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDep='" + nomDep + '\'' +
                '}';
    }
}
