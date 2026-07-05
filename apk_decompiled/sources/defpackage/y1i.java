package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class y1i {
    public static final zl4 E;
    public static final y1i F;
    public static final y1i G;
    public static final /* synthetic */ y1i[] H;

    static {
        y1i y1iVar = new y1i("OPEN_MODEL_SELECTOR", 0);
        F = y1iVar;
        y1i y1iVar2 = new y1i("DISMISS", 1);
        G = y1iVar2;
        H = new y1i[]{y1iVar, y1iVar2};
        E = new zl4(23);
    }

    public static y1i valueOf(String str) {
        return (y1i) Enum.valueOf(y1i.class, str);
    }

    public static y1i[] values() {
        return (y1i[]) H.clone();
    }
}
