num = int(input("Enter start number: ")) 
num2 = int(input("Enter end number: ")) 

print("The palindrome Numbers are: ")
#reversal
while num <= num2:
    temp = num
    rev = 0
    while temp > 0:
        r = temp % 10
        rev = rev * 10 + r
        temp//= 10
    if rev == num:
        print(num)
    num+=1
