package defpackage;

import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem;
import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemAggregationBucketBy;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ii8 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[HealthConnectQueryV0InputQueriesItemAggregationBucketBy.values().length];
        try {
            iArr[HealthConnectQueryV0InputQueriesItemAggregationBucketBy.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HealthConnectQueryV0InputQueriesItemAggregationBucketBy.DURATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HealthConnectQueryV0InputQueriesItemAggregationBucketBy.PERIOD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem.values().length];
        try {
            iArr2[HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem.SUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem.AVERAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem.MIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem.MAX.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem.COUNT.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem.DURATION.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
    }
}
