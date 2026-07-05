package defpackage;

import android.graphics.RenderEffect;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class at1 extends vfe {
    public final float b;
    public final float c;
    public final int d;

    public at1(float f, float f2, int i) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    @Override // defpackage.vfe
    public final RenderEffect b() {
        float f = this.b;
        float f2 = this.c;
        return (f == MTTypesetterKt.kLineSkipLimitMultiplier && f2 == MTTypesetterKt.kLineSkipLimitMultiplier) ? RenderEffect.createOffsetEffect(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier) : RenderEffect.createBlurEffect(f, f2, zni.b0(this.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at1)) {
            return false;
        }
        at1 at1Var = (at1) obj;
        return this.b == at1Var.b && this.c == at1Var.c && this.d == at1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + vb7.b(this.c, Float.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.b + ", radiusY=" + this.c + ", edgeTreatment=" + ((Object) hsk.i(this.d)) + ')';
    }
}
