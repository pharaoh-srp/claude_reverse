package com.anthropic.claude.analytics.events;

import defpackage.e2c;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.ybc;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/anthropic/claude/analytics/events/OfflineEvents$OfflineScreen", "", "Lcom/anthropic/claude/analytics/events/OfflineEvents$OfflineScreen;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ybc", "UNSPECIFIED", "CHAT_LIST", "PROJECT_LIST", "PROJECT_DETAIL", "SIDEBAR", "CHAT", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class OfflineEvents$OfflineScreen {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ OfflineEvents$OfflineScreen[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ybc Companion;
    public static final OfflineEvents$OfflineScreen UNSPECIFIED = new OfflineEvents$OfflineScreen("UNSPECIFIED", 0);
    public static final OfflineEvents$OfflineScreen CHAT_LIST = new OfflineEvents$OfflineScreen("CHAT_LIST", 1);
    public static final OfflineEvents$OfflineScreen PROJECT_LIST = new OfflineEvents$OfflineScreen("PROJECT_LIST", 2);
    public static final OfflineEvents$OfflineScreen PROJECT_DETAIL = new OfflineEvents$OfflineScreen("PROJECT_DETAIL", 3);
    public static final OfflineEvents$OfflineScreen SIDEBAR = new OfflineEvents$OfflineScreen("SIDEBAR", 4);
    public static final OfflineEvents$OfflineScreen CHAT = new OfflineEvents$OfflineScreen("CHAT", 5);

    private static final /* synthetic */ OfflineEvents$OfflineScreen[] $values() {
        return new OfflineEvents$OfflineScreen[]{UNSPECIFIED, CHAT_LIST, PROJECT_LIST, PROJECT_DETAIL, SIDEBAR, CHAT};
    }

    static {
        OfflineEvents$OfflineScreen[] offlineEvents$OfflineScreenArr$values = $values();
        $VALUES = offlineEvents$OfflineScreenArr$values;
        $ENTRIES = wd6.n0(offlineEvents$OfflineScreenArr$values);
        Companion = new ybc();
        $cachedSerializer$delegate = yb5.w(w1a.F, new e2c(14));
    }

    private OfflineEvents$OfflineScreen(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.OfflineEvents.OfflineScreen", values(), new String[]{"unspecified", "chat_list", "project_list", "project_detail", "sidebar", "chat"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static OfflineEvents$OfflineScreen valueOf(String str) {
        return (OfflineEvents$OfflineScreen) Enum.valueOf(OfflineEvents$OfflineScreen.class, str);
    }

    public static OfflineEvents$OfflineScreen[] values() {
        return (OfflineEvents$OfflineScreen[]) $VALUES.clone();
    }
}
