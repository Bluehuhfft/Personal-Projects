mpd=int(input("Enter the number you want to multiply: "))
mpd_w=int(input("Enter the number till which you want to multiply the number: "))

for i in range(0, mpd_w):
    print(f"{mpd} X {i} = {mpd*i}")
    