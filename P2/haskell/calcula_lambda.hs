
getnum::IO Int
getnum = do
  s <- getLine
  return (read s)

main = do
  putStr("1.- Sumar\n2.- Restar\n3.- Multiplicar\n4.- Dividir\n>\n")
  opc <- getnum
  putStr("Numero1: \n")
  numuno <- getnum
  putStr("Numero2: \n")
  numdos <- getnum
  
  let suma=[a+b | a <- [numuno], b <- [numdos]]
  let resta=[a-b | a <- [numuno], b <- [numdos]]
  let multiplicacion=[a*b | a <- [numuno], b <- [numdos]]
  let division=[a `div` b | a <- [numuno], b <- [numdos]]
  
  let resultado=if opc==1 then suma else if opc==2 then resta else if opc==3 then multiplicacion else if opc==4 then division else []
  putStr("respuesta-->:"++show(resultado)++"\n")
  main