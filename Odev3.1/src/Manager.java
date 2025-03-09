class Manager extends Employee {
    private final int teamSize;

    public Manager(int id, String name, double salary, String department, int teamSize) {
        super(id, name, salary, department);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2;
    }

    @Override
    public String toString() {
        return super.toString() + ", Team Size: " + teamSize;
    }
}