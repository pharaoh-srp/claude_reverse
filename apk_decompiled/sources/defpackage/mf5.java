package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mf5 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ mf5(j9f j9fVar, a80 a80Var, long j) {
        this.E = 1;
        this.G = j9fVar;
        this.H = a80Var;
        this.F = j;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.H;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                knk knkVar = (knk) obj3;
                ksg ksgVar = (ksg) obj2;
                cv9 cv9Var = (cv9) obj;
                cv9Var.getClass();
                cv9Var.a();
                boolean z = knkVar instanceof flc;
                long j = this.F;
                if (z) {
                    cv9Var.T0(j, 0L, (58 & 4) != 0 ? xd6.h0(cv9Var.g(), 0L) : 0L, (58 & 8) != 0 ? 1.0f : MTTypesetterKt.kLineSkipLimitMultiplier, (58 & 16) != 0 ? qk7.a : ksgVar, (58 & 32) != 0 ? null : null, (58 & 64) != 0 ? 3 : 0);
                    return ieiVar;
                }
                if (knkVar instanceof glc) {
                    c40 c40VarA = f40.a();
                    c40.c(c40VarA, ((glc) knkVar).k);
                    xd6.c1(cv9Var, c40VarA, j, MTTypesetterKt.kLineSkipLimitMultiplier, ksgVar, 52);
                    return ieiVar;
                }
                if (knkVar instanceof elc) {
                    xd6.c1(cv9Var, ((elc) knkVar).k, j, MTTypesetterKt.kLineSkipLimitMultiplier, ksgVar, 52);
                    return ieiVar;
                }
                wg6.i();
                return null;
            case 1:
                final j9f j9fVar = (j9f) obj3;
                final a80 a80Var = (a80) obj2;
                b52 b52Var = (b52) obj;
                b52Var.getClass();
                final float density = b52Var.getDensity() * 3.0f;
                final float density2 = b52Var.getDensity() * 24.0f;
                final float density3 = b52Var.getDensity() * 2.0f;
                float f = density / 2.0f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                final long j2 = this.F;
                return b52Var.b(new bz7() { // from class: eaf
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj4) {
                        cv9 cv9Var2 = (cv9) obj4;
                        cv9Var2.getClass();
                        ib2 ib2Var = cv9Var2.E;
                        cv9Var2.a();
                        int iH = j9fVar.e.h();
                        iei ieiVar2 = iei.a;
                        if (iH > 0) {
                            float fFloatValue = ((Number) a80Var.e()).floatValue();
                            if (fFloatValue != MTTypesetterKt.kLineSkipLimitMultiplier) {
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (ib2Var.g() >> 32));
                                float f2 = iH;
                                float f3 = (fIntBitsToFloat * fIntBitsToFloat) / (fIntBitsToFloat + f2);
                                float f4 = density2;
                                if (f3 < f4) {
                                    f3 = f4;
                                }
                                float fH = (fIntBitsToFloat - f3) * (r2.a.h() / f2);
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (ib2Var.g() & 4294967295L));
                                float f5 = density;
                                xd6.y(cv9Var2, j2, (((long) Float.floatToRawIntBits(fH)) << 32) | (((long) Float.floatToRawIntBits((fIntBitsToFloat2 - f5) - density3)) & 4294967295L), (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), jFloatToRawIntBits, null, fFloatValue, 208);
                                return ieiVar2;
                            }
                        }
                        return ieiVar2;
                    }
                });
            default:
                xd6 xd6Var = (xd6) obj;
                xd6Var.getClass();
                xd6.c1(xd6Var, (c40) obj3, this.F, MTTypesetterKt.kLineSkipLimitMultiplier, (ksg) obj2, 52);
                return ieiVar;
        }
    }

    public /* synthetic */ mf5(Object obj, long j, ksg ksgVar, int i) {
        this.E = i;
        this.G = obj;
        this.F = j;
        this.H = ksgVar;
    }
}
