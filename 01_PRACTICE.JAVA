એક number input લો:

divisible by 2 અને 3 → "TwoThree"

divisible by ફક્ત 2 → "Two"

divisible by ફક્ત 3 → "Three"

નહિંતર → "None"

📌 Hint: && પહેલા check કરવું જરૂરી છે.

int number =1400000000;

if(number % 2== 0 && number % 3 ==0 )
{
  system.out.println("TwoThree")
}
else if(number % 2== 0)
{
  system.out.println("Two")
}
else if(number % 3 ==0 )
{
  system.out.println("three");
}
else
{
     system.out.println("none");
}    

એક number input લો:

// divisible by 4 પણ 6 થી નહિ → "Only Four"

divisible by 6 → "Six"

નહિંતર → "No Match"

📌 Trick: && + != 0

int num1 = 28


if(number % 4==0 && number % 6!=0)
{
    system.out.println("only four");
}
else if(num2 % 6==0)
{
    system.out.println("six"); 
}
else
{
    system.out.println("no match");
}

એક number input લો:

divisible by 3, 5 અને 7 → "ThreeFiveSeven"

divisible by 3 અને 5 → "ThreeFive"

divisible by 7 → "Seven"

નહિંતર → "None"

📌 Hint: સૌથી મોટી condition પહેલા

int num = 125;


if(num % 3 == 0 && num % 5 == 0 && num % 7 == 0)
{
   system.out.println("ThreeFiveSeven");
}
else if(num % 3 == 0 && num % 5 == 0)
{
    system.out.println("ThreeFive"); 
}    
else if(num % 7 == 0)
{
     system.out.println("Seven");
}
else
{
     system.out.println("none");
}

//
એક number input લો:

divisible by 8 અથવા 12 → "EightOrTwelve"

divisible by 4 અને even → "FourEven"

divisible by odd number 5 → "Five"

નહિંતર → "No Match"

📌 Hint: || અને && mix

 int number = 200

 if(number % 8 ==0 || number % 12 ==0 )
 {
    System.out.println("EightOrTwelve");
 }
else if(number % 4 == 0 && number % 4 == 0)
{ 
    System.out.println("FourEven"); 
}
else if(number % 5 == 0)
{
    System.out.println("Five"); 
}
else
{
    System.out.println("No Match"); 
}