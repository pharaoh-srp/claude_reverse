package com.anthropic.claude.api.errors;

import defpackage.bj3;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.x44;
import defpackage.yi3;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/anthropic/claude/api/errors/ClaudeApiError$InvalidRequestError", "Lbj3;", "Claude.api:result"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final /* data */ class ClaudeApiError$InvalidRequestError implements bj3 {
    public final yi3 a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final String f;

    public ClaudeApiError$InvalidRequestError(yi3 yi3Var, String str, String str2, String str3, Integer num, String str4) {
        this.a = yi3Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = num;
        this.f = str4;
    }

    @Override // defpackage.bj3
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getA() {
        return this.f;
    }

    @Override // defpackage.bj3
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getC() {
        return this.e;
    }

    @Override // defpackage.bj3
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getD() {
        return this.c;
    }

    @Override // defpackage.bj3
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getA() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaudeApiError$InvalidRequestError)) {
            return false;
        }
        ClaudeApiError$InvalidRequestError claudeApiError$InvalidRequestError = (ClaudeApiError$InvalidRequestError) obj;
        return this.a == claudeApiError$InvalidRequestError.a && x44.r(this.b, claudeApiError$InvalidRequestError.b) && this.c.equals(claudeApiError$InvalidRequestError.c) && this.d.equals(claudeApiError$InvalidRequestError.d) && this.e.equals(claudeApiError$InvalidRequestError.e) && x44.r(this.f, claudeApiError$InvalidRequestError.f);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final yi3 getA() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.e.hashCode() + kgh.l(kgh.l((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d)) * 31;
        String str2 = this.f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvalidRequestError(type=");
        sb.append(this.a);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(", originalTypeString=");
        kgh.u(sb, this.c, ", originalMessage=", this.d, ", httpCode=");
        sb.append(this.e);
        sb.append(", originalCode=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
