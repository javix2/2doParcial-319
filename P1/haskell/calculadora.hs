getNum :: (Read a, Num a, Show a) => IO a
getNum = readLn
  
suma :: Integer->Integer->Integer
suma x y = x + y
resta :: Integer->Integer->Integer
resta x y = x - y
multiplicacion :: Integer->Integer->Integer
multiplicacion x y = x * y
division :: Integer->Integer->Integer
division x y = x `div` y

main = do

  putStrLn "num1:"
  a <- getNum
  putStrLn "num2:"
  b <- getNum

  print("la suma es: " ++ show (suma a b))
  print("la resta es: " ++ show (resta a b))
  print("la multiploicacion es: " ++ show (multiplicacion a b))
  print("la division es: " ++ show (division a b))

  