package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class hej {
    public final a49 f;
    public final a49 g;
    public final lsc a = mpk.P(Boolean.TRUE);
    public final lsc b = mpk.P(Boolean.FALSE);
    public final hsc c = new hsc(MTTypesetterKt.kLineSkipLimitMultiplier);
    public final jsc d = new jsc(0);
    public final hsc e = new hsc(1.0f);
    public long h = -1;
    public long i = -1;
    public long j = -1;
    public long k = -1;

    public hej(String str) {
        this.f = new a49(str.concat(" source"));
        this.g = new a49(str.concat(" target"));
    }
}
