package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h9g implements g9g {
    public static final h9g a = new h9g();

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return g9g.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof g9g;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + g9g.class.getName() + "()";
    }
}
