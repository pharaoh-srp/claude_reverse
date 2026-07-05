package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j73 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;

    public /* synthetic */ j73(String str, int i) {
        this.E = i;
        this.F = str;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Exception {
        tze tzeVarL0;
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.F;
        switch (i) {
            case 0:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.l(ekfVar, str);
                return ieiVar;
            case 1:
                ekf ekfVar2 = (ekf) obj;
                ekfVar2.getClass();
                ckf.q(ekfVar2, str);
                return ieiVar;
            case 2:
                ekf ekfVar3 = (ekf) obj;
                ekfVar3.getClass();
                ckf.l(ekfVar3, str);
                return ieiVar;
            case 3:
                ekf ekfVar4 = (ekf) obj;
                ekfVar4.getClass();
                ckf.l(ekfVar4, str);
                return ieiVar;
            case 4:
                ekf ekfVar5 = (ekf) obj;
                ckf.l(ekfVar5, str);
                ckf.s(ekfVar5, 5);
                return ieiVar;
            case 5:
                ekf ekfVar6 = (ekf) obj;
                ckf.l(ekfVar6, str);
                ckf.s(ekfVar6, 5);
                return ieiVar;
            case 6:
                ekf ekfVar7 = (ekf) obj;
                ekfVar7.getClass();
                ckf.l(ekfVar7, str);
                return ieiVar;
            case 7:
                ekf ekfVar8 = (ekf) obj;
                ekfVar8.getClass();
                ckf.l(ekfVar8, str);
                return ieiVar;
            case 8:
                ekf ekfVar9 = (ekf) obj;
                ekfVar9.getClass();
                ckf.l(ekfVar9, str);
                return ieiVar;
            case 9:
                lze lzeVar = (lze) obj;
                lzeVar.getClass();
                tzeVarL0 = lzeVar.L0("SELECT long_value FROM Preference where `key`=?");
                try {
                    tzeVarL0.N(1, str);
                    Long lValueOf = null;
                    if (tzeVarL0.H0() && !tzeVarL0.isNull(0)) {
                        lValueOf = Long.valueOf(tzeVarL0.getLong(0));
                        break;
                    }
                    return lValueOf;
                } finally {
                }
            case 10:
                ((swe) obj).getClass();
                return new smf(str);
            case 11:
                wn9[] wn9VarArr = ckf.a;
                ((ekf) obj).a(akf.O, str);
                return ieiVar;
            case 12:
                ekf ekfVar10 = (ekf) obj;
                ekfVar10.getClass();
                ckf.l(ekfVar10, str);
                return ieiVar;
            case 13:
                lze lzeVar2 = (lze) obj;
                lzeVar2.getClass();
                tzeVarL0 = lzeVar2.L0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    tzeVarL0.N(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (tzeVarL0.H0()) {
                        arrayList.add(tzeVarL0.g0(0));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            default:
                lze lzeVar3 = (lze) obj;
                lzeVar3.getClass();
                tzeVarL0 = lzeVar3.L0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    tzeVarL0.N(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (tzeVarL0.H0()) {
                        arrayList2.add(tzeVarL0.g0(0));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
        }
    }
}
