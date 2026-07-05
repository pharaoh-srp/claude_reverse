package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ys2 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ft2 F;

    public /* synthetic */ ys2(zs2 zs2Var, ft2 ft2Var, int i) {
        this.E = i;
        this.F = ft2Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Exception {
        tze tzeVarL0;
        int i = this.E;
        ft2 ft2Var = this.F;
        lze lzeVar = (lze) obj;
        switch (i) {
            case 0:
                lzeVar.getClass();
                tzeVarL0 = lzeVar.L0("SELECT * FROM chatIdListEntries WHERE source = ?");
                try {
                    tzeVarL0.N(1, vz8.F(ft2Var));
                    int iV = iv1.v(tzeVarL0, "source");
                    int iV2 = iv1.v(tzeVarL0, "chat_uuid");
                    ArrayList arrayList = new ArrayList();
                    while (tzeVarL0.H0()) {
                        arrayList.add(new at2(vz8.L(tzeVarL0.g0(iV)), tzeVarL0.g0(iV2)));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            default:
                lzeVar.getClass();
                tzeVarL0 = lzeVar.L0("DELETE FROM chatIdListEntries WHERE source = ?");
                try {
                    tzeVarL0.N(1, vz8.F(ft2Var));
                    tzeVarL0.H0();
                    tzeVarL0.close();
                    return iei.a;
                } finally {
                }
        }
    }
}
