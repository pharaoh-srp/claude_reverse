package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class qvg {
    public static final qvg E;
    public static final qvg F;
    public static final qvg G;
    public static final /* synthetic */ qvg[] H;

    static {
        qvg qvgVar = new qvg("GOOGLE_PLAY", 0);
        E = qvgVar;
        qvg qvgVar2 = new qvg("CLAUDE_AI_WEB", 1);
        F = qvgVar2;
        qvg qvgVar3 = new qvg("OTHER_PLATFORM", 2);
        G = qvgVar3;
        H = new qvg[]{qvgVar, qvgVar2, qvgVar3};
    }

    public static qvg valueOf(String str) {
        return (qvg) Enum.valueOf(qvg.class, str);
    }

    public static qvg[] values() {
        return (qvg[]) H.clone();
    }
}
