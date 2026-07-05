package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class nbd implements hbd {
    public static final jbd E;
    public static final /* synthetic */ nbd[] F;

    static {
        jbd jbdVar = new jbd();
        E = jbdVar;
        F = new nbd[]{jbdVar, new nbd() { // from class: kbd
            @Override // defpackage.hbd
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new nbd() { // from class: lbd
            @Override // defpackage.hbd
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new nbd() { // from class: mbd
            @Override // defpackage.hbd
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static nbd valueOf(String str) {
        return (nbd) Enum.valueOf(nbd.class, str);
    }

    public static nbd[] values() {
        return (nbd[]) F.clone();
    }
}
