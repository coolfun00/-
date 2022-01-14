import random
low = []
mid = []
high = []
for i in range(100) :
    n = random.randint(1, 100)
    if n < 40 :
        low.append(n)
    elif 40<= n <70 :
        mid.append(n)
    else :
        high.append(n)
print("low :", low)
print("mid :", mid)
print("high :", high)

