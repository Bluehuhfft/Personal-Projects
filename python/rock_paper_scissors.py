import random as r
import os

choices = ['rock', 'paper', 'scissors'] #Three possible choices - for user input and for ai random generation

#Getting user input. If user enters bullshit, cmd clears and freshly starts the same function, unless the user decides to exit. Otherwise, returns the input.
def user():
    user_choice = input("Here are your options: (Rock/Paper/Scissors):\nNote: You needn't worry about capitalisation\n\n>").lower()
    if user_choice not in choices:
        print(f"Error: '{user_choice}'  not recognised as workable input. \n\nPress <enter> to try again or <q> to exit:\n\n")
        e = input("> ").lower()

        if e != 'q':
            os.system("cls") #To clear cmd screen
            user() #Recalls this 
        else:
            print("\nSo long my friend, so long...\n")
            quit(0)#Adios!
    else:
        return user_choice
    
#Getting random ai choice from 'choices' list up in line 4, then returning it.
def ai():
    ai = r.choice(choices)
    return ai
    pass

#Winner/loser decision making function. returns winner ("no one" return value means draw!)
def winner(ai, user):

    winner = "me"

    #Draw
    if ai == user:
        winner = "no one"

    #User wins (too complicated to explain)
    elif (
        user == choices[0] and ai == choices[2] or 
        user == choices[2] and ai == choices[1] or 
        user == choices[1] and ai == choices[0] 
    ):
        winner = "user"

    #By elimination, ai will win at the end
    else:
        winner = "ai"

    return winner

#Main game loop
while True:
    print("\n\n-----------------------------------------------------------------------------------------------------------------\n\n", end="\n")
    yes_no_play = input("Hey there lad or lass, wish to play a game of rock, paper and scissors? (Y/N)\n> ").lower()

    if yes_no_play != 'y':
        print("\nSo long my friend, so long...\n")
        quit(0)
    else:
        user_final = user()
        ai_final = ai()
        winner_final = winner(ai_final, user_final)

        print(f"\n\nYour choice: {user_final}\nThe computer's intuition: {ai_final}\n\n\n") # Printing out the choices


        if winner_final == 'no one': #DRAW
            print("ITS A DRAW!")
            continue
        else:
            print("Aaannndddd.. The WINNER issssss....................................................\n")#Building up the suspense
            print(f"WINNER: {winner_final}") # Printing the Winner

        re_play = input("Press enter to exit, or <r> to play again!").lower()

        if re_play == 'r':
            continue
        else:
            quit(0)

        os.system("cls")

        quit(0)

# :) Hope you have a nice day!