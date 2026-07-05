package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hpc {
    public final Object a;
    public final Object b;

    public hpc(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpc)) {
            return false;
        }
        hpc hpcVar = (hpc) obj;
        return x44.r(this.a, hpcVar.a) && x44.r(this.b, hpcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Main(config=" + this.a + ", instance=" + this.b + ")";
    }
}
