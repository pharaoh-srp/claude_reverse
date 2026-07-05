package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class t7h {
    public static final t7h E;
    public static final t7h F;
    public static final t7h G;
    public static final t7h H;
    public static final t7h I;
    public static final t7h J;
    public static final /* synthetic */ t7h[] K;

    static {
        t7h t7hVar = new t7h("TOOL_ACTIVITY", 0);
        E = t7hVar;
        t7h t7hVar2 = new t7h("ASSISTANT_TEXT", 1);
        F = t7hVar2;
        t7h t7hVar3 = new t7h("LIFECYCLE", 2);
        G = t7hVar3;
        t7h t7hVar4 = new t7h("MODEL_STATE", 3);
        H = t7hVar4;
        t7h t7hVar5 = new t7h("ERROR", 4);
        I = t7hVar5;
        t7h t7hVar6 = new t7h("OTHER", 5);
        J = t7hVar6;
        K = new t7h[]{t7hVar, t7hVar2, t7hVar3, t7hVar4, t7hVar5, t7hVar6};
    }

    public static t7h valueOf(String str) {
        return (t7h) Enum.valueOf(t7h.class, str);
    }

    public static t7h[] values() {
        return (t7h[]) K.clone();
    }
}
