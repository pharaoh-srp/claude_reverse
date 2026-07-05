package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.project.knowledge.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iw0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ iw0(jme jmeVar, boolean z, iqb iqbVar, boolean z2, zy7 zy7Var, int i) {
        this.E = 9;
        this.I = jmeVar;
        this.F = z;
        this.H = iqbVar;
        this.G = z2;
        this.J = zy7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        iei ieiVar;
        int i = this.E;
        iei ieiVar2 = iei.a;
        Object obj3 = this.J;
        Object obj4 = this.H;
        Object obj5 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                huk.c((su0) obj5, this.F, this.G, (zy7) obj3, (iqb) obj4, (ld4) obj, x44.p0(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                o61.a((dmc) obj5, (y49) obj3, this.F, this.G, (iqb) obj4, (ld4) obj, x44.p0(73));
                break;
            case 2:
                ((Integer) obj2).getClass();
                osk.g((opg) obj5, this.F, (zy7) obj3, (iqb) obj4, this.G, (ld4) obj, x44.p0(9));
                break;
            case 3:
                zy7 zy7Var = (zy7) obj3;
                zy7 zy7Var2 = (zy7) obj5;
                iqb iqbVar = (iqb) obj4;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, fqb.E);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, cxeVarA);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    py8 py8VarE = ntk.e;
                    if (py8VarE != null) {
                        ieiVar = ieiVar2;
                    } else {
                        oy8 oy8Var = new oy8("AutoMirrored.Filled.KeyboardArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i2 = asi.a;
                        ieiVar = ieiVar2;
                        eeg eegVar = new eeg(d54.b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new zuc(15.41f, 16.59f));
                        arrayList.add(new yuc(10.83f, 12.0f));
                        arrayList.add(new gvc(4.58f, -4.59f));
                        arrayList.add(new yuc(14.0f, 6.0f));
                        arrayList.add(new gvc(-6.0f, 6.0f));
                        arrayList.add(new gvc(6.0f, 6.0f));
                        arrayList.add(new gvc(1.41f, -1.41f));
                        arrayList.add(vuc.c);
                        oy8Var.c(1.0f, 1.0f, 1.0f, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, 2, eegVar, null, "", arrayList);
                        py8VarE = oy8Var.e();
                        ntk.e = py8VarE;
                    }
                    cn5.h(zy7Var, py8VarE, dch.E(R.string.m3c_date_picker_switch_to_previous_month, e18Var), null, this.F, e18Var, 0, 8);
                    py8 py8VarE2 = ntk.f;
                    if (py8VarE2 == null) {
                        oy8 oy8Var2 = new oy8("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i3 = asi.a;
                        eeg eegVar2 = new eeg(d54.b);
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new zuc(8.59f, 16.59f));
                        arrayList2.add(new yuc(13.17f, 12.0f));
                        arrayList2.add(new yuc(8.59f, 7.41f));
                        arrayList2.add(new yuc(10.0f, 6.0f));
                        arrayList2.add(new gvc(6.0f, 6.0f));
                        arrayList2.add(new gvc(-6.0f, 6.0f));
                        arrayList2.add(new gvc(-1.41f, -1.41f));
                        arrayList2.add(vuc.c);
                        oy8Var2.c(1.0f, 1.0f, 1.0f, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, 2, eegVar2, null, "", arrayList2);
                        py8VarE2 = oy8Var2.e();
                        ntk.f = py8VarE2;
                    }
                    cn5.h(zy7Var2, py8VarE2, dch.E(R.string.m3c_date_picker_switch_to_next_month, e18Var), iqbVar, this.G, e18Var, 0, 0);
                    e18Var.p(true);
                }
                break;
            case 4:
                kyb kybVar = (kyb) obj5;
                yig yigVar = (yig) obj3;
                pz7 pz7Var = (pz7) obj4;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    zh4.h(((d54) f8g.a(!this.G ? kybVar.g : this.F ? kybVar.b : kybVar.e, yigVar, null, e18Var2, 0, 12).getValue()).a, bci.a(ttj.m, e18Var2), pz7Var, e18Var2, 0);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                vtk.b((m0c) obj5, this.F, this.G, (zy7) obj3, (iqb) obj4, (ld4) obj, x44.p0(24577));
                break;
            case 6:
                zub zubVar = (zub) obj5;
                ffh ffhVar = (ffh) obj3;
                e0g e0gVar = (e0g) obj4;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    k2e.K.m(this.F, this.G, zubVar, null, ffhVar, e0gVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var3, 100663296, 200);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                a.b((rwe) obj5, (List) obj3, (List) obj4, this.F, this.G, (ld4) obj, x44.p0(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                qik.h((lod) obj5, this.F, this.G, (zy7) obj3, (String) obj4, (ld4) obj, x44.p0(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ime.c((jme) obj5, this.F, (iqb) obj4, this.G, (zy7) obj3, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar2;
    }

    public /* synthetic */ iw0(kyb kybVar, boolean z, boolean z2, yig yigVar, pz7 pz7Var) {
        this.E = 4;
        this.I = kybVar;
        this.F = z;
        this.G = z2;
        this.J = yigVar;
        this.H = pz7Var;
    }

    public /* synthetic */ iw0(dmc dmcVar, y49 y49Var, boolean z, boolean z2, iqb iqbVar, int i) {
        this.E = 1;
        this.I = dmcVar;
        this.J = y49Var;
        this.F = z;
        this.G = z2;
        this.H = iqbVar;
    }

    public /* synthetic */ iw0(zy7 zy7Var, boolean z, zy7 zy7Var2, iqb iqbVar, boolean z2) {
        this.E = 3;
        this.J = zy7Var;
        this.F = z;
        this.I = zy7Var2;
        this.H = iqbVar;
        this.G = z2;
    }

    public /* synthetic */ iw0(rwe rweVar, List list, List list2, boolean z, boolean z2, int i) {
        this.E = 7;
        this.I = rweVar;
        this.J = list;
        this.H = list2;
        this.F = z;
        this.G = z2;
    }

    public /* synthetic */ iw0(opg opgVar, boolean z, zy7 zy7Var, iqb iqbVar, boolean z2, int i) {
        this.E = 2;
        this.I = opgVar;
        this.F = z;
        this.J = zy7Var;
        this.H = iqbVar;
        this.G = z2;
    }

    public /* synthetic */ iw0(Object obj, boolean z, boolean z2, zy7 zy7Var, Object obj2, int i, int i2) {
        this.E = i2;
        this.I = obj;
        this.F = z;
        this.G = z2;
        this.J = zy7Var;
        this.H = obj2;
    }

    public /* synthetic */ iw0(boolean z, boolean z2, zub zubVar, ffh ffhVar, e0g e0gVar) {
        this.E = 6;
        this.F = z;
        this.G = z2;
        this.I = zubVar;
        this.J = ffhVar;
        this.H = e0gVar;
    }
}
