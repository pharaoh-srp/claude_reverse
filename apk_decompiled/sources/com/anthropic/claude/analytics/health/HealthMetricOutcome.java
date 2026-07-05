package com.anthropic.claude.analytics.health;

import defpackage.el8;
import defpackage.fq6;
import defpackage.ij8;
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
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/anthropic/claude/analytics/health/HealthMetricOutcome;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "el8", "UNSPECIFIED", "SUCCESS", "FAILURE", "HANDOFF", "ABORTED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class HealthMetricOutcome {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ HealthMetricOutcome[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final el8 Companion;
    public static final HealthMetricOutcome UNSPECIFIED = new HealthMetricOutcome("UNSPECIFIED", 0);
    public static final HealthMetricOutcome SUCCESS = new HealthMetricOutcome("SUCCESS", 1);
    public static final HealthMetricOutcome FAILURE = new HealthMetricOutcome("FAILURE", 2);
    public static final HealthMetricOutcome HANDOFF = new HealthMetricOutcome("HANDOFF", 3);
    public static final HealthMetricOutcome ABORTED = new HealthMetricOutcome("ABORTED", 4);

    private static final /* synthetic */ HealthMetricOutcome[] $values() {
        return new HealthMetricOutcome[]{UNSPECIFIED, SUCCESS, FAILURE, HANDOFF, ABORTED};
    }

    static {
        HealthMetricOutcome[] healthMetricOutcomeArr$values = $values();
        $VALUES = healthMetricOutcomeArr$values;
        $ENTRIES = wd6.n0(healthMetricOutcomeArr$values);
        Companion = new el8();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ij8(14));
    }

    private HealthMetricOutcome(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.health.HealthMetricOutcome", values(), new String[]{"unspecified", "success", "failure", "handoff", "aborted"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static HealthMetricOutcome valueOf(String str) {
        return (HealthMetricOutcome) Enum.valueOf(HealthMetricOutcome.class, str);
    }

    public static HealthMetricOutcome[] values() {
        return (HealthMetricOutcome[]) $VALUES.clone();
    }
}
