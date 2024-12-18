# Projet Spring Boot - Shop Application

Ce projet est une application Spring Boot modulaire nommée **Shop Application**. Ce document fournit les instructions pour configurer, compiler et démarrer le projet.

## Prérequis

Assurez-vous que les outils suivants sont installés sur votre machine :

- [Java 17 ou supérieur](https://adoptium.net/)
- [Maven 3.8+](https://maven.apache.org/download.cgi)
- Un IDE tel que IntelliJ IDEA ou Eclipse (optionnel)

## Configuration

1. **Vérifiez Java et Maven** :

   ```bash
   java -version
   mvn -version
   ```

   Ces commandes doivent retourner les versions installées. Assurez-vous que la version de Java est 17 ou supérieure.

2. **Clonez le dépôt :**

   ```bash
git clone <URL_DU_DEPOT>
cd <REPERTOIRE_DU_PROJET>
   ```

3. **Vérifiez la structure des modules :**
   - `com.mg.shop.application`
   - `com.mg.shop.order.domain`
   - `com.mg.shop.order.infra`
   - `com.mg.shop.product.infra`

## Commandes Maven

### Compilation du projet

Pour compiler le projet et vérifier qu'il n'y a pas d'erreurs de compilation :

```bash
mvn clean compile
```

### Compilation et exécution des tests

Pour compiler et exécuter les tests unitaires :

```bash
mvn clean test
```

### Générer un JAR exécutable

Pour générer un fichier JAR exécutable :

```bash
mvn clean package
```

Le fichier généré se trouve dans le dossier `target/`.

### Exécution de l'application

#### 1. Démarrage direct avec Maven

Pour démarrer directement l'application sans générer le JAR :

```bash
mvn spring-boot:run
```

#### 2. Démarrage à partir du JAR

Après avoir généré le fichier JAR, exécutez :

```bash
java -jar target/<nom-du-jar>.jar
```

Remplacez `<nom-du-jar>` par le nom du fichier JAR, par exemple `shop-application-0.0.1-SNAPSHOT.jar`.

### Exécution avec un profil

Pour exécuter l'application avec un profil (par exemple, `dev`) :

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

Ou, si vous utilisez le JAR :

```bash
java -jar target/<nom-du-jar>.jar --spring.profiles.active=dev
```

## Problèmes connus

1. **Erreur `module does not open ... to unnamed module`** :
    - Ajoutez cette ligne dans votre fichier `module-info.java` :

      ```java
      opens com.mg.shop.application to spring.core, spring.context;
      ```

    - Ou démarrez l'application avec l'option JVM :

      ```bash
      --add-opens com.mg.shop.application/com.mg.shop.application=ALL-UNNAMED
      ```

2. **Manque d'espace disque lors de l'exécution Docker** :
    - Nettoyez les volumes inutilisés avec :

      ```bash
      docker system prune -a --volumes
      ```

## Ressources supplémentaires

- [Documentation Spring Boot](https://spring.io/projects/spring-boot)
- [Guide Maven](https://maven.apache.org/guides/index.html)
- [Tutoriel Java Modules](https://docs.oracle.com/javase/tutorial/java/javaOO/modules.html)

---

**Auteur** : [Votre nom ou équipe]

**Contact** : [Votre email ou lien]

