package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class zve extends rtk {
    @Override // defpackage.rtk
    public final void f(a1g a1gVar, float f, float f2) {
        a1gVar.d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        w0g w0gVar = new w0g(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, f3, f3);
        w0gVar.f = 180.0f;
        w0gVar.g = 90.0f;
        a1gVar.f.add(w0gVar);
        u0g u0gVar = new u0g(w0gVar);
        a1gVar.a(180.0f);
        a1gVar.g.add(u0gVar);
        a1gVar.d = 270.0f;
        float f4 = (MTTypesetterKt.kLineSkipLimitMultiplier + f3) * 0.5f;
        float f5 = (f3 - MTTypesetterKt.kLineSkipLimitMultiplier) / 2.0f;
        a1gVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f5) + f4;
        a1gVar.c = (f5 * ((float) Math.sin(Math.toRadians(270.0d)))) + f4;
    }
}
