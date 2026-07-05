package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ov8 {
    public final boolean a;

    public ov8(boolean z) {
        this.a = z;
    }

    public ef5 a() {
        return this.a ? new af5((System.currentTimeMillis() / 1000) << 32, b(), null) : bf5.f(b());
    }

    public abstract long b();
}
