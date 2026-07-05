package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yre implements hwe {
    public final g4e a;

    public yre(g4e g4eVar) {
        g4eVar.getClass();
        this.a = g4eVar;
    }

    @Override // defpackage.hwe
    public final boolean a() {
        return true;
    }

    @Override // defpackage.hwe
    public final hwe b() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.hwe
    public final g4e c() {
        return this.a;
    }

    @Override // defpackage.hwe
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.hwe
    public final gwe d() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.hwe
    public final gwe g() {
        throw new IllegalStateException("already connected");
    }
}
