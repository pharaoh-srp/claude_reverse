package defpackage;

import com.anthropic.claude.mainactivity.AssistantOverlayActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vx0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ swe F;
    public final /* synthetic */ AssistantOverlayActivity G;
    public final /* synthetic */ String H;
    public final /* synthetic */ lsc I;

    public /* synthetic */ vx0(swe sweVar, AssistantOverlayActivity assistantOverlayActivity, String str, lsc lscVar, int i) {
        this.E = i;
        this.F = sweVar;
        this.G = assistantOverlayActivity;
        this.H = str;
        this.I = lscVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object[] objArr = 0;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i2 = AssistantOverlayActivity.d0;
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    gr9.a(null, fd9.q0(-1169028797, new vx0(this.F, this.G, this.H, this.I, 1), e18Var), e18Var, 48);
                }
                break;
            default:
                int i3 = AssistantOverlayActivity.d0;
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    j8.c(twe.a.a(this.F), fd9.q0(1299197443, new ey0(this.G, this.H, this.I, objArr == true ? 1 : 0), e18Var2), e18Var2, 56);
                }
                break;
        }
        return ieiVar;
    }
}
