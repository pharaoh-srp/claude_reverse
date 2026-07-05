package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class le7 implements hwe {
    public final gwe a;

    public le7(Throwable th) {
        this.a = new gwe(this, th, 2);
    }

    @Override // defpackage.hwe
    public final boolean a() {
        return false;
    }

    @Override // defpackage.hwe
    public final hwe b() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.hwe
    public final g4e c() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // defpackage.hwe
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.hwe
    public final gwe d() {
        return this.a;
    }

    @Override // defpackage.hwe
    public final gwe g() {
        return this.a;
    }
}
