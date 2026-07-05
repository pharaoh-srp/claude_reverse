package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.app.l1;
import com.anthropic.claude.app.main.l;
import com.anthropic.claude.app.n0;
import com.anthropic.claude.login.LoginScreens;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m63 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ m63(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.E = i2;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        Object obj3 = this.H;
        Object obj4 = this.G;
        Object obj5 = this.F;
        switch (i) {
            case 0:
                ftc ftcVar = (ftc) obj5;
                lvh lvhVar = (lvh) obj4;
                String str = (String) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    uvk.a(ftcVar, lvhVar, str, null, e18Var, 3072);
                }
                break;
            case 1:
                t53 t53Var = (t53) obj5;
                hw2 hw2Var = (hw2) obj4;
                lc3 lc3Var = (lc3) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    fx2 fx2VarL0 = t53Var.L0();
                    if (fx2VarL0 == null) {
                        fx2VarL0 = null;
                    }
                    xc3 xc3Var = fx2VarL0 != null ? fx2VarL0.a : null;
                    if (xc3Var == null) {
                        e18Var2.a0(-1175571533);
                        Date date = (Date) t53Var.F0.getValue();
                        skd skdVarQ0 = t53Var.Q0();
                        String str2 = skdVarQ0 != null ? skdVarQ0.b : null;
                        q7 q7Var = t53Var.e;
                        if (!q7Var.b()) {
                            q7Var = null;
                        }
                        String display_name = q7Var != null ? q7Var.a().getDisplay_name() : null;
                        boolean zO = t53Var.A.a.o("mobile_personalized_greetings_enabled");
                        List list = (List) t53Var.m1.getValue();
                        boolean z = (((Boolean) hw2Var.T.getValue()).booleanValue() || hw2Var.e0()) ? false : true;
                        boolean zA1 = t53Var.a1();
                        boolean zBooleanValue = ((Boolean) t53Var.S1.getValue()).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) t53Var.T1.getValue()).booleanValue();
                        FillElement fillElement = b.c;
                        boolean zH = e18Var2.h(hw2Var) | e18Var2.f(t53Var);
                        Object objN = e18Var2.N();
                        if (zH || objN == lz1Var) {
                            objN = new o5(hw2Var, 15, t53Var);
                            e18Var2.k0(objN);
                        }
                        nai.d(lc3Var, date, str2, display_name, zO, z, list, (bz7) objN, zA1, zBooleanValue, zBooleanValue2, fillElement, e18Var2, 0);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-1175867707);
                        rvk.c((fn1) mpk.u(xc3Var.b().a(), e18Var2).getValue(), b.c, e18Var2, 48);
                        e18Var2.p(false);
                    }
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                nai.c((lc3) obj5, (zb0) obj4, (iqb) obj3, (ld4) obj, x44.p0(385));
                break;
            case 3:
                y1c y1cVar = (y1c) obj5;
                y1c y1cVar2 = (y1c) obj4;
                y1c y1cVar3 = (y1c) obj3;
                wf4 wf4Var = (wf4) obj;
                ea4 ea4Var = (ea4) obj2;
                wf4Var.getClass();
                ea4Var.getClass();
                if (wf4Var instanceof tf4) {
                    Object obj6 = ((tf4) wf4Var).a;
                } else if (wf4Var instanceof qf4) {
                    Object obj7 = ((qf4) wf4Var).a;
                } else if (!(wf4Var instanceof rf4)) {
                    mr9.b();
                } else {
                    rf4 rf4Var = (rf4) wf4Var;
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                n0.n((g09) obj5, (zkg) obj4, (zy7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                n0.c((wgc) obj5, (vgc) obj4, (pz7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 6:
                yn8 yn8Var = (yn8) obj5;
                of6 of6Var = (of6) obj4;
                zqc zqcVar = (zqc) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    dk3.a(yn8Var, of6Var, zqcVar, null, null, null, null, e18Var3, 0);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                sf5.b((ml3) obj5, (iqb) obj4, (l45) obj3, (ld4) obj, x44.p0(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                dch.g((iqb) obj5, (zhh) obj4, (ta4) obj3, (ld4) obj, x44.p0(385));
                break;
            case 9:
                ((Integer) obj2).getClass();
                knk.f((String) obj3, (mkf) obj5, (sa6) obj4, (ld4) obj, x44.p0(1));
                break;
            case 10:
                oge ogeVar = (oge) obj5;
                rf6 rf6Var = (rf6) obj4;
                zy7 zy7Var = (zy7) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    dgj.h(ogeVar, rf6Var.c, zy7Var, null, e18Var4, 0);
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                l1.a((zqc) obj5, (nf7) obj4, (qzb) obj3, (ld4) obj, x44.p0(513));
                break;
            case 12:
                pe6 pe6Var = (pe6) obj4;
                pf6 pf6Var = (pf6) obj;
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue3 = bool.booleanValue();
                pf6Var.getClass();
                ((pz7) obj5).invoke(pf6Var, bool);
                List list2 = (List) obj3;
                ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((rf6) it.next()).a);
                }
                uf6 uf6VarB = pe6Var.b();
                uf6VarB.getClass();
                List list3 = arrayList;
                if (uf6VarB.c()) {
                    list3 = uf6VarB.a;
                }
                ArrayList arrayListQ1 = w44.q1(list3);
                ArrayList arrayListQ12 = w44.q1(uf6VarB.b);
                arrayListQ1.remove(pf6Var);
                arrayListQ12.remove(pf6Var);
                if (zBooleanValue3) {
                    arrayListQ1.add(pf6Var);
                } else {
                    arrayListQ12.add(0, pf6Var);
                }
                pe6Var.d(uf6.b(uf6VarB, arrayListQ1, arrayListQ12, null, 4));
                break;
            case 13:
                ta4 ta4Var = (ta4) obj5;
                nwb nwbVar = (nwb) obj4;
                zy7 zy7Var2 = (zy7) obj3;
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else if (!((Boolean) nwbVar.getValue()).booleanValue()) {
                    e18Var5.a0(-1104454743);
                    boolean zF = e18Var5.f(nwbVar) | e18Var5.f(zy7Var2);
                    Object objN2 = e18Var5.N();
                    if (zF || objN2 == lz1Var) {
                        objN2 = new vc8(zy7Var2, 5, nwbVar);
                        e18Var5.k0(objN2);
                    }
                    ta4Var.invoke((zy7) objN2, e18Var5, 0);
                    e18Var5.p(false);
                } else {
                    e18Var5.a0(-1104349994);
                    e18Var5.p(false);
                }
                break;
            case 14:
                ((Integer) obj2).getClass();
                eve.g((oke) obj5, (qi3) obj4, (rc8) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                rwe rweVar = (rwe) obj5;
                k3g k3gVar = (k3g) obj4;
                nwb nwbVar2 = (nwb) obj3;
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var6.T();
                } else if (!(iv1.t(rweVar) instanceof LoginScreens.Welcome)) {
                    e18Var6.a0(-1592866586);
                    v40.c(null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var6, 0, 3);
                    e18Var6.p(false);
                } else {
                    e18Var6.a0(-1593125870);
                    oq5.c(k3gVar, ((Boolean) nwbVar2.getValue()).booleanValue(), e18Var6, 0);
                    e18Var6.p(false);
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                l.b((rwe) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((Integer) obj2).getClass();
                xn5.R((String) obj3, (iqb) obj5, (ta4) obj4, (ld4) obj, x44.p0(3127));
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((Integer) obj2).getClass();
                ez1.j((zy7) obj5, (oke) obj4, (qi3) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ta4 ta4Var2 = (ta4) obj5;
                ia0 ia0Var = (ia0) obj4;
                ie3 ie3Var = (ie3) obj3;
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e18Var7.T();
                } else {
                    ta4Var2.i(ia0Var, ie3Var.a, e18Var7, 0);
                }
                break;
            default:
                n54 n54Var = (n54) obj5;
                zbi zbiVar = (zbi) obj4;
                pz7 pz7Var = (pz7) obj3;
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    e18Var8.T();
                } else {
                    jwa.b(n54Var, null, zbiVar, pz7Var, e18Var8, 0, 2);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ m63(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    public /* synthetic */ m63(String str, Object obj, Object obj2, int i, int i2) {
        this.E = i2;
        this.H = str;
        this.F = obj;
        this.G = obj2;
    }
}
