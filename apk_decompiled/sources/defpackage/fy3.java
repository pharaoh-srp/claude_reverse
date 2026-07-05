package defpackage;

import com.anthropic.claude.code.remote.bottomsheet.a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fy3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ int I;

    public /* synthetic */ fy3(String str, String str2, zy7 zy7Var, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = str2;
        this.H = zy7Var;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        zy7 zy7Var = this.H;
        String str = this.G;
        String str2 = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                a.q(str2, str, zy7Var, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                num.intValue();
                h66.a(str2, str, zy7Var, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }
}
