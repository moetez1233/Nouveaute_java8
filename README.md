**I.	**Expressions Lambda****  
    Les expressions lambda sont introduites dans Java 8 et sont utilisées dans la programmation fonctionnelle. Une expression lambda est donc une fonction qui peut être créée sans appartenir à aucune classe. Une 
    expression lambda peut être transmise comme s’il s’agissait d’un objet et exécutée à la demande.
1.	Pourquoi utiliser les expressions lambda  
   - Pour fournir l’implémentation d’une interface fonctionnelle.  
   - Moins de code.  

**II.	Références de méthode**  
Les références de méthode sont un type spécial des expressions lambda. Ils sont souvent utilisés pour créer des expressions lambda simples en référençant des méthodes existantes.  
Il existe trois types de références de méthode:  
     - Référence à une méthode statique.  
     - Référence à une méthode d’instance.  
     - Référence à un constructeur.  
**Les interfaces fonctionnelles**  
    Une interface fonctionnelle en Java est une interface qui ne contient qu’une seule méthode abstraite (non implémentée).   
    Une interface fonctionnelle peut contenir des méthodes par défaut et statiques qui ont une implémentation, en plus de la méthode unique non implémentée.  
**Completable future**  
  CompletableFuture : est utiliser dans la programmation asynchrone , executer le programme dans multiple thread séparement
  ### Initialiser CompletableFuture  
   - ComplatableFuture<String> future = new CompleatableFuture<>();  
  1. Difference entre Future et CompletableFuture 
   Future est le resultat du programme asyn mais à certain limitation par rapport à CompletableFuture comme : 
      - Future ne peut pas completer manuellement comme dans CompletableFure with isComplete()
      - Ne peut pas combiner ou bien chainer un liste des Future
  2. runAsyn vs supplyAsync
     - runAsyn :  void 
     - supplyAsync :   Object
  3. Combination des CompletableFuture 
     - on peut comnbiner une list des CompletableFuture avec ollOf ou anyOff
       
   
     
