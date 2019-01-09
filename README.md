# ENSIIE - Projet Java Boutique

## Introduction

Membres du groupe : Evaristo LUIS (TSP) et Dan TRAN (TSP).

Il s'agit d'une première version d'un programme codé en Java qui a pour objectif la gestion d'une boutique : vente de disques CD et vinyles.

Le programme dispose d'une interface console.

## Fonctionnalité

La boutique prend en compte ses caractéristiques, clients, produits et commandes.

### Boutique

```
- nom
- adresse postale
- numero de téléphone
- adresse email
- charge
- salaire
- loyer
```

- Affichage des caractéristiques de la boutique.
- Modification des caractéristiques de la boutique.

### Client

```
- numéro
- prénom
- nom
- adresse postale
```

- Création d'un client.
- Affichage de la liste des clients de la boutique.

### Article

#### CD

```
- référence
- nom de l'album
- nom de l'artiste ou groupe
- nom du label
- nombre de disques
- prix
```

#### Vinyle

```
- référence
- nom de l'album
- nom de l'artiste ou groupe
- nom du label
- nombre de disques
- prix
- taille (diamètre du disque, en pouces)
- vitesse (vitesse de rotation du disque à la lecture, 33 tours, 45 tours, etc)
- masse d'un disque
```

- Création d'articles.
- Création de lots.
- Affichage du stock d'article.

### Commande

```
- numéro
- client (objet)
- date
- panier (objet)
- réduction
- frais de port
```

- Création de commande.
- Afficher toutes les commandes réalisées.
- Afficher les commandes d'un client spécifique.

### Gestion des données

L'objet `Boutique` est sérialisé dans un fichier appelé `save1` (présent dans le même répertoire que le fichier `jar`).

A la livraison de ce programme, ce fichier est fourni avec une Boutique, des clients, des produits et des commandes créés.

Si ce fichier n'existe pas, alors au lancement du programme, il vous sera demandé de créer une nouvelle boutique ainsi que le reste des Object (client, article, commande).

Le programme propose l'enregistrement des données par l'utilisateur via l'interface console.

## Utilisation et interface console

Java doit être installé sur le poste sur lequel le programme est exécuté.

Lancement du programme : `java -jar java-boutique-project.jar`

Navigation via des chiffres.
Lecture et insertion de données via le clavier.