## Réponses aux questions (JOBs)

### JOB 1 — Qu'est‑ce que Spring Initializr et comment peut‑il faciliter la création d'un nouveau projet Spring ?

Spring Initializr est un site qui permet de créer la base d'un projet Java Spring avec les fichiers de configuration comme le fichier `pom.xml`, le `.gitignore` et les autres fichiers de configuration de Maven/Gradle. Ça permet aussi de choisir les dépendances depuis le site et de les mettre dans le fichier `pom.xml` pour que Maven/Gradle les téléchargent.

### JOB 2 — Pourquoi le fichier `pom.xml` est‑il crucial dans un projet Maven ?

Le fichier `pom.xml` détermine les technologies (et versions) utilisées dans le projet. Il contient également les dépendances à télécharger lorsqu'on installe le projet sur une nouvelle machine.

### JOB 3 — Qu'est‑ce qu'un contrôleur dans le contexte de Spring MVC ?

Un contrôleur est une classe annotée qui sert à gérer ce qui se passe sur le site en fonction de l'adresse HTTP. On annote la classe avec `@RestController` avant la définition.

### JOB 4 — Comment Spring permet‑il l'injection de propriétés depuis des fichiers de configuration ?

Avec l'annotation `@Value` on peut charger des valeurs qui sont dans le fichier de configuration `application.yml`.

### JOB 5 — Pourquoi est‑il utile d'avoir différents profils dans une application Spring ?

On peut utiliser plusieurs profils pour par exemple avoir une version « clean » destinée au déploiement et une version `dev` sur laquelle on travaille pour voir les résultats en temps réel. Ça permet aussi de cacher des fonctionnalités sur la version publique et de les réserver à la version de dev (tests, logs).

### JOB 6 — En quoi la dépendance DevTools est‑elle bénéfique pour le développement ?

La dépendance DevTools de Spring Boot permet de build à chaque modification dans les fichiers. Cela fait gagner beaucoup de temps lors du développement car on n'a pas besoin de retaper les commandes pour rebuild et relancer le projet pour voir les modifications.