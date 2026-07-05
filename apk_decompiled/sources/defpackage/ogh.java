package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ogh implements to7, zz7 {
    public final /* synthetic */ zy7 E;

    public ogh(zy7 zy7Var) {
        this.E = zy7Var;
    }

    @Override // defpackage.to7
    public final /* synthetic */ float a() {
        return ((Number) this.E.a()).floatValue();
    }

    @Override // defpackage.zz7
    public final qz7 d() {
        return this.E;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof to7) || !(obj instanceof zz7)) {
            return false;
        }
        return x44.r(this.E, ((zz7) obj).d());
    }

    public final int hashCode() {
        return this.E.hashCode();
    }
}
