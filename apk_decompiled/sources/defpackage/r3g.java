package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class r3g {
    public r3g a(g2g g2gVar, s1g s1gVar, long j, long j2, long j3) {
        throw new IllegalStateException(("Active match can only be configured in ActiveMatchFoundConfigPending or ActiveMatchConfigured state. Current state: " + this).toString());
    }

    public boolean b() {
        return this instanceof ac;
    }

    public l9e c() {
        return null;
    }

    public boolean d() {
        return false;
    }

    public dpf e() {
        return null;
    }

    public l9e f(g2g g2gVar) {
        return c();
    }

    public abstract r3g g(s1g s1gVar);

    public abstract r3g h();

    public void i(l9e l9eVar) {
    }
}
