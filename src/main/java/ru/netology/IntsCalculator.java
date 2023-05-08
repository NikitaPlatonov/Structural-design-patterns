package ru.netology;

public class IntsCalculator implements Ints {
    private final Calculator target;

    public IntsCalculator(Calculator target) {
        this.target = target;
    }
    @Override
    public int sum(int arg0, int arg1) {
        return (int) target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.SUM).result();
    }
    @Override
    public int mult(int arg0, int arg1) {
        return (int) target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.MULT).result();
    }
    @Override
    public int pow(int arg0, int arg1) {
        return (int) target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.POW).result();
    }
}
