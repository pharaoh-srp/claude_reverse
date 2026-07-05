package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i03 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t4g F;

    public /* synthetic */ i03(t4g t4gVar, int i) {
        this.E = i;
        this.F = t4gVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        t4g t4gVar = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    tqh tqhVar = tqh.T;
                    ud0 ud0Var = ud0.d;
                    String strJ0 = d4c.j0(R.string.connector_directory_title, e18Var);
                    boolean zH = e18Var.h(t4gVar);
                    Object objN = e18Var.N();
                    if (zH || objN == lz1Var) {
                        objN = new ue(t4gVar, 6);
                        e18Var.k0(objN);
                    }
                    tqhVar.y(ud0Var, strJ0, null, false, (zy7) objN, e18Var, 196608, 12);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    tqh tqhVar2 = tqh.T;
                    ud0 ud0Var2 = ud0.d;
                    String strJ02 = d4c.j0(R.string.connector_directory_title, e18Var2);
                    boolean zH2 = e18Var2.h(t4gVar);
                    Object objN2 = e18Var2.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new ue(t4gVar, 7);
                        e18Var2.k0(objN2);
                    }
                    tqhVar2.y(ud0Var2, strJ02, null, false, (zy7) objN2, e18Var2, 196608, 12);
                }
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                t4gVar.d(new CodeRemoteBottomSheetDestination.ViewCode(str, (String) obj2));
                break;
            default:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                str3.getClass();
                t4gVar.d(new CodeRemoteBottomSheetDestination.ChannelMessage(str2, str3));
                break;
        }
        return ieiVar;
    }
}
