package defpackage;

import com.anthropic.claude.core.telemetry.ClaudeRegionUnavailableException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class yme implements bne {
    public final String a;
    public final String b;

    /* JADX WARN: Illegal instructions before constructor call */
    public yme(nf0 nf0Var) {
        String c;
        String strF;
        nf0Var.getClass();
        boolean z = nf0Var instanceof lf0;
        if (z) {
            c = ((lf0) nf0Var).b.getC();
        } else {
            if (!(nf0Var instanceof mf0)) {
                wg6.i();
                throw null;
            }
            Throwable th = ((mf0) nf0Var).a;
            c = th instanceof ClaudeRegionUnavailableException ? "region_unavailable" : th instanceof IOException ? "network" : "client_error";
        }
        if (z) {
            lf0 lf0Var = (lf0) nf0Var;
            strF = ksk.h(lf0Var.b, Integer.valueOf(lf0Var.a));
        } else {
            if (!(nf0Var instanceof mf0)) {
                wg6.i();
                throw null;
            }
            strF = jce.a.b(((mf0) nf0Var).a.getClass()).f();
        }
        this(c, strF);
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yme)) {
            return false;
        }
        yme ymeVar = (yme) obj;
        return x44.r(this.a, ymeVar.a) && x44.r(this.b, ymeVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ij0.l("Failed(errorType=", this.a, ", errorCode=", this.b, ")");
    }

    public yme(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public yme(Throwable th) {
        String str;
        th.getClass();
        if (th instanceof ClaudeRegionUnavailableException) {
            str = "region_unavailable";
        } else {
            str = th instanceof IOException ? "network" : "client_error";
        }
        this(str, jce.a.b(th.getClass()).f());
    }
}
