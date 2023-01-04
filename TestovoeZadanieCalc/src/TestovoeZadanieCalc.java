import java.util.Scanner;

public class TestovoeZadanieCalc {

    public static void main(String[] args) {

        String[] arab = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] rim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] znaki = {"+", "-", "*", "/"};
        String[] regexZnaki = {"\\+", "-", "\\*", "/"};
        String[] preobrazovanie = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String virazhenie = in.nextLine();
        in.close();

        int actZnak = -1;
        for (int i = 0; i < znaki.length; i++) {
            if (virazhenie.contains(znaki[i])) {
                actZnak = i;
                break;
            }
        }
        if (actZnak==-1)
        {
            System.out.println("Неверно введены данные");
            return;
        }


        String[] perem = virazhenie.split(regexZnaki[actZnak]);
        String perv = perem[0];
        String vtor = perem[1];
        String perv1 = perv.trim();
        String vtor1 = vtor.trim();
        if ((perv1.equals("I") ^ perv1.equals("II") ^ perv1.equals("III") ^ perv1.equals("IV") ^
                perv1.equals("V") ^ perv1.equals("VI") ^ perv1.equals("VII") ^ perv1.equals("VIII") ^
                perv1.equals("IX") ^ perv1.equals("X")) & (vtor1.equals("I") ^ vtor1.equals("II") ^
                vtor1.equals("III") ^ vtor1.equals("VI") ^ vtor1.equals("V") ^ vtor1.equals("VI") ^ vtor1.equals("VII")
                ^ vtor1.equals("VIII") ^ vtor1.equals("IX") ^ vtor1.equals("X"))) {

            int x;
            x = 0;
            for (int m = 0; m < 1; m++) {
                if (perv1.equals("I")) {
                    m = 1;

                } else if (perv1.equals("II")) {
                    m = 2;

                } else if (perv1.equals("III")) {
                    m = 3;

                } else if (perv1.equals("IV")) {
                    m = 4;

                } else if (perv1.equals("V")) {
                    m = 5;

                } else if (perv1.equals("VI")) {
                    m = 6;

                } else if (perv1.equals("VII")) {
                    m = 7;

                } else if (perv1.equals("VIII")) {
                    m = 8;

                } else if (perv1.equals("IX")) {
                    m = 9;

                } else if (perv1.equals("X")) {
                    m = 10;

                }

                x = m;
                break;
            }


            int v;
            v = 0;
            for (int z = 0; z < 1; z++) {
                if (vtor1.equals("I")) {
                    z = 1;
                } else if (vtor1.equals("II")) {
                    z = 2;
                } else if (vtor1.equals("III")) {
                    z = 3;
                } else if (vtor1.equals("IV")) {
                    z = 4;
                } else if (vtor1.equals("V")) {
                    z = 5;
                } else if (vtor1.equals("VI")) {
                    z = 6;
                } else if (vtor1.equals("VII")) {
                    z = 7;
                } else if (vtor1.equals("VIII")) {
                    z = 8;
                } else if (vtor1.equals("IX")) {
                    z = 9;
                } else if (vtor1.equals("X")) {
                    z = 10;
                }
                v = z;

                break;
            }
            int resultArab;
            String result1;
            switch (znaki[actZnak]) {
                case "+":
                    resultArab = x + v;
                    for (int l=resultArab; l < preobrazovanie.length;l++)
                    {
                        result1 = preobrazovanie[l];
                        System.out.println("Результат: "+ result1);
                        return;
                    }
                case "-":
                    if (x<v){
                        System.out.println("Невозможно произвести операцию");
                        return;
                    }
                    else
                    {
                        resultArab = x - v;
                        for (int l=resultArab; l < preobrazovanie.length;l++)
                        {
                            result1 = preobrazovanie[l];
                            System.out.println("Результат: "+ result1);
                            return;
                        }
                    }
                case "*":
                    resultArab = x * v;
                    for (int l=resultArab; l < preobrazovanie.length;l++)
                    {
                        result1 = preobrazovanie[l];
                        System.out.println("Результат: " + result1);
                        return;
                    }
                case "/":
                    if (x<v)
                    {
                        System.out.println("Невозможно произвести операцию");
                        return;
                    }
                    else {
                        resultArab = x / v;
                        for (int l=resultArab; l < preobrazovanie.length;l++)
                        {
                            result1 = preobrazovanie[l];
                            System.out.println("Результат: "+ result1);
                            return;
                        }

                    }

            }
        }
        else
        {
            int a = 0;

            try {
                a = Integer.parseInt(perv1);
            }
            catch (NumberFormatException ex){
                System.out.println("Неверно введены данные");
                return;
            }
            for (int y = 0; y < arab.length; y++) {
                if (perv1.contains(arab[y])) {
                    a = y;
                    break;
                }

            }

            int b = 0;
            try {
                b = Integer.parseInt(vtor1);
            }
            catch (NumberFormatException ex){
                System.out.println("Неверно введены данные");
                return;
            }
            for (int g = 0; g < arab.length; g++) {
                if (vtor1.contains(arab[g])) {
                    b = g;
                    break;
                }

            }


            switch (arab[a]) {

                case "0":
                    a = 10;
                    break;
                case "1":
                    a = 1;
                    break;
                case "2":
                    a = 2;
                    break;
                case "3":
                    a = 3;
                    break;
                case "4":
                    a = 4;
                    break;
                case "5":
                    a = 5;
                    break;
                case "6":
                    a = 6;
                    break;
                case "7":
                    a = 7;
                    break;
                case "8":
                    a = 8;
                    break;
                case "9":
                    a = 9;
                    break;
                case "10":
                    a = 10;
                    break;


            }

            switch (arab[b]) {
                case "0":
                    b = 10;
                    break;
                case "1":
                    b = 1;
                    break;
                case "2":
                    b = 2;
                    break;
                case "3":
                    b = 3;
                    break;
                case "4":
                    b = 4;
                    break;
                case "5":
                    b = 5;
                    break;
                case "6":
                    b = 6;
                    break;
                case "7":
                    b = 7;
                    break;
                case "8":
                    b = 8;
                    break;
                case "9":
                    b = 9;
                    break;
                case "10":
                    b = 10;
                    break;

            }


            int result;
            switch (znaki[actZnak]) {
                case "+":
                    result = a + b;
                    System.out.println("Результат: "+ result);
                    break;
                case "-":
                    result = a - b;
                    System.out.println("Результат: "+ result);
                    break;
                case "*":
                    result = a * b;
                    System.out.println("Результат: "+ result);
                    break;
                case "/":
                    if (a<b){
                        System.out.println("Невозможно выполнить операцию");
                        break;
                    }
                    else {
                        result = a / b;
                        System.out.println("Результат: " + result);
                        break;
                    }

            }

        }

    }
}