package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xs7 implements zz7 {
    public final /* synthetic */ bz7 E;

    public xs7(bz7 bz7Var) {
        this.E = bz7Var;
    }

    @Override // defpackage.zz7
    public final qz7 d() {
        return this.E;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xs7)) {
            return false;
        }
        return this.E.equals(((zz7) obj).d());
    }

    public final int hashCode() {
        return this.E.hashCode();
    }
}
