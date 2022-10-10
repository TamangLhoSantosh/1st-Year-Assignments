## core python

# code to convert celsius to and farhenit
# temp = int(input("Enter any temperature :"))
# ans = input("Is the temperture in celsius? Y/N :").upper()
# if ans == "Y":
#     f = temp * 9 / 5 + 32
#     print("The temperature in farhenit : ",f )
# else:
#     c = (temp - 32) * 5 / 9
#     print("The temperature in celsius : ",c)

# code to accept and display your id, full name, contact and address
# id = int(input("Enter your id : "))
# name = input("Enter your full name : ")
# cont = input('Enter your contact : ')
# address = input("Enter your address : ")
# print(id)
# print(name)
# print(cont)
# print(address)

# code to guess any number between 1 to 9
# num = int(input ("Enter any number from 1 to 9 : "))
# if num == 1:
#     print("Entered number is 1.")
# elif num == 2:
#     print("Entered number is 2.")
# elif num == 3:
#     print("Entered number is 3.")
# elif num == 4:
#     print("Entered number is 4.")
# elif num == 5:
#     print("Entered number is 5.")
# elif num == 6:
#     print("Entered number is 6.")
# elif num == 7:
#     print("Entered number is 7.")
# elif num == 8:
#     print("Entered number is 8.")
# else:
#     print("Entered number is 9.")

# code to reverse the word 
# wrd = input('Enter any word : ')
# reversing the word entered
# print(wrd[::-1])


##if statement questions

# checking for the eligible voters
# age = int(input("Enter your age : "))
# if age >= 18 : 
#     print("You are eligible for voting.")
# else:
#     print("You are not eligible for voting.")

# odd or even
# num = int(input("Enter any number : "))
# if num % 2 == 0 :
#     print("The number is even.")
# else:
#     print("The number is odd.")

# divisible by 7 or not
# num = int(input("Enter any number : "))
# if num % 7 == 0 :
#     print("The number is divisible by 7.")
# else:
#     print("The number is not  divisible by 7.")

# saying hi if the num is divisible by 5 else saying bye
# num = int(input("Enter any number : "))
# if num % 5 == 0 :
#     print("Hello")
# else:
#     print("Bye")

# taking last digit of any numbers
# num = int(input("Enter any number : "))
# last = num % 10
# print(last)

# taking last digit of any numbers and checking for the divisible by 3
# num = int(input("Enter any number : "))
# last = num % 10
# if last % 3 == 0:
#     print("The last digit number is divisible by 3.")
# else:
#     print("The last digit number is not divisible by 3.")

# checking for leap year
# year = int(input("Enter any year : "))
# if year % 4 == 0:
#     if year % 100 == 0 or year % 400 == 0:
#         print("The year entered is leap year")
#     else:
#         print("The year entered is not leap year")

# entering number to get days
# num = int(input("Enter any number of the day : "))
# if num == 1 :
#     print("Sunday")
# elif num == 2:
#     print("Monday")
# elif num == 3:
#     print("Tuesday")
# elif num == 4:
#     print("Wednesday")
# elif num == 5:
#     print("Thursday")
# elif num == 6:
#     print("Friday")
# elif num == 7:
#     print("Saturday")
# else:
#     print("Invalid number of the day entered.")

# entering number to get the month
# month = int(input("Enter any number of the month : "))
# if month == 1:
#     print("The month is January. The numbers of the days are 31.")
# elif month == 2:
#     print("The month is February. The numbers of the days are 28/29.")
# elif month == 3:
#     print("The month is March. The numbers of the days are 31.")
# elif month == 4:
#     print("The month is April. The numbers of the days are 30.")
# elif month == 5:
#     print("The month is May. The numbers of the days are 31.")
# elif month == 6:
#     print("The month is June. The numbers of the days are 30.")
# elif month == 7:
#     print("The month is July. The numbers of the days are 31.")
# elif month == 8:
#     print("The month is August. The numbers of the days are 31.")
# elif month == 9:
#     print("The month is September. The numbers of the days are 30.")
# elif month == 10:
#     print("The month is October. The numbers of the days are 31.")
# elif month == 11:
#     print("The month is November. The numbers of the days are 30.")
# elif month == 12:
#     print("The month is December. The numbers of the days are 31.")
# else:
#     print("Invalid number of the month.")

# senior citizen
# age = int(input("Enter the age : "))
# if age > 60:
#     print("The person is senior citizens.")
# else:
#     print("The person is not senior citizens.")

# largest numbers among three
# num1 = int(input("Enter any number : "))
# num2 = int(input("Enter any number : "))
# num3 = int(input("Enter any number : "))
# if num1 > num2 and num1 > num3:
#     print(num1, " is the largest number.")
# elif num2 > num3:
#     print(num2, " is the largest number.")
# else:
#     print(num3, " is the largest number.")

# second largest number among three
# num1 = int(input("Enter any number : "))
# num2 = int(input("Enter any number : "))
# num3 = int(input("Enter any number : "))
# if num1 < num2 and num1 > num3 or (num1 > num2 and num1 < num3):
#     print(num1, " is the second largest number amog the three.")
# elif num2 < num3:
#     print(num2, " is the second largest number amog the three.")
# else:
#     print(num3, " is the second largest number amog the three.")

# vowel or not
# word = input("Enter any word : ").lower()
# if word == "a" or word == "e" or  word == "i" or  word == "o" or word == "u":
#     print("The word is vowel.")
# else:
#     print("The word is not vowel.")

# prime number or not
# num = int(input("Enter any number : "))
# ans = "False"
# eliminating 0 and 1
# if num > 1 :
    # checking for factors
    # for i in range(2, num) :
        # if num % i == 0 :
            # if factor is found breaking the loop
            # ans = "True"
            # break
# printing the final ans
# if ans == "True" :
#     print("The number is not a prime number.")
# else :
#     print("The number is a prime number.")

# displaying the grade according to the percentage
# percent = int(input("Enter the percentage obtained : "))
# if percent > 90 :
#     print("The obtained grade is A.")
# elif percent > 80 and percent <= 90 :
#     print("The obtained grade is B.")
# elif percent >= 60 and percent <= 80 :
#     print("The obtained grade is C.")
# elif percent < 60 :
#     print("The obtained grade is D.")
# elif percent > 100 :
#     print("The entered value is incorrect.")

# road tax to pay
# cost = int(input("Enter the cost of the bike : "))
# if cost > 100000 :
#     tax = 15 / 100 * cost
#     print(tax, " is the amount to be paid for the road tax.")
# elif cost > 50000 and cost <= 1000000 :
#     tax = 10 / 100 * cost
#     print(tax, " is the amount to be paid for the road tax.")
# elif cost <= 50000 :
#     tax = 5 / 100 * cost
#     print(tax, " is the amount to be paid for the road tax.")

## looping  statements

# divisible by 7 and multiple of 5 between 1500 and 2700
# for i in range(1500, 2700) :
    # for divisible by 7
    # if i % 7 == 0 :
        # for multiple of 5
        # if i % 5 == 0 :
            # print(i)

# Fibonacci series between 0 to 50
# i = 0
# j = 0
# k = 0
# while i < 50:
#     print(i)
#     k = i + j
#     j = i 
#     i = k
#     if i == 0 :
#         i += 1

