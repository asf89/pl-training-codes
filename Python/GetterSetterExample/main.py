from car import *

def main():
  car1 = Car('Fiat', 1990)
  car2 = Car('Gol', 2007)
  car3 = Car('Fox', 2008)

  print(f'Carro 1: {car1.name}, Ano: {car1.year}')
  print(f'Carro 2: {car2.name}, Ano: {car2.year}')
  print(f'Carro 3: {car3.name}, Ano: {car3.year}')

  car1.name = 'Honda'
  car1.year = 2010

  aux_name = car2.name
  aux_year = car2.year
  
  car2.name = car3.name
  car2.year = car3.year

  car3.name = aux_name
  car3.year = aux_year

  print(f'Carro 1: {car1.name}, Ano: {car1.year}')
  print(f'Carro 2: {car2.name}, Ano: {car2.year}')
  print(f'Carro 3: {car3.name}, Ano: {car3.year}')

if __name__ == "__main__":
  main()
