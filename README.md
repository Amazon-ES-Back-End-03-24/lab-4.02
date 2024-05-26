# LAB | Java Introducción a Spring Boot

## Introducción

Acabamos de aprender cómo crear GET, así como cómo manejar parámetros de consulta y variables de ruta en las solicitudes GET, así que practiquemos un poco más.

<br>

## Requisitos

1. Haz un fork de este repositorio.
2. Clona este repositorio.
3. Añade a tu instructor y a los calificadores de la clase como colaboradores de tu repositorio. Si no estás seguro de quiénes son los calificadores de tu clase, pregunta a tu instructor o consulta la presentación del primer día.
4. En el repositorio, crea un proyecto de Java y añade el código para las siguientes tareas.

## Entrega

Una vez que termines la tarea, envía un enlace URL a tu repositorio o tu solicitud de extracción en el campo de abajo.

<br>

## Configuración

Para esta práctica, deberás crear dos tablas de base de datos y añadir algunos datos de muestra. Los datos de la base de datos representan clientes ficticios para un hospital multi-ciudad.

### **Puedes ver el sql script para insertarlo [aquí](./src/main/resources/data.sql).**


<br>

Employee Table (Tabla de empleados)

| employee_id | department  | name            | status  |
| ----------- | ----------- | --------------- | ------- |
| 356712      | cardiology  | Alonso Flores   | ON_CALL |
| 564134      | immunology  | Sam Ortega      | ON      |
| 761527      | cardiology  | German Ruiz     | OFF     |
| 166552      | pulmonary   | Maria Lin       | ON      |
| 156545      | orthopaedic | Paolo Rodriguez | ON_CALL |
| 172456      | psychiatric | John Paul Armes | OFF     |

<br>

*Ten en cuenta que `admitted_by` es una clave externa a la tabla de empleados.*

<br>

Patient Table (Tabla de pacientes)

| patient_id | name              | date_of_birth | admitted_by |
| ---------- | ----------------- | ------------- | ----------- |
| 1          | Jaime Jordan      | 1984-03-02    | 564134      |
| 2          | Marian Garcia     | 1972-01-12    | 564134      |
| 3          | Julia Dusterdieck | 1954-06-11    | 356712      |
| 4          | Steve McDuck      | 1931-11-10    | 761527      |
| 5          | Marian Garcia     | 1999-02-15    | 172456      |

<br>

## Instrucciones

1. **Obtener todos los médicos** (doctors): Crear una ruta para obtener todos los médicos.
2. **Obtener médico por ID**: Crear una ruta para obtener un médico por `employee_id`.
3. **Obtener médicos por estado** (status): Crear una ruta para obtener médicos por `status`.
4. **Obtener médicos por departamento**: Crear una ruta para obtener médicos por `department`.
5. **Obtener todos los pacientes**: Crear una ruta para obtener todos los pacientes.
6. **Obtener paciente por ID**: Crear una ruta para obtener un paciente por `patient_id`.
7. **Obtener pacientes por rango de fecha de nacimiento**: Crear una ruta para obtener pacientes con fecha de nacimiento dentro de un rango especificado.
8. **Obtener pacientes por departamento del médico que los admitió**: Crear una ruta para obtener pacientes por el departamento en el que se encuentra el médico que los admitió (por ejemplo, obtener todos los pacientes admitidos por un médico en cardiología).
9. **Obtener todos los pacientes con un médico cuyo estado es OFF**: Crear una ruta para obtener todos los pacientes con un médico cuyo `status` sea OFF.

<br>