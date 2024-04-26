# Dokumentation
Die Anwendung Songguesser ist ein Spiel zum Liederraten. Mit dieser Anwendung können Schätzungen abgeben werden, welche am Ende auch noch kontrolliert und mit einem Punkt pro richtiger Schätzung gewertet werden.
#### Vorbereitung:
Zuerst wird ein Event mit der _**event.html**_ Datei angelegt. Dieses Event wird in der Datenbank gespeichert. Danach müssen die Personen in der Datenbank und der _**guess.html**_ Datei eingetragen werden. Die Personen werden nicht von der Datenbank auf die Website geladen. Danach können die Lieder einem schon vorhandenem Event zugeordnet werden mit ihrem Wünscher oder auch Künstler. Dies ist über die _**song.html**_ Datei zu tun. Wichtig ist, dass die Schätzungen über die _**guess.html**_ Datei während des Liedes gesendet werden, da ein aktueller Zeitstempel automatisch erzeugt wird. Am Ende können die Schätzungen durch die Result-Methode ausgewertet werden. Mit jeder richtigen Schätzung erhält man einen Punkt. Wichtig ist auch die den Start und die Dauer der Lieder und Events richtig einzutragen. Es muss eine Datenbank erstellt und verbunden werden.

Die HTML Dateien sind unter _src/main/resources/static_ zu finden.
