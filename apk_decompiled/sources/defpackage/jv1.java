package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class jv1 implements xdg {
    public static final hv1 a = new hv1();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, iv1.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        b = z;
    }

    @Override // defpackage.xdg
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.xdg
    public final boolean b() {
        return b;
    }

    @Override // defpackage.xdg
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.xdg
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            s4d s4dVar = s4d.a;
            parameters.setApplicationProtocols((String[]) zp3.h(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
