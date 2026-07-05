package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public enum n7 implements m2 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    n7(int i) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i;
    }

    public static n7 fromApiNameSafely(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static n7 fromHttpStatusCode(int i) {
        for (n7 n7Var : values()) {
            if (n7Var.matches(i)) {
                return n7Var;
            }
        }
        return null;
    }

    private boolean matches(int i) {
        return i >= this.minHttpStatusCode && i <= this.maxHttpStatusCode;
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.m2
    public void serialize(q3 q3Var, a1 a1Var) {
        ((y) q3Var).A(apiName());
    }

    n7(int i, int i2) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i2;
    }

    public static n7 fromHttpStatusCode(Integer num, n7 n7Var) {
        n7 n7VarFromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : n7Var;
        return n7VarFromHttpStatusCode != null ? n7VarFromHttpStatusCode : n7Var;
    }
}
