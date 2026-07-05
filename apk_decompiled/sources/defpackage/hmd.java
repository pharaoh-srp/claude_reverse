package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hmd implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ kmd F;

    public /* synthetic */ hmd(imd imdVar, kmd kmdVar, int i) {
        this.E = i;
        this.F = kmdVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Exception {
        tze tzeVarL0;
        int i = this.E;
        kmd kmdVar = this.F;
        lze lzeVar = (lze) obj;
        switch (i) {
            case 0:
                lzeVar.getClass();
                tzeVarL0 = lzeVar.L0("SELECT * FROM projectIdListEntries WHERE source = ?");
                try {
                    tzeVarL0.N(1, imd.a(kmdVar));
                    int iV = iv1.v(tzeVarL0, "source");
                    int iV2 = iv1.v(tzeVarL0, "project_uuid");
                    ArrayList arrayList = new ArrayList();
                    while (tzeVarL0.H0()) {
                        arrayList.add(new jmd(imd.b(tzeVarL0.g0(iV)), tzeVarL0.g0(iV2)));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            default:
                lzeVar.getClass();
                tzeVarL0 = lzeVar.L0("DELETE FROM projectIdListEntries WHERE source = ?");
                try {
                    tzeVarL0.N(1, imd.a(kmdVar));
                    tzeVarL0.H0();
                    tzeVarL0.close();
                    return iei.a;
                } finally {
                }
        }
    }
}
