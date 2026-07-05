package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class p84 extends wjc implements Serializable {
    public final z31 E;

    public p84(z31 z31Var) {
        this.E = z31Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.E.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof p84) && this.E == ((p84) obj).E;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return this.E.toString();
    }
}
