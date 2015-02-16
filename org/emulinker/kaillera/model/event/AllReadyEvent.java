package org.emulinker.kaillera.model.event;

import org.emulinker.kaillera.model.KailleraGame;
import org.emulinker.kaillera.model.event.GameEvent;

public class AllReadyEvent implements GameEvent {
   private KailleraGame game;

   public AllReadyEvent(KailleraGame game) {
      this.game = game;
   }

   public String toString() {
      return "AllReadyEvent";
   }

   public KailleraGame getGame() {
      return this.game;
   }
}
