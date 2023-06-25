package net.sf.webdav.util;

public class ClientIdentifyUtils {

    public static boolean isWinSCP(String userAgent) {
        return String.valueOf(userAgent).contains("WinSCP");
    }
    public static boolean isMicrosoftExplorer(String userAgent) {
        return String.valueOf(userAgent).contains("Microsoft-WebDAV");
    }
    public static boolean isOSXFinder(String userAgent) {
        userAgent = String.valueOf(userAgent);
        return userAgent.contains("WebDAVFS") && !isTransmit(userAgent);
    }

    public static boolean isTransmit(String userAgent) {
        userAgent = String.valueOf(userAgent);
        return userAgent.contains("Transmit");
    }

    public static boolean isRclone(String userAgent) {
        userAgent = String.valueOf(userAgent);
        return userAgent.contains("rclone");
    }

    /**
     * 群晖 Cloud Sync 不提供UserAgent
     * @param userAgent
     * @return
     */
    public static boolean isSynoCloudSync(String userAgent) {
        return userAgent == null;
    }
}