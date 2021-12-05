# -*- coding: utf-8 -*-
"""
@author: javier
"""

op=True
while op:
    print("""
    1.Suma
    2.Resta
    3.Multiplicacion
    4.Division
    5.salir
    """)
    op=input("ingrese operacion: ")
    if op=="1":
      suma = lambda x,y : x + y
      print("la suma es: ",suma(int(input("num1:")), int(input("num2:"))))
    elif op=="2":
      resta = lambda x,y : x - y
      print("la resta es: ",resta(int(input("num1:")), int(input("num2:"))))
    elif op=="3":
      multi = lambda x,y : x * y
      print("la multiplicacion es: ",multi(int(input("num1:")), int(input("num2:"))))
    elif op=="4":
      division = lambda x,y : x / y
      print("la division es: ",division(int(input("num1:")), int(input("num2:"))))
    else:
      op = False
