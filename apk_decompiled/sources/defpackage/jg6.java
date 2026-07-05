package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jg6 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ long F;
    public final /* synthetic */ Object G;

    public /* synthetic */ jg6(ud0 ud0Var, long j) {
        this.G = ud0Var;
        this.F = j;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                ud0 ud0Var = (ud0) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    ud0 ud0Var2 = ud0.d;
                    cv8.b(a.a(ud0Var, e18Var), null, b.o(fqb.E, 24.0f), this.F, e18Var, 440, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                fxd.a((to7) obj3, this.F, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jg6(to7 to7Var, long j, int i) {
        this.G = to7Var;
        this.F = j;
    }
}
