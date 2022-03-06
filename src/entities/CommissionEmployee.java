package entities;
import java.util.Objects;

public class CommissionEmployee extends Employee
{
    private float grossSales;
    private int commision;

    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commision) {
        super(firstName, lastName, id);
        this.grossSales = grossSales;
        this.commision = commision;
    }

    public CommissionEmployee() {
        super();
        this.grossSales=0;
        this.commision=0;
    }

    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {
        if(grossSales<0)
            throw new RuntimeException("Please enter positive number\n");
        this.grossSales = grossSales;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        if(commision<0)
            throw new RuntimeException("Please enter positive number\n");
        this.commision = commision;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "grossSales=" + grossSales +
                ", commision=" + commision +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CommissionEmployee that = (CommissionEmployee) o;
        return Float.compare(that.grossSales, grossSales) == 0 && commision == that.commision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grossSales, commision);
    }

    @Override
    public float earnings(){return (commision/100)*grossSales;}
}
