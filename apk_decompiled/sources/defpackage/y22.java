package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y22 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ f4e F;

    public /* synthetic */ y22(f4e f4eVar, int i) {
        this.E = i;
        this.F = f4eVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        f4e f4eVar = this.F;
        switch (i) {
            case 0:
                f4eVar.cancel();
                break;
            default:
                try {
                    f4eVar.cancel();
                } catch (Throwable unused) {
                }
                break;
        }
        return ieiVar;
    }
}
