package defpackage;

import com.anthropic.claude.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e25 {
    public static final e25 I;
    public static final /* synthetic */ e25[] J;
    public static final /* synthetic */ gq6 K;
    public final String E;
    public final int F;
    public final int G;
    public final boolean H;

    static {
        e25 e25Var = new e25(0, R.string.conway_webhook_source_github, R.string.conway_webhook_verify_hint_github, "Github", "github_hmac256", false);
        I = e25Var;
        e25[] e25VarArr = {e25Var, new e25(1, R.string.conway_webhook_verify_source_shared, R.string.conway_webhook_verify_hint_shared, "SharedSecret", "static_secret_header", true)};
        J = e25VarArr;
        K = new gq6(e25VarArr);
    }

    public e25(int i, int i2, int i3, String str, String str2, boolean z) {
        this.E = str2;
        this.F = i2;
        this.G = i3;
        this.H = z;
    }

    public static e25 valueOf(String str) {
        return (e25) Enum.valueOf(e25.class, str);
    }

    public static e25[] values() {
        return (e25[]) J.clone();
    }
}
