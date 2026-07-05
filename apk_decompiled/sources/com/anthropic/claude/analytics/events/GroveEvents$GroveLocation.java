package com.anthropic.claude.analytics.events;

import defpackage.c97;
import defpackage.fq6;
import defpackage.kb8;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/GroveEvents$GroveLocation", "", "Lcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;", "<init>", "(Ljava/lang/String;I)V", "Companion", "kb8", "UNSPECIFIED", "SETTINGS", "POLICY_UPDATE_MODAL", "ONBOARDING", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class GroveEvents$GroveLocation {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ GroveEvents$GroveLocation[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final kb8 Companion;
    public static final GroveEvents$GroveLocation UNSPECIFIED = new GroveEvents$GroveLocation("UNSPECIFIED", 0);
    public static final GroveEvents$GroveLocation SETTINGS = new GroveEvents$GroveLocation("SETTINGS", 1);
    public static final GroveEvents$GroveLocation POLICY_UPDATE_MODAL = new GroveEvents$GroveLocation("POLICY_UPDATE_MODAL", 2);
    public static final GroveEvents$GroveLocation ONBOARDING = new GroveEvents$GroveLocation("ONBOARDING", 3);

    private static final /* synthetic */ GroveEvents$GroveLocation[] $values() {
        return new GroveEvents$GroveLocation[]{UNSPECIFIED, SETTINGS, POLICY_UPDATE_MODAL, ONBOARDING};
    }

    static {
        GroveEvents$GroveLocation[] groveEvents$GroveLocationArr$values = $values();
        $VALUES = groveEvents$GroveLocationArr$values;
        $ENTRIES = wd6.n0(groveEvents$GroveLocationArr$values);
        Companion = new kb8();
        $cachedSerializer$delegate = yb5.w(w1a.F, new c97(22));
    }

    private GroveEvents$GroveLocation(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.GroveEvents.GroveLocation", values(), new String[]{"unknown", "settings", "policy_update_modal", "onboarding"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static GroveEvents$GroveLocation valueOf(String str) {
        return (GroveEvents$GroveLocation) Enum.valueOf(GroveEvents$GroveLocation.class, str);
    }

    public static GroveEvents$GroveLocation[] values() {
        return (GroveEvents$GroveLocation[]) $VALUES.clone();
    }
}
