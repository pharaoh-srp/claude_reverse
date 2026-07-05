package io.sentry.android.replay.screenshot;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import defpackage.ts9;
import defpackage.zy7;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends ts9 implements zy7 {
    public static final f F = new f(0);

    @Override // defpackage.zy7
    public final Object a() {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        return paint;
    }
}
