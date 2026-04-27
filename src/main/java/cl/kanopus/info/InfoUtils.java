package cl.kanopus.info;

public class InfoUtils {

    private InfoUtils() {
    }

    public static StringBuilder printInfoKtools(String component, String version) {
        StringBuilder info = new StringBuilder();

        info.append("\n");
        info.append("██   ██ ████████  ██████   ██████  ██      ███████ \n");
        info.append("██  ██     ██    ██    ██ ██    ██ ██      ██     \n");
        info.append("█████      ██    ██    ██ ██    ██ ██      ███████\n");
        info.append("██  ██     ██    ██    ██ ██    ██ ██           ██\n");
        info.append("██   ██    ██     ██████   ██████  ███████ ███████\n");
        info.append("\n");
        info.append(" :: ").append(String.format("%-31s", component)).append("::  (").append(version).append(") \n");
        info.append(" :: Developed By Kanopus\n");
        info.append(" :: https://github.com/godheaven/\n");

        return info;
    }
}
