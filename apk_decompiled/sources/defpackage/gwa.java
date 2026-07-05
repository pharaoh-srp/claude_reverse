package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gwa {
    public final n54 a;
    public final zbi b;
    public final j1g c;
    public final zrb d;

    public gwa(n54 n54Var, zbi zbiVar, j1g j1gVar, zrb zrbVar) {
        this.a = n54Var;
        this.b = zbiVar;
        this.c = j1gVar;
        this.d = zrbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gwa.class != obj.getClass()) {
            return false;
        }
        gwa gwaVar = (gwa) obj;
        return x44.r(this.a, gwaVar.a) && x44.r(this.b, gwaVar.b) && x44.r(this.c, gwaVar.c) && x44.r(this.d, gwaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Values(colorScheme=" + this.a + ", typography=" + this.b + ", shapes=" + this.c + ", motionScheme=" + this.d + ')';
    }
}
