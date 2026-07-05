package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class tna {
    public final bna a;
    public final Throwable b;

    public tna(bna bnaVar) {
        this.a = bnaVar;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tna)) {
            return false;
        }
        tna tnaVar = (tna) obj;
        bna bnaVar = this.a;
        if (bnaVar != null && bnaVar == tnaVar.a) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || tnaVar.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public tna(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
