package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class dw5 implements xdg {
    public final cw5 a;
    public xdg b;

    public dw5(cw5 cw5Var) {
        this.a = cw5Var;
    }

    @Override // defpackage.xdg
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override // defpackage.xdg
    public final boolean b() {
        return true;
    }

    @Override // defpackage.xdg
    public final String c(SSLSocket sSLSocket) {
        xdg xdgVarE = e(sSLSocket);
        if (xdgVarE != null) {
            return xdgVarE.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.xdg
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        xdg xdgVarE = e(sSLSocket);
        if (xdgVarE != null) {
            xdgVarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized xdg e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.t(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
