package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mx9 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    public /* synthetic */ mx9(int i, int i2) {
        this.E = i2;
        this.F = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return new lx9(this.F, 0);
            default:
                return new isc(this.F);
        }
    }
}
