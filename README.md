# Proyecto Java EE con Maven - "Test JEE"
Este proyecto Java EE con Maven, denominado "Test JEE", es una aplicación web que incluye un servicio REST para enviar saludos y una interfaz de usuario que utiliza PrimeFaces para registrar vehículos.

Requisitos
Asegúrate de tener instalados los siguientes componentes antes de comenzar:

Java Development Kit (JDK) - Versión 8 o superior.
Maven - Para gestionar las dependencias del proyecto.
Wildfly - El servidor de aplicaciones donde se desplegará la aplicación.
Postgres - Utiliza la DDL correspondiente para configurar la base de datos.
Descarga de Recursos
Antes de continuar, descarga los recursos necesarios desde el siguiente enlace: Recursos del proyecto.
https://drive.google.com/drive/folders/1kCTeJvRnv1MNzUzD3-BdbHwfa4DM71gH

Configuración
Clona el repositorio:

shell
Copy code
git clone https://github.com/CuestaSantiago/test_jee
cd test_jee
Configura el servidor Wildfly:

Despliega la aplicación en Wildfly utilizando Maven o copiando el archivo EAR generado en la carpeta de despliegue de Wildfly.
Asegúrate de configurar las credenciales de Wildfly en tu entorno o archivo de configuración.
Configura la base de datos:

Descarga la DDL necesaria desde [este enlace](URL de la DDL de la base de datos).
Ejecuta la DDL en tu base de datos para configurarla correctamente.
Accede a la aplicación:

Abre tu navegador web y navega a la URL donde se encuentra desplegada la aplicación en Wildfly.
Uso
Utiliza la interfaz de usuario para registrar vehículos.
El servicio REST proporciona un saludo y la lista de vehículos (aunque esta característica aún no está disponible).
Credenciales del servidor Wildfly
Usuario: admin
Contraseña: admin
Autor
Santiago Cuesta
