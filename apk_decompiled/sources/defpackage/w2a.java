package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class w2a {
    public final h0g a;
    public final wdh b;
    public final CharSequence c;

    public w2a(h0g h0gVar, wdh wdhVar, String str) {
        str.getClass();
        this.a = h0gVar;
        this.b = wdhVar;
        this.c = str;
    }

    public final float a(w5b w5bVar, float f, float f2, float f3) {
        w5bVar.getClass();
        return wdh.d(this.b, w5bVar, this.c, (int) (f3 - (w5bVar.b(f2) + w5bVar.b(f))), MTTypesetterKt.kLineSkipLimitMultiplier, 56);
    }

    public final float b(w5b w5bVar, float f, float f2, float f3) {
        w5bVar.getClass();
        return wdh.f(this.b, w5bVar, this.c, (int) (f3 - (w5bVar.b(f2) + w5bVar.b(f))), 0, MTTypesetterKt.kLineSkipLimitMultiplier, 56);
    }
}
