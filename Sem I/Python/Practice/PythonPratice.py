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

# print 0 to 6 except 3 and 6
# for i in range(6) :
#     if i % 3 != 0 :
#         print(i)

# fizzbuzz
# for i in range(50) :
#     if i % 3 == 0 and i % 5 == 0 :
#         print("FizzBuzz")
#     elif i % 3 == 0 :
#         print("Fizz")
#     elif i % 5 == 0 :
#         print("Buzz")
#     else :
#         print(i)

# multiple table
# num = int(input("Enter any number : "))
# for i in range(1,11):
#     ans = num * i
#     print(num, "*", i, "=", ans)

# nested loop
# for i in range(1, 10):
#     for j in range (i):
#         print(i,end = " ")
#     print()

# sum and average
# num = int(input("Enter any number : "))
# sum = 0
# for i in range (1, num) :
#     sum = sum + num
# avg = sum // num
# print(sum)
# print(avg)

# character a
# for i in range(1, 7) :
#     if i == 1 :
#         print(" *** ")
#     elif i == 4 :
#         print("*****")
#     else :
#         print("*   *")

# character E
# for i in range(1,8) :
#     if i == 1 or i == 4 or i == 7 :
#         print("*****")
#     else :
#         print("*")

# character l
# for i in range( 1, 7) :
#     if i == 6 :
#         print("*****")
#     else :
#         print("*")

# 100 to 400 only even digits
# for i in range(100, 401) :
#     j = i % 10
#     k = (i // 10) % 10
#     l = (i // 100) % 100
#     if j % 2 == 0 and k % 2 == 0 and l % 2 == 0 :
#         print(i,end=",")

# sum of square of first n numbers
# num = int(input("Enter any num : "))
# sum = 0
# for i in range(num + 1) :
#     sum = sum + i ** 2
# print("The sum of square is ", sum)

# showing fibonacci series till nth number
# g = int(input("Enter the n th number for the fibonacci serires : "))
# h = 0
# i = 0
# j = 0
# k = 0
# while h < g :
#     print(i)
#     k = i + j
#     j = i 
#     i = k
#     if i == 0 :
#         i += 1
#     h += 1

# counting even or odd in series of number
# num = int(input("Enter any number : "))
# even = 0
# odd = 0
# while num > 0 :
#     co = num % 10
#     if co % 2 == 0 :
#         even += 1
#     else :
#         odd += 1
#     num = num // 10
# print("Enter the number of even in the number is ", even)
# print("The number of odd in the number is ", odd)

# factorial of number
# num = int(input("Enter any number : "))
# factorial = 1
# for i in range(2, num + 1) :
#     factorial = factorial * i
# print("The factorial of the number is ", factorial)

# prime or not
# ans = "true"
# print("The prime numbers are : ")
# for i in range(2, 11) :
#     for j in range(2,i) :
#         if i % j == 0 :
#             print(i, "Not prime")
#             ans = "false"
#             break
#         ans = "true"
#     if ans == "true":
#         print(i, "prime")

# Pallindrome for num
# num = int(input("Enter any number : "))
# number = num
# rev = 0
# while num > 0 :
#     rem = num % 10
#     rev = rev * 10 + rem
#     num //= 10
# if rev == number :
#     print("The number is a pallindrome number.")
# else :
#     print("The number is not a pallindrome number.")

# A = "NEPAL"
# for i in range(len(A)) :
#     print(A[0:i + 1:])
# for i in range(len(A)) :
#     for j in range( i + 1):
#         print(A[j], end= " ")
#     print()

# # Array

# printing all array element
# from array import array

# array_s = array('i', [1, 2, 3, 4, 5])
# for elem in array_s :
#     print(elem)

# printing sum of the number in the array
# from array import array

# sum = 0
# array_s = array('i', [1, 2, 3, 4, 5])
# for elem in array_s :
#     sum += elem    
# print(sum)

# printing largest number in the array
# from array import array

# max = 0
# array_s = array('f', [1.34, 2.54, 3.65, 4.76, 5.76])
# for elem in array_s :
#     if elem > max :
#         max = elem
# print(max)

# printing smallest nunber in the array
# from array import array

# array_s = array('i', [1, 2, 3, 4, 5])
# mini = array_s[0]
# for elem in array_s :
#     if elem < mini :
#         mini = elem
# print(mini)

#printing the characters in ascending order
# from array import array

# array_s = array('b', b'santosh')
# print(sorted(array_s))

# creating unique list
# lists = [1, 2, 3, 4, 1, 5]
# new_list = []
# for elem in lists :
#     if elem not in new_list :
#         new_list.append(elem)
# print(new_list)

# from copy import deepcopy


# lists = [1, 2, 3, 4, 1, 5]
# new_list = deepcopy(lists)
# for i in range(len(lists)) :
#     if lists[i] in lists[:i] :
#         new_list.pop(i)
# print(new_list)

# from copy import deepcopy

# i = 0
# lists = [1, 2, 3, 4, 1, 5]
# new_list = deepcopy(lists)
# for idx in range(len(lists)) :
#     count = lists.count(lists[idx])
#     if count > 1 and idx > 0:
#         for i in range(len(lists[:idx])) :
#             if lists[i] == list[idx]:
#                 new_list.pop(i)
# print(new_list)

# i = 0
# while i < 5 :
#     print(i)
#     i += 1
#     if i == 3 :
#         pass
# else :
#     print(0)

## list

# display all elements

# a = list(range(1,11))
# print(a)

# length of items

# a = list(range(1,11))
# print(len(a))

# types of items

# a = [1,2,3,4, 'sfgd', 'dsgg', 'sdgd', {}, ['asd','asf']]
# for elem in a :
#     print(type(elem))

# set

# adding single and multiple elements

# a = set(range(11))
# print(a)
# a.add(45)
# print(a)
# a.update(range(66))
# print(a)

# union of 2 sets

# a = set(range(11))
# b = set(range(5, 21))
# print(a & b)

# unique to a set

# a = set(range(11))
# b = set(range(5, 21))
# print(a ^ b)

# unique to only one

# a = set(range(11))
# b = set(range(5, 21))
# print(a - b)

# removing items from a set

# a = set(range(11))
# print(a)
# a.remove(0)
# print(a)
# a.clear()
# print(a)

# adding set b to set a

# a = set(range(11))
# b = set(range(5, 21))
# a.update(b)
# print(a)

# list to dictionary

# a = list(range(11))
# b = list(range(10,21))
# c = dict(zip(a,b))
# print(c)

# merging two dictonaries

# a = dict(zip(range(11), range(10, 21)))
# b = dict(zip(range(20,31), range(30,41)))
# print(a)
# a.update(b)
# print(a)

# initializng dictionary with default values

# a = list(range(11))

# deleting a list of keys

# a = dict(zip(range(11), range(10, 21)))
# print(a)
# a.pop(1)
# print(a)
# a.clear()
# print(a)

# checking for the availability of a key

# a = dict(zip(range(11), range(10, 21)))
# print(21 in a)