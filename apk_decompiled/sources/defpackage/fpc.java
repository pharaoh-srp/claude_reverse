package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fpc {
    public final Object a;
    public final Object b;

    public fpc(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpc)) {
            return false;
        }
        fpc fpcVar = (fpc) obj;
        return x44.r(this.a, fpcVar.a) && x44.r(this.b, fpcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Details(config=" + this.a + ", instance=" + this.b + ")";
    }
}
