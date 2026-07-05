package defpackage;

import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionState;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class eyh {
    public static final eyh E;
    public static final eyh F;
    public static final eyh G;
    public static final /* synthetic */ eyh[] H;
    public static final /* synthetic */ gq6 I;

    static {
        eyh eyhVar = new eyh("NEVER", 0);
        E = eyhVar;
        eyh eyhVar2 = new eyh("ASK", 1);
        F = eyhVar2;
        eyh eyhVar3 = new eyh("ALWAYS", 2);
        G = eyhVar3;
        eyh[] eyhVarArr = {eyhVar, eyhVar2, eyhVar3};
        H = eyhVarArr;
        I = new gq6(eyhVarArr);
    }

    public static eyh valueOf(String str) {
        return (eyh) Enum.valueOf(eyh.class, str);
    }

    public static eyh[] values() {
        return (eyh[]) H.clone();
    }

    public final boolean a() {
        return this == G || this == F;
    }

    public final MobileAppUseEvents$MobileAppUsePermissionState b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return MobileAppUseEvents$MobileAppUsePermissionState.NEVER;
        }
        if (iOrdinal == 1) {
            return MobileAppUseEvents$MobileAppUsePermissionState.ASK;
        }
        if (iOrdinal == 2) {
            return MobileAppUseEvents$MobileAppUsePermissionState.ALWAYS;
        }
        mr9.b();
        return null;
    }
}
