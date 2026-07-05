package io.sentry.android.replay;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import defpackage.kw9;
import defpackage.w1a;
import defpackage.yb5;
import io.sentry.a4;
import io.sentry.w6;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a4 {
    public static final kw9 c = yb5.w(w1a.G, a.G);
    public static final HashSet d;
    public String a;
    public final Map b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("status_code");
        hashSet.add(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR);
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        d = hashSet;
    }

    public d(w6 w6Var) {
        w6Var.getClass();
        this.b = Collections.synchronizedMap(new b());
        w6Var.setBeforeBreadcrumb(new io.sentry.y(this, w6Var.getBeforeBreadcrumb()));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    @Override // io.sentry.a4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.sentry.rrweb.b a(io.sentry.g r13) {
        /*
            Method dump skipped, instruction units count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.d.a(io.sentry.g):io.sentry.rrweb.b");
    }
}
