list = []
for _ in range(10):
    s = int(input())
    list.append(s%42)
    
print(len(set(list)))