package com.anthropic.claude.api.errors;

import com.anthropic.claude.api.common.RateLimit;
import defpackage.aj3;
import defpackage.bj3;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"com/anthropic/claude/api/errors/ClaudeApiError$RateLimitApiError", "Lbj3;", "aj3", "Claude.api:result"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final /* data */ class ClaudeApiError$RateLimitApiError implements bj3 {
    public final String a;
    public final RateLimit b;
    public final aj3 c;
    public final String d;
    public final String e;
    public final Integer f;
    public final String g;

    public ClaudeApiError$RateLimitApiError(String str, RateLimit rateLimit, aj3 aj3Var, String str2, String str3, Integer num, String str4) {
        this.a = str;
        this.b = rateLimit;
        this.c = aj3Var;
        this.d = str2;
        this.e = str3;
        this.f = num;
        this.g = str4;
    }

    @Override // defpackage.bj3
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF() {
        return this.g;
    }

    @Override // defpackage.bj3
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getE() {
        return this.f;
    }

    @Override // defpackage.bj3
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getC() {
        return this.d;
    }

    @Override // defpackage.bj3
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getD() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaudeApiError$RateLimitApiError)) {
            return false;
        }
        ClaudeApiError$RateLimitApiError claudeApiError$RateLimitApiError = (ClaudeApiError$RateLimitApiError) obj;
        return x44.r(this.a, claudeApiError$RateLimitApiError.a) && x44.r(this.b, claudeApiError$RateLimitApiError.b) && x44.r(this.c, claudeApiError$RateLimitApiError.c) && x44.r(this.d, claudeApiError$RateLimitApiError.d) && x44.r(this.e, claudeApiError$RateLimitApiError.e) && x44.r(this.f, claudeApiError$RateLimitApiError.f) && x44.r(this.g, claudeApiError$RateLimitApiError.g);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final aj3 getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RateLimit rateLimit = this.b;
        int iHashCode2 = (iHashCode + (rateLimit == null ? 0 : rateLimit.hashCode())) * 31;
        aj3 aj3Var = this.c;
        int iHashCode3 = (iHashCode2 + (aj3Var == null ? 0 : aj3Var.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RateLimitApiError(message=");
        sb.append(this.a);
        sb.append(", rateLimit=");
        sb.append(this.b);
        sb.append(", creditsRequired=");
        sb.append(this.c);
        sb.append(", originalTypeString=");
        sb.append(this.d);
        sb.append(", originalMessage=");
        sb.append(this.e);
        sb.append(", httpCode=");
        sb.append(this.f);
        sb.append(", originalCode=");
        return ij0.m(sb, this.g, ")");
    }
}
