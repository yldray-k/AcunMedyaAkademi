class Developer extends Employee {
    private final String about;

    public Developer(int id, String name, double salary, String department, String about) {
        super(id, name, salary, department);
        this.about = about;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.1;
    }

    @Override
    public String toString() {
        return super.toString() + ", About: " + about;
    }
}