-- Programa que recebe uma string de números inteiros e retorna uma lista
-- de números inteiros.

readInt :: String -> Int
readInt = read

charToString :: Char -> String
charToString x = [x]

switchToSpace :: Char -> String
switchToSpace ',' = " "

parseComma :: String -> String
parseComma "" = ""
parseComma (x:xs)
  | x == ',' = switchToSpace x ++ parseComma xs
  | otherwise = charToString x ++ parseComma xs

stringToList :: String -> [Int]
stringToList arg = map readInt $ words $ parseComma arg
-- form 2: stringToList arg = map readInt (words (parseComma arg))
-- form 3: stringToList string = map read $ words string :: [Int]

main :: IO ()
main = do {

  putStrLn "Enter a number sequence:";
  seq <- getLine;

  putStrLn "Generated list:";
  print $ stringToList seq;

}


 
