package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class l1g {
    public static final cm4 F;
    public static final /* synthetic */ l1g[] G;
    public static final /* synthetic */ gq6 H;
    public final String E;

    static {
        l1g[] l1gVarArr = {new l1g("ORG_SHARING_DISABLED", 0, "org_sharing_disabled"), new l1g("ORG_SHARING_CHECK_UNAVAILABLE", 1, "org_sharing_check_unavailable"), new l1g("ZDR_RESTRICTED", 2, "zdr_restricted"), new l1g("SESSION_CLAIM_MISMATCH", 3, "session_claim_mismatch")};
        G = l1gVarArr;
        H = new gq6(l1gVarArr);
        F = new cm4();
    }

    public l1g(String str, int i, String str2) {
        this.E = str2;
    }

    public static l1g valueOf(String str) {
        return (l1g) Enum.valueOf(l1g.class, str);
    }

    public static l1g[] values() {
        return (l1g[]) G.clone();
    }
}
