package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.models.organization.configtypes.CCRStarterTask;
import com.anthropic.claude.models.organization.configtypes.CCRStarterTaskConfig;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hy3 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ i F;
    public final /* synthetic */ bz7 G;

    public /* synthetic */ hy3(int i, bz7 bz7Var, i iVar) {
        this.E = i;
        this.F = iVar;
        this.G = bz7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CCRStarterTaskConfig cCRStarterTaskConfig;
        List<CCRStarterTask> tasks;
        String str;
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    bz7 bz7Var = this.G;
                    boolean zF = e18Var.f(bz7Var);
                    Object objN = e18Var.N();
                    if (zF || objN == jd4.a) {
                        objN = new f7(4, bz7Var);
                        e18Var.k0(objN);
                    }
                    nuj.b(this.F, (bz7) objN, i4gVar, null, e18Var, (iIntValue << 6) & 896);
                }
                break;
            default:
                px9 px9Var = (px9) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                px9Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(px9Var) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    i iVar = this.F;
                    List<CCRStarterTask> list = (iVar.Q0() || (cCRStarterTaskConfig = (CCRStarterTaskConfig) iVar.r.f("ccr_starter_tasks_config", CCRStarterTaskConfig.Companion.serializer()).getValue()) == null || (tasks = cCRStarterTaskConfig.getTasks()) == null) ? lm6.E : tasks;
                    String strN = (String) iVar.f1.getValue();
                    if (strN == null) {
                        e18Var2.a0(215483697);
                        e18Var2.p(false);
                        str = null;
                    } else {
                        e18Var2.a0(215483698);
                        if (strN.equals("error:connection_lost_while_sending")) {
                            strN = vb7.n(e18Var2, -984598182, R.string.error_connection_lost_while_sending, e18Var2, false);
                        } else {
                            e18Var2.a0(-984595741);
                            e18Var2.p(false);
                        }
                        e18Var2.p(false);
                        str = strN;
                    }
                    g34.d(list, this.G, str, px9.a(px9Var, new qsc(null, px9Var.b, 2), null, null, 7), e18Var2, 0);
                }
                break;
        }
        return ieiVar;
    }
}
