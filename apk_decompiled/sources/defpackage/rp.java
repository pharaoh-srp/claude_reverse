package defpackage;

import android.graphics.DashPathEffect;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rp implements bz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ float F;
    public final /* synthetic */ float G;
    public final /* synthetic */ long H;
    public final /* synthetic */ Object I;

    public /* synthetic */ rp(long j, float f, float f2, w0e w0eVar) {
        this.H = j;
        this.F = f;
        this.G = f2;
        this.I = w0eVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        float f = this.G;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                w0e w0eVar = (w0e) obj2;
                xd6 xd6Var = (xd6) obj;
                xd6Var.getClass();
                float f2 = 0.0f;
                while (true) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (xd6Var.g() >> 32));
                    long j = this.H;
                    float f3 = this.F;
                    if (f2 > fIntBitsToFloat) {
                        for (float f4 = 0.0f; f4 <= Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L)); f4 += f) {
                            xd6Var.M(j, (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xd6Var.g() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (504 & 8) != 0 ? 0.0f : f3, (504 & 16) != 0 ? 0 : 0);
                        }
                        xd6.S0(xd6Var, w0eVar, 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 0, 126);
                        return iei.a;
                    }
                    xd6Var.M(j, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32), (504 & 8) != 0 ? 0.0f : f3, (504 & 16) != 0 ? 0 : 0);
                    f2 += f;
                }
                break;
            default:
                b52 b52Var = (b52) obj;
                b52Var.getClass();
                return b52Var.b(new mf5(((e0g) obj2).a(b52Var.E.g(), b52Var.E.getLayoutDirection(), b52Var), this.H, new ksg(b52Var.getDensity() * 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, new d40(new DashPathEffect(new float[]{b52Var.getDensity() * this.F, b52Var.getDensity() * f}, MTTypesetterKt.kLineSkipLimitMultiplier)), 14), 0));
        }
    }

    public /* synthetic */ rp(e0g e0gVar, float f, float f2, long j) {
        this.I = e0gVar;
        this.F = f;
        this.G = f2;
        this.H = j;
    }
}
