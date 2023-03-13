public class DiagonalStar {
    public static void printSquareStar ( int number) {
        if(number < 5){
            System.out.println("Invalid Value");
        }

        for (int rowCount = 1; rowCount <= number; rowCount++){
            for(int columnCount = 1; columnCount <= number; columnCount++){
                if ((rowCount == columnCount)
                        || (rowCount + columnCount == number + 1)
                        || (rowCount == 1)
                        || (rowCount == number)
                        ||(columnCount == 1)
                        || (columnCount == number )) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");

        }
    }
}
