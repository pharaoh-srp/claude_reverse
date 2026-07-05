package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class rc2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public rc2(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wlg a(boolean r15, defpackage.zub r16, defpackage.ld4 r17, int r18) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.a(boolean, zub, ld4, int):wlg");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof rc2)) {
            return false;
        }
        rc2 rc2Var = (rc2) obj;
        return va6.b(this.a, rc2Var.a) && va6.b(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier) && va6.b(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier) && va6.b(this.b, rc2Var.b) && va6.b(this.d, rc2Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + vb7.b(this.b, vb7.b(MTTypesetterKt.kLineSkipLimitMultiplier, vb7.b(MTTypesetterKt.kLineSkipLimitMultiplier, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
