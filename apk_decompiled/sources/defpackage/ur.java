package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ur implements rr, zz7 {
    public final /* synthetic */ bz7 E;

    public ur(bz7 bz7Var) {
        this.E = bz7Var;
    }

    @Override // defpackage.zz7
    public final qz7 d() {
        return this.E;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rr) || !(obj instanceof zz7)) {
            return false;
        }
        return this.E.equals(((zz7) obj).d());
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.bz7
    public final /* synthetic */ Object invoke(Object obj) {
        return this.E.invoke(Double.valueOf(((Number) obj).doubleValue()));
    }
}
