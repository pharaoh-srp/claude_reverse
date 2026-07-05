package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class txf implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ String F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ List H;
    public final /* synthetic */ rz7 I;
    public final /* synthetic */ rz7 J;
    public final /* synthetic */ bz7 K;
    public final /* synthetic */ zy7 L;
    public final /* synthetic */ iqb M;
    public final /* synthetic */ long N;
    public final /* synthetic */ long O;
    public final /* synthetic */ int P;

    public /* synthetic */ txf(long j, long j2, iqb iqbVar, String str, List list, rz7 rz7Var, rz7 rz7Var2, Object obj, bz7 bz7Var, zy7 zy7Var, int i) {
        this.N = j;
        this.O = j2;
        this.M = iqbVar;
        this.F = str;
        this.H = list;
        this.I = rz7Var;
        this.J = rz7Var2;
        this.G = obj;
        this.K = bz7Var;
        this.L = zy7Var;
        this.P = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    long j = gm3.a(e18Var).o;
                    e0g e0gVar = gm3.b(e18Var).h;
                    long j2 = this.N;
                    float fD = za6.d(j2);
                    long j3 = this.O;
                    pzg.a(b.r(this.M, fD, za6.c(j2), za6.d(j3), za6.c(j3)), e0gVar, j, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(-725898723, new yu(this.F, this.H, this.I, this.J, this.G, this.K, this.L, this.P, 6), e18Var), e18Var, 12582912, 120);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                idi.d(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, (ld4) obj, x44.p0(this.P | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ txf(String str, Object obj, List list, rz7 rz7Var, rz7 rz7Var2, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, long j, long j2, int i) {
        this.F = str;
        this.G = obj;
        this.H = list;
        this.I = rz7Var;
        this.J = rz7Var2;
        this.K = bz7Var;
        this.L = zy7Var;
        this.M = iqbVar;
        this.N = j;
        this.O = j2;
        this.P = i;
    }
}
