package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mia;
import defpackage.oia;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/anthropic/claude/analytics/events/LoginEvents$LogoutReason", "", "Lcom/anthropic/claude/analytics/events/LoginEvents$LogoutReason;", "<init>", "(Ljava/lang/String;I)V", "Companion", "oia", "UNSPECIFIED", "USER_INITIATED", "SERVER_SESSION_INVALID", "MISSING_ORGANIZATION", "INTUNE_ENROLLMENT_INVALID", "INTUNE_INIT_FAILED", "ENDPOINT_CHANGED", "ACCOUNT_DELETED", "TRUSTED_DEVICE_RELOGIN", "ACCOUNT_RESTRICTED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class LoginEvents$LogoutReason {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ LoginEvents$LogoutReason[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final oia Companion;
    public static final LoginEvents$LogoutReason UNSPECIFIED = new LoginEvents$LogoutReason("UNSPECIFIED", 0);
    public static final LoginEvents$LogoutReason USER_INITIATED = new LoginEvents$LogoutReason("USER_INITIATED", 1);
    public static final LoginEvents$LogoutReason SERVER_SESSION_INVALID = new LoginEvents$LogoutReason("SERVER_SESSION_INVALID", 2);
    public static final LoginEvents$LogoutReason MISSING_ORGANIZATION = new LoginEvents$LogoutReason("MISSING_ORGANIZATION", 3);
    public static final LoginEvents$LogoutReason INTUNE_ENROLLMENT_INVALID = new LoginEvents$LogoutReason("INTUNE_ENROLLMENT_INVALID", 4);
    public static final LoginEvents$LogoutReason INTUNE_INIT_FAILED = new LoginEvents$LogoutReason("INTUNE_INIT_FAILED", 5);
    public static final LoginEvents$LogoutReason ENDPOINT_CHANGED = new LoginEvents$LogoutReason("ENDPOINT_CHANGED", 6);
    public static final LoginEvents$LogoutReason ACCOUNT_DELETED = new LoginEvents$LogoutReason("ACCOUNT_DELETED", 7);
    public static final LoginEvents$LogoutReason TRUSTED_DEVICE_RELOGIN = new LoginEvents$LogoutReason("TRUSTED_DEVICE_RELOGIN", 8);
    public static final LoginEvents$LogoutReason ACCOUNT_RESTRICTED = new LoginEvents$LogoutReason("ACCOUNT_RESTRICTED", 9);

    private static final /* synthetic */ LoginEvents$LogoutReason[] $values() {
        return new LoginEvents$LogoutReason[]{UNSPECIFIED, USER_INITIATED, SERVER_SESSION_INVALID, MISSING_ORGANIZATION, INTUNE_ENROLLMENT_INVALID, INTUNE_INIT_FAILED, ENDPOINT_CHANGED, ACCOUNT_DELETED, TRUSTED_DEVICE_RELOGIN, ACCOUNT_RESTRICTED};
    }

    static {
        LoginEvents$LogoutReason[] loginEvents$LogoutReasonArr$values = $values();
        $VALUES = loginEvents$LogoutReasonArr$values;
        $ENTRIES = wd6.n0(loginEvents$LogoutReasonArr$values);
        Companion = new oia();
        $cachedSerializer$delegate = yb5.w(w1a.F, new mia(1));
    }

    private LoginEvents$LogoutReason(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.LoginEvents.LogoutReason", values(), new String[]{"unspecified", "user_initiated", "server_session_invalid", "missing_organization", "intune_enrollment_invalid", "intune_init_failed", "endpoint_changed", "account_deleted", "trusted_device_relogin", "account_restricted"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static LoginEvents$LogoutReason valueOf(String str) {
        return (LoginEvents$LogoutReason) Enum.valueOf(LoginEvents$LogoutReason.class, str);
    }

    public static LoginEvents$LogoutReason[] values() {
        return (LoginEvents$LogoutReason[]) $VALUES.clone();
    }
}
