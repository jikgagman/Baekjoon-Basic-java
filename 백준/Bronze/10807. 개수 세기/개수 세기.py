n=int(input())
count=0
num=list(map(int, input().split()))
v=int(input())
for j in range(n):
    if num[j]==v:
        count+=1
print(count)