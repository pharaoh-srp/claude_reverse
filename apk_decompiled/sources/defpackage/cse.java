package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class cse extends wjc implements Serializable {
    public final wjc E;

    public cse(wjc wjcVar) {
        this.E = wjcVar;
    }

    @Override // defpackage.wjc
    public final wjc a() {
        return this.E;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.E.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cse) {
            return this.E.equals(((cse) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return -this.E.hashCode();
    }

    public final String toString() {
        return this.E + ".reverse()";
    }
}
