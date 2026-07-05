package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wy8 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ int G;

    public /* synthetic */ wy8(int i, String str) {
        this.E = 3;
        this.G = i;
        this.F = str;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Exception {
        tze tzeVarL0;
        l1h l1hVar;
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.F;
        int i2 = this.G;
        switch (i) {
            case 0:
                dfh dfhVar = (dfh) obj;
                kkh kkhVar = dfhVar.I;
                if (kkhVar != null) {
                    long j = kkhVar.a;
                    vuk.k(dfhVar, (int) (j >> 32), (int) (j & 4294967295L), str);
                } else {
                    vuk.k(dfhVar, kkh.g(dfhVar.H), kkh.f(dfhVar.H), str);
                }
                int iG = kkh.g(dfhVar.H);
                int iE0 = wd6.e0(i2 > 0 ? (iG + i2) - 1 : (iG + i2) - str.length(), 0, dfhVar.F.length());
                dfhVar.f(mwa.m(iE0, iE0));
                return ieiVar;
            case 1:
                lze lzeVar = (lze) obj;
                lzeVar.getClass();
                tzeVarL0 = lzeVar.L0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    tzeVarL0.N(1, str);
                    tzeVarL0.o(2, i2);
                    int iV = iv1.v(tzeVarL0, "work_spec_id");
                    int iV2 = iv1.v(tzeVarL0, "generation");
                    int iV3 = iv1.v(tzeVarL0, "system_id");
                    if (tzeVarL0.H0()) {
                        l1hVar = new l1h(tzeVarL0.g0(iV), (int) tzeVarL0.getLong(iV2), (int) tzeVarL0.getLong(iV3));
                        break;
                    } else {
                        l1hVar = null;
                    }
                    return l1hVar;
                } finally {
                }
            case 2:
                lze lzeVar2 = (lze) obj;
                lzeVar2.getClass();
                tzeVarL0 = lzeVar2.L0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    tzeVarL0.N(1, str);
                    tzeVarL0.o(2, i2);
                    tzeVarL0.H0();
                    return ieiVar;
                } finally {
                }
            default:
                lze lzeVar3 = (lze) obj;
                lzeVar3.getClass();
                tzeVarL0 = lzeVar3.L0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    tzeVarL0.o(1, i2);
                    tzeVarL0.N(2, str);
                    tzeVarL0.H0();
                    return ieiVar;
                } finally {
                }
        }
    }

    public /* synthetic */ wy8(String str, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = i;
    }
}
