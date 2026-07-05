package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v22 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ isc F;

    public /* synthetic */ v22(isc iscVar, int i) {
        this.E = i;
        this.F = iscVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        isc iscVar = this.F;
        switch (i) {
            case 0:
                iscVar.i(iscVar.h() + 1);
                break;
            case 1:
                iscVar.i(iscVar.h() + 1);
                break;
            default:
                iscVar.i(Math.max(0, iscVar.h() - 1));
                break;
        }
        return ieiVar;
    }
}
