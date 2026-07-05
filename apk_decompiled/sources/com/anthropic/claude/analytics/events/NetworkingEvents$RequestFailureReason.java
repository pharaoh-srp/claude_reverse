package com.anthropic.claude.analytics.events;

import defpackage.e2c;
import defpackage.f2c;
import defpackage.fq6;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/NetworkingEvents$RequestFailureReason", "", "Lcom/anthropic/claude/analytics/events/NetworkingEvents$RequestFailureReason;", "<init>", "(Ljava/lang/String;I)V", "Companion", "f2c", "UNSPECIFIED", "HTTP_ERROR", "NETWORK_EXCEPTION", "CLIENT_EXCEPTION", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class NetworkingEvents$RequestFailureReason {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ NetworkingEvents$RequestFailureReason[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final f2c Companion;
    public static final NetworkingEvents$RequestFailureReason UNSPECIFIED = new NetworkingEvents$RequestFailureReason("UNSPECIFIED", 0);
    public static final NetworkingEvents$RequestFailureReason HTTP_ERROR = new NetworkingEvents$RequestFailureReason("HTTP_ERROR", 1);
    public static final NetworkingEvents$RequestFailureReason NETWORK_EXCEPTION = new NetworkingEvents$RequestFailureReason("NETWORK_EXCEPTION", 2);
    public static final NetworkingEvents$RequestFailureReason CLIENT_EXCEPTION = new NetworkingEvents$RequestFailureReason("CLIENT_EXCEPTION", 3);

    private static final /* synthetic */ NetworkingEvents$RequestFailureReason[] $values() {
        return new NetworkingEvents$RequestFailureReason[]{UNSPECIFIED, HTTP_ERROR, NETWORK_EXCEPTION, CLIENT_EXCEPTION};
    }

    static {
        NetworkingEvents$RequestFailureReason[] networkingEvents$RequestFailureReasonArr$values = $values();
        $VALUES = networkingEvents$RequestFailureReasonArr$values;
        $ENTRIES = wd6.n0(networkingEvents$RequestFailureReasonArr$values);
        Companion = new f2c();
        $cachedSerializer$delegate = yb5.w(w1a.F, new e2c(0));
    }

    private NetworkingEvents$RequestFailureReason(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.NetworkingEvents.RequestFailureReason", values(), new String[]{"unspecified", "http_error", "network_exception", "client_exception"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static NetworkingEvents$RequestFailureReason valueOf(String str) {
        return (NetworkingEvents$RequestFailureReason) Enum.valueOf(NetworkingEvents$RequestFailureReason.class, str);
    }

    public static NetworkingEvents$RequestFailureReason[] values() {
        return (NetworkingEvents$RequestFailureReason[]) $VALUES.clone();
    }
}
