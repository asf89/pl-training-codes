class Car:

  # Initializing private attributes
  def __init__(self, name, year):
    self.name = name
    self.year = year

  # Getting class atrributes
  @property
  def name(self):
    return self.__name

  @name.setter
  def name(self, name):
    self.__name = name

  @property
  def year(self):
    return self.__year

  @year.setter
  def year(self, year):
    self.__year = year
