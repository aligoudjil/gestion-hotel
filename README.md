 Fonctionnalité : Réservations et Facturation PDF

1. Gestion des Réservations

Cette fonctionnalité permet la gestion complète des réservations dans l'application :

- **Créer une réservation :**  
  L'utilisateur peut sélectionner un client, une chambre disponible, une date de début et une date de fin, puis cliquer sur "Réserver".

- **Afficher les réservations :**  
  Toutes les réservations enregistrées s'affichent dans un tableau avec les informations : ID, ID Client, ID Chambre, Date début et Date fin.

- **Annuler une réservation :**  
  L'utilisateur peut sélectionner une réservation existante et cliquer sur "Annuler" pour la supprimer de la base de données.

 2. Facturation et Impression de Reçus en PDF

Cette interface de facturation permet de :

- Afficher les réservations dans une table.
- Générer automatiquement une facture en format PDF pour chaque réservation.
- Ajouter un logo personnalisé et un design professionnel à la facture.
- Inclure les informations du client, chambre, dates de séjour et signature d’hôtel.

 Classes impliquées :

- `ReservationView.java` – Interface utilisateur pour gérer les réservations.
- `FactureView.java` – Interface utilisateur pour la génération de factures.
- `ReservationDAO.java` – Accès à la base de données (ajout, suppression, affichage).
- `ClientDAO.java` – Accès aux données client.
- `Reservation.java` – Modèle représentant une réservation.
- `ConnexionDB.java` – Connexion à la base de données MySQL.
- **Librairie externe :** `iTextPDF` pour la génération de PDF.

