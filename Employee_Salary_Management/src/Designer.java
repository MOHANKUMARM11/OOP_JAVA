public class Designer extends Employee{

    private String stack;
    private double designBonus;

    public Designer(int id, String name, double salary,String stack, double designbonus){
        super(id,name,salary);
        this.stack=stack;
        this.designBonus=designbonus;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public double getdesignBonus() {
        return designBonus;
    }

    public void setCodingBonus(double designbonus) {
        this.designBonus = designbonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary()+getdesignBonus();
    }

    @Override
    public String toString() {
        return "Designer{" + super.toString() + "Stack=" + this.stack + "DesignBonus=" + this.designBonus + "}";
    }
}
