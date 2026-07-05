package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class n1c {
    public final o29 a;
    public final h99 b;
    public final HashSet c;
    public volatile Long d;
    public volatile Long e;
    public volatile Long f;
    public volatile boolean g;
    public volatile dpf h;

    public n1c(o29 o29Var, h99 h99Var) {
        o29Var.getClass();
        h99Var.getClass();
        this.a = o29Var;
        this.b = h99Var;
        this.c = new HashSet();
        this.h = new dpf(15);
    }

    public final Long a() {
        if (this.g) {
            return this.f;
        }
        g99 g99Var = g99.F;
        Long l = null;
        if (this.e == null) {
            dch.H(this.b, 2, g99Var, qs7.c0, null, false, 56);
        } else if (this.c.size() > 0) {
            dch.H(this.b, 2, g99Var, re4.W, null, false, 56);
        } else {
            l = this.d;
        }
        this.f = l;
        return this.f;
    }
}
