package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j1g {
    public final vve a;
    public final vve b;
    public final vve c;
    public final vve d;
    public final vve e;
    public final vve f;
    public final vve g;
    public final vve h;
    public xc6 i;
    public cdb j;

    public j1g() {
        vve vveVar = l0g.a;
        vve vveVar2 = l0g.b;
        vve vveVar3 = l0g.c;
        vve vveVar4 = l0g.d;
        vve vveVar5 = l0g.f;
        vve vveVar6 = l0g.e;
        vve vveVar7 = l0g.g;
        vve vveVar8 = l0g.h;
        this.a = vveVar;
        this.b = vveVar2;
        this.c = vveVar3;
        this.d = vveVar4;
        this.e = vveVar5;
        this.f = vveVar6;
        this.g = vveVar7;
        this.h = vveVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1g)) {
            return false;
        }
        j1g j1gVar = (j1g) obj;
        return x44.r(this.a, j1gVar.a) && x44.r(this.b, j1gVar.b) && x44.r(this.c, j1gVar.c) && x44.r(this.d, j1gVar.d) && x44.r(this.e, j1gVar.e) && x44.r(this.f, j1gVar.f) && x44.r(this.g, j1gVar.g) && x44.r(this.h, j1gVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
