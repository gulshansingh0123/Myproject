public class feb4 {
    public static void main(String[] args) {
        areaAndPerimenterOfRectangle(5,7);
        perimeterOfTraingle(2,3,5);
        addMultiplyModulo(2345);
        addMultiplyModuloWithOperator(2345);
        checkTwoNumberEqual(23,45);
        powerFinder(7,5);
//		7 and 8 merged
        conditionValueCheck();
        marksCalculator(78,45,62);
        swapTechnique(6,8);
        coverTempToCelcius(100);
        computeTotalGirlsGradeA(90,45);
        sumOfFirstAndSecondLastDigit(12345);
        addTwoOnEveryDigit(5696,2);
        sumOf3DigitNumber(132);
        reverseNumber(132);

//		permute("xyz");
    }



    private static void addTwoOnEveryDigit(int num,int toAdd) {
        int res=0;
        while(num>0) {
            int noOfDigit=getMeCountOfDigits(num);
            int val=getMeSingleDigit(num/(int)Math.pow(10, noOfDigit-1),toAdd);
            res=res*10+val;
            num%=(int)Math.pow(10, noOfDigit-1);
        }
        System.out.println("After Adding 2 to Every Digit: "+res);
    }



    private static int getMeCountOfDigits(int val) {
        int digit = 0;
        while (val > 0) {
            digit++;
            val /= 10;
        }
        return digit;
    }



    private static int getMeSingleDigit(int num,int toAdd) {
        int val=num+toAdd;
        int digit=getMeCountOfDigits(val);
        return (digit>1)?(val)%10:val;
    }



    private static void reverseNumber(int num) {
        int reverse=0;
        while(num>0) {
            reverse=reverse*10+(num%10);
            num/=10;
        }
        System.out.println("Reverse is: "+reverse);
    }



    private static void sumOf3DigitNumber(int num) {
        int res=0;
        while(num>0) {
            res+=(num%10);
            num/=10;
        }
        System.out.println("Sum is : "+res);
    }



    static void permute(String input)
    {
        int n = input.length();
        int max = 1 << n;
        input = input.toLowerCase();
        for(int i = 0;i < max; i++)
        {
            char combination[] = input.toCharArray();

            for(int j = 0; j < n; j++)
            {
                if(((i >> j) & 1) == 1)
                    combination[j] = (char) (combination[j]-32);
            }

            System.out.print(combination);
            System.out.print(",");
        }
    }



    private static void sumOfFirstAndSecondLastDigit(int num) {
        int first = num/10000;
        int fourth= (num%100)/10;
        System.out.println("Sum is: "+(first+fourth));
    }



    private static void computeTotalGirlsGradeA(int totalStudents,int noBoys) {
        int noGirls=totalStudents-noBoys;
        int gradeAStudent=(90*50)/100;
        System.out.println("Total number of girls getting grade 'A': "+(gradeAStudent-20));
    }



    private static void coverTempToCelcius(double d) {
        System.out.println("Farenheit to Celcius: "+(int)((d - 32) * 5/9)+" *C");

    }

    private static void swapTechnique(int a, int b) {
        swapUsingThirdVariable(a,b);
        swapWithoutUsingThirdVariable(a,b);
    }

    private static void swapWithoutUsingThirdVariable(int a, int b) {
        System.out.println("Before Swapping Value a:"+a+" and Value b:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping Value a:"+a+" and Value b:"+b);
    }

    private static void swapUsingThirdVariable(int a, int b) {
        System.out.println("Before Swapping Value a:"+a+" and Value b:"+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping Value a:"+a+" and Value b:"+b);
    }

    private static void marksCalculator(int i, int j, int k) {
        System.out.println("Total marks: "+(i+j+k)+" Percentage: "+(i+j+k)/3+"%");
    }

    private static void conditionValueCheck() {
        int a = 55;
        int b = 70;
        System.out.println(a < 50 && a < b);
        System.out.println(a < 50 || a < b);
    }

    private static void powerFinder(int base, int power) {
        System.out.println("Power is: "+(int)Math.pow(base,power));
    }

    private static void checkTwoNumberEqual(int a, int b) {
        System.out.println((a==b)?"Both are Equal":"Not Equal");
    }

    private static void addMultiplyModuloWithOperator(int num) {
        num+=8;
        num/=3;
        num%=5;
        num*=5;
        System.out.println("Result is :"+num);
    }

    private static void addMultiplyModulo(int num) {
        System.out.println("Result is :"+(((8+num)/3)%5)*5);
    }

    private static void perimeterOfTraingle(int i, int j, int k) {
        System.out.println("Perimeter :"+(i+j+k));

    }

    private static void areaAndPerimenterOfRectangle(int a, int b) {
        System.out.println("Area is " + (a * b) + "\nPerimeter is " + (2 * (a + b)));
    }
}

