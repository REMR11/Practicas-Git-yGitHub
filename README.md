# Practicas-Git-y-GitHub

## Git y Github

#### indice
- [Primeros pasos en git]( #primeros-pasos-en-git)
    - [¿Que es git?]( #tutorial-de-introducción-a-git)
    - [Instalacion]( #instalación)
    
- [Primeros pasos en github ](#)
    - [¿Que es Girhub?](#)
- [comandos que posiblemente te sirvan a futuro](Comandos-Basicos-Git.md)


### Primeros pasos en git

-    
    # Tutorial de introducción a git
    
    **¿Que es git?**
    
    En esencia git es un sistema de control de versiones muy popular para dar seguimiento a proyectos de desarrollo de software hoy en día. Creo que hoy en día es una herramienta indispensable  para colaborar en equipos de programación ya que nos permite crear copias o versiones de nuestros proyecto y darles un seguimiento claro en cada uno de los cambios que sufre a lo largo del desarrollo. Espero que este tutorial te ayude a familiarizarte con los conceptos básicos y comandos esenciales  de Git.
    
    ### Instalación
    
    Sospecho que utilizas **windows** para trabajos de universidad, así que aquí tienes unos cuantos pasos para la descarga. ********************************************Si en tu instalación, aparece alguna ventana adicional, presiona aceptar / si / siguiente.********************************************
    
    1. Visitamos [https://git-scm.com/download/win](https://git-scm.com/download/win).
    2. Descarga el instalador correspondiente a tu sistema operativo.
    3. Ejecuta el instalador en tu equipo y sigue los pasos que te muestra tu instalador
        
        En la primera pantalla nos informa sobre el tipo de licencia que tiene git
        
        ![Untitled](Git%20y%20Github%20d5f4e889c55e4e51b9ab5e972a1abff0/Untitled.png)
        
        En la segunda pantalla creo importante resaltar esta parte, aquí nos muestra los programas que se instalaran con git, en este caso tenemos **Git Bash** (Nuestra terminal de linea de comando, recomiendo que te familiarices con ella lo antes posible), ******************Git GUI****************** (una interfaz grafica para el control de git). 
        
        ![Untitled](Git%20y%20Github%20d5f4e889c55e4e51b9ab5e972a1abff0/Untitled%201.png)
        
        en el día a día, yo normalmente solo ocupo la terminal. así que solo selecciono esa opción.
        
        La siguiente pestaña nos pregunta que editor de texto nos gustaría ocupar para cuando realicemos algunos comandos en git, por defecto viene Vim y en experiencia propia, si es posible ocupa un editor de código con el que estés familiarizado, ocupado en lugar de Vim, en este caso te sugiero ocupar VS Code
        
        ![Untitled](Git%20y%20Github%20d5f4e889c55e4e51b9ab5e972a1abff0/Untitled%202.png)
        
        Aunque si eres valiente, selecciona vim y vive una gran experiencia.
        
        ![Untitled](Git%20y%20Github%20d5f4e889c55e4e51b9ab5e972a1abff0/Untitled%203.png)
        
        En la siguiente ventana nos pregunta como queremos llamar a nuestra rama principal (el tema de ramas, posiblemente lo veas en el futuro), ya que este tutorial esta alojado en Github, he de decirte por defecto debes utilizar la rama `main` en proyectos de Github. asi que para este paso selecciona la segunda opcion.
        
        ![Untitled](Git%20y%20Github%20d5f4e889c55e4e51b9ab5e972a1abff0/Untitled%204.png)
        
        Esta ventana nos muestra que programas podrán utilizar git, en este caso usamos la opción recomendada por defecto.
        
        ![Untitled](Git%20y%20Github%20d5f4e889c55e4e51b9ab5e972a1abff0/Untitled%205.png)
        
        Aquí nos pregunta que librería nos gustaría ocupar para la conexión de nuestra maquina remota hacia repositorios externos, en este caso ocupamos la librería por defecto, para evitar problemas a futuro 
        
        ![Untitled](Git%20y%20Github%20d5f4e889c55e4e51b9ab5e972a1abff0/Untitled%206.png)
        
        A futuro es posible que te encuentres trabajando con personas que utilicen un sistema operativo diferente y algunas cosas como los saltos de linear tengan un conflicto por esta diferencia de sistemas, lo recomendable es que git se encargue de convertir cualquier estilo a Unix-Style que es como el estándar para esto. 
        
        ![Untitled](Git%20y%20Github%20d5f4e889c55e4e51b9ab5e972a1abff0/Untitled%207.png)
        
        Aquí nos pregunta sobre que deberia hacer por defecto al momento que nosotros hagamos un `Git pull` este es un comando de git que veras a futuro. por defecto utilizamos `fast-forward` ya que es lo que normalmente necesitamos en esas situaciones. 
        
        ![Untitled](Git%20y%20Github%20d5f4e889c55e4e51b9ab5e972a1abff0/Untitled%208.png)
        
        Aquí nos pregunta sobre como queremos chequear nuestras credenciales al momento de enlazarnos a un repositorio remoto, en este caso lo dejamos por defecto.
        
        ![Untitled](Git%20y%20Github%20d5f4e889c55e4e51b9ab5e972a1abff0/Untitled%209.png)
        
        Las siguientes ventanas nos sugieren opciones que aun están en fase experimental, así que las ignoramos, hasta llegar al instalador.
        
        ![Untitled](Git%20y%20Github%20d5f4e889c55e4e51b9ab5e972a1abff0/Untitled%2010.png)
        
        Estando aquí, solo seleccionamos **Lauch Git Bash.**
        
        ![Untitled](Git%20y%20Github%20d5f4e889c55e4e51b9ab5e972a1abff0/Untitled%2011.png)
        
        Listo, has instalado con éxito tu terminal de git
        
    
    