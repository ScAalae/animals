package Layout;

import java.util.*;
public class MyModel extends Observable {
private int numClicks = 0;

public int getClicks() {
return numClicks;
}
@SuppressWarnings("deprecation")
public void clicked() {
numClicks++;
// Modell hat sich geaendert
setChanged();
// Observer benachrichtigen
notifyObservers();
}
}