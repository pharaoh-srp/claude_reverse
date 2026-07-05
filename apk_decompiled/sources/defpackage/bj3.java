package defpackage;

import com.anthropic.claude.api.errors.ClaudeApiError$InvalidRequestError;

/* JADX INFO: loaded from: classes3.dex */
public interface bj3 {
    /* JADX INFO: renamed from: a */
    default String getF() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    Integer getE();

    default boolean c(yi3 yi3Var) {
        yi3Var.getClass();
        return (this instanceof ClaudeApiError$InvalidRequestError) && ((ClaudeApiError$InvalidRequestError) this).a == yi3Var;
    }

    /* JADX INFO: renamed from: d */
    String getC();

    /* JADX INFO: renamed from: e */
    String getD();

    default String f() {
        return null;
    }
}
