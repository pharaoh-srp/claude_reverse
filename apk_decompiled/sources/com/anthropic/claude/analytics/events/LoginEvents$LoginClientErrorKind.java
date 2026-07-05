package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mia;
import defpackage.nia;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/anthropic/claude/analytics/events/LoginEvents$LoginClientErrorKind", "", "Lcom/anthropic/claude/analytics/events/LoginEvents$LoginClientErrorKind;", "<init>", "(Ljava/lang/String;I)V", "Companion", "nia", "UNSPECIFIED", "NETWORK", "CREDENTIAL_NO_ACCOUNT", "CREDENTIAL_INTERRUPTED", "CREDENTIAL_PROVIDER_ERROR", "CREDENTIAL_UNKNOWN", "CLOUDFLARE_BLOCKED", "CLIENT_EXCEPTION", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class LoginEvents$LoginClientErrorKind {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ LoginEvents$LoginClientErrorKind[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final nia Companion;
    public static final LoginEvents$LoginClientErrorKind UNSPECIFIED = new LoginEvents$LoginClientErrorKind("UNSPECIFIED", 0);
    public static final LoginEvents$LoginClientErrorKind NETWORK = new LoginEvents$LoginClientErrorKind("NETWORK", 1);
    public static final LoginEvents$LoginClientErrorKind CREDENTIAL_NO_ACCOUNT = new LoginEvents$LoginClientErrorKind("CREDENTIAL_NO_ACCOUNT", 2);
    public static final LoginEvents$LoginClientErrorKind CREDENTIAL_INTERRUPTED = new LoginEvents$LoginClientErrorKind("CREDENTIAL_INTERRUPTED", 3);
    public static final LoginEvents$LoginClientErrorKind CREDENTIAL_PROVIDER_ERROR = new LoginEvents$LoginClientErrorKind("CREDENTIAL_PROVIDER_ERROR", 4);
    public static final LoginEvents$LoginClientErrorKind CREDENTIAL_UNKNOWN = new LoginEvents$LoginClientErrorKind("CREDENTIAL_UNKNOWN", 5);
    public static final LoginEvents$LoginClientErrorKind CLOUDFLARE_BLOCKED = new LoginEvents$LoginClientErrorKind("CLOUDFLARE_BLOCKED", 6);
    public static final LoginEvents$LoginClientErrorKind CLIENT_EXCEPTION = new LoginEvents$LoginClientErrorKind("CLIENT_EXCEPTION", 7);

    private static final /* synthetic */ LoginEvents$LoginClientErrorKind[] $values() {
        return new LoginEvents$LoginClientErrorKind[]{UNSPECIFIED, NETWORK, CREDENTIAL_NO_ACCOUNT, CREDENTIAL_INTERRUPTED, CREDENTIAL_PROVIDER_ERROR, CREDENTIAL_UNKNOWN, CLOUDFLARE_BLOCKED, CLIENT_EXCEPTION};
    }

    static {
        LoginEvents$LoginClientErrorKind[] loginEvents$LoginClientErrorKindArr$values = $values();
        $VALUES = loginEvents$LoginClientErrorKindArr$values;
        $ENTRIES = wd6.n0(loginEvents$LoginClientErrorKindArr$values);
        Companion = new nia();
        $cachedSerializer$delegate = yb5.w(w1a.F, new mia(0));
    }

    private LoginEvents$LoginClientErrorKind(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.LoginEvents.LoginClientErrorKind", values(), new String[]{"unspecified", "network", "credential_no_account", "credential_interrupted", "credential_provider_error", "credential_unknown", "cloudflare_blocked", "client_exception"}, new Annotation[][]{null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static LoginEvents$LoginClientErrorKind valueOf(String str) {
        return (LoginEvents$LoginClientErrorKind) Enum.valueOf(LoginEvents$LoginClientErrorKind.class, str);
    }

    public static LoginEvents$LoginClientErrorKind[] values() {
        return (LoginEvents$LoginClientErrorKind[]) $VALUES.clone();
    }
}
