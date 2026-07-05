package defpackage;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class ccj extends dcj {
    public final WindowInsetsAnimation e;

    public ccj(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.dcj
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // defpackage.dcj
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.dcj
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.dcj
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.dcj
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
