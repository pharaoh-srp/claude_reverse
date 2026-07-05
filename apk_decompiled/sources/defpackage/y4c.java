package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y4c implements a5c {
    public static final y4c E;
    public static final y4c F;
    public static final y4c G;
    public static final y4c H;
    public static final y4c I;
    public static final /* synthetic */ y4c[] J;

    static {
        y4c y4cVar = new y4c("DISABLED", 0);
        E = y4cVar;
        y4c y4cVar2 = new y4c("NO_ACTION", 1);
        F = y4cVar2;
        y4c y4cVar3 = new y4c("NO_ELIGIBLE_ACTION", 2);
        G = y4cVar3;
        y4c y4cVar4 = new y4c("NO_PREVIOUS_VIEW", 3);
        H = y4cVar4;
        y4c y4cVar5 = new y4c("UNKNOWN", 4);
        I = y4cVar5;
        J = new y4c[]{y4cVar, y4cVar2, y4cVar3, y4cVar4, y4cVar5};
    }

    public static y4c valueOf(String str) {
        return (y4c) Enum.valueOf(y4c.class, str);
    }

    public static y4c[] values() {
        return (y4c[]) J.clone();
    }
}
