package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lk4 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ kk4 F;

    public /* synthetic */ lk4(kk4 kk4Var, int i) {
        this.E = i;
        this.F = kk4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    bpc bpcVarA = a.a(ud0.X, e18Var);
                    String strJ0 = d4c.j0(R.string.connector_discovery_setting_title, e18Var);
                    zb0 zb0VarI = zrk.i(R.string.connector_discovery_setting_description, e18Var);
                    kk4 kk4Var = this.F;
                    boolean zR = x44.r((Boolean) kk4Var.c.p.getValue(), Boolean.TRUE);
                    boolean zH = e18Var.h(kk4Var);
                    Object objN = e18Var.N();
                    if (zH || objN == jd4.a) {
                        Object ub2Var = new ub2(1, kk4Var, kk4.class, "onConnectorDiscoveryCheckedChange", "onConnectorDiscoveryCheckedChange(Z)V", 0, 23);
                        e18Var.k0(ub2Var);
                        objN = ub2Var;
                    }
                    yhk.d(bpcVarA, strJ0, zR, (bz7) ((jm9) objN), null, zb0VarI, false, e18Var, 8, 208);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    yhk.a(null, fd9.q0(198748479, new lk4(this.F, objArr == true ? 1 : 0), e18Var2), e18Var2, 48);
                }
                break;
        }
        return ieiVar;
    }
}
