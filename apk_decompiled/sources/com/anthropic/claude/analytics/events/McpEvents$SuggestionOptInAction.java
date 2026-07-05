package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.j2b;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/McpEvents$SuggestionOptInAction", "", "Lcom/anthropic/claude/analytics/events/McpEvents$SuggestionOptInAction;", "<init>", "(Ljava/lang/String;I)V", "Companion", "j2b", "UNSPECIFIED", "TURN_ON", "NOT_NOW", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class McpEvents$SuggestionOptInAction {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ McpEvents$SuggestionOptInAction[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final j2b Companion;
    public static final McpEvents$SuggestionOptInAction UNSPECIFIED = new McpEvents$SuggestionOptInAction("UNSPECIFIED", 0);
    public static final McpEvents$SuggestionOptInAction TURN_ON = new McpEvents$SuggestionOptInAction("TURN_ON", 1);
    public static final McpEvents$SuggestionOptInAction NOT_NOW = new McpEvents$SuggestionOptInAction("NOT_NOW", 2);

    private static final /* synthetic */ McpEvents$SuggestionOptInAction[] $values() {
        return new McpEvents$SuggestionOptInAction[]{UNSPECIFIED, TURN_ON, NOT_NOW};
    }

    static {
        McpEvents$SuggestionOptInAction[] mcpEvents$SuggestionOptInActionArr$values = $values();
        $VALUES = mcpEvents$SuggestionOptInActionArr$values;
        $ENTRIES = wd6.n0(mcpEvents$SuggestionOptInActionArr$values);
        Companion = new j2b();
        $cachedSerializer$delegate = yb5.w(w1a.F, new mia(22));
    }

    private McpEvents$SuggestionOptInAction(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.McpEvents.SuggestionOptInAction", values(), new String[]{"unspecified", "turn_on", "not_now"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static McpEvents$SuggestionOptInAction valueOf(String str) {
        return (McpEvents$SuggestionOptInAction) Enum.valueOf(McpEvents$SuggestionOptInAction.class, str);
    }

    public static McpEvents$SuggestionOptInAction[] values() {
        return (McpEvents$SuggestionOptInAction[]) $VALUES.clone();
    }
}
