package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.ij8;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.wj8;
import defpackage.xj8;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "wj8", "HEALTH_CONNECT_UNAVAILABLE", "SYSTEM_PERMISSION_DENIED", "UNKNOWN", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = xj8.class)
public final class HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final wj8 Companion;
    public static final HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType HEALTH_CONNECT_UNAVAILABLE = new HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType("HEALTH_CONNECT_UNAVAILABLE", 0, "health_connect_unavailable");
    public static final HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType SYSTEM_PERMISSION_DENIED = new HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType("SYSTEM_PERMISSION_DENIED", 1, "system_permission_denied");
    public static final HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType UNKNOWN = new HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType("UNKNOWN", 2, "unknown");
    private final String loggingName;

    private static final /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType[] $values() {
        return new HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType[]{HEALTH_CONNECT_UNAVAILABLE, SYSTEM_PERMISSION_DENIED, UNKNOWN};
    }

    static {
        HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType[] healthConnectQueryV0OutputHealthConnectQueryErrorErrorTypeArr$values = $values();
        $VALUES = healthConnectQueryV0OutputHealthConnectQueryErrorErrorTypeArr$values;
        $ENTRIES = wd6.n0(healthConnectQueryV0OutputHealthConnectQueryErrorErrorTypeArr$values);
        Companion = new wj8();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new ij8(3));
    }

    private HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType", values(), new String[]{"health_connect_unavailable", "system_permission_denied", "unknown"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType valueOf(String str) {
        return (HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType) Enum.valueOf(HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType.class, str);
    }

    public static HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType[] values() {
        return (HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
