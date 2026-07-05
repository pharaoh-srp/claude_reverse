package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x2a implements zz7 {
    public final /* synthetic */ ks0 E;

    public x2a(ks0 ks0Var) {
        this.E = ks0Var;
    }

    @Override // defpackage.zz7
    public final qz7 d() {
        return this.E;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x2a)) {
            return false;
        }
        return this.E.equals(((zz7) obj).d());
    }

    public final int hashCode() {
        return this.E.hashCode();
    }
}
