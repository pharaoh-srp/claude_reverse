package defpackage;

import com.anthropic.claude.mainactivity.AssistantOverlayActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dy0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ swe F;
    public final /* synthetic */ m7f G;
    public final /* synthetic */ AssistantOverlayActivity H;
    public final /* synthetic */ String I;

    public /* synthetic */ dy0(swe sweVar, m7f m7fVar, AssistantOverlayActivity assistantOverlayActivity, String str, int i) {
        this.E = i;
        this.F = sweVar;
        this.G = m7fVar;
        this.H = assistantOverlayActivity;
        this.I = str;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 1;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i3 = AssistantOverlayActivity.d0;
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    gr9.a(null, fd9.q0(-1313905540, new dy0(this.F, this.G, this.H, this.I, 1), e18Var), e18Var, 48);
                }
                break;
            default:
                int i4 = AssistantOverlayActivity.d0;
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    j8.d(new hvd[]{twe.a.a(this.F), gr9.b.a(this.G)}, fd9.q0(1869293500, new xx0(this.H, this.I, i2), e18Var2), e18Var2, 48);
                }
                break;
        }
        return ieiVar;
    }
}
