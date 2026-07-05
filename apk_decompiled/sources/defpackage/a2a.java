package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a2a extends c5c {
    public Object H;

    public a2a(String str) {
        pqi.p(str);
        this.H = str;
    }

    @Override // defpackage.c5c
    public final String B() {
        return O();
    }

    @Override // defpackage.c5c
    public final yj6 G() {
        return this.E;
    }

    public final String O() {
        return g(A());
    }

    public final void Q() {
        Object obj = this.H;
        if (obj instanceof n31) {
            return;
        }
        n31 n31Var = new n31();
        this.H = n31Var;
        n31Var.t(A(), (String) obj);
    }

    @Override // defpackage.c5c
    public final String a(String str) {
        Q();
        return super.a(str);
    }

    @Override // defpackage.c5c
    public final String g(String str) {
        return !(this.H instanceof n31) ? A().equals(str) ? (String) this.H : "" : super.g(str);
    }

    @Override // defpackage.c5c
    public final void h(String str, String str2) {
        Q();
        super.h("pubSysKey", str2);
    }

    @Override // defpackage.c5c
    public final n31 k() {
        Q();
        return (n31) this.H;
    }

    @Override // defpackage.c5c
    public final String l() {
        yj6 yj6Var = this.E;
        return yj6Var != null ? yj6Var.l() : "";
    }

    @Override // defpackage.c5c
    public final int o() {
        return 0;
    }

    @Override // defpackage.c5c
    public final c5c r(c5c c5cVar) {
        a2a a2aVar = (a2a) super.r(c5cVar);
        Object obj = this.H;
        if (obj instanceof n31) {
            a2aVar.H = ((n31) obj).clone();
        }
        return a2aVar;
    }

    @Override // defpackage.c5c
    public final List s() {
        return c5c.G;
    }

    @Override // defpackage.c5c
    public final boolean v() {
        return this.H instanceof n31;
    }
}
