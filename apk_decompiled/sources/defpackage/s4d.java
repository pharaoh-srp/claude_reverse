package defpackage;

import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class s4d {
    public static volatile s4d a;
    public static final Logger b;

    static {
        try {
            for (Map.Entry entry : l30.b.entrySet()) {
                l30.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        s4d uyVar = uy.e ? new uy() : null;
        if (uyVar == null) {
            boolean z = h40.e;
            uyVar = gqk.b();
        }
        if (uyVar == null) {
            throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
        }
        a = uyVar;
        b = Logger.getLogger(hdc.class.getName());
    }

    public abstract zh4 c(X509TrustManager x509TrustManager);

    public abstract void d(SSLSocket sSLSocket, String str, List list);

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    public abstract String f(SSLSocket sSLSocket);

    public Object g() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean h(String str);

    public abstract void i(String str, int i, Throwable th);

    public void j(String str, Object obj) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(str, 5, (Throwable) obj);
    }

    public abstract SSLContext k();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
