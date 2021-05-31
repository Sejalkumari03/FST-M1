def fibo(num):
    if num<=1:
        return num
    else:
        return (fibo(num-1) + fibo(num-2))
    
n = int(input("Enter a number : "))

if n<=0:
    print("Please enter a positive number")
else:
    print("Fibonacci sequence: ")
    for i in range(n):
        print(fibo(i))
        