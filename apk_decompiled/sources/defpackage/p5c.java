package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p5c extends q5c {
    public final Class a;
    public final String b;

    public p5c(Class cls, String str) {
        this.a = cls;
        this.b = "::".concat(str);
    }

    @Override // defpackage.av6
    public final int a() {
        return 1;
    }

    @Override // defpackage.q5c
    public final boolean g(c5c c5cVar) {
        return this.a.isInstance(c5cVar);
    }

    public final String toString() {
        return this.b;
    }
}
