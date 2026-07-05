package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y19 implements mb0 {
    public final vh6 a;
    public final fhe b;

    public y19(vh6 vh6Var, fhe fheVar) {
        this.a = vh6Var;
        this.b = fheVar;
        if (vh6Var instanceof z8i) {
            z8i z8iVar = (z8i) vh6Var;
            if (z8iVar.a != 0 || z8iVar.b != 0) {
                return;
            }
        } else if (vh6Var instanceof qcg) {
            if (((qcg) vh6Var).a != 0) {
                return;
            }
        } else if (!(vh6Var instanceof xp9) || ((xp9) vh6Var).a.a != 0) {
            return;
        }
        sz6.p("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // defpackage.mb0
    public final dsi a(c9i c9iVar) {
        return new e5e(this.a.a(c9iVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y19)) {
            return false;
        }
        y19 y19Var = (y19) obj;
        return x44.r(y19Var.a, this.a) && y19Var.b == this.b;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
