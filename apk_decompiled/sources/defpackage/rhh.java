package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class rhh {
    public static final y5f g = dgj.K(new yeg(12), new lwf(14));
    public final hsc a;
    public final hsc b = new hsc(MTTypesetterKt.kLineSkipLimitMultiplier);
    public final isc c = new isc(0);
    public l9e d = l9e.e;
    public long e = kkh.b;
    public final lsc f;

    public rhh(ukc ukcVar, float f) {
        this.a = new hsc(f);
        this.f = new lsc(ukcVar, a5.N);
    }

    public final void a(ukc ukcVar, l9e l9eVar, int i, int i2) {
        float f = i2 - i;
        this.b.i(f);
        float f2 = l9eVar.a;
        float f3 = l9eVar.b;
        l9e l9eVar2 = this.d;
        float f4 = l9eVar2.a;
        hsc hscVar = this.a;
        if (f2 != f4 || f3 != l9eVar2.b) {
            boolean z = ukcVar == ukc.E;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? l9eVar.d : l9eVar.c;
            float fH = hscVar.h();
            float f6 = i;
            float f7 = fH + f6;
            hscVar.i(hscVar.h() + ((f5 <= f7 && (f2 >= fH || f5 - f2 <= f6)) ? (f2 >= fH || f5 - f2 > f6) ? 0.0f : f2 - fH : f5 - f7));
            this.d = l9eVar;
        }
        hscVar.i(wd6.d0(hscVar.h(), MTTypesetterKt.kLineSkipLimitMultiplier, f));
        this.c.i(i);
    }
}
