n1 = int(input("Enter the start number: "))
n2 = int(input("Enter the end number: "))


def even(st,ed):
    while st <= ed:
        if st % 2 == 0: print(st)
        st+=1

def odd(st, ed):
    while st <= ed:
        if st % 2 != 0: print(st)
        st+=1

y_n = input("Enter 'odd' for odd and 'even' for even numbers: ").lower()

if y_n == 'even': print(even(n1,n2))
elif y_n == 'odd': print(odd(n1, n2))
else: print('SPELL IT PROPERLY!')