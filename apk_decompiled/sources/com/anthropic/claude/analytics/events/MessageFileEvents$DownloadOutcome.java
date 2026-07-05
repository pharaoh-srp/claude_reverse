package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.g9b;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mgb;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/anthropic/claude/analytics/events/MessageFileEvents$DownloadOutcome", "", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadOutcome;", "<init>", "(Ljava/lang/String;I)V", "Companion", "mgb", "UNSPECIFIED", "SUCCESS", "ENQUEUE_FAILED", "DOWNLOAD_FAILED", "CANCELLED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class MessageFileEvents$DownloadOutcome {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MessageFileEvents$DownloadOutcome[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final mgb Companion;
    public static final MessageFileEvents$DownloadOutcome UNSPECIFIED = new MessageFileEvents$DownloadOutcome("UNSPECIFIED", 0);
    public static final MessageFileEvents$DownloadOutcome SUCCESS = new MessageFileEvents$DownloadOutcome("SUCCESS", 1);
    public static final MessageFileEvents$DownloadOutcome ENQUEUE_FAILED = new MessageFileEvents$DownloadOutcome("ENQUEUE_FAILED", 2);
    public static final MessageFileEvents$DownloadOutcome DOWNLOAD_FAILED = new MessageFileEvents$DownloadOutcome("DOWNLOAD_FAILED", 3);
    public static final MessageFileEvents$DownloadOutcome CANCELLED = new MessageFileEvents$DownloadOutcome("CANCELLED", 4);

    private static final /* synthetic */ MessageFileEvents$DownloadOutcome[] $values() {
        return new MessageFileEvents$DownloadOutcome[]{UNSPECIFIED, SUCCESS, ENQUEUE_FAILED, DOWNLOAD_FAILED, CANCELLED};
    }

    static {
        MessageFileEvents$DownloadOutcome[] messageFileEvents$DownloadOutcomeArr$values = $values();
        $VALUES = messageFileEvents$DownloadOutcomeArr$values;
        $ENTRIES = wd6.n0(messageFileEvents$DownloadOutcomeArr$values);
        Companion = new mgb();
        $cachedSerializer$delegate = yb5.w(w1a.F, new g9b(9));
    }

    private MessageFileEvents$DownloadOutcome(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.MessageFileEvents.DownloadOutcome", values(), new String[]{"unspecified", "success", "enqueue_failed", "download_failed", "cancelled"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MessageFileEvents$DownloadOutcome valueOf(String str) {
        return (MessageFileEvents$DownloadOutcome) Enum.valueOf(MessageFileEvents$DownloadOutcome.class, str);
    }

    public static MessageFileEvents$DownloadOutcome[] values() {
        return (MessageFileEvents$DownloadOutcome[]) $VALUES.clone();
    }
}
