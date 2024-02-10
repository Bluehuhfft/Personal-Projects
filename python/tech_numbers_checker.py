user = int(input("Enter a four digit number: "))

if user > 9999 or user < 1000:
    print("INVALID INPUT", end=' ')
    quit(1)

use1 = str(user)
l = len(use1)

# slicing the string
fh = int(use1[0:l//2:1])
sh = int(use1[l//2::1])

c = (fh + sh) ** 2 # condition, if this is equal to the provided no.; then its a tech number

if c == user:
    print(f"{user} is a tech number.", end=' ')
else:
    print(f"{user} is not a tech number.", end=' ')
