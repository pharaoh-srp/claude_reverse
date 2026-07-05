package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class kwh {
    public static final kwh E;
    public static final kwh F;
    public static final kwh G;
    public static final kwh H;
    public static final kwh I;
    public static final kwh J;
    public static final kwh K;
    public static final /* synthetic */ kwh[] L;

    static {
        kwh kwhVar = new kwh("Heading", 0);
        E = kwhVar;
        kwh kwhVar2 = new kwh("CodeBlock", 1);
        F = kwhVar2;
        kwh kwhVar3 = new kwh("JsonBlock", 2);
        G = kwhVar3;
        kwh kwhVar4 = new kwh("RichItem", 3);
        H = kwhVar4;
        kwh kwhVar5 = new kwh("RichLink", 4);
        I = kwhVar5;
        kwh kwhVar6 = new kwh("TableRow", 5);
        J = kwhVar6;
        kwh kwhVar7 = new kwh("Text", 6);
        K = kwhVar7;
        L = new kwh[]{kwhVar, kwhVar2, kwhVar3, kwhVar4, kwhVar5, kwhVar6, kwhVar7};
    }

    public static kwh valueOf(String str) {
        return (kwh) Enum.valueOf(kwh.class, str);
    }

    public static kwh[] values() {
        return (kwh[]) L.clone();
    }
}
