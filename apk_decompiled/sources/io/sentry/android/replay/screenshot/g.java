package io.sentry.android.replay.screenshot;

import android.graphics.Canvas;
import android.graphics.Matrix;
import defpackage.ts9;
import defpackage.zy7;
import io.sentry.android.replay.y;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ h G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i) {
        super(0);
        this.F = i;
        this.G = hVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        h hVar = this.G;
        switch (i) {
            case 0:
                Matrix matrix = new Matrix();
                y yVar = hVar.c;
                matrix.preScale(yVar.c, yVar.d);
                return matrix;
            default:
                return new Canvas(hVar.g);
        }
    }
}
