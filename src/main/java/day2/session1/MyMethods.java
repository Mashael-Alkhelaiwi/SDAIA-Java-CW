package day2.session1;

public class MyMethods {

    public static double calmark(double mark, double fullmark)
    {
        return (mark / fullmark) * 100;
    }


    public static String fullmarkExceprtion(double x) {
        if (x > 85)
            return "Excellent";

        else if (x > 75)
        {
            return "Very Good";

        } else if (x > 65) {

            return "Good";
        } else if (x >= 50) {
            return "pass";
        } else {
            return "Fail";
        }
    }

    public static String[] fullmarkExceprtionAsArray(double[] grad) {
        var gradeExceprition = new String[grad.length];

        for (int i = 0; i < grad.length; i++) {
            var x = grad[i];

            if (x > 85)
                gradeExceprition[i] = "Excelent";
            else if (x > 75) {
                gradeExceprition[i] = "Very Good";
            } else if (x > 65) {
                gradeExceprition[i] = "Good";
            } else if (x >= 50) {
                gradeExceprition[i] = "pass";
            } else {
                gradeExceprition[i] = "Fail";
            }
        }
        return gradeExceprition;
    }

    public static String[] fullmarkExceprtionAsArray2(double... grad) {
        var gradeExceprition = new String[grad.length];

        for (int i = 0; i < grad.length; i++) {
            var x = grad[i];

            if (x > 85)
                gradeExceprition[i] = "Excelent";
            else if (x > 75) {
                gradeExceprition[i] = "Very Good";
            } else if (x > 65) {
                gradeExceprition[i] = "Good";
            } else if (x >= 50) {
                gradeExceprition[i] = "pass";
            } else {
                gradeExceprition[i] = "Fail";
            }
        }
        return gradeExceprition;
    }
}