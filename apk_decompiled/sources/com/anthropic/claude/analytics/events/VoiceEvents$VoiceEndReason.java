package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p3j;
import defpackage.t3j;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$VoiceEndReason", "", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEndReason;", "<init>", "(Ljava/lang/String;I)V", "Companion", "t3j", "UNSPECIFIED", "USER_EXIT", "ERROR", "RATE_LIMIT", "SERVER_CLOSE", "INTERRUPTION", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class VoiceEvents$VoiceEndReason {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ VoiceEvents$VoiceEndReason[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final t3j Companion;
    public static final VoiceEvents$VoiceEndReason UNSPECIFIED = new VoiceEvents$VoiceEndReason("UNSPECIFIED", 0);
    public static final VoiceEvents$VoiceEndReason USER_EXIT = new VoiceEvents$VoiceEndReason("USER_EXIT", 1);
    public static final VoiceEvents$VoiceEndReason ERROR = new VoiceEvents$VoiceEndReason("ERROR", 2);
    public static final VoiceEvents$VoiceEndReason RATE_LIMIT = new VoiceEvents$VoiceEndReason("RATE_LIMIT", 3);
    public static final VoiceEvents$VoiceEndReason SERVER_CLOSE = new VoiceEvents$VoiceEndReason("SERVER_CLOSE", 4);
    public static final VoiceEvents$VoiceEndReason INTERRUPTION = new VoiceEvents$VoiceEndReason("INTERRUPTION", 5);

    private static final /* synthetic */ VoiceEvents$VoiceEndReason[] $values() {
        return new VoiceEvents$VoiceEndReason[]{UNSPECIFIED, USER_EXIT, ERROR, RATE_LIMIT, SERVER_CLOSE, INTERRUPTION};
    }

    static {
        VoiceEvents$VoiceEndReason[] voiceEvents$VoiceEndReasonArr$values = $values();
        $VALUES = voiceEvents$VoiceEndReasonArr$values;
        $ENTRIES = wd6.n0(voiceEvents$VoiceEndReasonArr$values);
        Companion = new t3j();
        $cachedSerializer$delegate = yb5.w(w1a.F, new p3j(3));
    }

    private VoiceEvents$VoiceEndReason(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.VoiceEvents.VoiceEndReason", values(), new String[]{"unknown", "user_exit", "error", "rate_limit", "server_close", "interruption"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static VoiceEvents$VoiceEndReason valueOf(String str) {
        return (VoiceEvents$VoiceEndReason) Enum.valueOf(VoiceEvents$VoiceEndReason.class, str);
    }

    public static VoiceEvents$VoiceEndReason[] values() {
        return (VoiceEvents$VoiceEndReason[]) $VALUES.clone();
    }
}
