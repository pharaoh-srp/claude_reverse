package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum jbd extends nbd {
    public jbd() {
        super("ALWAYS_TRUE", 0);
    }

    @Override // defpackage.hbd
    public final boolean apply(Object obj) {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Predicates.alwaysTrue()";
    }
}
