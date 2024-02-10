num = int(input("Enter a number: "))
rev = 0
while num > 0:
    r = num % 10
    rev = rev * 10 + r
    num //= 10
print("The reversed number is ", rev)