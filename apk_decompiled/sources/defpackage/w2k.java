package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class w2k extends z1k implements Serializable {
    public final z1k E;

    public w2k(z1k z1kVar) {
        this.E = z1kVar;
    }

    @Override // defpackage.z1k
    public final z1k a() {
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
        if (obj instanceof w2k) {
            return this.E.equals(((w2k) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return -this.E.hashCode();
    }

    public final String toString() {
        return this.E.toString().concat(".reverse()");
    }
}
