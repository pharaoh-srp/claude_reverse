package defpackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sf4 {
    public static final String a;

    static {
        String hostName;
        String strA = vf4.a("HOSTNAME");
        if (strA == null || strA.isEmpty()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("hostname").getInputStream()));
                try {
                    strA = bufferedReader.readLine();
                    bufferedReader.close();
                } finally {
                }
            } catch (Throwable unused) {
            }
            if (strA == null || strA.isEmpty()) {
                try {
                    hostName = InetAddress.getLocalHost().getHostName();
                } catch (UnknownHostException unused2) {
                    hostName = null;
                }
            } else {
                hostName = strA.trim();
            }
        } else {
            hostName = strA.trim();
        }
        a = hostName;
    }
}
