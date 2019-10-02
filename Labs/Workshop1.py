#LISTAS

print('Hello World')
names=['Gaby','Maria','Camila']
ages=[18,15,20]

names.append('Stefania')
names.extend(['Camilo','Juan'])
ivan=names.pop()
print(ivan)
names.insert(1,'Ivan')
print(names)
print('I have this names:{} with this ages{}'.format(names,ages))

#ESTRUCTURAS DE CONTROL
#No hay switch case en python, se usa elif
name='Gabriela'
if name=='Gabriela':
    print(True)
elif name=='Gabriela2':
        print('Your names is{}'.format(name))
else:
    print(False)

#Division entera //
#Potencia **
#Is devuelve la comparacion entre direcciones de memoria

#BUCLE
for i in range(10):
    print(i)

for name in names:
    print(name)

#Emparejar con zip
for name_age in zip(names,ages):
    print(name_age)

#Desempaquetar la lista

for name_age in zip(names,ages):
    print('{}->{}'.format(names,ages))

while names:print(names.pop())

#FUNCIONES


#print(str_ages)

def pretty_print_list(input_list:list):
    '->'.join(input_list)
    print(input_list)

pretty_print_list(names)
#str_ages
#pretty_print_list(str_ages)

#proc_list[0](names)
#proc_list[0](str_ages)
#proc_list[1](names)
#proc_list[1](str_ages)

class Student:
    color='White'
    def _init_(self, _id, _name, _age):
        self.id=_id
        self.name=_name
        self.age=_age
    def _repr_(self):
        return 'Student({})'.format(self._dict_)

print(Student.color)

#No hay modificadores publicos ni privados

squared_nums=[num**2 for num in range(10)]
print(squared_nums)

student={
    'name':'Gabriela',
    'age':21
}

a=20 if squared_nums[0]==0 else 10

#printer(pretty_print_list, names)
#printer(print, names)

#Validar cedula. Definicion de un Api con los datos: nombre, cedula, fecha de nacimiento, edad y carrera que esta cursando.


