package defpackage;

import com.anthropic.claude.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class n6e {
    public static final bm4 F;
    public static final n6e G;
    public static final n6e H;
    public static final n6e I;
    public static final n6e J;
    public static final n6e K;
    public static final n6e L;
    public static final n6e M;
    public static final n6e N;
    public static final /* synthetic */ n6e[] O;
    public static final /* synthetic */ gq6 P;
    public final int E;

    static {
        n6e n6eVar = new n6e("TODAY", 0, R.string.recency_today);
        G = n6eVar;
        n6e n6eVar2 = new n6e("YESTERDAY", 1, R.string.recency_yesterday);
        H = n6eVar2;
        n6e n6eVar3 = new n6e("THIS_WEEK", 2, R.string.recency_this_week);
        I = n6eVar3;
        n6e n6eVar4 = new n6e("LAST_WEEK", 3, R.string.recency_last_week);
        J = n6eVar4;
        n6e n6eVar5 = new n6e("THIS_MONTH", 4, R.string.recency_this_month);
        K = n6eVar5;
        n6e n6eVar6 = new n6e("LAST_MONTH", 5, R.string.recency_last_month);
        L = n6eVar6;
        n6e n6eVar7 = new n6e("THIS_YEAR", 6, R.string.recency_this_year);
        M = n6eVar7;
        n6e n6eVar8 = new n6e("OLDER", 7, R.string.recency_older);
        N = n6eVar8;
        n6e[] n6eVarArr = {n6eVar, n6eVar2, n6eVar3, n6eVar4, n6eVar5, n6eVar6, n6eVar7, n6eVar8};
        O = n6eVarArr;
        P = new gq6(n6eVarArr);
        F = new bm4();
    }

    public n6e(String str, int i, int i2) {
        this.E = i2;
    }

    public static n6e valueOf(String str) {
        return (n6e) Enum.valueOf(n6e.class, str);
    }

    public static n6e[] values() {
        return (n6e[]) O.clone();
    }
}
