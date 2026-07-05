package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.i2b;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/McpEvents$SuggestionAction", "", "Lcom/anthropic/claude/analytics/events/McpEvents$SuggestionAction;", "<init>", "(Ljava/lang/String;I)V", "Companion", "i2b", "UNSPECIFIED", "CONNECT", "USE", "DECLINE", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class McpEvents$SuggestionAction {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ McpEvents$SuggestionAction[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final i2b Companion;
    public static final McpEvents$SuggestionAction UNSPECIFIED = new McpEvents$SuggestionAction("UNSPECIFIED", 0);
    public static final McpEvents$SuggestionAction CONNECT = new McpEvents$SuggestionAction("CONNECT", 1);
    public static final McpEvents$SuggestionAction USE = new McpEvents$SuggestionAction("USE", 2);
    public static final McpEvents$SuggestionAction DECLINE = new McpEvents$SuggestionAction("DECLINE", 3);

    private static final /* synthetic */ McpEvents$SuggestionAction[] $values() {
        return new McpEvents$SuggestionAction[]{UNSPECIFIED, CONNECT, USE, DECLINE};
    }

    static {
        McpEvents$SuggestionAction[] mcpEvents$SuggestionActionArr$values = $values();
        $VALUES = mcpEvents$SuggestionActionArr$values;
        $ENTRIES = wd6.n0(mcpEvents$SuggestionActionArr$values);
        Companion = new i2b();
        $cachedSerializer$delegate = yb5.w(w1a.F, new mia(21));
    }

    private McpEvents$SuggestionAction(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.McpEvents.SuggestionAction", values(), new String[]{"unspecified", "connect", "use", "decline"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static McpEvents$SuggestionAction valueOf(String str) {
        return (McpEvents$SuggestionAction) Enum.valueOf(McpEvents$SuggestionAction.class, str);
    }

    public static McpEvents$SuggestionAction[] values() {
        return (McpEvents$SuggestionAction[]) $VALUES.clone();
    }
}
