'''
Created on Oct 14, 2019

@author: Tyler Major
'''

import random


def main():
   header()
   randomNumberGenerator()
   runner()
   
    
    
def header():
     print()
     print("***************************************************************************************************************")
     print("***     Welcome to the number Guesser                                                                         *")
     print("***     This program tell you to guess a number between 0 and 100                                             *")  
     print("***     You will get hints as you guess but continue to guess until you successfully get the correct number   *")  
     print("***     Written by Tyler Major                                                                                *")
     print("***************************************************************************************************************")
     print()
     

#This function gets a random number between 0 and 100
def randomNumberGenerator():
    global randomNumber
    randomNumber = random.randint(1,101)
    
#This function is to compare the random number chosen to the number you guessed
#and tell you if you are right or wrong
def runner():
    counter = 0   #used to see if too many guesses were used
    userInput = int(input("Please enter a number between 0 and 100: "))
    print("The number you entered is:", userInput)
    while (userInput != randomNumber):   
        while (counter < 9):
            if (userInput < randomNumber):
                print()
                print("*** Sorry, incorrect. Try a higher number ***")
                userInput = int(input("Please enter a number between 0 and 100: "))
            if (userInput > randomNumber):
                print()
                print("*** Sorry, incorrect. Try a lower number ***")
                userInput = int(input("Please enter a number between 0 and 100: "))
            if (userInput == randomNumber):
                print()
                print("*** Yay! you guessed the right number!! ***")
            counter += 1
        else:
            print()
            print("Sorry, you lost! It took you over 10 guesses")
            print("The number was:", randomNumber)
            break
        
        
   
main()
