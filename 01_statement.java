// User ની age input લો.
// જો age 18 કે વધારે હોય તો "Eligible for vote" print કરો.     
     
int age = 20;

if(age >= 18){
    system.out.println("Eligible for vote")
    };

// એક number લો.
// જો number positive હોય તો "Positive Number" print કરો.

int num = 30;

if(num > 0)
{
    system.out.println("positive number");
};

(30>0) -> positive number
(-30>0) -> negative number

// એક integer લો.
// જો number even હોય તો "Even Number" print કરો.

int count = 100;

if(num % 2 == 0){
    system.out.println("even number");
} else{
    system.out.println("odd number");
}

// Marks input લો.
// જો marks 33 કે વધારે હોય તો "Pass" નહિંતર "Fail" print કરો

int marks = 18;

if (marks >= 33){
    system.out.println("pass");
}else{
    system.out.println("fail");
};

// User ની age input લો.
// જો age 18 થી ઓછી હોય તો "Minor" નહિંતર "Adult" print કરો

int age = 20;

if(age <= 18 ){
    system.out.println("minor");
}
else{
   system.out.println("adult"); 
};

// એક number input લો.
// જો number even હોય તો "Even" નહિંતર "Odd" print કરો.

int number = 7;
// aama 2 2 ni jodi kari devani jo jodi 1 ma ray jay to to odd number 

if(number 2 % ===0 ){
   system.out.println("number is even");
}else{
    system.out.println("number is odd");
};

int number = 25;

if(number % 2 === 0 ){
      system.out.println("number is even");
}else{
      system.out.println("number is odd");
}
 
=> this number is odd

// Marks input લો અને grade print કરો:

≥ 90 → Grade A

≥ 70 → Grade B

≥ 33 → Grade C

// else → Fail

int marks = 25

if(marks >= 90){
    system.out.println("grade a");
}else if(marks >= 70){
    system.out.println("grade b");
}else if(marks >= 33){
    system.out.println("grade c");
}else{
system.out.println("fail");
}

=> fail

T// temperature input લો:

40 → "Very Hot"

25 → "Hot"

15 → "Normal"

else → "Cold"

int temprature = -10;

if( temprature >= 40 ){
     system.out.println("Very Hot");
}else if(temprature >= 25){
     system.out.println("Hot");
}else if(temprature >= 15){
     system.out.println("cold");
}else{
    system.out.println("very cold");
}

=> very cold

// Salary input લો અને tax category બતાવો:

≥ 100000 → "High Tax"

≥ 50000 → "Medium Tax"

else → "Low Tax"

int salary = 80000;

if(salary >= 100000)
{
   system.out.println("High Tax");
} 
else if(salary >= 50000)
{
   system.out.println("Medium Tax");
}
else
{
   system.out.println("low Tax"); 
};

output => medium tax

// User ની age અને hasID (true/false) input લો.

જો age ≥ 18

અને hasID = true → "Entry Allowed"

નહિંતર → "ID Required"

નહિંતર → "Under Age"

int age = 14;
booleanhasID = true "entry allowed"

if(age >= 18){
    if(hasID == true){
        system.out.println("entry allowed");
    }else{
          system.out.println("under age");
    }
}

//1 થી 7 સુધીનો number input લો અને day name print કરો
(1 = Monday, 2 = Tuesday, …)

int day = (1 = Monday, 2 = Tuesday, …);

switch(day){
    case 1:
         system.out.println("monday");
    break;
    
    case 2:
         system.out.println("tuesday");
    break;
    
    case 3:
         system.out.println("wenesday");
    break;
    
    case 4:
         system.out.println("thursday");
    break;
    
    case 5:
         system.out.println("friday");
    break;
    
    case 6:
         system.out.println("saterday");
    break;
    
    case 7;
          system.out.println("sunday");
    break;
    
    default:
          system.out.println("invalid day");
    
}

output => monday,tuesday

// Calculator program બનાવો:

1 → Addition

2 → Subtraction

3 → Multiplication

4 → Division

User option input લેશે.

int num1 = 10
int num2 = 20

int operater = 1,2,3,4;

switch(operater){
    case 1:
        system.out.println("addition = " ( num1 + num2) );
    break;
    
    case 2:
        system.out.println("substracion = " ( num1 - num2) );
    break;

    case 3:
        system.out.println("multiplication = " ( num1  num2) );
    break;
    
    case 4:
        system.out.println("divison = " ( num1 \ num2) );
    break;
    
    default:
     system.out.println("invalid operator");

}

//એક number input લો:

જો divisible by 3 અને 5 → "FizzBuzz"

ફક્ત 3 → "Fizz"

ફક્ત 5 → "Buzz"

નહિંતર → "Not divisible"

int number = 4

// && → બે condition જોડે

if(number % 3 == 0 && number % 5 == 0)
{
    system.out.println("FizzBuzz");
}
else if(number % 3 == 0)
{
     system.out.println("Fizz");
}
else if(number % 5 == 0)
{
     system.out.println("buzz");
}
else
{
     system.out.println("Not divisible");
}

3 numbers input લો અને largest number find કરો
(if–else only)

int num1 = 24;
int num2 = 67;
int num3 = 99;

if(num1 >= num2 && num1 >= num3)
{
   System.out.println("largest number ="+ num1); 
}
else if(num2 >= num3 && num2 >= num1)
{
    System.out.println("largest number =" + num2);
}
else{
    System.out.println("largest number =" + num3);
}
