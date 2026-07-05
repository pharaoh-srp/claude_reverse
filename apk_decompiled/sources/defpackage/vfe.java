package defpackage;

import android.graphics.RenderEffect;

/* JADX INFO: loaded from: classes.dex */
public abstract class vfe {
    public RenderEffect a;

    public final RenderEffect a() {
        RenderEffect renderEffect = this.a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectB = b();
        this.a = renderEffectB;
        return renderEffectB;
    }

    public abstract RenderEffect b();
}
