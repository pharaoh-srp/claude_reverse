package com.anthropic.claude.analytics.events;

import defpackage.ahb;
import defpackage.fq6;
import defpackage.g9b;
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
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/anthropic/claude/analytics/events/MessageFileEvents$PdfPreviewResult", "", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$PdfPreviewResult;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ahb", "UNSPECIFIED", "LOADED", "ERROR", "RENDER_PROCESS_GONE", "ABANDONED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class MessageFileEvents$PdfPreviewResult {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MessageFileEvents$PdfPreviewResult[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ahb Companion;
    public static final MessageFileEvents$PdfPreviewResult UNSPECIFIED = new MessageFileEvents$PdfPreviewResult("UNSPECIFIED", 0);
    public static final MessageFileEvents$PdfPreviewResult LOADED = new MessageFileEvents$PdfPreviewResult("LOADED", 1);
    public static final MessageFileEvents$PdfPreviewResult ERROR = new MessageFileEvents$PdfPreviewResult("ERROR", 2);
    public static final MessageFileEvents$PdfPreviewResult RENDER_PROCESS_GONE = new MessageFileEvents$PdfPreviewResult("RENDER_PROCESS_GONE", 3);
    public static final MessageFileEvents$PdfPreviewResult ABANDONED = new MessageFileEvents$PdfPreviewResult("ABANDONED", 4);

    private static final /* synthetic */ MessageFileEvents$PdfPreviewResult[] $values() {
        return new MessageFileEvents$PdfPreviewResult[]{UNSPECIFIED, LOADED, ERROR, RENDER_PROCESS_GONE, ABANDONED};
    }

    static {
        MessageFileEvents$PdfPreviewResult[] messageFileEvents$PdfPreviewResultArr$values = $values();
        $VALUES = messageFileEvents$PdfPreviewResultArr$values;
        $ENTRIES = wd6.n0(messageFileEvents$PdfPreviewResultArr$values);
        Companion = new ahb();
        $cachedSerializer$delegate = yb5.w(w1a.F, new g9b(19));
    }

    private MessageFileEvents$PdfPreviewResult(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.MessageFileEvents.PdfPreviewResult", values(), new String[]{"unspecified", "loaded", "error", "render_process_gone", "abandoned"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MessageFileEvents$PdfPreviewResult valueOf(String str) {
        return (MessageFileEvents$PdfPreviewResult) Enum.valueOf(MessageFileEvents$PdfPreviewResult.class, str);
    }

    public static MessageFileEvents$PdfPreviewResult[] values() {
        return (MessageFileEvents$PdfPreviewResult[]) $VALUES.clone();
    }
}
