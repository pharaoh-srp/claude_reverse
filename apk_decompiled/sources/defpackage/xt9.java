package defpackage;

import android.graphics.Canvas;
import android.graphics.Picture;

/* JADX INFO: loaded from: classes3.dex */
public final class xt9 extends Picture {
    public final ja8 a;

    public xt9(ja8 ja8Var) {
        this.a = ja8Var;
    }

    @Override // android.graphics.Picture
    public final Canvas beginRecording(int i, int i2) {
        return new Canvas();
    }

    @Override // android.graphics.Picture
    public final void draw(Canvas canvas) {
        this.a.c(jz.a(canvas), null);
    }

    @Override // android.graphics.Picture
    public final void endRecording() {
    }

    @Override // android.graphics.Picture
    public final int getHeight() {
        return (int) (this.a.u & 4294967295L);
    }

    @Override // android.graphics.Picture
    public final int getWidth() {
        return (int) (this.a.u >> 32);
    }

    @Override // android.graphics.Picture
    public final boolean requiresHardwareAcceleration() {
        return true;
    }
}
