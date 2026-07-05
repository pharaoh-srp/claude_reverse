package com.anthropic.claude.api.errors;

import defpackage.bj3;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/anthropic/claude/api/errors/ClaudeApiError$ServerError", "Lbj3;", "Claude.api:result"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final /* data */ class ClaudeApiError$ServerError implements bj3 {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;

    public ClaudeApiError$ServerError(String str, String str2, String str3, String str4, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = str4;
    }

    @Override // defpackage.bj3
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.bj3
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getC() {
        return this.c;
    }

    @Override // defpackage.bj3
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // defpackage.bj3
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getE() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaudeApiError$ServerError)) {
            return false;
        }
        ClaudeApiError$ServerError claudeApiError$ServerError = (ClaudeApiError$ServerError) obj;
        return x44.r(this.a, claudeApiError$ServerError.a) && x44.r(this.b, claudeApiError$ServerError.b) && this.c.equals(claudeApiError$ServerError.c) && x44.r(this.d, claudeApiError$ServerError.d) && x44.r(this.e, claudeApiError$ServerError.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("ServerError(errorCode=", this.a, ", message=", this.b, ", httpCode=");
        sbR.append(this.c);
        sbR.append(", originalTypeString=");
        sbR.append(this.d);
        sbR.append(", originalMessage=");
        return ij0.m(sbR, this.e, ")");
    }
}
