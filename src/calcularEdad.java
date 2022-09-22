import java.time.LocalDate;
import java.time.Period;

public class calcularEdad {
    public String decirEdad(int ano, int mes, int dia){
        LocalDate dob = LocalDate.of(ano, mes, dia);
        LocalDate curDate = LocalDate.now();

        Period periodo = Period.between(dob, curDate);
        return ("Que equivale a " + periodo.getYears() + " años, "+ periodo.getMonths() + " meses y " + periodo.getDays() + " dias.");
    }
}
