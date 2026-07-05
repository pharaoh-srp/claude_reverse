package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class g2f extends ktk {
    public float c = MTTypesetterKt.kLineSkipLimitMultiplier;
    public final /* synthetic */ h2f d;

    public g2f(h2f h2fVar) {
        this.d = h2fVar;
    }

    @Override // defpackage.ktk
    public final void q(String str) {
        this.c = ((f2f) this.d.d).d.measureText(str) + this.c;
    }
}
