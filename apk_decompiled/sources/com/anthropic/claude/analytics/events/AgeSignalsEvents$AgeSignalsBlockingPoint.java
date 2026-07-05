package com.anthropic.claude.analytics.events;

import defpackage.b5;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mi;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsBlockingPoint", "", "Lcom/anthropic/claude/analytics/events/AgeSignalsEvents$AgeSignalsBlockingPoint;", "<init>", "(Ljava/lang/String;I)V", "Companion", "mi", "UNSPECIFIED", "WELCOME_EMAIL", "WELCOME_GOOGLE", "WELCOME_SSO", "MAGIC_LINK_VERIFY", "ONBOARDING", "WELCOME_APPLE", "WELCOME_MICROSOFT", "PHONE_VERIFICATION", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class AgeSignalsEvents$AgeSignalsBlockingPoint {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ AgeSignalsEvents$AgeSignalsBlockingPoint[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final mi Companion;
    public static final AgeSignalsEvents$AgeSignalsBlockingPoint UNSPECIFIED = new AgeSignalsEvents$AgeSignalsBlockingPoint("UNSPECIFIED", 0);
    public static final AgeSignalsEvents$AgeSignalsBlockingPoint WELCOME_EMAIL = new AgeSignalsEvents$AgeSignalsBlockingPoint("WELCOME_EMAIL", 1);
    public static final AgeSignalsEvents$AgeSignalsBlockingPoint WELCOME_GOOGLE = new AgeSignalsEvents$AgeSignalsBlockingPoint("WELCOME_GOOGLE", 2);
    public static final AgeSignalsEvents$AgeSignalsBlockingPoint WELCOME_SSO = new AgeSignalsEvents$AgeSignalsBlockingPoint("WELCOME_SSO", 3);
    public static final AgeSignalsEvents$AgeSignalsBlockingPoint MAGIC_LINK_VERIFY = new AgeSignalsEvents$AgeSignalsBlockingPoint("MAGIC_LINK_VERIFY", 4);
    public static final AgeSignalsEvents$AgeSignalsBlockingPoint ONBOARDING = new AgeSignalsEvents$AgeSignalsBlockingPoint("ONBOARDING", 5);
    public static final AgeSignalsEvents$AgeSignalsBlockingPoint WELCOME_APPLE = new AgeSignalsEvents$AgeSignalsBlockingPoint("WELCOME_APPLE", 6);
    public static final AgeSignalsEvents$AgeSignalsBlockingPoint WELCOME_MICROSOFT = new AgeSignalsEvents$AgeSignalsBlockingPoint("WELCOME_MICROSOFT", 7);
    public static final AgeSignalsEvents$AgeSignalsBlockingPoint PHONE_VERIFICATION = new AgeSignalsEvents$AgeSignalsBlockingPoint("PHONE_VERIFICATION", 8);

    private static final /* synthetic */ AgeSignalsEvents$AgeSignalsBlockingPoint[] $values() {
        return new AgeSignalsEvents$AgeSignalsBlockingPoint[]{UNSPECIFIED, WELCOME_EMAIL, WELCOME_GOOGLE, WELCOME_SSO, MAGIC_LINK_VERIFY, ONBOARDING, WELCOME_APPLE, WELCOME_MICROSOFT, PHONE_VERIFICATION};
    }

    static {
        AgeSignalsEvents$AgeSignalsBlockingPoint[] ageSignalsEvents$AgeSignalsBlockingPointArr$values = $values();
        $VALUES = ageSignalsEvents$AgeSignalsBlockingPointArr$values;
        $ENTRIES = wd6.n0(ageSignalsEvents$AgeSignalsBlockingPointArr$values);
        Companion = new mi();
        $cachedSerializer$delegate = yb5.w(w1a.F, new b5(2));
    }

    private AgeSignalsEvents$AgeSignalsBlockingPoint(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.AgeSignalsEvents.AgeSignalsBlockingPoint", values(), new String[]{"unspecified", "welcome_email", "welcome_google", "welcome_sso", "magic_link_verify", "onboarding", "welcome_apple", "welcome_microsoft", "phone_verification"}, new Annotation[][]{null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static AgeSignalsEvents$AgeSignalsBlockingPoint valueOf(String str) {
        return (AgeSignalsEvents$AgeSignalsBlockingPoint) Enum.valueOf(AgeSignalsEvents$AgeSignalsBlockingPoint.class, str);
    }

    public static AgeSignalsEvents$AgeSignalsBlockingPoint[] values() {
        return (AgeSignalsEvents$AgeSignalsBlockingPoint[]) $VALUES.clone();
    }
}
