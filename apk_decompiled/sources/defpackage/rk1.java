package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rk1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ hsc F;

    public /* synthetic */ rk1(hsc hscVar, int i) {
        this.E = i;
        this.F = hscVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        hsc hscVar = this.F;
        switch (i) {
            case 0:
                hscVar.i(((Float) obj).floatValue());
                return ieiVar;
            case 1:
                ((cz5) obj).getClass();
                return new y69(((long) mwa.L(hscVar.h())) & 4294967295L);
            default:
                hscVar.i(((Float) obj).floatValue());
                return ieiVar;
        }
    }
}
