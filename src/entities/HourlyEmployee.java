package entities;
import java.util.Objects;

public class HourlyEmployee extends Employee
{
    private int hours;
    private float wage;

    public HourlyEmployee(String firstName, String lastName, int id, int hours, float wage) {
        super(firstName, lastName, id);
        if(hours<=0)
            throw new RuntimeException("Hours is not correct please enter positive number\n");
        if(wage<0)
            throw new RuntimeException("Wage is not correct please enter positive number\n");
        this.hours = hours;
        this.wage = wage;
    }

    public HourlyEmployee() {
        super();
        this.hours=0;
        this.wage=0;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours<=0)
            throw new RuntimeException("Please enter positive number\n");
        this.hours = hours;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        if(wage<0)
            throw new RuntimeException("Please enter positive number\n");
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hours=" + hours +
                ", wage=" + wage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HourlyEmployee that = (HourlyEmployee) o;
        return hours == that.hours && Float.compare(that.wage, wage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hours, wage);
    }

    @Override
    public float earnings(){return hours*wage;}
}
