Muy bien, eld ia de hoy son ejercicios para acabar el módulo de flujo de control, asi que aqui mando el eneunciado del 
ejercicio:

Para la tarea se requiere un menú para administrar a los productos con las opciones: actualizar, eliminar, crear, listar y salir.

Para la clase con el método main vamos a contar con un menú para poder seleccionar el tipo de operación, puede ser con la clase Scanner indicando una lista con las opciones, cada opción asociada a un numero.

O bien! otra forma mucho mejor seria usando la clase JOptionPane para un menú con interfaces graficas de la siguiente forma:

    int opcionIndice = 0;
    ...
     
    // los Map (o mapas) los veremos mas adelante en el curso en profundidad
    // pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
    // también se les conoce como diccionarios para almacenar datos en base a un nombre.
    Map<String, Integer> opciones = new HashMap();
    opciones.put("Actualizar", 1);
    opciones.put("Eliminar", 2);
    opciones.put("Agregar", 3);
    opciones.put("Listar", 4);
    opciones.put("Salir", 5);
     
    Object[] opArreglo = opciones.keySet().toArray();
     
    Object opcion = JOptionPane.showInputDialog(null,
                        "Seleccione un Opción", 
                         "Mantenedor de Productos", 
                         JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);
     
    if (opcion == null) {
        JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
    } else {
        opcionIndice = opciones.get(opcion.toString());
    	
       // aca un if o switch para las distintas opciones.
    }


Según el número ingresado usar un if o switch para implementar cada una de las 4 operaciones y 5 para salir.

Dentro de cada sentencia o switch imprimir un texto relacionado a la opción, por ejemplo para actualizar:

JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");

o mediante sout en consola:

System.out.println("Usuario actualizado correctamente");

Para eliminar el mensaje "Usuario eliminado correctamente" y así sucesivamente dependiendo de la opción.

Usar un do while para iterar hasta que la opción sea salir, cada vez que se selecciona una operación distinta a salir, al finalizar con dicha operación debe volver al menú para continuar con otra, al finalizar con la opción salir (5) se debe mostrar el mensaje "Haz salido con exito!" y finalizar el programa.


Teniendo en cuenta que estaba bastante largo este código, decidi usar mi cabeza ajjajaa, mentiris, bueno decidi primero pensar
en español el objetivo del codigo, que es lo que se quiere llegar, que datos tengo y que debe de tener el codigo, claramente 
haciendo su respectivo pseudocodigo (puede que sea un poquito perdida de tiempo, pero para el pseudocoigo es necesario para 
entender el proposito del ejercicio)

como sea, continuaba en mi busqueda, pero no sabia como comenzar, creo que era un codigo un poco largo y no sabia como 
empezarlo, osea, sabia como hacerlo, o al menos tenia una idea, el problema es que no sabia muy bien como interpretarla

asi que decidi que lo mejor era que usara mi profe virtual, no te preocupes, mira te muestro incluso el prompt en el que fui 
muy espcifica de que no quiero que me de el codigo, solo que me de como un pequeño empujon por asi decirlo para que logre 
terminarlo por mis propios medios y conocmientos, obviamente tambien aprendiendo, le dije que si me equivocaba que no me diera 
el codigo, si no que me explicara a base de preguntas el por que esta mal lo que estoy haciendo, el esta mas bien como supervisando
nada mas, y me ayudo a mirar mejor la parte logica y usar metodos que no tenia pensandos usar, asi que bueno 

por ahora hoy hice eso, por que ya estaba cansada,y ya mañana podre terminar el codigo mucho mas tranquila, y si quieres 
aqui dejo el primer prompt de como le pedi que me ayudara 

_hola, recuerdas que estoy aprendiendo java? bueno en este caso en mi clase nos pusieron un ejercicio pero es un poco grande,
o al menos eso considero, por ello, quiero que me guies, pero no que me lo hagas, es decir, se como mi profesor, ayudame 
paso a paso, como deberia ir llevando este codigo hasta lograr terminarlo, enseñandome en el transcurso, 
como preguntandome que deberia de continuar o que funcion usar, bueno creo que ya me entiendes_

