package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class vs5 implements yzb {
    public final koc E;

    public vs5(koc kocVar) {
        this.E = kocVar;
    }

    @Override // defpackage.yzb
    public final long F(long j, int i, long j2) {
        if (i != 2 || Float.intBitsToFloat((int) (j2 >> 32)) == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // defpackage.yzb
    public final Object G(long j, long j2, tp4 tp4Var) {
        return new qsi(qsi.b(j2, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 1));
    }

    @Override // defpackage.yzb
    public final long X(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        koc kocVar = this.E;
        eoc eocVar = kocVar.d;
        eoc eocVar2 = kocVar.d;
        if (Math.abs(((hsc) eocVar.H).h()) <= 1.0E-6d) {
            return 0L;
        }
        int i2 = (int) (j >> 32);
        if (Math.abs(Float.intBitsToFloat(i2)) <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            return 0L;
        }
        coc cocVarK = kocVar.k();
        float fH = ((hsc) eocVar2.H).h() * kocVar.m();
        float f = ((cocVarK.b + cocVarK.c) * (-Math.signum(((hsc) eocVar2.H).h()))) + fH;
        if (((hsc) eocVar2.H).h() > MTTypesetterKt.kLineSkipLimitMultiplier) {
            fH = f;
            f = fH;
        }
        return (((long) Float.floatToRawIntBits(-kocVar.k.e(-wd6.d0(Float.intBitsToFloat(i2), fH, f)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L);
    }
}
