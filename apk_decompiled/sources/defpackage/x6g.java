package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x6g {
    public final Object a;
    public final re3 b;

    public x6g(Object obj, re3 re3Var) {
        obj.getClass();
        this.a = obj;
        this.b = re3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6g)) {
            return false;
        }
        x6g x6gVar = (x6g) obj;
        return x44.r(this.a, x6gVar.a) && this.b == x6gVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleChildNavState(configuration=" + this.a + ", status=" + this.b + ')';
    }
}
