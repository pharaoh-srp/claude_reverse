package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vai {
    public abstract int a();

    public abstract yr9 b();

    public abstract boolean c();

    public abstract vai d(es9 es9Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vai)) {
            return false;
        }
        vai vaiVar = (vai) obj;
        return c() == vaiVar.c() && a() == vaiVar.a() && b().equals(vaiVar.b());
    }

    public final int hashCode() {
        int iF = sq6.F(a());
        if (fbi.m(b())) {
            return (iF * 31) + 19;
        }
        return (iF * 31) + (c() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == 1) {
            return b().toString();
        }
        return fsh.E(a()) + " " + b();
    }
}
