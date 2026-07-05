package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gnd {
    public static final gnd E;
    public static final gnd F;
    public static final gnd G;
    public static final gnd H;
    public static final gnd I;
    public static final /* synthetic */ gnd[] J;

    static {
        gnd gndVar = new gnd(BaseEvent.ALL_INTEGRATIONS_KEY, 0);
        E = gndVar;
        gnd gndVar2 = new gnd("Creator", 1);
        F = gndVar2;
        gnd gndVar3 = new gnd("Team", 2);
        G = gndVar3;
        gnd gndVar4 = new gnd("Shared", 3);
        H = gndVar4;
        gnd gndVar5 = new gnd("Archived", 4);
        I = gndVar5;
        J = new gnd[]{gndVar, gndVar2, gndVar3, gndVar4, gndVar5};
    }

    public static gnd valueOf(String str) {
        return (gnd) Enum.valueOf(gnd.class, str);
    }

    public static gnd[] values() {
        return (gnd[]) J.clone();
    }
}
