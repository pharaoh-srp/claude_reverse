package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class whf implements qcc, zz7 {
    public final /* synthetic */ zy7 E;

    public whf(zy7 zy7Var) {
        this.E = zy7Var;
    }

    @Override // defpackage.qcc
    public final /* synthetic */ long a() {
        return ((fcc) this.E.a()).a;
    }

    @Override // defpackage.zz7
    public final qz7 d() {
        return this.E;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qcc) || !(obj instanceof zz7)) {
            return false;
        }
        return x44.r(this.E, ((zz7) obj).d());
    }

    public final int hashCode() {
        return this.E.hashCode();
    }
}
