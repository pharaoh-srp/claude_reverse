package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class tk4 implements xdg {
    public static final rk4 a = new rk4();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, sk4.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (sk4.a()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        b = z;
    }

    @Override // defpackage.xdg
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.xdg
    public final boolean b() {
        return b;
    }

    @Override // defpackage.xdg
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.xdg
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            s4d s4dVar = s4d.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) zp3.h(list).toArray(new String[0]));
        }
    }
}
