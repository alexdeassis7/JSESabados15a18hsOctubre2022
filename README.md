# JSESabados15a18hsOctubre2022

# Novedades Java 11

-comencemos aclarando que hace un tiempo java al igual que otras tecnologias como angular sacan versiones cada 6 meses
desde Java SE 9 que las actualizaciones ocurren cada 6 meses, pero bueno tambien estan las versiones LTS
(Long Time Support)que tienen mantenimiento por varios años,antes las versiones tardaban de 2 q 3 años en salir


novedad grande de java 9 es el tema de el sistema de modulos que nos permite a nosotros crear app modulares lo cual ademas esta
implementado dentro del mismo jdk 9 

java 10 cambia muy pocas cosas con respecto a la 9 lo mas significativos es el tipo de dato inferido y la palabra
reservada "var" para este uso , seria como un any de .TypeScrip o el var de JavaScript ,java 11 se basa mucho en esto del var


                                      #  diferencias en open jdk y oracle jdk de java 11

- en java 11 open jdk y oracle jdk convergen a una sola base de codigo

-las licencias , ya que jdk de oracle a partir de java 11 no la podes usar jdk oracle gratis en produccion , tenes que entrar a oracle y pagar el soporte ,pero bueno esta la opcion del open jdk free


JAVA 11 es un LTS
- en el que se eliminan tecnologias bastante obsoletas del jdk , esto puede ser bueno pero te
puede afectar un proceso de migracion de app en versiones mas viejas

-no solo se borran tecnologias si no tambien se agregan cosas nuevas como el nuevo httpClient ,


-- se agregan 2 nuevos garbage collectors y mejoras menores


-- la posibilidad de ejecutar codigo sin compilar  :
 podemos ejecutar archivos .java sin usar el compiler , se deja de usar comando "javac hello.java" y usando solo "java "
y podemos crear archivos .java que comienzan !# y se pueden ejecutar como si fueran script sh con parametros , basicamente
podemos hacer un .sh con java y ejecutarlos desde el cmd sin incluso utilizar la palabra java delante jaja esto
nos puede servir tambien para probar fragmentos de codigo sin mucha vuelta o hacer scripteria en java

 # borrado de librerias importantes en java 11 del paquete jse


JAXB java.xml.bind (mapeo de xml a POJO)
JAX-WS java.xml.ws SOAP problemasss
CORBA java.corba
JAX-WS ANOTTATION java.xml.ws.annotation
JTA java.trasaccion
JavaBeans Activation  java .activation

lo bueno que las app que viven en un server java pueden seguir usando las librerias del JEE , ya que estas librerias solo se eliminan
del JSE, lo bueno es que lo podemos agregar por fuera siempre y cuando este disponible la implementacion de alguien
 
 # borrado de metodos importantes

-clase thread se borro el metodo destroy() y stop() ya que son metodos peligrosos

-java.lang.System::runFinalzersOnExit borrado

-java.lang.Runtime::runFinalzersOnExit borrado
8
-lo metodos checkAwtEventQueueAccess , checkSystemClipboardAccess ,checkMemeberAccess ,checkTopLevelWindows estos
estaban en la clase SecurityManager borrados ya que no se usa mas tegnologias de escritorio
 
#  borrado de tecnologia obsoletas importantes
--applet son eliminados es algo re obsoleto  borrado

--java web start borrado

--Nashorn que era un motor de JS  borrado

--el proyecto JavaFX se mueve a fuera del JDK a un proyecto aparte pero se publica todo por maven central repository

# novedades en el lenguaje y en la librerias

-renovaron el http cliente con este nuevo paquete que seria el cambio mayor y perminte web sockect y https  para trabajar

-tenemos  los reactive Streams integration , la api REactive Stremas ofrece para administrar flujos de datos asincronicos  (los producers y consumers )

-la libreria http client de java 9 y 10 era marcada como experimental ahora en java 11  ya forma parte del stardart , las clases mas usadas del http client son send , sendAsync ,Builder , HttpRequest y httpResponse que viene de la epoca de los servlets

-en la clase String y Files  se agregaron metodos nuevos

-se agregaron nuevos caracteres unicode como el del bitcoint

-se agrega la variable "VAR", y su inferencia de tipos

- se hicieron cambios mas a bajo nivel digamos en la jvm con respecto al nest-based access control , que seria la manera que internamente la jvm maneja cosas tipo las clases dentro de clases y
la visivilidad de atributos privados en estos casos , esto ahora ya no se genera dentro de la jvm el metodo bridge que puentea la clase externa de la interna para llegar a los atributo privados en versiones anteriores de la jvm

-despues exitio cambios de mas bajo nivel pero esos la verdad que los via al pasar ya que son cambios mas a nivel jvm como lo de los Dynamic Class-file constants que son basicamente archivos
que permites que sea mas flexible el java a la espera de nueva mejoras en la plataforma


#  mejoras de rendimiento y seguridad del sistema en java 11
    MEJORAS DE RENDIMIENTO :se agregaron 2 garbabe collectors nuevos para mejorar el rendimiento

-el garbaje collector 1 digamos nuevo que se llama Epsilon GC -que en realidad no recoge basura - si habilitamos esto la JVM seguira asignando
memoria hasta que se quede sin memoria , no habra recolecciones de basuras intermedias ni ningun otro proceso relacionado con la administracion de memoria esto
significa que la app se bloqueara cuando se solicite mas memoria de la disponible , entonces ocmo no ahy recoleccion de basura
la memoria de los objetos no utilizados no puede recuperarse, entoces nos puede servir en el caso de tener una app que asigna objetos de manera limitada
y predecible podriamos con Epsilon GC tener un mejor rendimiento digamos que es una configuraciones mas inusual pero con latencias criticas quizas pueda ayudar bastante a
mejorar el rendimiento

-un ejemplo de uso de Epsilon tambien puede ser si programas "short-live" como un script en java 11 que haga algo rapido y no necesite que se recoja basura , otro uso puede
ser durante una prueba de performance testing para acercarnos al rendimiento del codigo real sin la influencia de la Recoleccion de basura , tengamos en cuenta
que epsilon es una caracteristica experimental en java 11

-el garbaje collector 2 digamos nuevo que se llama "Z Garbage Collector" tambien es experimental , lo cual no significa que no sea estable este colector trae
lo que se llaman "Coloured Pointers" que son 4 bits dentro de la referencia  del objeto que se usan para saber el estado de recoleccion de un objeto y
significa que tenemos 4 bit menos para la direccion real del objeto igual asi mismo nos quedan para tener mas direcciones de memoria de las que podriamos utilizar


-para usar cualquiera de los 2 recolectores nuevos deberiamos especificar -XX:+UnlockExperimetalnJVMOptions -XX:UseZGC
 o el -XX:UseEpsilonGC


# MEJORAS DE SEGURIDAD: TLS 1.3

--TLS significa Transport Layer Security y es un protocolo que se utiliza entre otras cosas para el https , aca en esta version 1.3 se quitaron algoritmos
criptograficos inseguros y se agregaron algoritmos  nuevos mas seguros, en java 11 se implementaron varias cosas del TLS nuevo pero no todo ...

--con la mejora de TLS 1.3 podemos tener problema si tenemos una migracion y la app a migra utiliza mecanismos de firmas obsoletos y bueno se tentran que usar
mecanizmos mas nuevo que cumplan la misma funcion
