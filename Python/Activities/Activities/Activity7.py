"""
x=0
number=[1,2,3,4,5,6]
for p in number:
    x = x + p
print(x)

"""

n = list(input("Enter the list of numbers: ").split(","))
sum=0

for x in n:
    sum += int (x)

print(sum)