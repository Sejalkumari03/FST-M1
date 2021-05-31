n1= [2,3,4,5,7,9,6,8]
n2= [1,4,7,2,0,5]
n3= []

for n in n1:
    if (n % 2 != 0) :
        n3.append(n)
for n in n2:       
    if (n % 2 == 0) :
        n3.append(n)

print("the final list is")
print(n3)

