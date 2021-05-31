fruit = {
    "orange" : 29,
    "mango" : 36,
    "guava" : 22,
    "grapes" : 43
}

n= input("What are u looking for ? ").lower()

if (n in fruit) :
    print("Yes fruit is available")

else:
    print("No fruit is not available")