# Iterator
class IteradorLibro:
    def next(self):
        pass

    def has_next(self):
        pass
# ConcreteIterator 
class IteradorListaLibros(IteradorLibro):
    def __init__(self, lista_libros):
        self.lista_libros = lista_libros
        self.indice = 0

    def next(self):
        libro = self.lista_libros[self.indice]
        self.indice += 1
        return libro

    def has_next(self):
        return self.indice < len(self.lista_libros)

# Aggregate y ConcreteAggregate
class ColeccionLibros:
    def crear_iterador(self):
        pass

class ListaLibros(ColeccionLibros):
    def __init__(self, libros):
        self.libros = libros

    def crear_iterador(self):
        return IteradorListaLibros(self.libros)

#Cliente 
libros = ListaLibros(["Libro Y", "Libro Z", "Libro M", "Libro X"])
iterador = libros.crear_iterador()

while iterador.has_next():
    print(iterador.next())  
    
# Salida: "Libro Y", "Libro Z", "Libro M","Libro X"
