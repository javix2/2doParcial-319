main :: IO ()

lcar::String->[Char]
lcar lista = [x | x <- lista, not (x == ' ')]

main = do

putStr "frase: \n"
frase <- getLine
let b = words frase
print b
print (lcar frase)



  