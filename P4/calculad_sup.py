# -*- coding: utf-8 -*-
"""
Created on Sun Dec  1 22:15:59 2021

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
    
    suma = lambda x,y : x + y
    resta = lambda x,y : x - y
    multi = lambda x,y : x * y
    division = lambda x,y : x / y
    def func_sup(x,y,funcion):
        print("resultado: ",funcion(x, y))
        
    if op=="1":
      func_sup(int(input("num1:")), int(input("num2:")), suma)
    elif op=="2":
      func_sup(int(input("num1:")), int(input("num2:")), resta)
    elif op=="3":
      func_sup(int(input("num1:")), int(input("num2:")), multi)
    elif op=="4":
      func_sup(int(input("num1:")), int(input("num2:")), division)
    else:
      op = False
