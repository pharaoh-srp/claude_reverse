package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class vo7 implements jo7 {
    public final float a;
    public final xig b;

    public vo7(float f, float f2, float f3) {
        this.a = f3;
        xig xigVar = new xig();
        xigVar.a = 1.0f;
        xigVar.b = Math.sqrt(50.0d);
        xigVar.c = 1.0f;
        if (f < MTTypesetterKt.kLineSkipLimitMultiplier) {
            bbd.a("Damping ratio must be non-negative");
        }
        xigVar.c = f;
        double d = xigVar.b;
        if (((float) (d * d)) <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            bbd.a("Spring stiffness constant must be positive.");
        }
        xigVar.b = Math.sqrt(f2);
        this.b = xigVar;
    }

    @Override // defpackage.jo7
    public final float b(long j, float f, float f2, float f3) {
        xig xigVar = this.b;
        xigVar.a = f2;
        return Float.intBitsToFloat((int) (xigVar.a(j / 1000000, f, f3) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    @Override // defpackage.jo7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(float r34, float r35, float r36) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo7.c(float, float, float):long");
    }

    @Override // defpackage.jo7
    public final float d(float f, float f2, float f3) {
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.jo7
    public final float e(long j, float f, float f2, float f3) {
        xig xigVar = this.b;
        xigVar.a = f2;
        return Float.intBitsToFloat((int) (xigVar.a(j / 1000000, f, f3) >> 32));
    }
}
