package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cz2 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;

    public /* synthetic */ cz2(boolean z, int i) {
        this.E = i;
        this.F = z;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        boolean z = this.F;
        switch (i) {
            case 0:
                return mpk.P(Boolean.valueOf(!z));
            case 1:
                return mpk.P(Boolean.valueOf(!z));
            case 2:
                return mpk.P(Boolean.valueOf(z));
            case 3:
                return mpk.P(Boolean.valueOf(z));
            case 4:
                return mpk.P(z ? ce8.DeepLink : ce8.Settings);
            default:
                return mpk.P(Boolean.valueOf(z));
        }
    }
}
