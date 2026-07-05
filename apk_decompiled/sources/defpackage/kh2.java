package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class kh2 {
    public static final /* synthetic */ kh2[] F;
    public static final /* synthetic */ gq6 G;
    public final String E;

    static {
        kh2[] kh2VarArr = {new kh2("GITHUB_WEBHOOK_ACTIVITY", 0, "github-webhook-activity"), new kh2("CI_MONITOR_EVENT", 1, "ci-monitor-event")};
        F = kh2VarArr;
        G = new gq6(kh2VarArr);
    }

    public kh2(String str, int i, String str2) {
        this.E = str2;
    }

    public static kh2 valueOf(String str) {
        return (kh2) Enum.valueOf(kh2.class, str);
    }

    public static kh2[] values() {
        return (kh2[]) F.clone();
    }
}
