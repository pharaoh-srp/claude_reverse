package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dz4 implements fz4 {
    public final Object a;

    public dz4(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dz4) && x44.r(this.a, ((dz4) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return grc.t(this.a, "Loaded(data=", ")");
    }
}
