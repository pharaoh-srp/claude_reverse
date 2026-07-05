package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class os1 {
    public static final ns1 E;
    public static final /* synthetic */ os1[] F;

    static {
        ns1 ns1Var = new ns1();
        E = ns1Var;
        F = new os1[]{ns1Var, new os1() { // from class: ms1
            @Override // defpackage.os1
            public final double a() {
                return 0.05555555555555555d;
            }

            @Override // defpackage.os1
            public final String b() {
                return "mg/dL";
            }
        }};
    }

    public static os1 valueOf(String str) {
        return (os1) Enum.valueOf(os1.class, str);
    }

    public static os1[] values() {
        return (os1[]) F.clone();
    }

    public abstract double a();

    public abstract String b();
}
