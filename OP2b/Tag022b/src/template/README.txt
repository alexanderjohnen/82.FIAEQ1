Anonyme Klassen mit Interfaces und abstrakten Klassen
CodeWerk GmbH – Startprojekt für IDE-Übung 2
Dienstag, 15.09.2026

Enthalten:
- TaskAction.java
- ArchiveTaskAction.java
- ProjectAction.java
- Main.java

Ausgangszustand:
Main verwendet zunächst die benannte Klasse ArchiveTaskAction.

Arbeitsauftrag Teil 1:
1. Projekt öffnen und ausführen.
2. TaskAction und ArchiveTaskAction analysieren.
3. In Main die benannte Implementierung durch eine anonyme Implementierung
   von TaskAction ersetzen.
4. Erneut ausführen.
5. Das fachliche Verhalten muss unverändert bleiben.

Arbeitsauftrag Teil 2:
1. ProjectAction analysieren.
2. In Main eine anonyme Unterklasse von ProjectAction erzeugen.
3. "Archivierung" an den Konstruktor übergeben.
4. execute() implementieren.
5. Zuerst printStart(), danach execute() aufrufen.
6. Programm testen.

Keine Lambda-Syntax verwenden.

Kompilieren:
javac *.java

Starten:
java Main
