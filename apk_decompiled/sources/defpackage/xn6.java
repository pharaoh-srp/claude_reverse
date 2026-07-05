package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xn6 {
    public static final tn6 E;
    public static final vn6 F;
    public static final /* synthetic */ xn6[] G;

    static {
        tn6 tn6Var = new tn6();
        E = tn6Var;
        vn6 vn6Var = new vn6();
        F = vn6Var;
        G = new xn6[]{tn6Var, vn6Var, new xn6() { // from class: un6
            @Override // defpackage.xn6
            public final double a() {
                return 0.2390057361d;
            }

            @Override // defpackage.xn6
            public final String b() {
                return "J";
            }
        }, new xn6() { // from class: wn6
            @Override // defpackage.xn6
            public final double a() {
                return 239.0057361d;
            }

            @Override // defpackage.xn6
            public final String b() {
                return "kJ";
            }
        }};
    }

    public static xn6 valueOf(String str) {
        return (xn6) Enum.valueOf(xn6.class, str);
    }

    public static xn6[] values() {
        return (xn6[]) G.clone();
    }

    public abstract double a();

    public abstract String b();
}
