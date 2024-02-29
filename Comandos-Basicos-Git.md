-    ## Comandos que posiblemente te sirvan a futuro
        
        ### Configuración inicial
        
        Después de haber instalado git, debes configurar tu Nickname y correo electrónico, esto es importante por que git necesita identificar tus cambios en los proyectos:
        
        ```bash
        //En terminal, puedes realizar un comando a la vez
        //Comando 1
        git config --global user.name "NickName"
        //Comando 2
        git config --global user.email "Your@Email.anything"
        ```
        
        ### Comandos básicos
        
        1. ********************************************Inicial un repositorio********************************************
            
            Para comenzar a rastrear un proyecto, dirígete a la carpeta raíz de tu proyecto y abre la terminal de `Git Bash`
            
            ```bash
            git init
            ```
            
            Esto crear una carpeta escondida en tu proyecto donde git podrá ir guardando todos los cambios que hagas en tu proyecto.
            
        2. ******************************************Clonar un repositorio******************************************
            
            Si ya tienes un proyecto creado en algún repositorio, puedes ****************clonarlo**************** en tu equipo con el siguiente comando:
            
            ```bash
            git clone URL_DEL_REPOSITORIO123456
            ```
            
            Recuerda que debes saber en que parte de tu equipo estas clonando tu nuevo repositorio.
            
        3. **************************Ver el estado**************************
            
            Al estar trabajando ya con un repositorio es recomendable que verifiques el estado de tus archivos:
            
            ```bash
            git status
            ```
            
            Esto mostrara una lista de archivos modificados y una lista de archivos salvados, esto para que te hagas una idea de con que archivos has estado trabajando últimamente.
            
        4. ****************************Anadir cambios****************************
            
            Después de haber verificado el estado de tus proyecto debes guardarlos en ******staging area \ Area de preparación:******
            
            ```bash
            git add File_Name
            ```
            
            Esto es con el objetivo de que no pierdas tus avances en tu equipo local.
            
        5. ******Confirmar cambios****** 
            
            Debes confirmar tus cambios con un mensaje descriptivo:
            
            ```bash
            git commit -m "Mensaje bonito"
            ```
            
            Esto con la finalidad que otros programadores sepan en que estuviste trabajando en ese momento.
            
        6. ******Ramas (branches)******
            
            Las ramas crean una copia de tu proyecto en el estado actual, esto nos sirve para desarrollar, testear e implementar funciones de nuestro código de manera segura sin correr el peligro de dañar nuestro trabajo:
            
            ```bash
            git branch branch_Name
            ```
            
            Es posible que existan mas de una rama en un repositorio, puedes cambiar de rama de esta manera:
            
            ```bash
            git checkout branch_Name
            ```
            
        7. ****************Enlazarte a un repositorio remoto****************
            
            En algún punto es posible que el objetivo de una rama ya se haya cumplido, así que sera necesario traer ese trabajo a la rama principal en este caso **master,** esto es el proceso de fusión de ramas conocido como **merge,** futuros dolores de cabeza nos esperan cuando ya tocamos este tema; de momento me limito a mostrarte el comando básico:
            
            ```bash
            git merge branch_Name
            ```
            
        8. **Repositorios remotos**
            
            Ya mencionamos a lo largo de este tutorial, que git nos permite trabajar en equipo, así que en algún punto deberemos enlazarnos a un repositorio remoto. Aquí los comandos básicos para realizar esta tarea:
            
            ```bash
            // Registra un repositorio remoto
            git remote add origin URL_DEL_REPOSITORIO
            // Extrae los ultimos cambios realizados en el repositorio remoto
            git pull -u origin  branch_Name
            // Sube los cambios que hayas confirmado en tu repositorio local 
            git push -u origin  branch_Name
            ```
            
            Si tienes alguna dura, recuerda que al momento de crear un repositorio Github nos proporciona una serie de comandos para que nos sea mas fácil enlazarnos o subir nuestros archivos o proyectos a un repositorio remoto.  
            
            [https://github.com/REMR11/qyerfdw](https://github.com/REMR11/qyerfdw)
            
            Hasta aquí nuestro pequeño tutorial, espero no haberte aburrido y que te sirva para iniciar en la plataforma.
    -

    ### ¿Que es Github? 
