package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class il4 {
    public final Object a;

    public il4(Object obj) {
        this.a = obj;
    }

    public abstract yr9 a(tqb tqbVar);

    public Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objB = b();
        il4 il4Var = obj instanceof il4 ? (il4) obj : null;
        return x44.r(objB, il4Var != null ? il4Var.b() : null);
    }

    public final int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
