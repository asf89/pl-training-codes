from student import Student

student1 = Student("Carlos", 20)
student2 = Student("Luísa", 18)
student3 = Student("Bruno", 22)

if __name__ == '__main__':
  print(f'{student1.name}, {student1.age}')
  print(f'{student2.name}, {student2.age}')
  print(f'{student3.name}, {student3.age}')
