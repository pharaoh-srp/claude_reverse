package defpackage;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes3.dex */
public final class bpj extends gse {
    public final PendingIntent E;
    public final boolean F;

    public bpj(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            mr9.h("Null pendingIntent");
            throw null;
        }
        this.E = pendingIntent;
        this.F = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gse) {
            bpj bpjVar = (bpj) ((gse) obj);
            if (this.E.equals(bpjVar.E) && this.F == bpjVar.F) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.F ? 1237 : 1231) ^ ((this.E.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return sq6.v("}", sq6.x("ReviewInfo{pendingIntent=", this.E.toString(), ", isNoOp="), this.F);
    }
}
