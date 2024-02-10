num = int(input("Enter a number to be checked: "))
temp = num # temp variable for usage as the num variable has to be used to check later on
rev = 0

while temp > 0:
    r = temp % 10
    rev = rev * 10 + r
    temp //= 10
if rev == num:
    print(f"{num} is a palindrome number.")
else:
    print("not a palindrome")