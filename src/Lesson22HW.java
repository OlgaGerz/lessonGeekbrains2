public class Lesson22HW {

    private static Object nfe;



    public void Massiv(String[][] array) throws MyArraySizeException {

        if (array.length != 4) {
            throw new MyArraySizeException();
        }

        int changeArray = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    changeArray = Integer.parseInt(array[i][j]);

                } catch (NumberFormatException nfe) {
                }
            }
        }

    }



    private static class MyArraySizeException extends Exception {
    }


    public static void main(String args[]) {
        String table [][] = new String[4][4];
        System.out.println(table);

    }
}