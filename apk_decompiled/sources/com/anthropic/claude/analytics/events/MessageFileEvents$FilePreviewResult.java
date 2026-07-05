package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.g9b;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.ugb;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewResult", "", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewResult;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ugb", "UNSPECIFIED", "LOADED", "LOAD_FAILED", "UNSUPPORTED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class MessageFileEvents$FilePreviewResult {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MessageFileEvents$FilePreviewResult[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ugb Companion;
    public static final MessageFileEvents$FilePreviewResult UNSPECIFIED = new MessageFileEvents$FilePreviewResult("UNSPECIFIED", 0);
    public static final MessageFileEvents$FilePreviewResult LOADED = new MessageFileEvents$FilePreviewResult("LOADED", 1);
    public static final MessageFileEvents$FilePreviewResult LOAD_FAILED = new MessageFileEvents$FilePreviewResult("LOAD_FAILED", 2);
    public static final MessageFileEvents$FilePreviewResult UNSUPPORTED = new MessageFileEvents$FilePreviewResult("UNSUPPORTED", 3);

    private static final /* synthetic */ MessageFileEvents$FilePreviewResult[] $values() {
        return new MessageFileEvents$FilePreviewResult[]{UNSPECIFIED, LOADED, LOAD_FAILED, UNSUPPORTED};
    }

    static {
        MessageFileEvents$FilePreviewResult[] messageFileEvents$FilePreviewResultArr$values = $values();
        $VALUES = messageFileEvents$FilePreviewResultArr$values;
        $ENTRIES = wd6.n0(messageFileEvents$FilePreviewResultArr$values);
        Companion = new ugb();
        $cachedSerializer$delegate = yb5.w(w1a.F, new g9b(15));
    }

    private MessageFileEvents$FilePreviewResult(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.MessageFileEvents.FilePreviewResult", values(), new String[]{"unspecified", "loaded", "load_failed", "unsupported"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MessageFileEvents$FilePreviewResult valueOf(String str) {
        return (MessageFileEvents$FilePreviewResult) Enum.valueOf(MessageFileEvents$FilePreviewResult.class, str);
    }

    public static MessageFileEvents$FilePreviewResult[] values() {
        return (MessageFileEvents$FilePreviewResult[]) $VALUES.clone();
    }
}
