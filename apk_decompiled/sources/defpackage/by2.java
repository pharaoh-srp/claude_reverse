package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class by2 {
    public static final by2 E;
    public static final by2 F;
    public static final /* synthetic */ by2[] G;
    public static final /* synthetic */ gq6 H;

    static {
        by2 by2Var = new by2(BaseEvent.ALL_INTEGRATIONS_KEY, 0);
        E = by2Var;
        by2 by2Var2 = new by2("Starred", 1);
        F = by2Var2;
        by2[] by2VarArr = {by2Var, by2Var2};
        G = by2VarArr;
        H = new gq6(by2VarArr);
    }

    public static by2 valueOf(String str) {
        return (by2) Enum.valueOf(by2.class, str);
    }

    public static by2[] values() {
        return (by2[]) G.clone();
    }
}
