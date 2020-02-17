# Actividad3_8

EJERCICIO3_8
Realiza un programa servidor que escuche en el puerto 44444. Cada vez que se conecte un cliente se creará un nuevo hilo para atenderlo. Se mostrará en la consola del servidor la dirección IP y el puerto remoto del cliente que se conecta y cuando el cliente se desconecte se muestra un mensaje indicado que se ha desconectado.
En el hilo  servidor que atiende al cliente se recibe una cadena de caracteres, si es distinta de “*” se enviará la cadena de nuevo al cliente convertida a mayúsculas.

En el programa cliente se muestra una pantalla donde el cliente recibe una cadena por teclado y al pulsar el botón Enviar aparecerá debajo la cadena en mayúsculas. El botón Limpiar limpia los dos campos y el botón Salir envía un”*” al servidor y finaliza la ejecución del cliente. Si la cadena que envía el cliente es un”*” también finaliza la ejecución.
