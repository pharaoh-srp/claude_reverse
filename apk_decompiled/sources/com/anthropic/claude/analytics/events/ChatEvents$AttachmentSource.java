package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.pk2;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.wn2;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$AttachmentSource", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;", "<init>", "(Ljava/lang/String;I)V", "Companion", "wn2", "UNSPECIFIED", "LIBRARY", "FILE", "CAMERA", "PASTE", "DRAG_AND_DROP", "APP_SHARE", "CAMERA_CAPTURE_INTENT_LOCKED", "CAMERA_CAPTURE_INTENT_UNLOCKED", "PROCESS_TEXT", "MCP_APP_TOOL", "LIBRARY_RECENT", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$AttachmentSource {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$AttachmentSource[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final wn2 Companion;
    public static final ChatEvents$AttachmentSource UNSPECIFIED = new ChatEvents$AttachmentSource("UNSPECIFIED", 0);
    public static final ChatEvents$AttachmentSource LIBRARY = new ChatEvents$AttachmentSource("LIBRARY", 1);
    public static final ChatEvents$AttachmentSource FILE = new ChatEvents$AttachmentSource("FILE", 2);
    public static final ChatEvents$AttachmentSource CAMERA = new ChatEvents$AttachmentSource("CAMERA", 3);
    public static final ChatEvents$AttachmentSource PASTE = new ChatEvents$AttachmentSource("PASTE", 4);
    public static final ChatEvents$AttachmentSource DRAG_AND_DROP = new ChatEvents$AttachmentSource("DRAG_AND_DROP", 5);
    public static final ChatEvents$AttachmentSource APP_SHARE = new ChatEvents$AttachmentSource("APP_SHARE", 6);
    public static final ChatEvents$AttachmentSource CAMERA_CAPTURE_INTENT_LOCKED = new ChatEvents$AttachmentSource("CAMERA_CAPTURE_INTENT_LOCKED", 7);
    public static final ChatEvents$AttachmentSource CAMERA_CAPTURE_INTENT_UNLOCKED = new ChatEvents$AttachmentSource("CAMERA_CAPTURE_INTENT_UNLOCKED", 8);
    public static final ChatEvents$AttachmentSource PROCESS_TEXT = new ChatEvents$AttachmentSource("PROCESS_TEXT", 9);
    public static final ChatEvents$AttachmentSource MCP_APP_TOOL = new ChatEvents$AttachmentSource("MCP_APP_TOOL", 10);
    public static final ChatEvents$AttachmentSource LIBRARY_RECENT = new ChatEvents$AttachmentSource("LIBRARY_RECENT", 11);

    private static final /* synthetic */ ChatEvents$AttachmentSource[] $values() {
        return new ChatEvents$AttachmentSource[]{UNSPECIFIED, LIBRARY, FILE, CAMERA, PASTE, DRAG_AND_DROP, APP_SHARE, CAMERA_CAPTURE_INTENT_LOCKED, CAMERA_CAPTURE_INTENT_UNLOCKED, PROCESS_TEXT, MCP_APP_TOOL, LIBRARY_RECENT};
    }

    static {
        ChatEvents$AttachmentSource[] chatEvents$AttachmentSourceArr$values = $values();
        $VALUES = chatEvents$AttachmentSourceArr$values;
        $ENTRIES = wd6.n0(chatEvents$AttachmentSourceArr$values);
        Companion = new wn2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new pk2(27));
    }

    private ChatEvents$AttachmentSource(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.AttachmentSource", values(), new String[]{"unknown", "library", "file", "camera", "paste", "drag_and_drop", "app_share", "camera_capture_intent_locked", "camera_capture_intent_unlocked", "process_text", "mcp_app_tool", "library_recent"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$AttachmentSource valueOf(String str) {
        return (ChatEvents$AttachmentSource) Enum.valueOf(ChatEvents$AttachmentSource.class, str);
    }

    public static ChatEvents$AttachmentSource[] values() {
        return (ChatEvents$AttachmentSource[]) $VALUES.clone();
    }
}
