n1 = int(input("Enter start number with even number of digits: "))
n2 = int(input("Enter end number with even number of digits(Same or more): "))

while n1 <= n2:
    temp = n1
    tstr = str(temp)
    l = len(tstr)

    hf1 =int(tstr[0:l//2])
    hf2 = int(tstr[l//2:])

    sq = (hf1+hf2) ** 2
    if sq == temp: print(temp)
    n1+=1