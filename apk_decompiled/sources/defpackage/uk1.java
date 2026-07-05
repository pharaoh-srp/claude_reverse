package defpackage;

import com.anthropic.claude.bell.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uk1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ s64 F;
    public final /* synthetic */ fn1 G;
    public final /* synthetic */ int H;

    public /* synthetic */ uk1(s64 s64Var, fn1 fn1Var, int i, int i2) {
        this.E = i2;
        this.F = s64Var;
        this.G = fn1Var;
        this.H = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        fn1 fn1Var = this.G;
        s64 s64Var = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                b.f(s64Var, fn1Var, ld4Var, x44.p0(i2 | 1));
                break;
            case 1:
                num.intValue();
                b.f(s64Var, fn1Var, ld4Var, x44.p0(i2 | 1));
                break;
            case 2:
                num.getClass();
                b.k(s64Var, fn1Var, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                num.getClass();
                b.k(s64Var, fn1Var, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }
}
