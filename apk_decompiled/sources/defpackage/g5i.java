package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g5i {
    public final efh a;
    public final h79 b;

    public g5i(efh efhVar, h79 h79Var) {
        this.a = efhVar;
        this.b = h79Var;
    }

    public final h79 a() {
        return this.b;
    }

    public final efh b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g5i) {
            g5i g5iVar = (g5i) obj;
            return this.a.equals(g5iVar.a) && this.b == g5iVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
