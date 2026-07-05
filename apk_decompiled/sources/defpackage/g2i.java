package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g2i implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;
    public final /* synthetic */ float I;
    public final /* synthetic */ float J;
    public final /* synthetic */ float K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ ta4 M;

    public /* synthetic */ g2i(i2i i2iVar, long j, long j2, float f, float f2, float f3, hsc hscVar, ta4 ta4Var) {
        this.E = 2;
        this.F = i2iVar;
        this.G = j;
        this.H = j2;
        this.I = f;
        this.J = f2;
        this.K = f3;
        this.L = hscVar;
        this.M = ta4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.L;
        Object obj4 = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vuk.a((z1i) obj4, this.G, this.H, this.I, this.J, this.K, (iqb) obj3, this.M, (ld4) obj, x44.p0(12582913));
                break;
            case 1:
                ((Integer) obj2).getClass();
                vuk.a((z1i) obj4, this.G, this.H, this.I, this.J, this.K, (iqb) obj3, this.M, (ld4) obj, x44.p0(12582913));
                break;
            default:
                i2i i2iVar = (i2i) obj4;
                hsc hscVar = (hsc) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    vuk.a(i2iVar.b, this.G, this.H, hscVar.h(), this.I, this.J, gb9.L(fqb.E, this.K, MTTypesetterKt.kLineSkipLimitMultiplier, 2), fd9.q0(-1617407963, new tte(this.M, 7, (byte) 0), e18Var), e18Var, 12582912);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ g2i(z1i z1iVar, long j, long j2, float f, float f2, float f3, iqb iqbVar, ta4 ta4Var, int i, int i2) {
        this.E = i2;
        this.F = z1iVar;
        this.G = j;
        this.H = j2;
        this.I = f;
        this.J = f2;
        this.K = f3;
        this.L = iqbVar;
        this.M = ta4Var;
    }
}
