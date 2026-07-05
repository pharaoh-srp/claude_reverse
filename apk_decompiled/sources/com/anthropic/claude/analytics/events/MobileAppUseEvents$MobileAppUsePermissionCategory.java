package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.ulb;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.wlb;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionCategory", "", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionCategory;", "<init>", "(Ljava/lang/String;I)V", "Companion", "wlb", "UNSPECIFIED", "LOCATION", "CALENDAR", "REMINDERS", "HEALTH", "CONNECTED_APP", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class MobileAppUseEvents$MobileAppUsePermissionCategory {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MobileAppUseEvents$MobileAppUsePermissionCategory[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final wlb Companion;
    public static final MobileAppUseEvents$MobileAppUsePermissionCategory UNSPECIFIED = new MobileAppUseEvents$MobileAppUsePermissionCategory("UNSPECIFIED", 0);
    public static final MobileAppUseEvents$MobileAppUsePermissionCategory LOCATION = new MobileAppUseEvents$MobileAppUsePermissionCategory("LOCATION", 1);
    public static final MobileAppUseEvents$MobileAppUsePermissionCategory CALENDAR = new MobileAppUseEvents$MobileAppUsePermissionCategory("CALENDAR", 2);
    public static final MobileAppUseEvents$MobileAppUsePermissionCategory REMINDERS = new MobileAppUseEvents$MobileAppUsePermissionCategory("REMINDERS", 3);
    public static final MobileAppUseEvents$MobileAppUsePermissionCategory HEALTH = new MobileAppUseEvents$MobileAppUsePermissionCategory("HEALTH", 4);
    public static final MobileAppUseEvents$MobileAppUsePermissionCategory CONNECTED_APP = new MobileAppUseEvents$MobileAppUsePermissionCategory("CONNECTED_APP", 5);

    private static final /* synthetic */ MobileAppUseEvents$MobileAppUsePermissionCategory[] $values() {
        return new MobileAppUseEvents$MobileAppUsePermissionCategory[]{UNSPECIFIED, LOCATION, CALENDAR, REMINDERS, HEALTH, CONNECTED_APP};
    }

    static {
        MobileAppUseEvents$MobileAppUsePermissionCategory[] mobileAppUseEvents$MobileAppUsePermissionCategoryArr$values = $values();
        $VALUES = mobileAppUseEvents$MobileAppUsePermissionCategoryArr$values;
        $ENTRIES = wd6.n0(mobileAppUseEvents$MobileAppUsePermissionCategoryArr$values);
        Companion = new wlb();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ulb(1));
    }

    private MobileAppUseEvents$MobileAppUsePermissionCategory(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.MobileAppUseEvents.MobileAppUsePermissionCategory", values(), new String[]{"unknown", "location", "calendar", "reminders", "health", "connected_app"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MobileAppUseEvents$MobileAppUsePermissionCategory valueOf(String str) {
        return (MobileAppUseEvents$MobileAppUsePermissionCategory) Enum.valueOf(MobileAppUseEvents$MobileAppUsePermissionCategory.class, str);
    }

    public static MobileAppUseEvents$MobileAppUsePermissionCategory[] values() {
        return (MobileAppUseEvents$MobileAppUsePermissionCategory[]) $VALUES.clone();
    }
}
