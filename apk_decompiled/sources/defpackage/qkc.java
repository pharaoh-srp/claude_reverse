package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qkc implements zz7 {
    public final /* synthetic */ y73 E;

    public qkc(y73 y73Var) {
        this.E = y73Var;
    }

    @Override // defpackage.zz7
    public final qz7 d() {
        return this.E;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof qkc) && (obj instanceof zz7)) {
            return this.E == ((zz7) obj).d();
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }
}
