- VLAN = Virtual Local Area Networks unterteilt einzelnes physisches Netzwerk in mehrere logische
- jedes vlan bildet eigene Broadcast-Domain
- kommunikation zwischen 2 vlan's nur über router möglich der an beide angeschlossen ist


#Typen
- grundsätzlich in 2 typen:
-- als portbasierte VLAN's (untagged)
-- als tagged VLAN's

##Portbasierte
Mit portbasierten VLANs unterteilen Sie einen einzelnen physischen Switch einfach auf mehrere logische Switche. Im folgenden Beispiel teilen wir einen physischen 8-Port Switch (Switch A) auf zwei logische Switches auf:
|Switch A|   |   |
|---|---|---|
|Switch-Port|VLAN ID|angeschlossenes Gerät|
|1|1<br><br>(grün)|PC A-1|
|2|PC A-2|
|3|(nicht in Verwendung)|
|4|(nicht in Verwendung)|
|5|2<br><br>(orange)|PC A-5|
|6|PC A-6|
|7|(nicht in Verwendung)|
|8|(nicht in Verwendung)|

- Obwohl alle PCs an einem physischen Switch angeschlossen sind, können aufgrund der VLAN Konfiguration nur folgende PCs jeweils miteinander kommunizieren:
- PC A-1 mit PC A-2
- PC A-5 mit PC A-6

|Switch B|   |   |
|---|---|---|
|Switch-Port|VLAN ID|angeschlossenes Gerät|
|1|1<br><br>(grün)|PC B-1|
|2|PC B-2|
|3|(nicht in Verwendung)|
|4|(nicht in Verwendung)|
|5|2<br><br>(orange)|PC B-5|
|6|PC B-6|
|7|(nicht in Verwendung)|
|8|(nicht in Verwendung)|

