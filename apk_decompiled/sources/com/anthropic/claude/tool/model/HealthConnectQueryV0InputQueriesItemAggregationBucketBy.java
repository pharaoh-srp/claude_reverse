package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.ij8;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.nj8;
import defpackage.oj8;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregationBucketBy;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "nj8", "NONE", "DURATION", "PERIOD", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = oj8.class)
public final class HealthConnectQueryV0InputQueriesItemAggregationBucketBy {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ HealthConnectQueryV0InputQueriesItemAggregationBucketBy[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final nj8 Companion;
    private final String loggingName;
    public static final HealthConnectQueryV0InputQueriesItemAggregationBucketBy NONE = new HealthConnectQueryV0InputQueriesItemAggregationBucketBy("NONE", 0, "none");
    public static final HealthConnectQueryV0InputQueriesItemAggregationBucketBy DURATION = new HealthConnectQueryV0InputQueriesItemAggregationBucketBy("DURATION", 1, "duration");
    public static final HealthConnectQueryV0InputQueriesItemAggregationBucketBy PERIOD = new HealthConnectQueryV0InputQueriesItemAggregationBucketBy("PERIOD", 2, "period");

    private static final /* synthetic */ HealthConnectQueryV0InputQueriesItemAggregationBucketBy[] $values() {
        return new HealthConnectQueryV0InputQueriesItemAggregationBucketBy[]{NONE, DURATION, PERIOD};
    }

    static {
        HealthConnectQueryV0InputQueriesItemAggregationBucketBy[] healthConnectQueryV0InputQueriesItemAggregationBucketByArr$values = $values();
        $VALUES = healthConnectQueryV0InputQueriesItemAggregationBucketByArr$values;
        $ENTRIES = wd6.n0(healthConnectQueryV0InputQueriesItemAggregationBucketByArr$values);
        Companion = new nj8();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new ij8(2));
    }

    private HealthConnectQueryV0InputQueriesItemAggregationBucketBy(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemAggregationBucketBy", values(), new String[]{"none", "duration", "period"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static HealthConnectQueryV0InputQueriesItemAggregationBucketBy valueOf(String str) {
        return (HealthConnectQueryV0InputQueriesItemAggregationBucketBy) Enum.valueOf(HealthConnectQueryV0InputQueriesItemAggregationBucketBy.class, str);
    }

    public static HealthConnectQueryV0InputQueriesItemAggregationBucketBy[] values() {
        return (HealthConnectQueryV0InputQueriesItemAggregationBucketBy[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
