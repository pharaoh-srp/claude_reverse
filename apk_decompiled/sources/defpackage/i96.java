package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i96 implements bz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ long F;
    public final /* synthetic */ float G;

    public /* synthetic */ i96(float f, long j) {
        this.G = f;
        this.F = j;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        float f = this.G;
        switch (i) {
            case 0:
                xd6 xd6Var = (xd6) obj;
                float fQ0 = xd6Var.q0(f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(xd6Var.q0(f) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L);
                float fQ02 = xd6Var.q0(f) / 2.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L));
                xd6Var.M(this.F, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fQ02)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (504 & 8) != 0 ? 0.0f : fQ0, (504 & 16) != 0 ? 0 : 0);
                return iei.a;
            default:
                b52 b52Var = (b52) obj;
                b52Var.getClass();
                long j = this.F;
                return b52Var.a(new cv1(f, new w0e(x44.X(new d54(d54.b(0.35f, j)), new d54(d54.b(0.12f, j)), new d54(d54.g)), null, 9205357640488583168L, Float.POSITIVE_INFINITY, 0), 4));
        }
    }

    public /* synthetic */ i96(long j, float f) {
        this.F = j;
        this.G = f;
    }
}
