package by.itland.itjava.timshina.lesson14_2;

public abstract class Var implements Operation {
    @Override
    public Var add(Var other) throws CalcException{
        throw new CalcException("Error: сложение " + this.getClass().getSimpleName() + " невозможно с " +
                other.getClass().getSimpleName());
    }

    @Override
    public Var sub(Var other) throws CalcException {
        throw new CalcException("Error: вычитание " + getClass().getSimpleName() + " невозможно с " +
                other.getClass().getSimpleName());

    }

    @Override
    public Var mul(Var other) throws CalcException {
        throw new CalcException("Error: умножение " + getClass().getSimpleName() + " невозможно с " +
                other.getClass().getSimpleName());

    }

    @Override
    public Var div(Var other) throws CalcException {
        throw new CalcException("Error деление " + getClass().getSimpleName() + " невозможно с " +
                other.getClass().getSimpleName());

    }

    public static Var createVar(String operand) throws CalcException {
        if (operand.matches(Patterns.SCALAR))
            return new Scalar(operand);
        else if (operand.matches(Patterns.VECTOR)) {
            return new Vector(operand);
        } else if (operand.matches(Patterns.MATRIX)) {
            return new Matrix(operand);
        }
        throw new CalcException();
    }


    @Override
    public String toString() {
        return "i'm var";
    }
}
