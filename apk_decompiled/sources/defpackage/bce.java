package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bce {
    public final Class a;
    public final z81 b;

    public bce(Class cls, z81 z81Var) {
        this.a = cls;
        this.b = z81Var;
    }

    public final String a() {
        String strReplace = this.a.getName().replace('.', '/');
        strReplace.getClass();
        return strReplace.concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bce) {
            return x44.r(this.a, ((bce) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return bce.class.getName() + ": " + this.a;
    }
}
