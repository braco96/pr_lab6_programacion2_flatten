# PR_LAB6_PROGRAMACION2_FLATTEN
**Autor:** Luis Bravo  
**Curso:** 2017–2018  
**Asignatura:** Programación II — Laboratorio 6 (A.E.D.)

## Descripción
Implementación de los métodos `flatNub` y `member` en la clase `Flatten<E>`.  
El objetivo es recorrer una **lista de listas** (`PositionList<PositionList<E>>`) y devolver una lista nueva con **todos los elementos no repetidos** y **en orden de aparición**.

## Funciones principales
- **`boolean member(E elem, PositionList<E> list)`**  
  Devuelve `true` si `list` contiene el elemento `elem`, `false` en caso contrario.

- **`PositionList<E> flatNub(PositionList<PositionList<E>> listOfLists)`**  
  Devuelve una lista “aplanada”, sin repeticiones, conteniendo los elementos de todas las sublistas.

## Reglas del laboratorio
- Uso obligatorio de **iteradores (`java.util.Iterator`)** para implementar ambos métodos.  
- Solo se pueden usar los métodos `iterator`, `addLast`, y `addBefore` de `PositionList`.  
- Es obligatorio usar el método `member` dentro de `flatNub`.  
- Los elementos y sublistas no pueden ser `null`.

## Ejemplos de ejecución
```
flatNub([]) → []
flatNub([[]]) → []
flatNub([[1,2]]) → [1,2]
flatNub([[2,1,2]]) → [2,1]
flatNub([[2],[2],[1]]) → [2,1]
flatNub([[],["hola"],["hi"]]) → ["hola","hi"]
flatNub([[1,2],[],[2,3,4],[8,4]]) → [1,2,3,4,8]
```

## Clases incluidas
- **`Flatten`**: Implementa la lógica principal (`flatNub`, `member`).  
- **`Tester`**: Contiene los casos de prueba oficiales del laboratorio.

## Compilación y ejecución
```bash
mvn clean compile
mvn test
```

## Créditos
Proyecto desarrollado en el contexto del Laboratorio A.E.D. (UPM).  
Guía oficial: `docs/guia.pdf`

— *Luis Bravo*