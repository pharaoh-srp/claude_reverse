package io.sentry.android.core.internal.util;

import android.content.Context;
import io.sentry.a1;
import io.sentry.android.core.l0;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final Charset g = Charset.forName("UTF-8");
    public final Context a;
    public final l0 b;
    public final a1 c;
    public final String[] d;
    public final String[] e;
    public final Runtime f;

    public k(Context context, a1 a1Var, l0 l0Var) {
        Runtime runtime = Runtime.getRuntime();
        this.a = context;
        io.sentry.p.v("The BuildInfoProvider is required.", l0Var);
        this.b = l0Var;
        io.sentry.p.v("The Logger is required.", a1Var);
        this.c = a1Var;
        this.d = new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        io.sentry.p.v("The Runtime is required.", runtime);
        this.f = runtime;
    }
}
