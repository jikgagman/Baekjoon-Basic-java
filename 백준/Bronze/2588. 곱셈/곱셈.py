a = int(input())
b = int(input())
print((a*((b%100)%10)), (a*((b%100)//10)), (a*(b//100)), (a*b), sep='\n')
