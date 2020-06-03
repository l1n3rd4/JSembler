# Pré-requisitos
1. Instalar o [java] na versão `1.8.0_121`
2. Instalar Gradle versão `6.4.1`

#Instalando Java
##Windows
```
Escolha windows x64: 
https://www.oracle.com/java/technologies/javase-jdk8-downloads.html
```
#Instalando Gradle
##MacOS
```brew install gradle```
#Linux
##Debian based distros
```sudo apt-get install gradle```
#Arch based distros
```sudo pacman -S gradle```

# Como fazer build
##LINUX
```
cd $WORKDIR
git clone https://github.com/l1n3rd4/JSembler.git
cd JSembler
gradle clean build
```
depois 
```
cd build/libs/ 
java -jar JSembler.jar [arquivo-input][arquivo-output]
```



