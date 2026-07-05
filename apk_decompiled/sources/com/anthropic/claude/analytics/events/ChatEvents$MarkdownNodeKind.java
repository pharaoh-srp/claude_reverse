package com.anthropic.claude.analytics.events;

import defpackage.ao2;
import defpackage.fp2;
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
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$MarkdownNodeKind", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$MarkdownNodeKind;", "<init>", "(Ljava/lang/String;I)V", "Companion", "fp2", "UNSPECIFIED", "FENCED_CODE", "INDENTED_CODE", "INLINE_CODE", "TABLE", "HEADING", "BLOCK_QUOTE", "ORDERED_LIST", "UNORDERED_LIST", "PARAGRAPH", "THEMATIC_BREAK", "HTML_BLOCK", "INLINE_MATH", "DISPLAY_MATH", "IMAGE", "LINK", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$MarkdownNodeKind {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$MarkdownNodeKind[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final fp2 Companion;
    public static final ChatEvents$MarkdownNodeKind UNSPECIFIED = new ChatEvents$MarkdownNodeKind("UNSPECIFIED", 0);
    public static final ChatEvents$MarkdownNodeKind FENCED_CODE = new ChatEvents$MarkdownNodeKind("FENCED_CODE", 1);
    public static final ChatEvents$MarkdownNodeKind INDENTED_CODE = new ChatEvents$MarkdownNodeKind("INDENTED_CODE", 2);
    public static final ChatEvents$MarkdownNodeKind INLINE_CODE = new ChatEvents$MarkdownNodeKind("INLINE_CODE", 3);
    public static final ChatEvents$MarkdownNodeKind TABLE = new ChatEvents$MarkdownNodeKind("TABLE", 4);
    public static final ChatEvents$MarkdownNodeKind HEADING = new ChatEvents$MarkdownNodeKind("HEADING", 5);
    public static final ChatEvents$MarkdownNodeKind BLOCK_QUOTE = new ChatEvents$MarkdownNodeKind("BLOCK_QUOTE", 6);
    public static final ChatEvents$MarkdownNodeKind ORDERED_LIST = new ChatEvents$MarkdownNodeKind("ORDERED_LIST", 7);
    public static final ChatEvents$MarkdownNodeKind UNORDERED_LIST = new ChatEvents$MarkdownNodeKind("UNORDERED_LIST", 8);
    public static final ChatEvents$MarkdownNodeKind PARAGRAPH = new ChatEvents$MarkdownNodeKind("PARAGRAPH", 9);
    public static final ChatEvents$MarkdownNodeKind THEMATIC_BREAK = new ChatEvents$MarkdownNodeKind("THEMATIC_BREAK", 10);
    public static final ChatEvents$MarkdownNodeKind HTML_BLOCK = new ChatEvents$MarkdownNodeKind("HTML_BLOCK", 11);
    public static final ChatEvents$MarkdownNodeKind INLINE_MATH = new ChatEvents$MarkdownNodeKind("INLINE_MATH", 12);
    public static final ChatEvents$MarkdownNodeKind DISPLAY_MATH = new ChatEvents$MarkdownNodeKind("DISPLAY_MATH", 13);
    public static final ChatEvents$MarkdownNodeKind IMAGE = new ChatEvents$MarkdownNodeKind("IMAGE", 14);
    public static final ChatEvents$MarkdownNodeKind LINK = new ChatEvents$MarkdownNodeKind("LINK", 15);

    private static final /* synthetic */ ChatEvents$MarkdownNodeKind[] $values() {
        return new ChatEvents$MarkdownNodeKind[]{UNSPECIFIED, FENCED_CODE, INDENTED_CODE, INLINE_CODE, TABLE, HEADING, BLOCK_QUOTE, ORDERED_LIST, UNORDERED_LIST, PARAGRAPH, THEMATIC_BREAK, HTML_BLOCK, INLINE_MATH, DISPLAY_MATH, IMAGE, LINK};
    }

    static {
        ChatEvents$MarkdownNodeKind[] chatEvents$MarkdownNodeKindArr$values = $values();
        $VALUES = chatEvents$MarkdownNodeKindArr$values;
        $ENTRIES = wd6.n0(chatEvents$MarkdownNodeKindArr$values);
        Companion = new fp2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ao2(12));
    }

    private ChatEvents$MarkdownNodeKind(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.MarkdownNodeKind", values(), new String[]{"unknown", "fenced_code", "indented_code", "inline_code", "table", "heading", "block_quote", "ordered_list", "unordered_list", "paragraph", "thematic_break", "html_block", "inline_math", "display_math", "image", "link"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$MarkdownNodeKind valueOf(String str) {
        return (ChatEvents$MarkdownNodeKind) Enum.valueOf(ChatEvents$MarkdownNodeKind.class, str);
    }

    public static ChatEvents$MarkdownNodeKind[] values() {
        return (ChatEvents$MarkdownNodeKind[]) $VALUES.clone();
    }
}
