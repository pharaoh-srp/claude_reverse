package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.g9b;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.xgb;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewSurface", "", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewSurface;", "<init>", "(Ljava/lang/String;I)V", "Companion", "xgb", "UNSPECIFIED", "CHAT", "PROJECT_KNOWLEDGE", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class MessageFileEvents$FilePreviewSurface {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MessageFileEvents$FilePreviewSurface[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final xgb Companion;
    public static final MessageFileEvents$FilePreviewSurface UNSPECIFIED = new MessageFileEvents$FilePreviewSurface("UNSPECIFIED", 0);
    public static final MessageFileEvents$FilePreviewSurface CHAT = new MessageFileEvents$FilePreviewSurface("CHAT", 1);
    public static final MessageFileEvents$FilePreviewSurface PROJECT_KNOWLEDGE = new MessageFileEvents$FilePreviewSurface("PROJECT_KNOWLEDGE", 2);

    private static final /* synthetic */ MessageFileEvents$FilePreviewSurface[] $values() {
        return new MessageFileEvents$FilePreviewSurface[]{UNSPECIFIED, CHAT, PROJECT_KNOWLEDGE};
    }

    static {
        MessageFileEvents$FilePreviewSurface[] messageFileEvents$FilePreviewSurfaceArr$values = $values();
        $VALUES = messageFileEvents$FilePreviewSurfaceArr$values;
        $ENTRIES = wd6.n0(messageFileEvents$FilePreviewSurfaceArr$values);
        Companion = new xgb();
        $cachedSerializer$delegate = yb5.w(w1a.F, new g9b(17));
    }

    private MessageFileEvents$FilePreviewSurface(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.MessageFileEvents.FilePreviewSurface", values(), new String[]{"unspecified", "chat", "project_knowledge"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MessageFileEvents$FilePreviewSurface valueOf(String str) {
        return (MessageFileEvents$FilePreviewSurface) Enum.valueOf(MessageFileEvents$FilePreviewSurface.class, str);
    }

    public static MessageFileEvents$FilePreviewSurface[] values() {
        return (MessageFileEvents$FilePreviewSurface[]) $VALUES.clone();
    }
}
