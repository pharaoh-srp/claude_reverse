package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.ulb;
import defpackage.vlb;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionAction", "", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionAction;", "<init>", "(Ljava/lang/String;I)V", "Companion", "vlb", "UNSPECIFIED", "ALLOW_ONCE", "ALWAYS_ALLOW", "DENY", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class MobileAppUseEvents$MobileAppUsePermissionAction {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MobileAppUseEvents$MobileAppUsePermissionAction[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final vlb Companion;
    public static final MobileAppUseEvents$MobileAppUsePermissionAction UNSPECIFIED = new MobileAppUseEvents$MobileAppUsePermissionAction("UNSPECIFIED", 0);
    public static final MobileAppUseEvents$MobileAppUsePermissionAction ALLOW_ONCE = new MobileAppUseEvents$MobileAppUsePermissionAction("ALLOW_ONCE", 1);
    public static final MobileAppUseEvents$MobileAppUsePermissionAction ALWAYS_ALLOW = new MobileAppUseEvents$MobileAppUsePermissionAction("ALWAYS_ALLOW", 2);
    public static final MobileAppUseEvents$MobileAppUsePermissionAction DENY = new MobileAppUseEvents$MobileAppUsePermissionAction("DENY", 3);

    private static final /* synthetic */ MobileAppUseEvents$MobileAppUsePermissionAction[] $values() {
        return new MobileAppUseEvents$MobileAppUsePermissionAction[]{UNSPECIFIED, ALLOW_ONCE, ALWAYS_ALLOW, DENY};
    }

    static {
        MobileAppUseEvents$MobileAppUsePermissionAction[] mobileAppUseEvents$MobileAppUsePermissionActionArr$values = $values();
        $VALUES = mobileAppUseEvents$MobileAppUsePermissionActionArr$values;
        $ENTRIES = wd6.n0(mobileAppUseEvents$MobileAppUsePermissionActionArr$values);
        Companion = new vlb();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ulb(0));
    }

    private MobileAppUseEvents$MobileAppUsePermissionAction(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.MobileAppUseEvents.MobileAppUsePermissionAction", values(), new String[]{"unknown", "allow_once", "always_allow", "deny"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MobileAppUseEvents$MobileAppUsePermissionAction valueOf(String str) {
        return (MobileAppUseEvents$MobileAppUsePermissionAction) Enum.valueOf(MobileAppUseEvents$MobileAppUsePermissionAction.class, str);
    }

    public static MobileAppUseEvents$MobileAppUsePermissionAction[] values() {
        return (MobileAppUseEvents$MobileAppUsePermissionAction[]) $VALUES.clone();
    }
}
