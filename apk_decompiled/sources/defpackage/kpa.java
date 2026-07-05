package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.app.main.l;
import com.anthropic.claude.mainactivity.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kpa implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ MainActivity F;
    public final /* synthetic */ swe G;

    public /* synthetic */ kpa(MainActivity mainActivity, swe sweVar, int i) {
        this.E = i;
        this.F = mainActivity;
        this.G = sweVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        MainActivity mainActivity = this.F;
        int i2 = 0;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = MainActivity.h0;
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    xkk.a(fd9.q0(-712857550, new lpa(mainActivity, i2, this.G), e18Var), e18Var, 6);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i4 = MainActivity.h0;
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    opa opaVar = (opa) mainActivity.e0.getValue();
                    boolean zH = e18Var2.h(opaVar);
                    Object objN = e18Var2.N();
                    if (zH || objN == jd4.a) {
                        objN = new mx5(opaVar);
                        e18Var2.k0(objN);
                    }
                    FillElement fillElement = b.c;
                    e18Var2.a0(-183454956);
                    e18Var2.p(false);
                    l.a((zy7) ((jm9) objN), this.G, fillElement.B(fqb.E), null, null, null, null, e18Var2, 0);
                }
                break;
        }
        return ieiVar;
    }
}
