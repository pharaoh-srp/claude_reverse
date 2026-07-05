package com.anthropic.claude.analytics.events;

import defpackage.e2c;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.xbc;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/OfflineEvents$OfflineErrorKind", "", "Lcom/anthropic/claude/analytics/events/OfflineEvents$OfflineErrorKind;", "<init>", "(Ljava/lang/String;I)V", "Companion", "xbc", "UNSPECIFIED", "OFFLINE", "SERVER_ERROR", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class OfflineEvents$OfflineErrorKind {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ OfflineEvents$OfflineErrorKind[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final xbc Companion;
    public static final OfflineEvents$OfflineErrorKind UNSPECIFIED = new OfflineEvents$OfflineErrorKind("UNSPECIFIED", 0);
    public static final OfflineEvents$OfflineErrorKind OFFLINE = new OfflineEvents$OfflineErrorKind("OFFLINE", 1);
    public static final OfflineEvents$OfflineErrorKind SERVER_ERROR = new OfflineEvents$OfflineErrorKind("SERVER_ERROR", 2);

    private static final /* synthetic */ OfflineEvents$OfflineErrorKind[] $values() {
        return new OfflineEvents$OfflineErrorKind[]{UNSPECIFIED, OFFLINE, SERVER_ERROR};
    }

    static {
        OfflineEvents$OfflineErrorKind[] offlineEvents$OfflineErrorKindArr$values = $values();
        $VALUES = offlineEvents$OfflineErrorKindArr$values;
        $ENTRIES = wd6.n0(offlineEvents$OfflineErrorKindArr$values);
        Companion = new xbc();
        $cachedSerializer$delegate = yb5.w(w1a.F, new e2c(13));
    }

    private OfflineEvents$OfflineErrorKind(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.OfflineEvents.OfflineErrorKind", values(), new String[]{"unspecified", "offline", "server_error"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static OfflineEvents$OfflineErrorKind valueOf(String str) {
        return (OfflineEvents$OfflineErrorKind) Enum.valueOf(OfflineEvents$OfflineErrorKind.class, str);
    }

    public static OfflineEvents$OfflineErrorKind[] values() {
        return (OfflineEvents$OfflineErrorKind[]) $VALUES.clone();
    }
}
