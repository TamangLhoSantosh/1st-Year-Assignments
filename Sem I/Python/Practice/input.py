# importing gettersetter
import gettersetter as gs

# declaring variables
fname = input("Enter your first name : ")
lname = input("Enter your last name : ")
address = input("Enter your address : ")
contact = input("Enter your contact : ")

# creating a bnew object of St class
new = gs.St(fname, lname, address, contact)

ans = input("What do you want to see?(First Name, Last Name, Address, Contact) : ").lower()

match ans :
    
    case "first name" :
        print(new.get_fname())

    case "last name" :
        print(new.get_lname())

    case "address" :
        print(new.get_address())

    case "contact" :
        print(new.get_contact())

    case default :
        print("Invalid input")