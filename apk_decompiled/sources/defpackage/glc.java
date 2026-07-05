package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class glc extends knk {
    public final sve k;
    public final c40 l;

    public glc(sve sveVar) {
        c40 c40VarA;
        this.k = sveVar;
        if (gb9.A(sveVar)) {
            c40VarA = null;
        } else {
            c40VarA = f40.a();
            c40.c(c40VarA, sveVar);
        }
        this.l = c40VarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof glc) {
            return this.k.equals(((glc) obj).k);
        }
        return false;
    }

    public final int hashCode() {
        return this.k.hashCode();
    }

    @Override // defpackage.knk
    public final l9e w() {
        sve sveVar = this.k;
        return new l9e(sveVar.a, sveVar.b, sveVar.c, sveVar.d);
    }
}
