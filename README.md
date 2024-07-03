# Proyecto CineCampus

## Diego Fernando Rueda Baez & Sara Lucia Lozano Rueda

El proyecto **CineCampus** consiste en el desarrollo de una aplicación de gestión de películas para un sistema de cine llamado CineCampus. Esta innovadora aplicación tiene como objetivo centralizar y optimizar la administración de la vasta cantidad de información relacionada con la industria cinematográfica. Permitirá gestionar de manera eficiente y detallada datos sobre películas, actores, formatos, géneros y países.

## Descripción de la Base de Datos

La base de datos de CineCampus está estructurada para cubrir diversos aspectos esenciales de la información cinematográfica. Por ejemplo, la tabla `cinecampus.pelicula` contiene campos para registrar el código interno de la película, su nombre, duración y una sinopsis detallada, lo que permite tener una visión completa de cada título.

### Tablas Principales

- **Películas** (`cinecampus.pelicula`): Almacena el código interno, nombre, duración y sinopsis de las películas.
- **Actores** (`cinecampus.actor`): Registra el nombre, nacionalidad, edad y género del actor, enlazándose con la tabla `cinecampus.genero`.
- **Formatos** (`cinecampus.formato`): Describe los distintos formatos de proyección disponibles.
- **Géneros** (`cinecampus.genero`): Clasifica los diferentes géneros cinematográficos.
- **Países** (`cinecampus.pais`): Registra la procedencia de las películas.
- **Protagonistas** (`cinecampus.peliculaprotagonista`): Relaciona cada película con sus protagonistas y el tipo de actor que representan.
- **Tipos de Actores** (`cinecampus.tipoactor`): Facilita el registro y gestión de los diferentes papeles desempeñados en cada producción.

## Objetivos

1. **Base de Datos MySQL**
    - Crear una base de datos llamada `cinecampus`.
    - Crear las tablas según el DER proporcionado.
    - Poblar las tablas con algunos datos iniciales para pruebas.

2. **Aplicación Java**
    - Utilizar Maven para la gestión de dependencias.
    - Implementar las funcionalidades CRUD para las tablas del sistema.
    - Crear un menú de consola para interactuar con el usuario.

## Requisitos

### Base de Datos MySQL

1. Crear una base de datos llamada `cinecampus`.
2. Crear las tablas según el DER proporcionado.
3. Poblar las tablas con algunos datos iniciales para pruebas.

### Aplicación Java

1. Utilizar Maven para la gestión de dependencias.
2. Implementar las funcionalidades CRUD para las tablas del sistema.
3. Crear un menú de consola para interactuar con el usuario.

## Casos de Uso

### Caso de Uso 1: Gestión de Actores

**Descripción:** Permitir al usuario agregar, editar, eliminar y listar actores.

**Flujo Principal:**
1. El usuario selecciona la opción "Gestionar Actores" en el menú principal.
2. El sistema muestra las opciones:
    - Agregar Actor.
    - Editar Actor.
    - Eliminar Actor.
    - Listar Actores.

### Caso de Uso 2: Gestión de Películas

**Descripción:** Permitir al usuario agregar, editar, eliminar y listar películas.

**Flujo Principal:**
1. El usuario selecciona la opción "Gestionar Películas" en el menú principal.
2. El sistema muestra las opciones:
    - Agregar Película.
    - Editar Película.
    - Eliminar Película.
    - Listar Películas.

### Caso de Uso 3: Gestión de Formatos

**Descripción:** Permitir al usuario agregar, editar, eliminar y listar formatos.

**Flujo Principal:**
1. El usuario selecciona la opción "Gestionar Formatos" en el menú principal.
2. El sistema muestra las opciones:
    - Agregar Formato.
    - Editar Formato.
    - Eliminar Formato.
    - Listar Formatos.

### Caso de Uso 4: Asignación de Actores a Películas

**Descripción:** Permitir al usuario asignar actores a las películas y definir sus roles.

**Flujo Principal:**
1. El usuario selecciona la opción "Asignar Actores a Películas" en el menú principal.
2. El sistema muestra una lista de películas registradas.
3. El usuario selecciona una película de la lista.
4. El sistema muestra una lista de actores y permite asignarles roles.

### Caso de Uso 5: Gestión de Géneros

**Descripción:** Permitir al usuario agregar, editar, eliminar y listar géneros.

**Flujo Principal:**
1. El usuario selecciona la opción "Gestionar Géneros" en el menú principal.
2. El sistema muestra las opciones:
    - Agregar Género.
    - Editar Género.
    - Eliminar Género.
    - Listar Géneros.

**Extensiones:**
- Si el usuario decide agregar un nuevo género, el sistema muestra un formulario para ingresar los datos del nuevo género.
- Si el usuario decide editar un género, el sistema muestra un formulario con los datos actuales del género para su modificación.
- Si el usuario decide eliminar un género, el sistema solicita confirmación antes de proceder.

### Caso de Uso 6: Gestión de Países

**Descripción:** Permitir al usuario agregar, editar, eliminar y listar países.

**Flujo Principal:**
1. El usuario selecciona la opción "Gestionar Países" en el menú principal.
2. El sistema muestra las opciones:
    - Agregar País.
    - Editar País.
    - Eliminar País.
    - Listar Países.

**Extensiones:**
- Si el usuario decide agregar un nuevo país, el sistema muestra un formulario para ingresar los datos del nuevo país.
- Si el usuario decide editar un país, el sistema muestra un formulario con los datos actuales del país para su modificación.
- Si el usuario decide eliminar un país, el sistema solicita confirmación antes de proceder.

### Caso de Uso 7: Gestión de Tipos de Actores

**Descripción:** Permitir al usuario agregar, editar, eliminar y listar tipos de actores.

**Flujo Principal:**
1. El usuario selecciona la opción "Gestionar Tipos de Actores" en el menú principal.
2. El sistema muestra las opciones:
    - Agregar Tipo de Actor.
    - Editar Tipo de Actor.
    - Eliminar Tipo de Actor.
    - Listar Tipos de Actores.

**Extensiones:**
- Si el usuario decide agregar un nuevo tipo de actor, el sistema muestra un formulario para ingresar los datos del nuevo tipo de actor.
- Si el usuario decide editar un tipo de actor, el sistema muestra un formulario con los datos actuales del tipo de actor para su modificación.
- Si el usuario decide eliminar un tipo de actor, el sistema solicita confirmación antes de proceder.

### Caso de Uso 8: Consulta de Información Detallada de una Película

**Descripción:** Permitir al usuario consultar la información detallada de una película, incluyendo actores, formatos, y otros detalles relacionados.

**Flujo Principal:**
1. El usuario selecciona la opción "Consultar Información Detallada de una Película" en el menú principal.
2. El sistema muestra una lista de películas registradas.
3. El usuario selecciona una película de la lista.
4. El sistema muestra los detalles de la película seleccionada, incluyendo los actores que participan, los formatos disponibles, y otros detalles relacionados.

**Extensiones:**
- Si el usuario selecciona una película, el sistema muestra una vista detallada con toda la información relacionada con esa película.

### Caso de Uso 9: Listar Actores por Película

**Descripción:** Permitir al usuario listar los actores que participan en una película específica.

**Flujo Principal:**
1. El usuario selecciona la opción "Listar Actores por Película" en el menú principal.
2. El sistema muestra una lista de películas registradas.
3. El usuario selecciona una película de la lista.
4. El sistema muestra una lista de actores que participan en la película seleccionada.

## Criterios de Evaluación

### Gestión de Actores

1. **Agregar Actor**
    - El sistema permite agregar un nuevo actor con todos los campos requeridos (nombre, nacionalidad, edad, género).
    - Los datos del nuevo actor se guardan correctamente en la base de datos.
    - Se muestra un mensaje de confirmación tras agregar el actor.
2. **Editar Actor**
    - El sistema permite editar los datos de un actor existente.
    - Los cambios se guardan correctamente en la base de datos.
    - Se muestra un mensaje de confirmación tras editar el actor.
3. **Eliminar Actor**
    - El sistema permite eliminar un actor existente.
    - El actor se elimina correctamente de la base de datos.
    - Se muestra un mensaje de confirmación tras eliminar el actor.
4. **Listar Actores**
    - El sistema muestra una lista de todos los actores registrados.
    - La lista incluye todos los detalles relevantes de los actores.

### Gestión de Películas

1. **Agregar Película**
    - El sistema permite agregar una nueva película con todos los campos requeridos (código interno, nombre, duración, sinopsis).
    - Los datos de la nueva película se guardan correctamente en la base de datos.
    - Se muestra un mensaje de confirmación tras agregar la película.
2. **Editar Película**
    - El sistema permite editar los datos de una película existente.
    - Los cambios se guardan correctamente en la base de datos.
    - Se muestra un mensaje de confirmación tras editar la película.
3. **Eliminar Película**
    - El sistema permite eliminar una película existente.
    - La película se elimina correctamente de la base de datos.
    - Se muestra un mensaje de confirmación tras eliminar la película.
4. **Listar Películas**
    - El sistema muestra una lista de todas las películas registradas.
    - La lista incluye todos los detalles relevantes de las películas.

### Gestión de Formatos

1. **Agregar Formato**
    - El sistema permite agregar un nuevo formato con la descripción correspondiente.
    - Los datos del nuevo formato se guardan correctamente en la base de datos.
    - Se muestra un mensaje de confirmación tras agregar el formato.
2. **Editar Formato**
    - El sistema permite editar la descripción de un formato existente.
    - Los cambios se guardan correctamente en la base de datos.
    - Se muestra un mensaje de confirmación tras editar el formato.
3. **Eliminar Formato**
    - El sistema permite eliminar un formato existente.
    - El formato se elimina correctamente de la base de datos.
    - Se muestra un mensaje de confirmación tras eliminar el formato.
4. **Listar Formatos**
    - El sistema muestra una lista de todos los formatos registrados.
    - La lista incluye todas las descripciones de los formatos.

### Asignación de Actores a Películas

1. **Asignar Actores a Películas**
    - El sistema permite seleccionar una película y asignarle actores.
    - El sistema permite definir el rol del actor en la película.
    - Los datos de asignación se guardan correctamente en la base de datos.
    - Se muestra un mensaje de confirmación tras asignar el actor a la película.
2. **Editar Asignación de Actor a Película**
    - El sistema permite editar la asignación de un actor a una película.
    - Los cambios se guardan correctamente en la base de datos.
    - Se muestra un mensaje de confirmación tras editar la asignación.
3. **Eliminar Asignación de Actor a Película**
    - El sistema permite eliminar la asignación de un actor a una película.
    - La asignación se elimina correctamente de la base de datos.
    - Se muestra un mensaje de confirmación tras eliminar la asignación.

### Gestión de Géneros

1. **Agregar Género**
    - El sistema permite agregar un nuevo género con la descripción correspondiente.
    - Los datos del nuevo género se guardan correctamente en la base de datos.
    - Se muestra un mensaje de confirmación tras agregar el género.
2. **Editar Género**
    - El sistema permite editar la descripción de un género existente.
    - Los cambios se guardan correctamente en la base de datos.
    - Se muestra un mensaje de confirmación tras editar el género.
3. **Eliminar Género**
    - El sistema permite eliminar un género existente.
    - El género se elimina correctamente de la base de datos.
    - Se muestra un mensaje de confirmación tras eliminar el género.
4. **Listar Géneros**
    - El sistema muestra una lista de todos los géneros registrados.
    - La lista incluye todas las descripciones de los géneros.

### Gestión de Países

1. **Agregar País**
    - El sistema permite agregar un nuevo país con la descripción correspondiente.
    - Los datos del nuevo país se guardan correctamente en la base de datos.
    - Se muestra un mensaje de confirmación tras agregar el país.
2. **Editar País**
    - El sistema permite editar la descripción de un país existente.
    - Los cambios se guardan correctamente en la base de datos.
    - Se muestra un mensaje de confirmación tras editar el país.
3. **Eliminar País**
    - El sistema permite eliminar un país existente.
    - El país se elimina correctamente de la base de datos.
    - Se muestra un mensaje de confirmación tras eliminar el país.
4. **Listar Países**
    - El sistema muestra una lista de todos los países registrados.
    - La lista incluye todas las descripciones de los países.

### Gestión de Tipos de Actores

1. **Agregar Tipo de Actor**
    - El sistema permite agregar un nuevo tipo de actor con la descripción correspondiente.
    - Los datos del nuevo tipo de actor se guardan correctamente en la base de datos.
    - Se muestra un mensaje de confirmación tras agregar el tipo de actor.
2. **Editar Tipo de Actor**
    - El sistema permite editar la descripción de un tipo de actor existente.
    - Los cambios se guardan correctamente en la base de datos.
    - Se muestra un mensaje de confirmación tras editar el tipo de actor.
3. **Eliminar Tipo de Actor**
    - El sistema permite eliminar un tipo de actor existente.
    - El tipo de actor se elimina correctamente de la base de datos.
    - Se muestra un mensaje de confirmación tras eliminar el tipo de actor.
4. **Listar Tipos de Actores**
    - El sistema muestra una lista de todos los tipos de actores registrados.
    - La lista incluye todas las descripciones de los tipos de actores.

### Consulta de Información Detallada de una Película

1. **Consultar Información Detallada de una Película**
    - El sistema permite seleccionar una película de la lista de películas registradas.
    - El sistema muestra todos los detalles de la película seleccionada, incluyendo actores, formatos, y otros datos relacionados.
    - La información mostrada es correcta y está completa.

### Listar Actores por Película

1. **Listar Actores por Película**
    - El sistema permite seleccionar una película de la lista de películas registradas.
    - El sistema muestra una lista de actores que participan en la película seleccionada.
    - La información mostrada es correcta y está completa.
