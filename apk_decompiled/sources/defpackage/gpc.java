package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gpc {
    public final Object a;
    public final Object b;

    public gpc(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpc)) {
            return false;
        }
        gpc gpcVar = (gpc) obj;
        return x44.r(this.a, gpcVar.a) && x44.r(this.b, gpcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Extra(config=" + this.a + ", instance=" + this.b + ")";
    }
}
