package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class z78 extends EdgeEffect {
    public final float a;
    public float b;

    public z78(Context context) {
        super(context);
        this.a = d4c.s(context).E * 1.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.b = MTTypesetterKt.kLineSkipLimitMultiplier;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.b = MTTypesetterKt.kLineSkipLimitMultiplier;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.b = MTTypesetterKt.kLineSkipLimitMultiplier;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.b = MTTypesetterKt.kLineSkipLimitMultiplier;
        super.onPull(f);
    }
}
