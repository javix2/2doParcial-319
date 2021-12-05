# -*- coding: utf-8 -*-
"""
@author: javier
"""


def suma (a,b):
    return a+b
def resta (a,b):
    return a-b
def multiplica (a,b):
    return a*b
def divide (a,b):
    return a/b
    
op=True
while op:
    print("""
    1.Suma
    2.Resta
    3.Multiplicacion
    4.Division
    5.salir
    """)
    op=input("ingrese opcion: ")
    if op=="1":
      print("la suma es: ",suma(int(input("num1:")), int(input("num2:"))))
    elif op=="2":
       print("la resta es: ",resta(int(input("num1:")), int(input("num2:"))))
    elif op=="3":
       print("la multiplicacion es: ",multiplica(int(input("num1:")), int(input("num2:"))))
    elif op=="4":
       print("la division es: ",divide(int(input("num1:")), int(input("num2:"))))
    else:
      op = False
