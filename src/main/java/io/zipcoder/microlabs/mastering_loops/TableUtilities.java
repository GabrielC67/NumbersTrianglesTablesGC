package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getMultiplicationTable(int tableSize) {
        StringBuilder stringBuilder = new StringBuilder();
        String separator = " |";

        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                stringBuilder.append(String.format("%3d", (i * j)));
                if (j <= tableSize) {
                    stringBuilder.append(separator);
                }
            }
            stringBuilder.append("\n");
        }
        String table = stringBuilder.toString();
        return table;
    }

    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {


        return getMultiplicationTable(10);
    }
}
