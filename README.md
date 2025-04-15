Enregistrement des Clients

Cette fonctionnalité permet d'enregistrer les clients dans la base de données via une interface conviviale.

Interfaces et classes impliquées :

ClientView.java : Interface JavaFX avec des champs de texte pour le nom et le prénom, un bouton pour ajouter, et une table pour afficher les clients enregistrés.

ClientDAO.java : Classe de communication avec la base de données pour insérer de nouveaux clients et récupérer la liste des clients.

Client.java : Modèle d'objet représentant un client.

ConnexionDB.java : Gère la connexion à la base MySQL.

Fonctionnalités disponibles :

Ajout d'un client avec validation des champs

Affichage automatique de la liste des clients existants dans une table

Affichage des chambres disponibles et réservées

Cette fonctionnalité permet de consulter la disponibilité des chambres dans l'application.

Interfaces et classes impliquées :

DisponibiliteView.java : Interface JavaFX qui affiche deux listes séparées ou deux sections (chambres disponibles et chambres réservées).

ChambreDAO.java : Classe d'accès à la base pour filtrer les chambres par statut.

Chambre.java : Modèle d'objet d'une chambre (numéro, type, statut).

ConnexionDB.java : Connexion à la base de données.

Fonctionnalités disponibles :

Affichage des chambres "Disponible"

Affichage des chambres "Reservee"

Rafraîchissement automatique de la table après modification ou mise à jour

Ces deux modules sont totalement intégrés à l'application de gestion d'hôtel pour permettre une gestion efficace des clients et des ressources disponibles.

