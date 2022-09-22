import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class calcularDias {
    public long calcularDiasTotales(int ano, int mes, int dia){
        LocalDate dob = LocalDate.of(ano, mes, dia);
        LocalDate curDate = LocalDate.now();
        return ChronoUnit.DAYS.between(dob, curDate);
    }
}
