# Simulación de Ascensor en Java

Este proyecto es una simulación de un sistema de ascensor implementado en Java. El ascensor puede moverse entre pisos y soporta múltiples usuarios simultáneos utilizando hilos para garantizar la sincronización de las operaciones.

---

## 🚀 Características

- **Movimiento sincronizado**: El ascensor puede ser utilizado por múltiples usuarios al mismo tiempo, con un control estricto de acceso mediante hilos y mecanismos de sincronización (`synchronized`, `wait` y `notifyAll`).
- **Validación de piso destino**: Comprueba que el piso ingresado sea válido (dentro de los pisos permitidos).
- **Feedback en tiempo real**: Informa al usuario si el ascensor está subiendo, bajando o si ya se encuentra en el piso seleccionado.
- **Límite de pisos configurables**: El sistema admite una cantidad configurable de pisos totales (por defecto, 20).

---

## 🛠️ Clases principales

### 1. `Ascensor`
Contiene la lógica principal del movimiento del ascensor:
- **Atributos**:
  - `funcionando`: Indica si el ascensor está en uso.
  - `pisoActual`: Piso en el que se encuentra el ascensor.
  - `pisoDestino`: Piso al que se desea mover el ascensor.
  - `pisosTotales`: Límite máximo de pisos permitido.
- **Métodos**:
  - `moverAscensor()`: Método sincronizado que gestiona el movimiento del ascensor entre pisos y valida las entradas del usuario.

### 2. `Usuario`
Implementa la interfaz `Runnable` para simular el uso del ascensor por múltiples usuarios mediante hilos:
- Llama continuamente al método `moverAscensor()` del objeto `Ascensor`.

### 3. `Main`
Clase principal que inicializa el programa:
- Crea una instancia del ascensor.
- Inicia múltiples hilos que representan a los usuarios interactuando con el ascensor.

---

## ⚙️ Cómo usar

1. **Clonar el repositorio o copiar el código fuente**.
2. **Compilar las clases**:
   ```bash
   javac Ascensor.java Usuario.java Main.java
