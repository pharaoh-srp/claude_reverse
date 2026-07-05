package defpackage;

import android.content.Context;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.settings.internal.e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ jn0(dae daeVar, dae daeVar2, dae daeVar3, Context context, RemoteViews remoteViews, c59 c59Var, dae daeVar4, dae daeVar5, dae daeVar6, f6i f6iVar, dae daeVar7, dae daeVar8, dae daeVar9) {
        this.E = 0;
        this.F = daeVar;
        this.G = daeVar2;
        this.H = daeVar3;
        this.M = remoteViews;
        this.N = c59Var;
        this.I = daeVar4;
        this.J = daeVar6;
        this.K = daeVar8;
        this.L = daeVar9;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        jnc jncVar;
        iqb iqbVarT;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.K;
        Object obj7 = this.J;
        Object obj8 = this.I;
        Object obj9 = this.H;
        Object obj10 = this.G;
        Object obj11 = this.F;
        switch (i) {
            case 0:
                dae daeVar = (dae) obj11;
                dae daeVar2 = (dae) obj10;
                dae daeVar3 = (dae) obj9;
                RemoteViews remoteViews = (RemoteViews) obj4;
                c59 c59Var = (c59) obj3;
                dae daeVar4 = (dae) obj8;
                dae daeVar5 = (dae) obj7;
                dae daeVar6 = (dae) obj6;
                dae daeVar7 = (dae) obj5;
                p68 p68Var = (p68) obj2;
                if (p68Var instanceof pb) {
                    if (daeVar.E != null) {
                        Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                    }
                    daeVar.E = p68Var;
                } else if (p68Var instanceof gaj) {
                    daeVar2.E = p68Var;
                } else if (p68Var instanceof km8) {
                    daeVar3.E = p68Var;
                } else if (p68Var instanceof bc1) {
                    bc1 bc1Var = (bc1) p68Var;
                    int i2 = c59Var.a;
                    if (!(bc1Var instanceof bc1)) {
                        wg6.i();
                    } else {
                        remoteViews.setInt(i2, "setBackgroundResource", bc1Var.a.a);
                    }
                } else if (p68Var instanceof jnc) {
                    jnc jncVar2 = (jnc) daeVar4.E;
                    if (jncVar2 != null) {
                        jnc jncVar3 = (jnc) p68Var;
                        jncVar = new jnc(jncVar2.a.a(jncVar3.a), jncVar2.b.a(jncVar3.b), jncVar2.c.a(jncVar3.c), jncVar2.d.a(jncVar3.d), jncVar2.e.a(jncVar3.e), jncVar2.f.a(jncVar3.f));
                    } else {
                        jncVar = (jnc) p68Var;
                    }
                    daeVar4.E = jncVar;
                } else if (p68Var instanceof q35) {
                    daeVar5.E = null;
                } else if (!(p68Var instanceof bu)) {
                    if (p68Var instanceof an6) {
                        daeVar6.E = p68Var;
                    } else if (!(p68Var instanceof rjf)) {
                        Log.w("GlanceAppWidget", "Unknown modifier '" + p68Var + "', nothing done.");
                    } else {
                        daeVar7.E = p68Var;
                    }
                }
                break;
            case 1:
                iqb iqbVar = (iqb) obj11;
                z02 z02Var = (z02) obj10;
                a12 a12Var = (a12) obj9;
                zub zubVar = (zub) obj8;
                zy7 zy7Var = (zy7) obj7;
                d54 d54Var = (d54) obj6;
                mnc mncVar = (mnc) obj5;
                wlg wlgVar = (wlg) obj4;
                ta4 ta4Var = (ta4) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    wo1 wo1Var = lja.Q;
                    iqb iqbVarP = yfd.p(b.c(xn5.V(androidx.compose.foundation.layout.b.e(iqbVar, z02Var.d(e18Var)), z02Var.a(e18Var)), a12Var != a12.H, null, new vue(0), zubVar, zy7Var, 2), ((d54) wlgVar.getValue()).a, zni.b);
                    iqb iqbVarI = fqb.E;
                    if (d54Var != null) {
                        e18Var.a0(1734661070);
                        qnc qncVar = p02.a;
                        iqbVarT = ez1.t(iqbVarI, 1.0f, d54Var.a, z02Var.a(e18Var));
                        e18Var.p(false);
                    } else {
                        e18Var.a0(1734911891);
                        e18Var.p(false);
                        iqbVarT = iqbVarI;
                    }
                    iqb iqbVarB = iqbVarP.B(iqbVarT);
                    if (mncVar != null) {
                        iqbVarI = gb9.I(iqbVarI, mncVar);
                    }
                    iqb iqbVarB2 = iqbVarB.B(iqbVarI);
                    cxe cxeVarA = axe.a(ko0.e, wo1Var, e18Var, 54);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarB2);
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
                    ta4Var.invoke(fxe.a, e18Var, 6);
                    e18Var.p(true);
                }
                break;
            case 2:
                wlg wlgVar2 = (wlg) obj11;
                nwb nwbVar = (nwb) obj10;
                wlg wlgVar3 = (wlg) obj9;
                zy7 zy7Var2 = (zy7) obj8;
                nwb nwbVar2 = (nwb) obj7;
                f fVar = (f) obj6;
                nwb nwbVar3 = (nwb) obj5;
                zy7 zy7Var3 = (zy7) obj4;
                wlg wlgVar4 = (wlg) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    zni.e(null, fd9.q0(-565793850, new f44(wlgVar2, nwbVar, wlgVar3, 16), e18Var2), fd9.q0(-1533754779, new wh(14, zy7Var2), e18Var2), fd9.q0(1429755484, new xe(nwbVar2, fVar, nwbVar3, zy7Var3, wlgVar4, 15), e18Var2), MTTypesetterKt.kLineSkipLimitMultiplier, null, zh4.n(gm3.a(e18Var2).o, e18Var2, 0), e18Var2, 3504, 177);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                e.e((zy7) obj11, (zy7) obj10, (rwe) obj9, (iqb) obj8, (fk0) obj7, (um1) obj6, (ze0) obj5, (qi3) obj4, (b4e) obj3, (ld4) obj, x44.p0(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                cpk.b((McpServer) obj11, (String) obj10, (pz7) obj9, (zy7) obj8, (pl3) obj7, (iqb) obj6, (zy7) obj5, (oxf) obj4, (mnc) obj3, (ld4) obj, x44.p0(1));
                break;
            default:
                ((Integer) obj2).getClass();
                mqk.c((String) obj11, (zy7) obj10, (zy7) obj9, (bz7) obj8, (iqb) obj7, (lbb) obj6, (obb) obj5, (qi3) obj4, (ze0) obj3, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jn0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
        this.K = obj6;
        this.L = obj7;
        this.M = obj8;
        this.N = obj9;
    }

    public /* synthetic */ jn0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i, int i2) {
        this.E = i2;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
        this.K = obj6;
        this.L = obj7;
        this.M = obj8;
        this.N = obj9;
    }
}
