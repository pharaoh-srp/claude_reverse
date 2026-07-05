package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class rk4 implements cw5 {
    @Override // defpackage.cw5
    public final boolean a(SSLSocket sSLSocket) {
        return tk4.b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.cw5
    public final xdg t(SSLSocket sSLSocket) {
        return new tk4();
    }
}
