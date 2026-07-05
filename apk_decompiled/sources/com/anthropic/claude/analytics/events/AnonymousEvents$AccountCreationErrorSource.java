package com.anthropic.claude.analytics.events;

import defpackage.ad0;
import defpackage.b5;
import defpackage.fq6;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/AnonymousEvents$AccountCreationErrorSource", "", "Lcom/anthropic/claude/analytics/events/AnonymousEvents$AccountCreationErrorSource;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ad0", "UNSPECIFIED", "ATTESTATION", "VERIFICATION", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class AnonymousEvents$AccountCreationErrorSource {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ AnonymousEvents$AccountCreationErrorSource[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ad0 Companion;
    public static final AnonymousEvents$AccountCreationErrorSource UNSPECIFIED = new AnonymousEvents$AccountCreationErrorSource("UNSPECIFIED", 0);
    public static final AnonymousEvents$AccountCreationErrorSource ATTESTATION = new AnonymousEvents$AccountCreationErrorSource("ATTESTATION", 1);
    public static final AnonymousEvents$AccountCreationErrorSource VERIFICATION = new AnonymousEvents$AccountCreationErrorSource("VERIFICATION", 2);

    private static final /* synthetic */ AnonymousEvents$AccountCreationErrorSource[] $values() {
        return new AnonymousEvents$AccountCreationErrorSource[]{UNSPECIFIED, ATTESTATION, VERIFICATION};
    }

    static {
        AnonymousEvents$AccountCreationErrorSource[] anonymousEvents$AccountCreationErrorSourceArr$values = $values();
        $VALUES = anonymousEvents$AccountCreationErrorSourceArr$values;
        $ENTRIES = wd6.n0(anonymousEvents$AccountCreationErrorSourceArr$values);
        Companion = new ad0();
        $cachedSerializer$delegate = yb5.w(w1a.F, new b5(19));
    }

    private AnonymousEvents$AccountCreationErrorSource(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.AnonymousEvents.AccountCreationErrorSource", values(), new String[]{"unspecified", "attestation", "verify"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static AnonymousEvents$AccountCreationErrorSource valueOf(String str) {
        return (AnonymousEvents$AccountCreationErrorSource) Enum.valueOf(AnonymousEvents$AccountCreationErrorSource.class, str);
    }

    public static AnonymousEvents$AccountCreationErrorSource[] values() {
        return (AnonymousEvents$AccountCreationErrorSource[]) $VALUES.clone();
    }
}
