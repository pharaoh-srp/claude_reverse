package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.gb5;
import defpackage.h85;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/CronetAnalyticsEvents$RequestFailureReason", "", "Lcom/anthropic/claude/analytics/events/CronetAnalyticsEvents$RequestFailureReason;", "<init>", "(Ljava/lang/String;I)V", "Companion", "gb5", "UNSPECIFIED", "HTTP_ERROR", "NETWORK_EXCEPTION", "CLIENT_EXCEPTION", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class CronetAnalyticsEvents$RequestFailureReason {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ CronetAnalyticsEvents$RequestFailureReason[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final gb5 Companion;
    public static final CronetAnalyticsEvents$RequestFailureReason UNSPECIFIED = new CronetAnalyticsEvents$RequestFailureReason("UNSPECIFIED", 0);
    public static final CronetAnalyticsEvents$RequestFailureReason HTTP_ERROR = new CronetAnalyticsEvents$RequestFailureReason("HTTP_ERROR", 1);
    public static final CronetAnalyticsEvents$RequestFailureReason NETWORK_EXCEPTION = new CronetAnalyticsEvents$RequestFailureReason("NETWORK_EXCEPTION", 2);
    public static final CronetAnalyticsEvents$RequestFailureReason CLIENT_EXCEPTION = new CronetAnalyticsEvents$RequestFailureReason("CLIENT_EXCEPTION", 3);

    private static final /* synthetic */ CronetAnalyticsEvents$RequestFailureReason[] $values() {
        return new CronetAnalyticsEvents$RequestFailureReason[]{UNSPECIFIED, HTTP_ERROR, NETWORK_EXCEPTION, CLIENT_EXCEPTION};
    }

    static {
        CronetAnalyticsEvents$RequestFailureReason[] cronetAnalyticsEvents$RequestFailureReasonArr$values = $values();
        $VALUES = cronetAnalyticsEvents$RequestFailureReasonArr$values;
        $ENTRIES = wd6.n0(cronetAnalyticsEvents$RequestFailureReasonArr$values);
        Companion = new gb5();
        $cachedSerializer$delegate = yb5.w(w1a.F, new h85(2));
    }

    private CronetAnalyticsEvents$RequestFailureReason(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.CronetAnalyticsEvents.RequestFailureReason", values(), new String[]{"unspecified", "http_error", "network_exception", "client_exception"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static CronetAnalyticsEvents$RequestFailureReason valueOf(String str) {
        return (CronetAnalyticsEvents$RequestFailureReason) Enum.valueOf(CronetAnalyticsEvents$RequestFailureReason.class, str);
    }

    public static CronetAnalyticsEvents$RequestFailureReason[] values() {
        return (CronetAnalyticsEvents$RequestFailureReason[]) $VALUES.clone();
    }
}
