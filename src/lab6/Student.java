package lab6;

public class Student {
    String nume;
    Double notaLaborator, notaPartial, notaExamen;

    public String getNume() {
        return nume;
    }

    public Double getNotaLaborator() {
        return notaLaborator;
    }

    public Double getNotaPartial() {
        return notaPartial;
    }

    public Double getNotaExamen() {
        return notaExamen;
    }

    public Student(String nume, Double notaLaborator, Double notaPartial, Double notaExamen) {
        this.nume = nume;
        this.notaLaborator = notaLaborator;
        this.notaPartial = notaPartial;
        this.notaExamen = notaExamen;
    }
}
