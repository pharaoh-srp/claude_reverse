package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dk1 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ dk1(nwb nwbVar, zy7 zy7Var) {
        this.E = 2;
        this.G = nwbVar;
        this.F = zy7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        nwb nwbVar = this.G;
        zy7 zy7Var = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    jwk.g(0, e18Var, zy7Var, null, ((Boolean) nwbVar.getValue()).booleanValue());
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    boolean zF = e18Var2.f(zy7Var);
                    Object objN = e18Var2.N();
                    if (zF || objN == lz1Var) {
                        objN = new pn(zy7Var, nwbVar, 19);
                        e18Var2.k0(objN);
                    }
                    t30.b(dmk.b, (zy7) objN, null, null, null, false, null, null, e18Var2, 6, 508);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    String strJ0 = d4c.j0(R.string.chat_sharing_report, e18Var3);
                    bpc bpcVarA = a.a(ud0.q0, e18Var3);
                    float f = wcb.a;
                    ycb ycbVarB = wcb.b(e18Var3);
                    ycb ycbVarB2 = ycbVarB.b(gm3.a(e18Var3).z, ycbVarB.b, gm3.a(e18Var3).z, ycbVarB.d, ycbVarB.e, ycbVarB.f);
                    boolean zF2 = e18Var3.f(nwbVar) | e18Var3.f(zy7Var);
                    Object objN2 = e18Var3.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new pn(zy7Var, nwbVar, 26);
                        e18Var3.k0(objN2);
                    }
                    uuj.a(strJ0, bpcVarA, (zy7) objN2, null, null, false, null, ycbVarB2, null, null, 0, 0, e18Var3, 64, 3960);
                }
                break;
            default:
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    e18Var4.T();
                } else {
                    bpc bpcVarA2 = a.a(ud0.L1, e18Var4);
                    boolean zF3 = e18Var4.f(zy7Var);
                    Object objN3 = e18Var4.N();
                    if (zF3 || objN3 == lz1Var) {
                        objN3 = new pn(zy7Var, nwbVar, 27);
                        e18Var4.k0(objN3);
                    }
                    uuj.a("Inspect raw events", bpcVarA2, (zy7) objN3, null, null, false, null, null, null, null, 0, 0, e18Var4, 70, 4088);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ dk1(zy7 zy7Var, nwb nwbVar, int i) {
        this.E = i;
        this.F = zy7Var;
        this.G = nwbVar;
    }
}
