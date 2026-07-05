package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hoh {
    public final ooh a;
    public final ooh b;

    public hoh(ooh oohVar, ooh oohVar2) {
        this.a = oohVar;
        this.b = oohVar2;
        ooh oohVar3 = ooh.E;
        if (oohVar == oohVar3 || oohVar3 == oohVar2 || oohVar == oohVar2) {
            throw new IllegalArgumentException(("invalid ThreePaneScaffoldHorizontalOrder(" + oohVar + ", " + oohVar3 + ", " + oohVar2 + ") - panes must be unique").toString());
        }
    }

    public final void a(pz7 pz7Var) {
        pz7Var.invoke(0, this.a);
        pz7Var.invoke(1, ooh.E);
        pz7Var.invoke(2, this.b);
    }

    public final int b(ooh oohVar) {
        if (oohVar == this.a) {
            return 0;
        }
        if (oohVar == ooh.E) {
            return 1;
        }
        return oohVar == this.b ? 2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoh)) {
            return false;
        }
        hoh hohVar = (hoh) obj;
        return this.a == hohVar.a && this.b == hohVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((ooh.E.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
