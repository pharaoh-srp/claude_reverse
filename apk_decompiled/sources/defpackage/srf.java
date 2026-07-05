package defpackage;

import com.anthropic.claude.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class srf {
    public static final srf F;
    public static final srf G;
    public static final srf H;
    public static final srf I;
    public static final srf J;
    public static final srf K;
    public static final /* synthetic */ srf[] L;
    public static final /* synthetic */ gq6 M;
    public final int E;

    static {
        srf srfVar = new srf("ALL", 0, R.string.session_filter_all);
        F = srfVar;
        srf srfVar2 = new srf("IN_PROGRESS", 1, R.string.session_filter_working);
        G = srfVar2;
        srf srfVar3 = new srf("BLOCKED", 2, R.string.session_filter_needs_input);
        H = srfVar3;
        srf srfVar4 = new srf("REVIEW_READY", 3, R.string.session_filter_ready_for_review);
        I = srfVar4;
        srf srfVar5 = new srf("DONE", 4, R.string.session_filter_completed);
        J = srfVar5;
        srf srfVar6 = new srf("ARCHIVED", 5, R.string.session_filter_archived);
        K = srfVar6;
        srf[] srfVarArr = {srfVar, srfVar2, srfVar3, srfVar4, srfVar5, srfVar6};
        L = srfVarArr;
        M = new gq6(srfVarArr);
    }

    public srf(String str, int i, int i2) {
        this.E = i2;
    }

    public static srf valueOf(String str) {
        return (srf) Enum.valueOf(srf.class, str);
    }

    public static srf[] values() {
        return (srf[]) L.clone();
    }

    public final String a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "all";
        }
        if (iOrdinal == 1) {
            return "working";
        }
        if (iOrdinal == 2) {
            return "need_input";
        }
        if (iOrdinal == 3) {
            return "review_ready";
        }
        if (iOrdinal == 4) {
            return "completed";
        }
        if (iOrdinal == 5) {
            return "archived";
        }
        wg6.i();
        return null;
    }
}
