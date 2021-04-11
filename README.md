# Projet calculatrice RPN/pattern Command
### Fait par: HAAFFAR Mohammed et HAMIDI Oussama

## Choix n° 1 : Projet avec JDK11 et maven
### Pourquoi le maven ?
On a utilisé dans ce projet manevn comme un outil de gestion et d'automatisation de production des projets logiciels Java en général et Java EE en particulier. Il est utilisé pour automatiser l'intégration continue lors d'un développement de logiciel. Maven est géré par l'organisation Apache Software Foundation. L'outil était précédemment une branche de l'organisation Jakarta Project.

L'objectif recherché est de produire un logiciel à partir de ses sources, en optimisant les tâches réalisées à cette fin et en garantissant le bon ordre de fabrication.


### Pourquoi le JDK 11 ?
Notre choix de JDK 11 est lié à les fonctionnalités importantes de Java 11 sont:

    -  Exécution d'un fichier Java avec une seule commande
    -  Nouvelles méthodes utilitaires dans la classe String
    - Syntaxe de variable locale pour les paramètres Lambda
    - Contrôle d'accès basé sur l'imbrication
    - JEP 321: client HTTP
    - Lecture / écriture de chaînes vers et depuis les fichiers
    - JEP 328: Enregistreur de vol 

## Choix n° 2 : Junit 4
### Pourquoi le Junit 4 ?
JUnit est un framework open source pour le développement et l'exécution de tests unitaires automatisables. Le principal intérêt est de s'assurer que le code 
répond toujours aux besoins même après d'éventuelles modifications. Plus généralement, ce type de tests est appelé tests unitaires de non-régression.


## Choix n° 3: Les tests Selenium avec Maven
### Pourquoi le plugin Selenium ?
Selenium regroupe une suite d’outils permettant de tester des applications web. Tout comme les tests unitaires, Selenium permet notamment de vérifier la non-régression d’une application et est un gage de qualité supplémentaire. Bien que la création des tests Selenium soit relativement simple, automatiser leur exécution sur un serveur d’intégration continue reste complexe à mettre en œuvre. 
Je vous propose une solution avec l’outil de build Maven

Pour executer les testes, tapez dans le terminal:

```bash
mvn test
```
## Choix n° 4: Checkstyle
### C'est quoi le checkstyle? Quel sont les objectifs de Checkstyle?
Le plugin Checkstyle génère un rapport concernant le style de code utilisé par les développeurs. Pour plus d'informations sur Checkstyle.

Le plugin Checkstyle a trois objectifs:
- checkstyle: checkstyle est un objectif de rapport qui effectue une analyse Checkstyle et génère un rapport sur les violations.
- checkstyle: checkstyle-aggregate est un objectif de rapport qui effectue une analyse Checkstyle et génère un rapport HTML agrégé sur les violations dans une construction de réacteur multi-module.
- checkstyle: check est un objectif qui effectue une analyse Checkstyle et génère des violations ou un nombre de violations sur la console, ce qui peut potentiellement échouer la construction. Il peut également être configuré pour réutiliser une analyse antérieure. 

# Conception de projet
## La classe de Command de Structure de (Command)
Dans notre projet cette classe est appelé "Command" c'est une classe absract. 

## La classe de Concraite Command de Structure de (Command)
Dans notre projet les classe qui représente cette partie sont: "Add, Subtract, Multiply, Divide, Accept, Undo, Quit".

## La classe de Receiver de Structure de (Command)
Dans notre projet cette classe est appelé "Interpreter" c'est une classe absract. 

## La classe de Invocker de Structure de (Command)
Dans notre projet cette classe est appelé "MoteurRPN" c'est une classe absract. 