package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class lnc implements mnc {
    @Override // defpackage.mnc
    public final float a() {
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.mnc
    public final float b(fu9 fu9Var) {
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.mnc
    public final float c(fu9 fu9Var) {
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.mnc
    public final float d() {
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lnc) && va6.b(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier) && va6.b(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier) && va6.b(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier) && va6.b(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    public final int hashCode() {
        return Float.hashCode(MTTypesetterKt.kLineSkipLimitMultiplier) + vb7.b(MTTypesetterKt.kLineSkipLimitMultiplier, vb7.b(MTTypesetterKt.kLineSkipLimitMultiplier, Float.hashCode(MTTypesetterKt.kLineSkipLimitMultiplier) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues.Absolute(left=" + ((Object) va6.c(MTTypesetterKt.kLineSkipLimitMultiplier)) + ", top=" + ((Object) va6.c(MTTypesetterKt.kLineSkipLimitMultiplier)) + ", right=" + ((Object) va6.c(MTTypesetterKt.kLineSkipLimitMultiplier)) + ", bottom=" + ((Object) va6.c(MTTypesetterKt.kLineSkipLimitMultiplier)) + ')';
    }
}
