package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fyh implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ long G;

    public /* synthetic */ fyh(int i, int i2, long j) {
        this.E = i2;
        this.F = i;
        this.G = j;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.F;
        int i3 = 1;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    wtk.c(null, d54.g, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-1275365001, new fyh(i2, i3, this.G), e18Var), e18Var, 199728, 21);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    cv8.b(u00.D(i2, 0, e18Var2), d4c.j0(R.string.custom_tool_icon_content_description, e18Var2), b.o(fqb.E, 16.0f), this.G, e18Var2, 392, 0);
                }
                break;
        }
        return ieiVar;
    }
}
