package com.anthropic.claude.api.errors;

import defpackage.bj3;
import defpackage.mdj;
import defpackage.sq6;
import defpackage.vb7;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/anthropic/claude/api/errors/ClaudeApiError$UnknownPermissionError", "Lbj3;", "Claude.api:result"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final /* data */ class ClaudeApiError$UnknownPermissionError implements bj3 {
    public final String a;
    public final int b;

    public ClaudeApiError$UnknownPermissionError(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.bj3
    /* JADX INFO: renamed from: b */
    public final Integer getC() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.bj3
    /* JADX INFO: renamed from: d */
    public final String getD() {
        return null;
    }

    @Override // defpackage.bj3
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaudeApiError$UnknownPermissionError)) {
            return false;
        }
        ClaudeApiError$UnknownPermissionError claudeApiError$UnknownPermissionError = (ClaudeApiError$UnknownPermissionError) obj;
        return x44.r(this.a, claudeApiError$UnknownPermissionError.a) && this.b == claudeApiError$UnknownPermissionError.b;
    }

    public final int hashCode() {
        return vb7.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return sq6.u("UnknownPermissionError(originalMessage=", this.a, this.b, ", httpCode=", ", originalTypeString=null)");
    }
}
