package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class r35 {
    public static final r35 b = new r35(3, MTTypesetterKt.kLineSkipLimitMultiplier);
    public final float a;

    public r35(int i, float f) {
        this.a = (i & 1) != 0 ? MTTypesetterKt.kLineSkipLimitMultiplier : f;
    }
}
