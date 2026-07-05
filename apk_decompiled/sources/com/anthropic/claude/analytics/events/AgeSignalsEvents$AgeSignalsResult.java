package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.j7;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.ti;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsResult", "", "Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsResult;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ti", "UNSPECIFIED", "VERIFIED", "SUPERVISED", "UNKNOWN", "RETRYABLE_ERROR", "DECLINED_SHARING", "ERROR", "DECLARED", "DECLARED_ADULT", "DECLARED_MINOR", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class AgeSignalsEvents$AgeSignalsResult {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ AgeSignalsEvents$AgeSignalsResult[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ti Companion;
    public static final AgeSignalsEvents$AgeSignalsResult UNSPECIFIED = new AgeSignalsEvents$AgeSignalsResult("UNSPECIFIED", 0);
    public static final AgeSignalsEvents$AgeSignalsResult VERIFIED = new AgeSignalsEvents$AgeSignalsResult("VERIFIED", 1);
    public static final AgeSignalsEvents$AgeSignalsResult SUPERVISED = new AgeSignalsEvents$AgeSignalsResult("SUPERVISED", 2);
    public static final AgeSignalsEvents$AgeSignalsResult UNKNOWN = new AgeSignalsEvents$AgeSignalsResult("UNKNOWN", 3);
    public static final AgeSignalsEvents$AgeSignalsResult RETRYABLE_ERROR = new AgeSignalsEvents$AgeSignalsResult("RETRYABLE_ERROR", 4);
    public static final AgeSignalsEvents$AgeSignalsResult DECLINED_SHARING = new AgeSignalsEvents$AgeSignalsResult("DECLINED_SHARING", 5);
    public static final AgeSignalsEvents$AgeSignalsResult ERROR = new AgeSignalsEvents$AgeSignalsResult("ERROR", 6);
    public static final AgeSignalsEvents$AgeSignalsResult DECLARED = new AgeSignalsEvents$AgeSignalsResult("DECLARED", 7);
    public static final AgeSignalsEvents$AgeSignalsResult DECLARED_ADULT = new AgeSignalsEvents$AgeSignalsResult("DECLARED_ADULT", 8);
    public static final AgeSignalsEvents$AgeSignalsResult DECLARED_MINOR = new AgeSignalsEvents$AgeSignalsResult("DECLARED_MINOR", 9);

    private static final /* synthetic */ AgeSignalsEvents$AgeSignalsResult[] $values() {
        return new AgeSignalsEvents$AgeSignalsResult[]{UNSPECIFIED, VERIFIED, SUPERVISED, UNKNOWN, RETRYABLE_ERROR, DECLINED_SHARING, ERROR, DECLARED, DECLARED_ADULT, DECLARED_MINOR};
    }

    static {
        AgeSignalsEvents$AgeSignalsResult[] ageSignalsEvents$AgeSignalsResultArr$values = $values();
        $VALUES = ageSignalsEvents$AgeSignalsResultArr$values;
        $ENTRIES = wd6.n0(ageSignalsEvents$AgeSignalsResultArr$values);
        Companion = new ti();
        $cachedSerializer$delegate = yb5.w(w1a.F, new j7(9));
    }

    private AgeSignalsEvents$AgeSignalsResult(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.AgeSignalsEvents.AgeSignalsResult", values(), new String[]{"unspecified", "verified", "supervised", "unknown", "retryable_error", "declined_sharing", "error", "declared", "declared_adult", "declared_minor"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static AgeSignalsEvents$AgeSignalsResult valueOf(String str) {
        return (AgeSignalsEvents$AgeSignalsResult) Enum.valueOf(AgeSignalsEvents$AgeSignalsResult.class, str);
    }

    public static AgeSignalsEvents$AgeSignalsResult[] values() {
        return (AgeSignalsEvents$AgeSignalsResult[]) $VALUES.clone();
    }
}
