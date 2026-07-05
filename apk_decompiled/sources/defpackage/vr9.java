package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vr9 implements d16 {
    public final bce E;

    public vr9(bce bceVar, int i) {
        sq6.a(i);
        this.E = bceVar;
    }

    @Override // defpackage.d16
    public final String d() {
        return "Class '" + yae.a(this.E.a).b().b() + '\'';
    }

    public final String toString() {
        return vr9.class.getSimpleName() + ": " + this.E;
    }
}
