package defpackage;

import android.content.Context;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.e;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.types.strings.SessionId;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a14 implements sz7 {
    public final /* synthetic */ List E;
    public final /* synthetic */ c F;
    public final /* synthetic */ bz7 G;
    public final /* synthetic */ Context H;
    public final /* synthetic */ l45 I;
    public final /* synthetic */ op3 J;
    public final /* synthetic */ String K;
    public final /* synthetic */ nwb L;
    public final /* synthetic */ nwb M;
    public final /* synthetic */ ybg N;

    public a14(List list, c cVar, bz7 bz7Var, Context context, l45 l45Var, op3 op3Var, String str, nwb nwbVar, nwb nwbVar2, ybg ybgVar) {
        this.E = list;
        this.F = cVar;
        this.G = bz7Var;
        this.H = context;
        this.I = l45Var;
        this.J = op3Var;
        this.K = str;
        this.L = nwbVar;
        this.M = nwbVar2;
        this.N = ybgVar;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        SessionResource sessionResource;
        Object x04Var;
        px9 px9Var = (px9) obj;
        int iIntValue = ((Number) obj2).intValue();
        ld4 ld4Var = (ld4) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((e18) ld4Var).f(px9Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((e18) ld4Var).d(iIntValue) ? 32 : 16;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(i & 1, (i & 147) != 146)) {
            SessionResource sessionResource2 = (SessionResource) this.E.get(iIntValue);
            e18Var.a0(-933701435);
            c cVar = this.F;
            boolean zF = e18Var.f(cVar) | e18Var.h(sessionResource2);
            bz7 bz7Var = this.G;
            boolean zF2 = zF | e18Var.f(bz7Var);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF2 || objN == lz1Var) {
                objN = new n4(cVar, sessionResource2, bz7Var, 3);
                e18Var.k0(objN);
            }
            zy7 zy7Var = (zy7) objN;
            nwb nwbVar = this.L;
            SessionResource sessionResource3 = (SessionResource) nwbVar.getValue();
            String strM875getIdOcx55TE = sessionResource3 != null ? sessionResource3.m875getIdOcx55TE() : null;
            boolean zM1117equalsimpl0 = strM875getIdOcx55TE == null ? false : SessionId.m1117equalsimpl0(strM875getIdOcx55TE, sessionResource2.m875getIdOcx55TE());
            boolean zH = e18Var.h(sessionResource2) | e18Var.f(cVar);
            Context context = this.H;
            boolean zH2 = zH | e18Var.h(context) | e18Var.f(zy7Var);
            Object objN2 = e18Var.N();
            if (zH2 || objN2 == lz1Var) {
                sessionResource = sessionResource2;
                x04Var = new x04(sessionResource, context, cVar, zy7Var, 0);
                e18Var.k0(x04Var);
            } else {
                sessionResource = sessionResource2;
                x04Var = objN2;
            }
            zy7 zy7Var2 = (zy7) x04Var;
            boolean zH3 = e18Var.h(sessionResource);
            Object objN3 = e18Var.N();
            if (zH3 || objN3 == lz1Var) {
                objN3 = new y04(sessionResource, nwbVar, 0);
                e18Var.k0(objN3);
            }
            zy7 zy7Var3 = (zy7) objN3;
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = new u83(3, nwbVar);
                e18Var.k0(objN4);
            }
            zy7 zy7Var4 = (zy7) objN4;
            boolean zH4 = e18Var.h(sessionResource);
            Object objN5 = e18Var.N();
            if (zH4 || objN5 == lz1Var) {
                objN5 = new y04(sessionResource, this.M, 1);
                e18Var.k0(objN5);
            }
            zy7 zy7Var5 = (zy7) objN5;
            e18Var.a0(-931198745);
            e18Var.p(false);
            l45 l45Var = this.I;
            boolean zH5 = e18Var.h(l45Var);
            op3 op3Var = this.J;
            boolean zH6 = zH5 | e18Var.h(op3Var);
            String str = this.K;
            boolean zF3 = zH6 | e18Var.f(str);
            Object objN6 = e18Var.N();
            ybg ybgVar = this.N;
            if (zF3 || objN6 == lz1Var) {
                objN6 = new jo3(l45Var, op3Var, ybgVar, str, 2);
                e18Var.k0(objN6);
            }
            bz7 bz7Var2 = (bz7) objN6;
            boolean zH7 = e18Var.h(l45Var);
            Object objN7 = e18Var.N();
            if (zH7 || objN7 == lz1Var) {
                objN7 = new am3(l45Var, ybgVar);
                e18Var.k0(objN7);
            }
            e.i(sessionResource, cVar, zM1117equalsimpl0, zy7Var2, zy7Var, zy7Var3, zy7Var4, zy7Var5, null, bz7Var2, (bz7) ((jm9) objN7), gb9.L(fqb.E, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), e18Var, 1572864);
            e18Var.p(false);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
