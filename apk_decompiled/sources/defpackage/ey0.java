package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.mainactivity.AssistantOverlayActivity;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ey0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ AssistantOverlayActivity F;
    public final /* synthetic */ String G;
    public final /* synthetic */ lsc H;

    public /* synthetic */ ey0(AssistantOverlayActivity assistantOverlayActivity, String str, lsc lscVar, int i) {
        this.E = i;
        this.F = assistantOverlayActivity;
        this.G = str;
        this.H = lscVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 1;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = AssistantOverlayActivity.d0;
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    olh.a(true, af2.a, oai.a(false, e18Var, 1), fd9.q0(-780245312, new ey0(this.F, this.G, this.H, i2), e18Var), e18Var, 3126, 0);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i4 = AssistantOverlayActivity.d0;
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    v4g v4gVarG = iuj.G(true, null, e18Var2, 6, 2);
                    Object objN = e18Var2.N();
                    lz1 lz1Var = jd4.a;
                    if (objN == lz1Var) {
                        objN = fd9.O(im6.E, e18Var2);
                        e18Var2.k0(objN);
                    }
                    l45 l45Var = (l45) objN;
                    vve vveVarD = xve.d(28.0f, 28.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 12);
                    long j = gm3.a(e18Var2).p;
                    long j2 = gm3.a(e18Var2).M;
                    long jB = d54.b(0.5f, d54.b);
                    WeakHashMap weakHashMap = gdj.x;
                    iqb iqbVarM = knk.M(fqb.E, new a5a(s4i.d(e18Var2).m, 16));
                    AssistantOverlayActivity assistantOverlayActivity = this.F;
                    boolean zH = e18Var2.h(assistantOverlayActivity);
                    Object objN2 = e18Var2.N();
                    if (zH || objN2 == lz1Var) {
                        objN2 = new wx0(assistantOverlayActivity, 1);
                        e18Var2.k0(objN2);
                    }
                    String str = this.G;
                    iuj.f((zy7) objN2, iqbVarM, v4gVarG, MTTypesetterKt.kLineSkipLimitMultiplier, false, vveVarD, j, j2, jB, fd9.q0(-1484266571, new xx0(assistantOverlayActivity, str, 3), e18Var2), new te(5), null, fd9.q0(266919714, new xe(this.H, str, l45Var, v4gVarG, assistantOverlayActivity, 5), e18Var2), e18Var2, 805306368, 3078, 4376);
                }
                break;
        }
        return ieiVar;
    }
}
