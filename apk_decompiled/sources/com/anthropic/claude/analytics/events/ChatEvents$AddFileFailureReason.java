package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kn2;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.pk2;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$AddFileFailureReason", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$AddFileFailureReason;", "<init>", "(Ljava/lang/String;I)V", "Companion", "kn2", "UNSPECIFIED", "ERROR_LOCAL_PROCESSING", "ERROR_UPLOADING", "CANCELLED", "REJECTED_FILE_TOO_LARGE", "SERVER_UNSUPPORTED_FORMAT", "SERVER_FILE_TOO_LARGE", "SERVER_RATE_LIMITED", "NETWORK_ERROR", "REJECTED_UNSUPPORTED_TYPE", "REJECTED_ATTACHMENT_LIMIT", "ERROR_FILE_ACCESS_DENIED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$AddFileFailureReason {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$AddFileFailureReason[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final kn2 Companion;
    public static final ChatEvents$AddFileFailureReason UNSPECIFIED = new ChatEvents$AddFileFailureReason("UNSPECIFIED", 0);
    public static final ChatEvents$AddFileFailureReason ERROR_LOCAL_PROCESSING = new ChatEvents$AddFileFailureReason("ERROR_LOCAL_PROCESSING", 1);
    public static final ChatEvents$AddFileFailureReason ERROR_UPLOADING = new ChatEvents$AddFileFailureReason("ERROR_UPLOADING", 2);
    public static final ChatEvents$AddFileFailureReason CANCELLED = new ChatEvents$AddFileFailureReason("CANCELLED", 3);
    public static final ChatEvents$AddFileFailureReason REJECTED_FILE_TOO_LARGE = new ChatEvents$AddFileFailureReason("REJECTED_FILE_TOO_LARGE", 4);
    public static final ChatEvents$AddFileFailureReason SERVER_UNSUPPORTED_FORMAT = new ChatEvents$AddFileFailureReason("SERVER_UNSUPPORTED_FORMAT", 5);
    public static final ChatEvents$AddFileFailureReason SERVER_FILE_TOO_LARGE = new ChatEvents$AddFileFailureReason("SERVER_FILE_TOO_LARGE", 6);
    public static final ChatEvents$AddFileFailureReason SERVER_RATE_LIMITED = new ChatEvents$AddFileFailureReason("SERVER_RATE_LIMITED", 7);
    public static final ChatEvents$AddFileFailureReason NETWORK_ERROR = new ChatEvents$AddFileFailureReason("NETWORK_ERROR", 8);
    public static final ChatEvents$AddFileFailureReason REJECTED_UNSUPPORTED_TYPE = new ChatEvents$AddFileFailureReason("REJECTED_UNSUPPORTED_TYPE", 9);
    public static final ChatEvents$AddFileFailureReason REJECTED_ATTACHMENT_LIMIT = new ChatEvents$AddFileFailureReason("REJECTED_ATTACHMENT_LIMIT", 10);
    public static final ChatEvents$AddFileFailureReason ERROR_FILE_ACCESS_DENIED = new ChatEvents$AddFileFailureReason("ERROR_FILE_ACCESS_DENIED", 11);

    private static final /* synthetic */ ChatEvents$AddFileFailureReason[] $values() {
        return new ChatEvents$AddFileFailureReason[]{UNSPECIFIED, ERROR_LOCAL_PROCESSING, ERROR_UPLOADING, CANCELLED, REJECTED_FILE_TOO_LARGE, SERVER_UNSUPPORTED_FORMAT, SERVER_FILE_TOO_LARGE, SERVER_RATE_LIMITED, NETWORK_ERROR, REJECTED_UNSUPPORTED_TYPE, REJECTED_ATTACHMENT_LIMIT, ERROR_FILE_ACCESS_DENIED};
    }

    static {
        ChatEvents$AddFileFailureReason[] chatEvents$AddFileFailureReasonArr$values = $values();
        $VALUES = chatEvents$AddFileFailureReasonArr$values;
        $ENTRIES = wd6.n0(chatEvents$AddFileFailureReasonArr$values);
        Companion = new kn2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new pk2(13));
    }

    private ChatEvents$AddFileFailureReason(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.AddFileFailureReason", values(), new String[]{"unspecified", "error_local_processing", "error_uploading", "cancelled", "rejected_file_too_large", "server_unsupported_format", "server_file_too_large", "server_rate_limited", "network_error", "rejected_unsupported_type", "rejected_attachment_limit", "error_file_access_denied"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$AddFileFailureReason valueOf(String str) {
        return (ChatEvents$AddFileFailureReason) Enum.valueOf(ChatEvents$AddFileFailureReason.class, str);
    }

    public static ChatEvents$AddFileFailureReason[] values() {
        return (ChatEvents$AddFileFailureReason[]) $VALUES.clone();
    }
}
