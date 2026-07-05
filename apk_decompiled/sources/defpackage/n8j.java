package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n8j {
    public static final /* synthetic */ n8j[] F;
    public static final /* synthetic */ gq6 G;
    public final String E;

    static {
        n8j[] n8jVarArr = {new n8j("REPLY", 0, "reply"), new n8j("UPDATE_STATUS", 1, "update_status"), new n8j("NO_REPLY_NEEDED", 2, "no_reply_needed")};
        F = n8jVarArr;
        G = new gq6(n8jVarArr);
    }

    public n8j(String str, int i, String str2) {
        this.E = str2;
    }

    public static n8j valueOf(String str) {
        return (n8j) Enum.valueOf(n8j.class, str);
    }

    public static n8j[] values() {
        return (n8j[]) F.clone();
    }
}
