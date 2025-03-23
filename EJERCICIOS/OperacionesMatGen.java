public class OperacionesMatGen<N extends Number> implements Operable<N> {

    @Override
    public N suma(N operando1, N operando2) {
        return convertirTipo((operando1.doubleValue() + operando2.doubleValue()), operando1);
    }

    @Override
    public N resta(N operando1, N operando2) {
        return convertirTipo((operando1.doubleValue() - operando2.doubleValue()), operando1);
    }

    @Override
    public N producto(N operando1, N operando2) {
        return convertirTipo((operando1.doubleValue() * operando2.doubleValue()), operando1);
    }

    @Override
    public N division(N operando1, N operando2) {
        if (operando2.doubleValue() == 0) {
            System.out.println("ERROR - Division por cero no permitida");
            return null;
        }
        return convertirTipo((operando1.doubleValue() / operando2.doubleValue()), operando1);
    }

    @Override
    public N potencia(N base, N exponente) {
        return convertirTipo(Math.pow(base.doubleValue(), exponente.doubleValue()), base);
    }

    @Override
    public N raizCuadrada(N operando) {
        return convertirTipo(Math.sqrt(operando.doubleValue()), operando);
    }

    @Override
    public N raizCubica(N operando) {
        return convertirTipo(Math.cbrt(operando.doubleValue()), operando);
    }

    // Método auxiliar para convertir el resultado al tipo adecuado
    private N convertirTipo(Double resultado, N ejemplo) {
        if (ejemplo instanceof Integer) {
            return (N) Integer.valueOf(resultado.intValue());
        } else if (ejemplo instanceof Double) {
            return (N) Double.valueOf(resultado);
        } else {
            throw new UnsupportedOperationException("Tipo no soportado");
        }
    }
}

