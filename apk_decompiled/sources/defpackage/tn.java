package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tn implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ isc F;

    public /* synthetic */ tn(isc iscVar, int i) {
        this.E = i;
        this.F = iscVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        isc iscVar = this.F;
        switch (i) {
            case 0:
                iscVar.i((int) (((g79) obj).a & 4294967295L));
                break;
            case 1:
                cu9 cu9Var = (cu9) obj;
                cu9Var.getClass();
                iscVar.getClass();
                if (iscVar.h() == 0) {
                    iscVar.i((int) (cu9Var.k() & 4294967295L));
                }
                break;
            case 2:
                iscVar.i((int) (((g79) obj).a & 4294967295L));
                break;
            case 3:
                iscVar.i((int) (((g79) obj).a >> 32));
                break;
            case 4:
                iscVar.i((int) (((g79) obj).a & 4294967295L));
                break;
            case 5:
                iscVar.i((int) (((g79) obj).a & 4294967295L));
                break;
            case 6:
                iscVar.i((int) (((g79) obj).a >> 32));
                break;
            case 7:
                ((i90) obj).getClass();
                break;
            case 8:
                ((Integer) obj).intValue();
                break;
            default:
                ((Integer) obj).intValue();
                break;
        }
        return Integer.valueOf(iscVar.h());
    }
}
