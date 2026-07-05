package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.ir2;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$StreamingEndpointType", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingEndpointType;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ir2", "UNSPECIFIED", "RETRY", "COMPLETION", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$StreamingEndpointType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$StreamingEndpointType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ir2 Companion;
    public static final ChatEvents$StreamingEndpointType UNSPECIFIED = new ChatEvents$StreamingEndpointType("UNSPECIFIED", 0);
    public static final ChatEvents$StreamingEndpointType RETRY = new ChatEvents$StreamingEndpointType("RETRY", 1);
    public static final ChatEvents$StreamingEndpointType COMPLETION = new ChatEvents$StreamingEndpointType("COMPLETION", 2);

    private static final /* synthetic */ ChatEvents$StreamingEndpointType[] $values() {
        return new ChatEvents$StreamingEndpointType[]{UNSPECIFIED, RETRY, COMPLETION};
    }

    static {
        ChatEvents$StreamingEndpointType[] chatEvents$StreamingEndpointTypeArr$values = $values();
        $VALUES = chatEvents$StreamingEndpointTypeArr$values;
        $ENTRIES = wd6.n0(chatEvents$StreamingEndpointTypeArr$values);
        Companion = new ir2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new xq2(5));
    }

    private ChatEvents$StreamingEndpointType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.StreamingEndpointType", values(), new String[]{"unknown", "retry", "completion"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$StreamingEndpointType valueOf(String str) {
        return (ChatEvents$StreamingEndpointType) Enum.valueOf(ChatEvents$StreamingEndpointType.class, str);
    }

    public static ChatEvents$StreamingEndpointType[] values() {
        return (ChatEvents$StreamingEndpointType[]) $VALUES.clone();
    }
}
