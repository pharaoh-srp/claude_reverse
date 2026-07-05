package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import defpackage.k2c;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.n40;
import defpackage.w1a;
import defpackage.yb5;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Closeable {
    public final kw9 E;
    public final kw9 F;
    public final kw9 G;

    public c() {
        b bVar = b.G;
        w1a w1aVar = w1a.G;
        this.E = yb5.w(w1aVar, bVar);
        this.F = yb5.w(w1aVar, new k2c(16, this));
        this.G = yb5.w(w1aVar, b.H);
    }

    public final List c(Bitmap bitmap, io.sentry.android.replay.viewhierarchy.g gVar, Matrix matrix) {
        bitmap.getClass();
        if (bitmap.isRecycled()) {
            return lm6.E;
        }
        ArrayList arrayList = new ArrayList();
        Canvas canvas = new Canvas(bitmap);
        if (matrix != null) {
            canvas.setMatrix(matrix);
        }
        gVar.a(new n40(this, bitmap, matrix, arrayList, canvas, 3));
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kw9 kw9Var = this.E;
        if (!kw9Var.b() || ((Bitmap) kw9Var.getValue()).isRecycled()) {
            return;
        }
        ((Bitmap) kw9Var.getValue()).recycle();
    }
}
