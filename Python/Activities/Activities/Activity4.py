#take user names
user1=input("Enter user 1 name")
user2=input("Enter user 2 name")

user1_ans= input(user1 + ", Enter rock/paper/scissors : ").lower()
user2_ans= input(user2 + ", Enter rock/paper/scissors : ").lower()

if (user1_ans == user2_ans):
    print("Its a tie, play again")

elif(user1_ans == 'rock'):
    if (user2_ans == 'scissors'):
        print("rock wins")
    else:
        print("Paper wins")    

elif(user1_ans == 'paper'):
    if (user2_ans =='rock'):
        print("paper wins")
    else:
        print("scissors wins")  

elif(user1_ans == 'scissors'):
    if (user2_ans =='paper'):
        print("scissors wins")
    else:
        print("rock wins")    

else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")         

repeat = input("Do you want to play another round? Yes/No: ").lower()
    
if(repeat == "yes"):
    pass
elif(repeat == "no"):
    raise SystemExit
else:
    print("You entered an invalid option. Exiting now.")
    raise SystemExit
    