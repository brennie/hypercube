package ca.brennie.hypercube;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.game.state.GameStoppingServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
  id = "hypercube",
  version = "@VERSION@",
  name = "Hypercube API",
  description = "An HTTP API for interacting with a Minecraft server."
)
public class Hypercube {
    private Logger logger = LoggerFactory.getLogger(Plugin.class);

    @Listener
    public void onServerStart(final GameStartedServerEvent event) {
        logger.info("Starting Hypercube...");
    }

    @Listener
    public void onServerStopping(final GameStoppingServerEvent event) {
        logger.info("Stopping Hypercube...");
    }
}
