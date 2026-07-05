package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s5j {
    public static final q5j E;
    public static final /* synthetic */ s5j[] F;

    static {
        q5j q5jVar = new q5j();
        E = q5jVar;
        F = new s5j[]{q5jVar, new s5j() { // from class: r5j
            @Override // defpackage.s5j
            public final double a() {
                return 0.001d;
            }

            @Override // defpackage.s5j
            public final String b() {
                return "mL";
            }
        }, new s5j() { // from class: p5j
            @Override // defpackage.s5j
            public final double a() {
                return 0.02957353d;
            }

            @Override // defpackage.s5j
            public final String b() {
                return "fl. oz (US)";
            }
        }};
    }

    public static s5j valueOf(String str) {
        return (s5j) Enum.valueOf(s5j.class, str);
    }

    public static s5j[] values() {
        return (s5j[]) F.clone();
    }

    public abstract double a();

    public abstract String b();
}
