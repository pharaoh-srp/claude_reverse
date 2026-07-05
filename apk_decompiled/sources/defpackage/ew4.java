package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ew4 {
    public final egg a;
    public final egg b;
    public final egg c;

    public ew4(egg eggVar, egg eggVar2, egg eggVar3) {
        eggVar.getClass();
        eggVar2.getClass();
        eggVar3.getClass();
        this.a = eggVar;
        this.b = eggVar2;
        this.c = eggVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew4)) {
            return false;
        }
        ew4 ew4Var = (ew4) obj;
        return x44.r(this.a, ew4Var.a) && x44.r(this.b, ew4Var.b) && x44.r(this.c, ew4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ConwayHeadingSpans(h1=" + this.a + ", h2=" + this.b + ", h3=" + this.c + ")";
    }
}
