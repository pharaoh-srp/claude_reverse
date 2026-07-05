package io.sentry.util;

import defpackage.de7;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final List a = Arrays.asList("X-FORWARDED-FOR", "AUTHORIZATION", "COOKIE", "SET-COOKIE", "X-API-KEY", "X-REAL-IP", "REMOTE-ADDR", "FORWARDED", "PROXY-AUTHORIZATION", "X-CSRF-TOKEN", "X-CSRFTOKEN", "X-XSRF-TOKEN");
    public static final de7 b;
    public static final de7 c;

    static {
        Arrays.asList("JSESSIONID", "JSESSIONIDSSO", "JSSOSESSIONID", "SESSIONID", "SID", "CSRFTOKEN", "XSRF-TOKEN");
        b = new de7(400, 499);
        c = new de7(500, 599);
    }

    public static boolean a(int i) {
        de7 de7Var = b;
        return i >= de7Var.a && i <= de7Var.b;
    }

    public static boolean b(int i) {
        de7 de7Var = c;
        return i >= de7Var.a && i <= de7Var.b;
    }
}
