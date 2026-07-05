package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class wa8 implements ya8 {
    public final float a;

    public wa8(float f) {
        this.a = f;
        if (va6.a(f, MTTypesetterKt.kLineSkipLimitMultiplier) > 0) {
            return;
        }
        e39.a("Provided min size should be larger than zero.");
    }

    @Override // defpackage.ya8
    public final ArrayList a(cz5 cz5Var, int i, int i2) {
        return yuj.b(i, Math.max((i + i2) / (cz5Var.M0(this.a) + i2), 1), i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wa8) {
            return va6.b(this.a, ((wa8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
