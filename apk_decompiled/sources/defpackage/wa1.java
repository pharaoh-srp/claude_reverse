package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class wa1 {
    public static final /* synthetic */ wn9[] d = {jce.a.e(new bwb(wa1.class, "isEnabled", "isEnabled()Z", 0))};
    public final int a;
    public Set b = um6.E;
    public final va1 c;

    public wa1(boolean z, int i) {
        this.a = i;
        this.c = new va1(Boolean.valueOf(z), 0, this);
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(za1 za1Var);

    public abstract void d(za1 za1Var);
}
