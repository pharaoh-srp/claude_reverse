package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0g {
    public static final vve a = f1g.d;
    public static final vve b = f1g.h;
    public static final vve c = f1g.g;
    public static final vve d = f1g.e;
    public static final vve e = f1g.f;
    public static final vve f = f1g.b;
    public static final vve g = f1g.c;
    public static final vve h = f1g.a;
    public static final wa6 i = f1g.i;

    static {
        if (100.0f < MTTypesetterKt.kLineSkipLimitMultiplier || 100.0f > 100.0f) {
            e39.a("The percent should be in the range of [0, 100]");
        }
    }
}
