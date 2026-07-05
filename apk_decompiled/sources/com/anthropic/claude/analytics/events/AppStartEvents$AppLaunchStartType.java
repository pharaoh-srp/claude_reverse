package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.j7;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.tk0;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/AppStartEvents$AppLaunchStartType", "", "Lcom/anthropic/claude/analytics/events/AppStartEvents$AppLaunchStartType;", "<init>", "(Ljava/lang/String;I)V", "Companion", "tk0", "UNSPECIFIED", "COLD", "WARM", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class AppStartEvents$AppLaunchStartType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ AppStartEvents$AppLaunchStartType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final tk0 Companion;
    public static final AppStartEvents$AppLaunchStartType UNSPECIFIED = new AppStartEvents$AppLaunchStartType("UNSPECIFIED", 0);
    public static final AppStartEvents$AppLaunchStartType COLD = new AppStartEvents$AppLaunchStartType("COLD", 1);
    public static final AppStartEvents$AppLaunchStartType WARM = new AppStartEvents$AppLaunchStartType("WARM", 2);

    private static final /* synthetic */ AppStartEvents$AppLaunchStartType[] $values() {
        return new AppStartEvents$AppLaunchStartType[]{UNSPECIFIED, COLD, WARM};
    }

    static {
        AppStartEvents$AppLaunchStartType[] appStartEvents$AppLaunchStartTypeArr$values = $values();
        $VALUES = appStartEvents$AppLaunchStartTypeArr$values;
        $ENTRIES = wd6.n0(appStartEvents$AppLaunchStartTypeArr$values);
        Companion = new tk0();
        $cachedSerializer$delegate = yb5.w(w1a.F, new j7(21));
    }

    private AppStartEvents$AppLaunchStartType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.AppStartEvents.AppLaunchStartType", values(), new String[]{"unspecified", "cold", "warm"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static AppStartEvents$AppLaunchStartType valueOf(String str) {
        return (AppStartEvents$AppLaunchStartType) Enum.valueOf(AppStartEvents$AppLaunchStartType.class, str);
    }

    public static AppStartEvents$AppLaunchStartType[] values() {
        return (AppStartEvents$AppLaunchStartType[]) $VALUES.clone();
    }
}
