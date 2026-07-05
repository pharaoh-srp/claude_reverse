package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.j7;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.sk0;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/anthropic/claude/analytics/events/AppStartEvents$AppLaunchDestination", "", "Lcom/anthropic/claude/analytics/events/AppStartEvents$AppLaunchDestination;", "<init>", "(Ljava/lang/String;I)V", "Companion", "sk0", "UNSPECIFIED", "LOGIN", "ONBOARDING", "LOGGED_IN", "OTHER", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class AppStartEvents$AppLaunchDestination {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ AppStartEvents$AppLaunchDestination[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final sk0 Companion;
    public static final AppStartEvents$AppLaunchDestination UNSPECIFIED = new AppStartEvents$AppLaunchDestination("UNSPECIFIED", 0);
    public static final AppStartEvents$AppLaunchDestination LOGIN = new AppStartEvents$AppLaunchDestination("LOGIN", 1);
    public static final AppStartEvents$AppLaunchDestination ONBOARDING = new AppStartEvents$AppLaunchDestination("ONBOARDING", 2);
    public static final AppStartEvents$AppLaunchDestination LOGGED_IN = new AppStartEvents$AppLaunchDestination("LOGGED_IN", 3);
    public static final AppStartEvents$AppLaunchDestination OTHER = new AppStartEvents$AppLaunchDestination("OTHER", 4);

    private static final /* synthetic */ AppStartEvents$AppLaunchDestination[] $values() {
        return new AppStartEvents$AppLaunchDestination[]{UNSPECIFIED, LOGIN, ONBOARDING, LOGGED_IN, OTHER};
    }

    static {
        AppStartEvents$AppLaunchDestination[] appStartEvents$AppLaunchDestinationArr$values = $values();
        $VALUES = appStartEvents$AppLaunchDestinationArr$values;
        $ENTRIES = wd6.n0(appStartEvents$AppLaunchDestinationArr$values);
        Companion = new sk0();
        $cachedSerializer$delegate = yb5.w(w1a.F, new j7(20));
    }

    private AppStartEvents$AppLaunchDestination(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.AppStartEvents.AppLaunchDestination", values(), new String[]{"unspecified", "login", "onboarding", "logged_in", "other"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static AppStartEvents$AppLaunchDestination valueOf(String str) {
        return (AppStartEvents$AppLaunchDestination) Enum.valueOf(AppStartEvents$AppLaunchDestination.class, str);
    }

    public static AppStartEvents$AppLaunchDestination[] values() {
        return (AppStartEvents$AppLaunchDestination[]) $VALUES.clone();
    }
}
