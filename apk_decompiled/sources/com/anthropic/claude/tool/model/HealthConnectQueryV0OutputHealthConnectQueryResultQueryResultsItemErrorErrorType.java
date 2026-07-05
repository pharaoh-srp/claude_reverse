package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.ij8;
import defpackage.kk8;
import defpackage.kw9;
import defpackage.lk8;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "kk8", "PERMISSION_DENIED", "INVALID_RECORD_TYPE", "INVALID_TIME_RANGE", "QUERY_FAILED", "UNKNOWN", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = lk8.class)
public final class HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final kk8 Companion;
    private final String loggingName;
    public static final HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType PERMISSION_DENIED = new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType("PERMISSION_DENIED", 0, "permission_denied");
    public static final HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType INVALID_RECORD_TYPE = new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType("INVALID_RECORD_TYPE", 1, "invalid_record_type");
    public static final HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType INVALID_TIME_RANGE = new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType("INVALID_TIME_RANGE", 2, "invalid_time_range");
    public static final HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType QUERY_FAILED = new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType("QUERY_FAILED", 3, "query_failed");
    public static final HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType UNKNOWN = new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType("UNKNOWN", 4, "unknown");

    private static final /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType[] $values() {
        return new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType[]{PERMISSION_DENIED, INVALID_RECORD_TYPE, INVALID_TIME_RANGE, QUERY_FAILED, UNKNOWN};
    }

    static {
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType[] healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorTypeArr$values = $values();
        $VALUES = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorTypeArr$values;
        $ENTRIES = wd6.n0(healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorTypeArr$values);
        Companion = new kk8();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new ij8(9));
    }

    private HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType", values(), new String[]{"permission_denied", "invalid_record_type", "invalid_time_range", "query_failed", "unknown"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType valueOf(String str) {
        return (HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType) Enum.valueOf(HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType.class, str);
    }

    public static HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType[] values() {
        return (HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
