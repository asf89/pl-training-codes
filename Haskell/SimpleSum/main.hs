readInt :: String -> Int
readInt = read

soma :: Int -> Int -> Int
soma num1 num2 = num1 + num2

main :: IO ()
main = do {
  putStrLn "Enter the first number:";
  num1 <- getLine;

  putStrLn "Enter the second number:";
  num2 <- getLine;

  putStrLn "The sum is:";
  print $ soma (readInt num1) (readInt num2);
}
