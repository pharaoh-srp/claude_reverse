package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vif {
    public final d9j a;
    public final d9j b;

    public vif(d9j d9jVar, d9j d9jVar2) {
        this.a = d9jVar;
        this.b = d9jVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vif)) {
            return false;
        }
        vif vifVar = (vif) obj;
        return this.a == vifVar.a && this.b == vifVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.a + ", endAffinity=" + this.b + ')';
    }
}
