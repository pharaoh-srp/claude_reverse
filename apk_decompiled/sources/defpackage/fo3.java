package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fo3 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ zy7 G;

    public /* synthetic */ fo3(zy7 zy7Var, String str) {
        this.E = 0;
        this.G = zy7Var;
        this.F = str;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        String strN = this.F;
        iei ieiVar = iei.a;
        int i2 = 0;
        switch (i) {
            case 0:
                ((Integer) obj3).getClass();
                ((iqb) obj).getClass();
                e18 e18Var = (e18) ((ld4) obj2);
                e18Var.a0(1209147702);
                Object objN = e18Var.N();
                lz1 lz1Var = jd4.a;
                if (objN == lz1Var) {
                    objN = vb7.f(e18Var);
                }
                zub zubVar = (zub) objN;
                Object objN2 = e18Var.N();
                if (objN2 == lz1Var) {
                    objN2 = mpk.P(null);
                    e18Var.k0(objN2);
                }
                nwb nwbVar = (nwb) objN2;
                Object objN3 = e18Var.N();
                if (objN3 == lz1Var) {
                    objN3 = mpk.P(new g79(0L));
                    e18Var.k0(objN3);
                }
                nwb nwbVar2 = (nwb) objN3;
                Object objN4 = e18Var.N();
                if (objN4 == lz1Var) {
                    objN4 = new x40(15, nwbVar2);
                    e18Var.k0(objN4);
                }
                iqb iqbVarV0 = wd6.v0(fqbVar, (bz7) objN4);
                zy7 zy7Var = this.G;
                boolean zF = e18Var.f(zy7Var);
                Object objN5 = e18Var.N();
                if (zF || objN5 == lz1Var) {
                    objN5 = new io3(0, zy7Var);
                    e18Var.k0(objN5);
                }
                iqb iqbVarA = a0h.a(iqbVarV0, ieiVar, (PointerInputEventHandler) objN5);
                boolean zF2 = e18Var.f(strN) | e18Var.f(zy7Var);
                Object objN6 = e18Var.N();
                if (zF2 || objN6 == lz1Var) {
                    objN6 = new go3(i2, zy7Var, strN);
                    e18Var.k0(objN6);
                }
                iqb iqbVarB = tjf.b(iqbVarA, true, (bz7) objN6);
                boolean zF3 = e18Var.f(zy7Var);
                Object objN7 = e18Var.N();
                if (zF3 || objN7 == lz1Var) {
                    jo3 jo3Var = new jo3(nwbVar, nwbVar2, zubVar, zy7Var, 0);
                    e18Var.k0(jo3Var);
                    objN7 = jo3Var;
                }
                iqb iqbVarM = dch.M(iqbVarB, (bz7) objN7);
                Object objN8 = e18Var.N();
                if (objN8 == lz1Var) {
                    objN8 = new lj2(nwbVar, 8, zubVar);
                    e18Var.k0(objN8);
                }
                iqb iqbVarC = ez1.C(d19.a(u00.C(iqbVarM, (bz7) objN8), zubVar, (h19) e18Var.j(d19.a)), zubVar, 1);
                e18Var.p(false);
                break;
            case 1:
                dxe dxeVar = (dxe) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                dxeVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(dxeVar) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var2.T();
                } else {
                    tjh.b(this.F, dxeVar.a(fqbVar, 1.0f, true), gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).k, e18Var2, 0, 0, 131064);
                    h66.f(this.G, e18Var2, 0);
                }
                break;
            case 2:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var3 = (e18) ld4Var2;
                if (!e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    ud0 ud0Var = ud0.e;
                    if (strN == null) {
                        strN = vb7.n(e18Var3, -646908956, R.string.code_agent_picker_title, e18Var3, false);
                    } else {
                        e18Var3.a0(-646909204);
                        e18Var3.p(false);
                    }
                    t3c.g(ud0Var, strN, this.G, null, false, e18Var3, 0, 24);
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var4 = (e18) ld4Var3;
                if (!e18Var4.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var4.T();
                } else {
                    ud0 ud0Var2 = ud0.R;
                    if (strN == null) {
                        strN = vb7.n(e18Var4, -717107214, R.string.ccr_sheet_choose_environment, e18Var4, false);
                    } else {
                        e18Var4.a0(-717107803);
                        e18Var4.p(false);
                    }
                    t3c.g(ud0Var2, strN, this.G, null, false, e18Var4, 0, 24);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ fo3(int i, zy7 zy7Var, String str) {
        this.E = i;
        this.F = str;
        this.G = zy7Var;
    }
}
