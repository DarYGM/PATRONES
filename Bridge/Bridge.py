
# clase Abstracción
class ReproductorMultimedia:
    def __init__(self, codec):
        self.codec = codec
    
    def reproducir(self):
        self.codec.reproducir_archivo()

# clase Implementation
class CodecImplementor:
    def reproducir_archivo(self):
        pass

# ConcreteImplementor 
class CodecMP4(CodecImplementor):
    def reproducir_archivo(self):
        print("Reproduciendo archivo MP4.")

class CodecAVI(CodecImplementor):
    def reproducir_archivo(self):
        print("Reproduciendo archivo AVI.")

#RefinedAbstraction 
class ReproductorAvanzado(ReproductorMultimedia):
    def pausar(self):
        print("Video en pausa.")


codec_mp4 = CodecMP4()
reproductor = ReproductorMultimedia(codec_mp4)
reproductor.reproducir()  # Salida: "Reproduciendo archivo MP4."

