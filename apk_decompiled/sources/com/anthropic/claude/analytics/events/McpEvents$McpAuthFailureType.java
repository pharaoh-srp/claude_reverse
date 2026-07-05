package com.anthropic.claude.analytics.events;

import defpackage.d1b;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mia;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/anthropic/claude/analytics/events/McpEvents$McpAuthFailureType", "", "Lcom/anthropic/claude/analytics/events/McpEvents$McpAuthFailureType;", "<init>", "(Ljava/lang/String;I)V", "Companion", "d1b", "UNSPECIFIED", "START_AUTH", "WEB_AUTH_SESSION", "CALLBACK_ERROR", "CALLBACK_MISSING_CODE", "TOKEN_EXCHANGE", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class McpEvents$McpAuthFailureType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ McpEvents$McpAuthFailureType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final d1b Companion;
    public static final McpEvents$McpAuthFailureType UNSPECIFIED = new McpEvents$McpAuthFailureType("UNSPECIFIED", 0);
    public static final McpEvents$McpAuthFailureType START_AUTH = new McpEvents$McpAuthFailureType("START_AUTH", 1);
    public static final McpEvents$McpAuthFailureType WEB_AUTH_SESSION = new McpEvents$McpAuthFailureType("WEB_AUTH_SESSION", 2);
    public static final McpEvents$McpAuthFailureType CALLBACK_ERROR = new McpEvents$McpAuthFailureType("CALLBACK_ERROR", 3);
    public static final McpEvents$McpAuthFailureType CALLBACK_MISSING_CODE = new McpEvents$McpAuthFailureType("CALLBACK_MISSING_CODE", 4);
    public static final McpEvents$McpAuthFailureType TOKEN_EXCHANGE = new McpEvents$McpAuthFailureType("TOKEN_EXCHANGE", 5);

    private static final /* synthetic */ McpEvents$McpAuthFailureType[] $values() {
        return new McpEvents$McpAuthFailureType[]{UNSPECIFIED, START_AUTH, WEB_AUTH_SESSION, CALLBACK_ERROR, CALLBACK_MISSING_CODE, TOKEN_EXCHANGE};
    }

    static {
        McpEvents$McpAuthFailureType[] mcpEvents$McpAuthFailureTypeArr$values = $values();
        $VALUES = mcpEvents$McpAuthFailureTypeArr$values;
        $ENTRIES = wd6.n0(mcpEvents$McpAuthFailureTypeArr$values);
        Companion = new d1b();
        $cachedSerializer$delegate = yb5.w(w1a.F, new mia(17));
    }

    private McpEvents$McpAuthFailureType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.McpEvents.McpAuthFailureType", values(), new String[]{"unspecified", "start_auth", "web_auth_session", "callback_error", "callback_missing_code", "token_exchange"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static McpEvents$McpAuthFailureType valueOf(String str) {
        return (McpEvents$McpAuthFailureType) Enum.valueOf(McpEvents$McpAuthFailureType.class, str);
    }

    public static McpEvents$McpAuthFailureType[] values() {
        return (McpEvents$McpAuthFailureType[]) $VALUES.clone();
    }
}
