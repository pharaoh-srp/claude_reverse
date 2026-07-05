package defpackage;

import com.anthropic.claude.code.remote.bottomsheet.a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class by3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ mnc G;
    public final /* synthetic */ int H;

    public /* synthetic */ by3(String str, mnc mncVar, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = mncVar;
        this.H = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        mnc mncVar = this.G;
        String str = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.l(str, mncVar, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                a.o(str, mncVar, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }
}
