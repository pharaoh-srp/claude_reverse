package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Paint;
import defpackage.ts9;
import defpackage.zy7;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends ts9 implements zy7 {
    public static final b G;
    public static final b H;
    public final /* synthetic */ int F;

    static {
        int i = 0;
        G = new b(i, 0);
        H = new b(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2) {
        super(i);
        this.F = i2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.F) {
            case 0:
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            default:
                return new Paint();
        }
    }
}
