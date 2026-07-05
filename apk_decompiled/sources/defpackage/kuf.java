package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kuf implements fvf {
    public final boolean a;

    public kuf(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kuf) && this.a == ((kuf) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qy1.g("CompactionStatus(isCompacting=", ")", this.a);
    }
}
