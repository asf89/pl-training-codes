-- Programa que acrescenta um nome ao fim do arquivo file.txt, lê o mesmo
-- e imprime no console, e cria um novo arquivo com uma mensagem.

main :: IO ()
main = do
  putStrLn "Digite seu nome:"
  name <- getLine
  appendFile "file.txt" name
  arq <- readFile "file.txt"
  print arq
  writeFile "file2.txt" "Hello World!"

