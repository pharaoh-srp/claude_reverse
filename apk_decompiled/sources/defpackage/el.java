package defpackage;

import com.anthropic.claude.bell.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class el implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ int H;

    public /* synthetic */ el(int i, String str, iqb iqbVar, int i2) {
        this.E = 2;
        this.H = i;
        this.F = str;
        this.G = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        iqb iqbVar = this.G;
        String str = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                il.c(str, iqbVar, ld4Var, x44.p0(i2 | 1));
                break;
            case 1:
                il.g(str, iqbVar, ld4Var, x44.p0(i2 | 1));
                break;
            case 2:
                il.b(i2, x44.p0(7), ld4Var, iqbVar, str);
                break;
            case 3:
                b.n(str, iqbVar, ld4Var, x44.p0(i2 | 1));
                break;
            case 4:
                ah4.a(str, iqbVar, ld4Var, x44.p0(i2 | 1));
                break;
            case 5:
                fuk.k(str, iqbVar, ld4Var, x44.p0(i2 | 1));
                break;
            case 6:
                mvk.c(str, iqbVar, ld4Var, x44.p0(i2 | 1));
                break;
            case 7:
                bik.b(str, iqbVar, ld4Var, x44.p0(i2 | 1));
                break;
            case 8:
                rwj.d(str, iqbVar, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                gjk.a(str, iqbVar, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ el(String str, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = iqbVar;
        this.H = i;
    }
}
