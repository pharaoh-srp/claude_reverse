package defpackage;

import com.anthropic.claude.api.account.VillageWeaverConsentState;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class uwc {
    public static final yl4 F;
    public static final uwc G;
    public static final uwc H;
    public static final /* synthetic */ uwc[] I;
    public static final /* synthetic */ gq6 J;
    public final VillageWeaverConsentState E;

    static {
        uwc uwcVar = new uwc("ALWAYS_SHARE", 0, VillageWeaverConsentState.ACCEPTED);
        G = uwcVar;
        uwc uwcVar2 = new uwc("ASK_EACH_TIME", 1, VillageWeaverConsentState.PER_SESSION);
        H = uwcVar2;
        uwc[] uwcVarArr = {uwcVar, uwcVar2};
        I = uwcVarArr;
        J = new gq6(uwcVarArr);
        F = new yl4();
    }

    public uwc(String str, int i, VillageWeaverConsentState villageWeaverConsentState) {
        this.E = villageWeaverConsentState;
    }

    public static uwc valueOf(String str) {
        return (uwc) Enum.valueOf(uwc.class, str);
    }

    public static uwc[] values() {
        return (uwc[]) I.clone();
    }
}
