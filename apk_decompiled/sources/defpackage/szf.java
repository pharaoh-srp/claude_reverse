package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes3.dex */
public final class szf extends CharacterStyle implements UpdateAppearance {
    public final rzf E;
    public final float F;
    public final lsc G = mpk.P(new k8g(9205357640488583168L));
    public final wz5 H = mpk.w(new pza(23, this));

    public szf(rzf rzfVar, float f) {
        this.E = rzfVar;
        this.F = f;
    }

    public final void a(long j) {
        this.G.setValue(new k8g(j));
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        nrk.h(textPaint, this.F);
        textPaint.setShader((Shader) this.H.getValue());
    }
}
