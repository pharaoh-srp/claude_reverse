package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class eva {
    public static final yua E;
    public static final zua F;
    public static final bva G;
    public static final /* synthetic */ eva[] H;

    static {
        yua yuaVar = new yua();
        E = yuaVar;
        zua zuaVar = new zua();
        F = zuaVar;
        bva bvaVar = new bva();
        G = bvaVar;
        H = new eva[]{yuaVar, zuaVar, bvaVar, new eva() { // from class: ava
            @Override // defpackage.eva
            public final double a() {
                return 1.0E-6d;
            }
        }, new eva() { // from class: cva
            @Override // defpackage.eva
            public final double a() {
                return 28.34952d;
            }
        }, new eva() { // from class: dva
            @Override // defpackage.eva
            public final double a() {
                return 453.59237d;
            }
        }};
    }

    public static eva valueOf(String str) {
        return (eva) Enum.valueOf(eva.class, str);
    }

    public static eva[] values() {
        return (eva[]) H.clone();
    }

    public abstract double a();
}
