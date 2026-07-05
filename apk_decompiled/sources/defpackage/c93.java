package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class c93 implements xx1 {
    public final /* synthetic */ nwb b;

    public c93(nwb nwbVar) {
        this.b = nwbVar;
    }

    @Override // defpackage.xx1
    public final float a(float f, float f2, float f3) {
        return ((Boolean) this.b.getValue()).booleanValue() ? MTTypesetterKt.kLineSkipLimitMultiplier : super.a(f, f2, f3);
    }
}
