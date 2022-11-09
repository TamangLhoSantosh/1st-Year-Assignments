# declaring class
class Calcu :

    #  declaring constructor
    def __init__(self, n1, n2, op) :
        self.n1 = n1
        self.n2 = n2
        self.op = op

    # declaring calc method
    def calc(self) :
        match self.op :

            case "+" :
                print(n1 + n2)
            
            case "-" :
                print(n1 - n2)
            
            case "*" :
                print(n1 * n2)
            
            case "/" :
                print(n1 / n2)
            
            case default :
                print("Invaild operation.")

# declaring variables
n1 = int(input("Enter any number : "))
n2 = int(input("Enter any number : "))
op = input("Enter the operation to be performed : ")

# initializing object
cal = Calcu(n1, n2, op)

# invoking method calc
cal.calc()

