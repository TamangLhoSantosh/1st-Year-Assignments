# # defining cor function
# def cor(a) :

#     match a :
#         case 1 :
#             print("The day is Sunday.")
        
#         case 2 :
#             print("The day is Monday.")


#         case 3 :
#             print("The day is Tuesday.")


#         case 4 :
#             print("The day is Wednesday.")


#         case 5 :
#             print("The day is Thursday.")


#         case 6 :
#             print("The day is Friday.")


#         case 7 :
#             print("The day is Saturday.")

# # looping to make the user enter correct value
# while True :
#     a = int(input("Enter any number : "))

#     # checking for the value entred
#     if a > 0 and a < 8 :

#         # calling cor method
#         cor(a)
#         break
#     else :
#         print("Invalid input please enter a number again.")


# declaring class
class Calcu:

    # constructor
    def __init__(self, num_1, num_2, operatotr) :
        self.num_1 = num_1
        self.num_2 = num_2
        self.operatotr = operatotr

    # declaring cal method
    def cal(self) :
        match self.operatotr :
            case "+" :
                print(self.num_1 + self.num_2)
            case "-" :
                print(self.num_1 - self.num_2)
            case "*" :
                print(self.num_1 * self.num_2)
            case "/" :
                print(self.num_1 / self.num_2)
    
# entering data
num_1 = int(input("Enter any number : "))
num_2 = int(input("Enter any number : "))
operatotr = input("Enter the mathematical operation : ")

# initializing object
calc = Calcu(num_1, num_2, operatotr)

# calling cal method
calc.cal()