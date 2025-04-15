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

Affichage des chambres "Réservée"

Rafraîchissement automatique de la table après modification ou mise à jour

Fonctionnalité : Réservations et Facturation PDF
1. Gestion des Réservations
Cette fonctionnalité permet la gestion complète des réservations dans l'application :

Créer une réservation :
L'utilisateur peut sélectionner un client, une chambre disponible, une date de début et une date de fin, puis cliquer sur "Réserver".

Afficher les réservations :
Toutes les réservations enregistrées s'affichent dans un tableau avec les informations : ID, ID Client, ID Chambre, Date début et Date fin.

Annuler une réservation :
L'utilisateur peut sélectionner une réservation existante et cliquer sur "Annuler" pour la supprimer de la base de données.

2. Facturation et Impression de Reçus en PDF
Cette interface de facturation permet de :

Afficher les réservations dans une table

Générer automatiquement une facture en format PDF pour chaque réservation

Ajouter un logo personnalisé et un design professionnel à la facture

Inclure les informations du client, chambre, dates de séjour et signature d’hôtel

Classes impliquées :
ReservationView.java

FactureView.java

ReservationDAO.java

ClientDAO.java

Reservation.java

ConnexionDB.java

Librairie externe : iTextPDF pour la génération de PDF