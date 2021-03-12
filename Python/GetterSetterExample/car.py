class Car:

  # Initializing private attributes
  def __init__(self, name, year):
    self.__name = name
    self.__year = year

  # Getting class atrributes
  def getName(self):
    return self.__name
  
  def getYear(self):
    return self.__year

  # Setting class attributes
  def setName(self, name):
    self.__name = name

  def setYear(self, year):
    self.__year = year
