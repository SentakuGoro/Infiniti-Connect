# Infiniti Connect – Android Demo
Native Android-Demo mit simulierten Fahrzeugdaten, Fahrzeugauswahl, Fahrtenbuch, Klima- und Fenster-Demosteuerung, Wartung, Diagnose und einfachem Homescreen-Widget. Keine echte Fahrzeugverbindung. Fahrzeugansicht ist eine stilisierte Vektorgrafik, kein Originalfoto.

## APK erstellen
GitHub Actions -> Build Infiniti Connect APK -> Run workflow (oder Push auf main). Nach erfolgreichem Build das Artefakt `Infiniti-Connect-Demo-APK` als ZIP herunterladen, entpacken und `app-debug.apk` installieren.

Java 17, Android SDK 35 und Gradle 8.10.2 (GitHub Actions installiert die Werkzeuge). Die App ist ein früher Prototyp; reale Aucar-CAN-Kommunikation ist nicht implementiert.
