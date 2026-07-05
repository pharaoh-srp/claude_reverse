package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bu2 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ bu2(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Typeface typefaceM;
        int i = this.E;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        Object obj4 = this.G;
        Object obj5 = this.F;
        switch (i) {
            case 0:
                pn8 pn8Var = (pn8) obj5;
                on8 on8Var = (on8) obj4;
                iqb iqbVar = (iqb) obj;
                ((Integer) obj3).getClass();
                iqbVar.getClass();
                e18 e18Var = (e18) ((ld4) obj2);
                e18Var.a0(1450519116);
                Object objN = e18Var.N();
                if (objN == lz1Var) {
                    objN = mpk.P(null);
                    e18Var.k0(objN);
                }
                nwb nwbVar = (nwb) objN;
                Object objN2 = e18Var.N();
                if (objN2 == lz1Var) {
                    objN2 = new ig1(2, nwbVar);
                    e18Var.k0(objN2);
                }
                iqb iqbVarP0 = xn5.p0(iqbVar, (bz7) objN2);
                boolean zH = e18Var.h(on8Var) | e18Var.f(pn8Var);
                Object objN3 = e18Var.N();
                if (zH || objN3 == lz1Var) {
                    objN3 = new dv2(on8Var, pn8Var, nwbVar);
                    e18Var.k0(objN3);
                }
                iqb iqbVarB = a0h.b(iqbVarP0, pn8Var, on8Var, (PointerInputEventHandler) objN3);
                e18Var.p(false);
                return iqbVarB;
            case 1:
                xa1 xa1Var = (xa1) obj5;
                jyb jybVar = (jyb) obj;
                Boolean bool = (Boolean) obj3;
                bool.booleanValue();
                jybVar.getClass();
                xa1Var.c.a(xa1Var, wa1.d[0], bool);
                ((pz7) obj4).invoke(jybVar, (jyb) obj2);
                return ieiVar;
            case 2:
                zy7 zy7Var = (zy7) obj5;
                tkh tkhVar = (tkh) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var2 = (e18) ld4Var;
                if (e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strJ0 = d4c.j0(R.string.chat_new_chat, e18Var2);
                    int i2 = syb.a;
                    ez1.h(strJ0, zy7Var, null, false, null, kxk.b, null, null, syb.a(gm3.a(e18Var2).q, d54.g, gm3.a(e18Var2).c, gm3.a(e18Var2).c, e18Var2, 116), tkhVar, gm3.a(e18Var2).c, e18Var2, 199680, 0, 212);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 3:
                fca fcaVar = (fca) obj5;
                zy7 zy7Var2 = (zy7) obj4;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var3 = (e18) ld4Var2;
                if (!e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var3.T();
                } else if (fcaVar.k.a()) {
                    e18Var3.a0(464314614);
                    ez1.e(zy7Var2, null, false, null, null, j8.c, e18Var3, 1572864, 62);
                    e18Var3.p(false);
                } else {
                    e18Var3.a0(464654808);
                    e18Var3.p(false);
                }
                return ieiVar;
            case 4:
                ta4 ta4Var = (ta4) obj5;
                ybg ybgVar = (ybg) obj4;
                mnc mncVar = (mnc) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                mncVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(mncVar) ? 4 : 2;
                }
                e18 e18Var4 = (e18) ld4Var3;
                if (e18Var4.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    ta4Var.i(mncVar, ybgVar, e18Var4, Integer.valueOf(48 | (iIntValue3 & 14)));
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 5:
                noh nohVar = (noh) obj5;
                el5 el5Var = (el5) obj4;
                ia0 ia0Var = (ia0) obj;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ia0Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? ((e18) ld4Var4).f(ia0Var) : ((e18) ld4Var4).h(ia0Var) ? 4 : 2;
                }
                e18 e18Var5 = (e18) ld4Var4;
                if (e18Var5.Q(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    nohVar.E.c().a(nohVar.F.toString(), fd9.q0(-1491709047, new fga(el5Var, 8, ia0Var), e18Var5), e18Var5, 48);
                } else {
                    e18Var5.T();
                }
                return ieiVar;
            case 6:
                Spannable spannable = (Spannable) obj5;
                a40 a40Var = (a40) obj4;
                egg eggVar = (egg) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int iIntValue6 = ((Integer) obj3).intValue();
                xt7 xt7Var = eggVar.f;
                dv7 dv7Var = eggVar.c;
                if (dv7Var == null) {
                    dv7Var = dv7.J;
                }
                wu7 wu7Var = eggVar.d;
                int i3 = wu7Var != null ? wu7Var.a : 0;
                xu7 xu7Var = eggVar.e;
                int i4 = xu7Var != null ? xu7Var.a : 65535;
                b40 b40Var = (b40) a40Var.F;
                ubi ubiVarB = ((zt7) b40Var.I).b(xt7Var, dv7Var, i3, i4);
                if (ubiVarB instanceof tbi) {
                    Object obj6 = ((tbi) ubiVarB).E;
                    obj6.getClass();
                    typefaceM = (Typeface) obj6;
                } else {
                    lrb lrbVar = new lrb(ubiVarB, b40Var.N);
                    b40Var.N = lrbVar;
                    typefaceM = lrbVar.M();
                }
                spannable.setSpan(new bu7(1, typefaceM), iIntValue5, iIntValue6, 33);
                return ieiVar;
            case 7:
                lhh lhhVar = (lhh) obj5;
                zub zubVar = (zub) obj4;
                ((Integer) obj3).getClass();
                e18 e18Var6 = (e18) ((ld4) obj2);
                e18Var6.a0(-102778667);
                Object objN4 = e18Var6.N();
                Object obj7 = objN4;
                if (objN4 == lz1Var) {
                    l45 l45VarO = fd9.O(im6.E, e18Var6);
                    e18Var6.k0(l45VarO);
                    obj7 = l45VarO;
                }
                l45 l45Var = (l45) obj7;
                Object objN5 = e18Var6.N();
                Object obj8 = objN5;
                if (objN5 == lz1Var) {
                    lsc lscVarP = mpk.P(null);
                    e18Var6.k0(lscVarP);
                    obj8 = lscVarP;
                }
                nwb nwbVar2 = (nwb) obj8;
                nwb nwbVarZ = mpk.Z(lhhVar, e18Var6);
                boolean zF = e18Var6.f(zubVar);
                Object objN6 = e18Var6.N();
                Object obj9 = objN6;
                if (zF || objN6 == lz1Var) {
                    e6f e6fVar = new e6f(nwbVar2, 6, zubVar);
                    e18Var6.k0(e6fVar);
                    obj9 = e6fVar;
                }
                fd9.d(zubVar, (bz7) obj9, e18Var6);
                boolean zH2 = e18Var6.h(l45Var) | e18Var6.f(zubVar) | e18Var6.f(nwbVarZ);
                Object objN7 = e18Var6.N();
                Object obj10 = objN7;
                if (zH2 || objN7 == lz1Var) {
                    ohh ohhVar = new ohh(l45Var, nwbVar2, zubVar, nwbVarZ);
                    e18Var6.k0(ohhVar);
                    obj10 = ohhVar;
                }
                iqb iqbVarA = a0h.a(fqb.E, zubVar, (PointerInputEventHandler) obj10);
                e18Var6.p(false);
                return iqbVarA;
            default:
                sz7 sz7Var = (sz7) obj5;
                qoh qohVar = (qoh) obj4;
                vpc vpcVar = (vpc) obj;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((e18) ld4Var5).f(vpcVar) ? 4 : 2;
                }
                e18 e18Var7 = (e18) ld4Var5;
                if (e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    sz7Var.i(qohVar, vpcVar, e18Var7, Integer.valueOf((iIntValue7 << 3) & 112));
                } else {
                    e18Var7.T();
                }
                return ieiVar;
        }
    }
}
