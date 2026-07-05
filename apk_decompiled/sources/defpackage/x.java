package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x extends kjc {
    public static final x E = new x();

    @Override // defpackage.kjc
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.kjc
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
