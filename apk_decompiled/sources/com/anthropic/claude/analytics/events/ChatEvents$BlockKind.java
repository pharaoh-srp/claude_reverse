package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.pk2;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.xn2;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$BlockKind", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$BlockKind;", "<init>", "(Ljava/lang/String;I)V", "Companion", "xn2", "UNSPECIFIED", "TEXT", "ARTIFACT", "THINKING", "ANALYSIS_TOOL_INVOCATION", "SEARCH_TOOL_INVOCATION", "MCP_TOOL_INVOCATION", "MCP_APP_INVOCATION", "KNOWLEDGE_SOURCES", "BELL_NOTE", "RESEARCH_TOOL_INVOCATION", "MOBILE_APP_USE_TOOL_INVOCATION", "WIGGLE_ARTIFACTS", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$BlockKind {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$BlockKind[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final xn2 Companion;
    public static final ChatEvents$BlockKind UNSPECIFIED = new ChatEvents$BlockKind("UNSPECIFIED", 0);
    public static final ChatEvents$BlockKind TEXT = new ChatEvents$BlockKind("TEXT", 1);
    public static final ChatEvents$BlockKind ARTIFACT = new ChatEvents$BlockKind("ARTIFACT", 2);
    public static final ChatEvents$BlockKind THINKING = new ChatEvents$BlockKind("THINKING", 3);
    public static final ChatEvents$BlockKind ANALYSIS_TOOL_INVOCATION = new ChatEvents$BlockKind("ANALYSIS_TOOL_INVOCATION", 4);
    public static final ChatEvents$BlockKind SEARCH_TOOL_INVOCATION = new ChatEvents$BlockKind("SEARCH_TOOL_INVOCATION", 5);
    public static final ChatEvents$BlockKind MCP_TOOL_INVOCATION = new ChatEvents$BlockKind("MCP_TOOL_INVOCATION", 6);
    public static final ChatEvents$BlockKind MCP_APP_INVOCATION = new ChatEvents$BlockKind("MCP_APP_INVOCATION", 7);
    public static final ChatEvents$BlockKind KNOWLEDGE_SOURCES = new ChatEvents$BlockKind("KNOWLEDGE_SOURCES", 8);
    public static final ChatEvents$BlockKind BELL_NOTE = new ChatEvents$BlockKind("BELL_NOTE", 9);
    public static final ChatEvents$BlockKind RESEARCH_TOOL_INVOCATION = new ChatEvents$BlockKind("RESEARCH_TOOL_INVOCATION", 10);
    public static final ChatEvents$BlockKind MOBILE_APP_USE_TOOL_INVOCATION = new ChatEvents$BlockKind("MOBILE_APP_USE_TOOL_INVOCATION", 11);
    public static final ChatEvents$BlockKind WIGGLE_ARTIFACTS = new ChatEvents$BlockKind("WIGGLE_ARTIFACTS", 12);

    private static final /* synthetic */ ChatEvents$BlockKind[] $values() {
        return new ChatEvents$BlockKind[]{UNSPECIFIED, TEXT, ARTIFACT, THINKING, ANALYSIS_TOOL_INVOCATION, SEARCH_TOOL_INVOCATION, MCP_TOOL_INVOCATION, MCP_APP_INVOCATION, KNOWLEDGE_SOURCES, BELL_NOTE, RESEARCH_TOOL_INVOCATION, MOBILE_APP_USE_TOOL_INVOCATION, WIGGLE_ARTIFACTS};
    }

    static {
        ChatEvents$BlockKind[] chatEvents$BlockKindArr$values = $values();
        $VALUES = chatEvents$BlockKindArr$values;
        $ENTRIES = wd6.n0(chatEvents$BlockKindArr$values);
        Companion = new xn2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new pk2(28));
    }

    private ChatEvents$BlockKind(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.BlockKind", values(), new String[]{"unknown", "text", "artifact", "thinking", "analysis_tool_invocation", "search_tool_invocation", "mcp_tool_invocation", "mcp_app_invocation", "knowledge_sources", "bell_note", "research_tool_invocation", "mobile_app_use_tool_invocation", "wiggle_artifacts"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$BlockKind valueOf(String str) {
        return (ChatEvents$BlockKind) Enum.valueOf(ChatEvents$BlockKind.class, str);
    }

    public static ChatEvents$BlockKind[] values() {
        return (ChatEvents$BlockKind[]) $VALUES.clone();
    }
}
