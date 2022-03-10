package creator;

public class ArrayCreator {
    public double[] factoryArray(String[] values) {
        double[] result = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = Double.parseDouble(values[i]);
        }
        return result;
    }

}
