package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i46 implements bz7 {
    public final /* synthetic */ boolean E;
    public final /* synthetic */ float F;
    public final /* synthetic */ long G;

    public /* synthetic */ i46(float f, long j, boolean z) {
        this.E = z;
        this.F = f;
        this.G = j;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        cv9 cv9Var = (cv9) obj;
        cv9Var.getClass();
        boolean z = this.E;
        if (z) {
            cv9Var.a();
        }
        float fQ0 = cv9Var.q0(this.F);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fQ0)) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cv9Var.E.g() & 4294967295L));
        cv9Var.M(this.G, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fQ0)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (504 & 8) != 0 ? 0.0f : MTTypesetterKt.kLineSkipLimitMultiplier, (504 & 16) != 0 ? 0 : 0);
        if (!z) {
            cv9Var.a();
        }
        return iei.a;
    }
}
