package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class hre implements Serializable {
    public final Throwable E;

    public hre(Throwable th) {
        th.getClass();
        this.E = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hre) {
            return x44.r(this.E, ((hre) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.E + ')';
    }
}
