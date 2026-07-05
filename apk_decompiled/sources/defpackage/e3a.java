package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e3a {
    public static final c3a E;
    public static final /* synthetic */ e3a[] F;

    static {
        c3a c3aVar = new c3a();
        E = c3aVar;
        F = new e3a[]{c3aVar, new e3a() { // from class: b3a
            @Override // defpackage.e3a
            public final double a() {
                return 1000.0d;
            }
        }, new e3a() { // from class: d3a
            @Override // defpackage.e3a
            public final double a() {
                return 1609.34d;
            }
        }, new e3a() { // from class: a3a
            @Override // defpackage.e3a
            public final double a() {
                return 0.0254d;
            }
        }, new e3a() { // from class: z2a
            @Override // defpackage.e3a
            public final double a() {
                return 0.3048d;
            }
        }};
    }

    public static e3a valueOf(String str) {
        return (e3a) Enum.valueOf(e3a.class, str);
    }

    public static e3a[] values() {
        return (e3a[]) F.clone();
    }

    public abstract double a();
}
