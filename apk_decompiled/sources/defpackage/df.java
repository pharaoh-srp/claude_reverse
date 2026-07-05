package defpackage;

import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class df implements s35 {
    public final s35 a;
    public final float b;

    public df(float f, s35 s35Var) {
        while (s35Var instanceof df) {
            s35Var = ((df) s35Var).a;
            f += ((df) s35Var).b;
        }
        this.a = s35Var;
        this.b = f;
    }

    @Override // defpackage.s35
    public final float a(RectF rectF) {
        return Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df)) {
            return false;
        }
        df dfVar = (df) obj;
        return this.a.equals(dfVar.a) && this.b == dfVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
