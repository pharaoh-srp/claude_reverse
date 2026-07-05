package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hva {
    public final String a;
    public final b79 b;

    public hva(String str, b79 b79Var) {
        this.a = str;
        this.b = b79Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hva)) {
            return false;
        }
        hva hvaVar = (hva) obj;
        return this.a.equals(hvaVar.a) && this.b.equals(hvaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
