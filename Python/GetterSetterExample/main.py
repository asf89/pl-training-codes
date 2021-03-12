from car import *

def main():
  car1 = Car('Fiat', 1990)
  car2 = Car('Gol', 2007)
  car3 = Car('Fox', 2008)

  print(f'Carro 1: {car1.getName()}, Ano: {car1.getYear()}')
  print(f'Carro 2: {car2.getName()}, Ano: {car2.getYear()}')
  print(f'Carro 3: {car3.getName()}, Ano: {car3.getYear()}')

  car1.setName('Honda')
  car1.setYear(2010)

  aux_name = car2.getName()
  aux_year = car2.getYear()
  
  car2.setName(car3.getName())
  car2.setYear(car3.getYear())

  car3.setName(aux_name)
  car3.setYear(aux_year)

  print(f'Carro 1: {car1.getName()}, Ano: {car1.getYear()}')
  print(f'Carro 2: {car2.getName()}, Ano: {car2.getYear()}')
  print(f'Carro 3: {car3.getName()}, Ano: {car3.getYear()}')

if __name__ == "__main__":
  main()
