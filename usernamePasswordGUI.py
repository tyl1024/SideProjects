'''
Created on Oct 13, 2019
@author: Tyler Major
'''

from tkinter import *

def register_user():
    username_info = username.get()
    password_info = password.get()
    
    file = open("loginData.txt", "w")
    file.write("Username: " + username_info + "\n")
    file.write("Password: " + password_info)
    file.close()
    
    username_entry.delete(0,END)
    password_entry.delete(0,END)
    
    Label(screen1, text = "You have successfully registered", fg = "green", font = ("Calibri, 11")).pack()


def register():
    global username_entry
    global password_entry
    global screen1
    global username
    global password
    
    screen1 = Toplevel(screen)
    screen1.title("Register")
    screen1.geometry("500x500")

    username = StringVar()
    password = StringVar()
    
    Label(screen1, text = "Please enter details below").pack()
    Label(screen1, text = "").pack()
    Label(screen1, text = "Username * ").pack()
    username_entry = Entry(screen1, textvariable = username)
    username_entry.pack()
    Label(screen1, text = "Password * ").pack()
    password_entry = Entry(screen1, textvariable = password)
    password_entry.pack()
    Label(screen1, text = "").pack()
    Button(screen1, text = "Register", width = 10, height = 1, command = register_user).pack()

    

def login():
    print("Login session has started")
  
    
def main_screen():
    global screen
    screen = Tk()
    screen.geometry("500x500")
    screen.title("Login")
    Label(text = "Login", bg = "Cyan", width = "300", height = "2", font = ("Calibri, 13")).pack()
    Label(text = "").pack()
    Button(text = "Login", height = "2", width = "30", command = login).pack()
    Label(text = "").pack()
    Button(text = "Register",height = "2", width = "30", command = register).pack()
    
    screen.mainloop()

main_screen()
    
    

