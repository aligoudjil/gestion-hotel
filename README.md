Cette fonctionnalité permet la gestion complète des réservations dans l'application :

Fonctions principales :
Créer une réservation :
L'utilisateur peut sélectionner un client, une chambre disponible, une date de début et une date de fin, puis cliquer sur "Réserver".

Afficher les réservations :
Toutes les réservations enregistrées s'affichent dans un tableau avec les informations : ID, ID Client, ID Chambre, Date début et Date fin.

Annuler une réservation :
L'utilisateur peut sélectionner une réservation existante et cliquer sur "Annuler" pour la supprimer de la base de données.

Classes concernées :
ReservationView.java
Interface utilisateur pour gérer les réservations.

ReservationDAO.java
Accès à la base de données (ajout, suppression, affichage).

ConnexionDB.java
Connexion à la base de données MySQL.

Reservation.java
Modèle représentant une réservation.
