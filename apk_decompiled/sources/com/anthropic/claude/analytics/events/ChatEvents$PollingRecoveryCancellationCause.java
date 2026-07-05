package com.anthropic.claude.analytics.events;

import defpackage.ao2;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.wp2;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryCancellationCause", "", "Lcom/anthropic/claude/analytics/events/ChatEvents$PollingRecoveryCancellationCause;", "<init>", "(Ljava/lang/String;I)V", "Companion", "wp2", "UNSPECIFIED", "ROUTE_DESTROYED", "APP_BACKGROUNDED", "SUPERSEDED", "USER_STOPPED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatEvents$PollingRecoveryCancellationCause {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatEvents$PollingRecoveryCancellationCause[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final wp2 Companion;
    public static final ChatEvents$PollingRecoveryCancellationCause UNSPECIFIED = new ChatEvents$PollingRecoveryCancellationCause("UNSPECIFIED", 0);
    public static final ChatEvents$PollingRecoveryCancellationCause ROUTE_DESTROYED = new ChatEvents$PollingRecoveryCancellationCause("ROUTE_DESTROYED", 1);
    public static final ChatEvents$PollingRecoveryCancellationCause APP_BACKGROUNDED = new ChatEvents$PollingRecoveryCancellationCause("APP_BACKGROUNDED", 2);
    public static final ChatEvents$PollingRecoveryCancellationCause SUPERSEDED = new ChatEvents$PollingRecoveryCancellationCause("SUPERSEDED", 3);
    public static final ChatEvents$PollingRecoveryCancellationCause USER_STOPPED = new ChatEvents$PollingRecoveryCancellationCause("USER_STOPPED", 4);

    private static final /* synthetic */ ChatEvents$PollingRecoveryCancellationCause[] $values() {
        return new ChatEvents$PollingRecoveryCancellationCause[]{UNSPECIFIED, ROUTE_DESTROYED, APP_BACKGROUNDED, SUPERSEDED, USER_STOPPED};
    }

    static {
        ChatEvents$PollingRecoveryCancellationCause[] chatEvents$PollingRecoveryCancellationCauseArr$values = $values();
        $VALUES = chatEvents$PollingRecoveryCancellationCauseArr$values;
        $ENTRIES = wd6.n0(chatEvents$PollingRecoveryCancellationCauseArr$values);
        Companion = new wp2();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ao2(17));
    }

    private ChatEvents$PollingRecoveryCancellationCause(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatEvents.PollingRecoveryCancellationCause", values(), new String[]{"unknown", "route_destroyed", "app_backgrounded", "superseded", "user_stopped"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatEvents$PollingRecoveryCancellationCause valueOf(String str) {
        return (ChatEvents$PollingRecoveryCancellationCause) Enum.valueOf(ChatEvents$PollingRecoveryCancellationCause.class, str);
    }

    public static ChatEvents$PollingRecoveryCancellationCause[] values() {
        return (ChatEvents$PollingRecoveryCancellationCause[]) $VALUES.clone();
    }
}
