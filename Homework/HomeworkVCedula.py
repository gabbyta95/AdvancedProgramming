def vcedula(texto):
    nocero = texto.strip('0')
    cedula = int(nocero, 0)
    verifica = cedula % 10
    n = cedula // 10
    num = 0
    while n > 0:
        impar = n % 10
        n = n // 10
        impar = 2 * impar
        if impar > 9:
            impar = impar - 9
        par = n % 10
        n = n // 10
        num = num + impar + par
    ds = num // 10 + 1
    num = ds * 10 - num
    if num >= 10:
        num = num - 10
    if num == verifica:
        print('Valido')
    else:
        print('No valido')


vcedula("1075347866")
