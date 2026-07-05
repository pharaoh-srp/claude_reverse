package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class osi {
    public static final msi E;
    public static final /* synthetic */ osi[] F;

    static {
        msi msiVar = new msi();
        E = msiVar;
        F = new osi[]{msiVar, new osi() { // from class: lsi
            @Override // defpackage.osi
            public final double a() {
                return 0.2777777777777778d;
            }

            @Override // defpackage.osi
            public final String b() {
                return "km/h";
            }
        }, new osi() { // from class: nsi
            @Override // defpackage.osi
            public final double a() {
                return 0.447040357632d;
            }

            @Override // defpackage.osi
            public final String b() {
                return "miles/h";
            }
        }};
    }

    public static osi valueOf(String str) {
        return (osi) Enum.valueOf(osi.class, str);
    }

    public static osi[] values() {
        return (osi[]) F.clone();
    }

    public abstract double a();

    public abstract String b();
}
