package defpackage;

import android.graphics.ComposeShader;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class ee4 extends rzf {
    public final rzf c;
    public final rzf d;

    public ee4(rzf rzfVar, rzf rzfVar2) {
        this.c = rzfVar;
        this.d = rzfVar2;
    }

    @Override // defpackage.rzf
    public final Shader c(long j) {
        Shader shaderC = this.c.c(j);
        Shader shaderC2 = this.d.c(j);
        return Build.VERSION.SDK_INT >= 29 ? w5.c(shaderC, shaderC2, wd6.C0(5)) : new ComposeShader(shaderC, shaderC2, wd6.D0(5));
    }

    public final rzf d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee4)) {
            return false;
        }
        ee4 ee4Var = (ee4) obj;
        return this.c.equals(ee4Var.c) && this.d.equals(ee4Var.d);
    }

    public final int hashCode() {
        return Integer.hashCode(5) + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CompositeShaderBrush(dstBrush=" + this.c + ", srcBrush=" + this.d + ", blendMode=" + ((Object) yb5.P(5)) + ')';
    }
}
