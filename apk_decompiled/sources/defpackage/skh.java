package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class skh {
    public final m54 a;
    public final clh b;
    public final cv7 c;

    public skh(m54 m54Var, clh clhVar, cv7 cv7Var, int i) {
        clhVar = (i & 2) != 0 ? null : clhVar;
        cv7Var = (i & 4) != 0 ? null : cv7Var;
        this.a = m54Var;
        this.b = clhVar;
        this.c = cv7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skh)) {
            return false;
        }
        skh skhVar = (skh) obj;
        return x44.r(this.a, skhVar.a) && x44.r(this.b, skhVar.b) && x44.r(this.c, skhVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        clh clhVar = this.b;
        return (((iHashCode + (clhVar != null ? Long.hashCode(clhVar.a) : 0)) * 31) + (this.c != null ? Integer.hashCode(700) : 0)) * 923521;
    }

    public final String toString() {
        return "TextStyle(color=" + this.a + ", fontSize=" + this.b + ", fontWeight=" + this.c + ", fontStyle=null, textDecoration=null, textAlign=null, fontFamily=null)";
    }
}
