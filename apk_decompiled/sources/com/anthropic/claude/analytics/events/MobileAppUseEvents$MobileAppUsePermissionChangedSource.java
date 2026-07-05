package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.ulb;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.zlb;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChangedSource", "", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChangedSource;", "<init>", "(Ljava/lang/String;I)V", "Companion", "zlb", "UNSPECIFIED", "CHAT_PROMPT", "SETTINGS", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class MobileAppUseEvents$MobileAppUsePermissionChangedSource {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MobileAppUseEvents$MobileAppUsePermissionChangedSource[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final zlb Companion;
    public static final MobileAppUseEvents$MobileAppUsePermissionChangedSource UNSPECIFIED = new MobileAppUseEvents$MobileAppUsePermissionChangedSource("UNSPECIFIED", 0);
    public static final MobileAppUseEvents$MobileAppUsePermissionChangedSource CHAT_PROMPT = new MobileAppUseEvents$MobileAppUsePermissionChangedSource("CHAT_PROMPT", 1);
    public static final MobileAppUseEvents$MobileAppUsePermissionChangedSource SETTINGS = new MobileAppUseEvents$MobileAppUsePermissionChangedSource("SETTINGS", 2);

    private static final /* synthetic */ MobileAppUseEvents$MobileAppUsePermissionChangedSource[] $values() {
        return new MobileAppUseEvents$MobileAppUsePermissionChangedSource[]{UNSPECIFIED, CHAT_PROMPT, SETTINGS};
    }

    static {
        MobileAppUseEvents$MobileAppUsePermissionChangedSource[] mobileAppUseEvents$MobileAppUsePermissionChangedSourceArr$values = $values();
        $VALUES = mobileAppUseEvents$MobileAppUsePermissionChangedSourceArr$values;
        $ENTRIES = wd6.n0(mobileAppUseEvents$MobileAppUsePermissionChangedSourceArr$values);
        Companion = new zlb();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ulb(7));
    }

    private MobileAppUseEvents$MobileAppUsePermissionChangedSource(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.MobileAppUseEvents.MobileAppUsePermissionChangedSource", values(), new String[]{"unknown", "chat_prompt", "settings"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MobileAppUseEvents$MobileAppUsePermissionChangedSource valueOf(String str) {
        return (MobileAppUseEvents$MobileAppUsePermissionChangedSource) Enum.valueOf(MobileAppUseEvents$MobileAppUsePermissionChangedSource.class, str);
    }

    public static MobileAppUseEvents$MobileAppUsePermissionChangedSource[] values() {
        return (MobileAppUseEvents$MobileAppUsePermissionChangedSource[]) $VALUES.clone();
    }
}
