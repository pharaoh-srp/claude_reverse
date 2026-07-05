package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class hc9 {
    public static final hc9 E;
    public static final hc9 F;
    public static final hc9 G;
    public static final hc9 H;
    public static final /* synthetic */ hc9[] I;

    static {
        hc9 hc9Var = new hc9("CHAT_EMPTY_STATE", 0);
        E = hc9Var;
        hc9 hc9Var2 = new hc9("MEMORY", 1);
        F = hc9Var2;
        hc9 hc9Var3 = new hc9("KNOWLEDGE_AND_INSTRUCTIONS", 2);
        G = hc9Var3;
        hc9 hc9Var4 = new hc9("RECENT_CHATS_HEADER", 3);
        H = hc9Var4;
        I = new hc9[]{hc9Var, hc9Var2, hc9Var3, hc9Var4};
    }

    public static hc9 valueOf(String str) {
        return (hc9) Enum.valueOf(hc9.class, str);
    }

    public static hc9[] values() {
        return (hc9[]) I.clone();
    }
}
