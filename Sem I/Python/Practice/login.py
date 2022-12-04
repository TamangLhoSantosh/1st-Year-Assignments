# importing tkinter
from tkinter import *

# creating window
window = Tk()

# creating frames
top = Frame(window, bg = "Light Grey")
unpw = Frame(window, bg = "Light Grey")
txtfield = Frame(window,bg = "Light Grey")
btn = Frame(window, bg = "Light Grey")
log = Frame(btn, bg = "Light Grey")

# adding frame to screeen
top.pack(side = TOP)
unpw.pack(side = LEFT)
txtfield.pack(side = RIGHT)
btn.pack(side = BOTTOM)

# creating method to clear textfield
def clear_text(event):
    if un_text.get() == "Enter your email":
        un_text.delete(0, END)
    if pw_text.get() == "":
        pw_text.insert(0, "Enter your password")
        pw_text.config(show = "")

# creating method to clear textfield
def clear_text1(event):
    if pw_text.get() == "Enter your password":
        pw_text.delete(0, END)
        pw_text.config(show = "*")
    if un_text.get() == "":
        un_text.insert(0, "Enter your email")

# creating method to show password
def get_value(event):
    if checkbutton.get() == 1:
        pw_text.config(show = "*")
    else :
        pw_text.config(show = "")

# creating lable widgets
title = Label(top, text = "Welcome To S&S Taxi Service", font = ("", 30), bg = "Light Grey", fg = "Black")
un = Label(unpw, text = "Email : ", font = ("", 20), bg = "Light Grey", fg = "Black")
pw = Label(unpw, text = "Password : ", font = ("", 20), bg = "Light Grey", fg = "Black")
nry = Label(log, text = "Not Registered Yet?", font = ("", 10), bg = "Light Grey", fg = "Black") 

# creating buttons widgets
lg = Button(log, text = "Login", font = ("", 10), bg = "Light Grey", fg = "Black")
sg = Button(log, text = "Register", font = ("",10), bg = "Light Grey", fg = "Black")

# creating textfield
un_text = Entry(txtfield, bg = "White", fg = "Black", font = ("", 20))
un_text.insert(0, "Enter your email")
pw_text = Entry(txtfield, bg = "White", fg = "Black", font = ("", 20))
pw_text.insert(0, "Enter your password")

# creating checkbox
checkbutton = IntVar()
cb = Checkbutton(btn, text="Show Password", variable = checkbutton, onvalue=1, offvalue=0, bg = "Light Grey", fg = "Black")

# creating an event
un_text.bind('<FocusIn>', clear_text)
pw_text.bind('<FocusIn>', clear_text1)
cb.bind('<Button-1>', get_value)
cb.bind('<ButtonRelease-1>', get_value)

# adding checkbox to the frame
cb.pack()

# adding widget to the frame
title.pack(pady = 40)
un.pack(padx = 20)
pw.pack(padx = 20)

# adding textfield to the frame
un_text.pack(padx = 20)
pw_text.pack(padx = 20)

log.pack()

# adding buttons to he frame
lg.pack(side = LEFT)
nry.pack(side = LEFT) # this is a label
sg.pack(side = RIGHT)

window.config(bg = "Light Grey")
window.title("Login Page")
# window.resizable(False, False)
window.geometry('550x350+450+200')
window.mainloop()  
