package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d08 {
    public final e08 a;
    public final int b;

    public d08(e08 e08Var, int i) {
        this.a = e08Var;
        this.b = i;
    }

    public final e08 a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d08)) {
            return false;
        }
        d08 d08Var = (d08) obj;
        return this.a == d08Var.a && this.b == d08Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KindWithArity(kind=");
        sb.append(this.a);
        sb.append(", arity=");
        return vb7.r(sb, this.b, ')');
    }
}
