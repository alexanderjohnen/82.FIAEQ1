Funktionale Interfaces und Lambda
CodeWerk GmbH – Startprojekt für IDE-Übung 3
Mittwoch, 16.09.2026

Enthalten:
- TaskAction.java
- ProjectPrinter.java
- ProjectLabelBuilder.java
- ProjectValidator.java
- Main.java

Ausgangszustand:
Main enthält zunächst die bekannte anonyme Implementierung von TaskAction.

IDE-Auftrag Teil 1:
1. TaskAction analysieren.
2. Anzahl der abstrakten Methoden bestimmen.
3. Programm unverändert ausführen.
4. Die anonyme Implementierung durch ein Lambda ersetzen.
5. Erneut kompilieren und ausführen.
6. Prüfen, dass das fachliche Verhalten unverändert bleibt.

IDE-Auftrag Teil 2:
ProjectPrinter mit einem Lambda implementieren.
Erwartete Ausgabe:
Projekt: Kundenportal

IDE-Auftrag Teil 3:
ProjectLabelBuilder als Expression Lambda implementieren.
Erwartete Ausgabe:
Kundenportal [AKTIV]

IDE-Auftrag Teil 4:
ProjectLabelBuilder als Block Lambda mit toUpperCase() und return umsetzen.
Erwartete Ausgabe:
Kundenportal [AKTIV]

Keine Methodenreferenzen verwenden.

Kompilieren:
javac *.java

Starten:
java Main
