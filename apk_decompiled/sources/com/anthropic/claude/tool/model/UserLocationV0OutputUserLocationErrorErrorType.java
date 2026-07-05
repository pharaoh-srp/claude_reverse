package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.kdi;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.pni;
import defpackage.qni;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/anthropic/claude/tool/model/UserLocationV0OutputUserLocationErrorErrorType;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "pni", "SYSTEM_PERMISSION_DENIED", "APP_PERMISSION_DENIED", "LOCATION_SERVICES_DISABLED", "TIMEOUT", "UNABLE_TO_LOCATE", "UNKNOWN", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = qni.class)
public final class UserLocationV0OutputUserLocationErrorErrorType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ UserLocationV0OutputUserLocationErrorErrorType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final pni Companion;
    private final String loggingName;
    public static final UserLocationV0OutputUserLocationErrorErrorType SYSTEM_PERMISSION_DENIED = new UserLocationV0OutputUserLocationErrorErrorType("SYSTEM_PERMISSION_DENIED", 0, "system_permission_denied");
    public static final UserLocationV0OutputUserLocationErrorErrorType APP_PERMISSION_DENIED = new UserLocationV0OutputUserLocationErrorErrorType("APP_PERMISSION_DENIED", 1, "app_permission_denied");
    public static final UserLocationV0OutputUserLocationErrorErrorType LOCATION_SERVICES_DISABLED = new UserLocationV0OutputUserLocationErrorErrorType("LOCATION_SERVICES_DISABLED", 2, "location_services_disabled");
    public static final UserLocationV0OutputUserLocationErrorErrorType TIMEOUT = new UserLocationV0OutputUserLocationErrorErrorType("TIMEOUT", 3, "timeout");
    public static final UserLocationV0OutputUserLocationErrorErrorType UNABLE_TO_LOCATE = new UserLocationV0OutputUserLocationErrorErrorType("UNABLE_TO_LOCATE", 4, "unable_to_locate");
    public static final UserLocationV0OutputUserLocationErrorErrorType UNKNOWN = new UserLocationV0OutputUserLocationErrorErrorType("UNKNOWN", 5, "unknown");

    private static final /* synthetic */ UserLocationV0OutputUserLocationErrorErrorType[] $values() {
        return new UserLocationV0OutputUserLocationErrorErrorType[]{SYSTEM_PERMISSION_DENIED, APP_PERMISSION_DENIED, LOCATION_SERVICES_DISABLED, TIMEOUT, UNABLE_TO_LOCATE, UNKNOWN};
    }

    static {
        UserLocationV0OutputUserLocationErrorErrorType[] userLocationV0OutputUserLocationErrorErrorTypeArr$values = $values();
        $VALUES = userLocationV0OutputUserLocationErrorErrorTypeArr$values;
        $ENTRIES = wd6.n0(userLocationV0OutputUserLocationErrorErrorTypeArr$values);
        Companion = new pni();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new kdi(18));
    }

    private UserLocationV0OutputUserLocationErrorErrorType(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationErrorErrorType", values(), new String[]{"system_permission_denied", "app_permission_denied", "location_services_disabled", "timeout", "unable_to_locate", "unknown"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static UserLocationV0OutputUserLocationErrorErrorType valueOf(String str) {
        return (UserLocationV0OutputUserLocationErrorErrorType) Enum.valueOf(UserLocationV0OutputUserLocationErrorErrorType.class, str);
    }

    public static UserLocationV0OutputUserLocationErrorErrorType[] values() {
        return (UserLocationV0OutputUserLocationErrorErrorType[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
