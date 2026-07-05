package defpackage;

import com.anthropic.claude.chat.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aw1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    public /* synthetic */ aw1(Object obj, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.F = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.F;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                dw1.a((iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                f.d((t53) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            default:
                k0a k0aVar = (k0a) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    ra9 ra9VarC = k0aVar.b.l.c(i2);
                    ((i0a) ra9VarC.c).c.i(k0aVar.c, Integer.valueOf(i2 - ra9VarC.a), e18Var, 0);
                }
                break;
        }
        return ieiVar;
    }
}
