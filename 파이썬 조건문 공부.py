import random

n1 = random.randint(0,100)

n2 = random.randint(0,100)

n3 = random.randint(0,100)

n4 = random.randint(0,100)

a = [] # 50 이상 값들의 리스트

b = [] # 50 미만 값들의 리스트

# n1, n2, n3, n4에서 50 이상의 값들은 리스트 a 에,

# 50 미만의 ﻿ 값들은 리스트 b 에 모으는 프로그램을 이 아래에 채우세요.

# if else 와 리스트 append() 이용﻿

if n1 >= 50 : 
    a.append(n1)
else :
    b.append(n1)
if n2 >= 50 :
    a.append(n2)
else :
    b.append(n2)
if n3 >= 50 :
    a.append(n3)
else :
    b.append(n3)
if n4 >= 50 :
    a.append(n4)
else :
    b.append(n4)

print("50이상 : ", a)
print("50미만 : ", b)












