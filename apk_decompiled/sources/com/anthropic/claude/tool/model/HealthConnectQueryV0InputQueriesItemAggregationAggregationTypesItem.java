package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.ij8;
import defpackage.kw9;
import defpackage.lj8;
import defpackage.mdj;
import defpackage.mj8;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "lj8", "SUM", "AVERAGE", "MIN", "MAX", "COUNT", "DURATION", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = mj8.class)
public final class HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final lj8 Companion;
    private final String loggingName;
    public static final HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem SUM = new HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem("SUM", 0, "sum");
    public static final HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem AVERAGE = new HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem("AVERAGE", 1, "average");
    public static final HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem MIN = new HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem("MIN", 2, "min");
    public static final HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem MAX = new HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem("MAX", 3, "max");
    public static final HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem COUNT = new HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem("COUNT", 4, "count");
    public static final HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem DURATION = new HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem("DURATION", 5, "duration");

    private static final /* synthetic */ HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem[] $values() {
        return new HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem[]{SUM, AVERAGE, MIN, MAX, COUNT, DURATION};
    }

    static {
        HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem[] healthConnectQueryV0InputQueriesItemAggregationAggregationTypesItemArr$values = $values();
        $VALUES = healthConnectQueryV0InputQueriesItemAggregationAggregationTypesItemArr$values;
        $ENTRIES = wd6.n0(healthConnectQueryV0InputQueriesItemAggregationAggregationTypesItemArr$values);
        Companion = new lj8();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new ij8(1));
    }

    private HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem", values(), new String[]{"sum", "average", "min", "max", "count", "duration"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem valueOf(String str) {
        return (HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem) Enum.valueOf(HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem.class, str);
    }

    public static HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem[] values() {
        return (HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
