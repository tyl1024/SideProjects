'''
Created on Nov 4, 2019
@author: Tyler Major
'''
import random as rand
import sys

letters = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
numbers = [0,1,2,3,4,5,6,7,8,9]
special = ['!','@','#','$','%','^','*','~']


user = eval(input("Enter how long you want your password to be: "))
print("Your password is going to be a random password that will be" , user , "characters long.\n")


action1Length = eval(input("How many numbers do you want your password to contain?: "))
if action1Length > user:
    print("Error occurred because you only want your password to be",user,"characters long.")
    sys.exit()
elif (action1Length < user):
    total = user - action1Length
    print("You have",total,"more characters available.\n")
    randChoice = rand.sample(numbers,k = action1Length)
    #print(randChoice) 
        

action2Length = eval(input("How many special characters do you want your password to contain?: "))
if action2Length > user:
    print("Error occurred because you only want your password to be",user,"characters long.")
    sys.exit()
elif (action2Length < user):
    Newtotal = total - action2Length
    print("You have",Newtotal,"more characters available.\n")
    if Newtotal > 0:
        randChoice2 = rand.sample(special,k = action2Length)
        #print(randChoice2)
        print("The leftover characters will be", Newtotal, "random letters from a-z")
        randChoice3 = rand.sample(letters, k = Newtotal)
        #print(randChoice3)
        finalPass = (randChoice3 + randChoice + randChoice2)
        print("Your randomly generated password is", finalPass)
    elif Newtotal < 0:
        print("Error: You have exceeded the value of your password length which was",user)
    else:
        print("**You ran out of characters available so your password only has numbers and special characters.**")
        randChoice2 = rand.sample(special,k = action2Length)
        weirdPass = randChoice + randChoice2
        print("Your password is:", weirdPass)



