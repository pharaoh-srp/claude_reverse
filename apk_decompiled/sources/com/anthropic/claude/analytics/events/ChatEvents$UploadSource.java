package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.vr2;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.xq2;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$UploadSource", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$UploadSource;", "<init>", "(Ljava/lang/String;I)V", "Companion", "vr2", "UNSPECIFIED", "INITIAL_UPLOAD", "TAP_RETRY", "SEND_RETRY", "MARKUP_REPLACEMENT", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$UploadSource {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$UploadSource[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final vr2 Companion;
    public static final ChatEvents$UploadSource UNSPECIFIED = new ChatEvents$UploadSource("UNSPECIFIED", 0);
    public static final ChatEvents$UploadSource INITIAL_UPLOAD = new ChatEvents$UploadSource("INITIAL_UPLOAD", 1);
    public static final ChatEvents$UploadSource TAP_RETRY = new ChatEvents$UploadSource("TAP_RETRY", 2);
    public static final ChatEvents$UploadSource SEND_RETRY = new ChatEvents$UploadSource("SEND_RETRY", 3);
    public static final ChatEvents$UploadSource MARKUP_REPLACEMENT = new ChatEvents$UploadSource("MARKUP_REPLACEMENT", 4);

    private static final /* synthetic */ ChatEvents$UploadSource[] $values() {
        return new ChatEvents$UploadSource[]{UNSPECIFIED, INITIAL_UPLOAD, TAP_RETRY, SEND_RETRY, MARKUP_REPLACEMENT};
    }

    static {
        ChatEvents$UploadSource[] chatEvents$UploadSourceArr$values = $values();
        $VALUES = chatEvents$UploadSourceArr$values;
        $ENTRIES = wd6.n0(chatEvents$UploadSourceArr$values);
        Companion = new vr2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new xq2(13));
    }

    private ChatEvents$UploadSource(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.UploadSource", values(), new String[]{"unspecified", "initial_upload", "tap_retry", "send_retry", "markup_replacement"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$UploadSource valueOf(String str) {
        return (ChatEvents$UploadSource) Enum.valueOf(ChatEvents$UploadSource.class, str);
    }

    public static ChatEvents$UploadSource[] values() {
        return (ChatEvents$UploadSource[]) $VALUES.clone();
    }
}
