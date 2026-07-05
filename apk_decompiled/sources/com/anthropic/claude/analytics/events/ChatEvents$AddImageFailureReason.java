package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.pk2;
import defpackage.pn2;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$AddImageFailureReason", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$AddImageFailureReason;", "<init>", "(Ljava/lang/String;I)V", "Companion", "pn2", "UNSPECIFIED", "ERROR_LOCAL_PROCESSING", "ERROR_UPLOADING", "CANCELLED", "REJECTED_FILE_TOO_LARGE", "REJECTED_UNSUPPORTED_TYPE", "REJECTED_ATTACHMENT_LIMIT", "ERROR_FILE_ACCESS_DENIED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$AddImageFailureReason {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$AddImageFailureReason[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final pn2 Companion;
    public static final ChatEvents$AddImageFailureReason UNSPECIFIED = new ChatEvents$AddImageFailureReason("UNSPECIFIED", 0);
    public static final ChatEvents$AddImageFailureReason ERROR_LOCAL_PROCESSING = new ChatEvents$AddImageFailureReason("ERROR_LOCAL_PROCESSING", 1);
    public static final ChatEvents$AddImageFailureReason ERROR_UPLOADING = new ChatEvents$AddImageFailureReason("ERROR_UPLOADING", 2);
    public static final ChatEvents$AddImageFailureReason CANCELLED = new ChatEvents$AddImageFailureReason("CANCELLED", 3);
    public static final ChatEvents$AddImageFailureReason REJECTED_FILE_TOO_LARGE = new ChatEvents$AddImageFailureReason("REJECTED_FILE_TOO_LARGE", 4);
    public static final ChatEvents$AddImageFailureReason REJECTED_UNSUPPORTED_TYPE = new ChatEvents$AddImageFailureReason("REJECTED_UNSUPPORTED_TYPE", 5);
    public static final ChatEvents$AddImageFailureReason REJECTED_ATTACHMENT_LIMIT = new ChatEvents$AddImageFailureReason("REJECTED_ATTACHMENT_LIMIT", 6);
    public static final ChatEvents$AddImageFailureReason ERROR_FILE_ACCESS_DENIED = new ChatEvents$AddImageFailureReason("ERROR_FILE_ACCESS_DENIED", 7);

    private static final /* synthetic */ ChatEvents$AddImageFailureReason[] $values() {
        return new ChatEvents$AddImageFailureReason[]{UNSPECIFIED, ERROR_LOCAL_PROCESSING, ERROR_UPLOADING, CANCELLED, REJECTED_FILE_TOO_LARGE, REJECTED_UNSUPPORTED_TYPE, REJECTED_ATTACHMENT_LIMIT, ERROR_FILE_ACCESS_DENIED};
    }

    static {
        ChatEvents$AddImageFailureReason[] chatEvents$AddImageFailureReasonArr$values = $values();
        $VALUES = chatEvents$AddImageFailureReasonArr$values;
        $ENTRIES = wd6.n0(chatEvents$AddImageFailureReasonArr$values);
        Companion = new pn2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new pk2(21));
    }

    private ChatEvents$AddImageFailureReason(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.AddImageFailureReason", values(), new String[]{"unspecified", "error_local_processing", "error_uploading", "cancelled", "rejected_file_too_large", "rejected_unsupported_type", "rejected_attachment_limit", "error_file_access_denied"}, new Annotation[][]{null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$AddImageFailureReason valueOf(String str) {
        return (ChatEvents$AddImageFailureReason) Enum.valueOf(ChatEvents$AddImageFailureReason.class, str);
    }

    public static ChatEvents$AddImageFailureReason[] values() {
        return (ChatEvents$AddImageFailureReason[]) $VALUES.clone();
    }
}
