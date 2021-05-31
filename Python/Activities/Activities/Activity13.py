def sum(num):
    s=0
    for n in num:
        s=s+n
    return s

numlist=[12,8,5,0,11]
res= sum(numlist)

print("the sum of the list is : " + str(res))
