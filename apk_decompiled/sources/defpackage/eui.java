package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class eui {
    public final zjj a;
    public final zjj b;
    public final zjj c;
    public boolean d;
    public final hsc e;
    public final lsc f;
    public final boolean g;
    public final n2g h;
    public final y3e i;

    public eui(zjj zjjVar, zjj zjjVar2, zjj zjjVar3, float f, boolean z) {
        zjjVar.getClass();
        zjjVar2.getClass();
        zjjVar3.getClass();
        this.f = mpk.P(new fq3(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier));
        n2g n2gVarB = o2g.b(0, 7, null);
        this.h = n2gVarB;
        this.i = new y3e(n2gVarB);
        this.g = true;
        this.a = zjjVar;
        this.b = zjjVar2;
        this.c = zjjVar3;
        this.e = new hsc(f);
        this.d = z;
    }

    public final void a(float f) {
        this.e.i(((Number) wd6.i0(Float.valueOf(f), (gq3) this.f.getValue())).floatValue());
    }
}
