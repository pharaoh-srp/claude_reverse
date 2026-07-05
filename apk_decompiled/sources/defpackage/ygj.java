package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ygj implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ String G;

    public /* synthetic */ ygj(long j, int i, String str) {
        this.E = i;
        this.F = j;
        this.G = str;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Exception {
        tze tzeVarL0;
        int i = this.E;
        String str = this.G;
        long j = this.F;
        lze lzeVar = (lze) obj;
        switch (i) {
            case 0:
                lzeVar.getClass();
                tzeVarL0 = lzeVar.L0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    tzeVarL0.o(1, j);
                    tzeVarL0.N(2, str);
                    tzeVarL0.H0();
                    int iC = v40.C(lzeVar);
                    tzeVarL0.close();
                    return Integer.valueOf(iC);
                } finally {
                }
            default:
                lzeVar.getClass();
                tzeVarL0 = lzeVar.L0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    tzeVarL0.o(1, j);
                    tzeVarL0.N(2, str);
                    tzeVarL0.H0();
                    tzeVarL0.close();
                    return iei.a;
                } finally {
                }
        }
    }
}
