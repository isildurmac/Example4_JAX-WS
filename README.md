Example4_JAX-WS
===============

Proyecto de ejemplo de desarrollo de un servicio web jax-ws con CXF y seguridad UserNameToken

Se crea un proyecto mavven mutimodulo para el desarrollo de un servicio web con CXF y seguridad a nivel de transporte SSL
con un token de usuario y contraseña incluido en el header.
Se tiene un módulo para el componente que contendría la lógica de negocio del servicio, un módulo para la aplicación web que
expone el servicio y un módulo para un cliente del servicio que puede ser usado como prueba.

Para empezar luego de descargarlo basta con dar un mvn clean install y se tendrá la aplicación web a desplegar en un
contenedor como Apache Tomcat
