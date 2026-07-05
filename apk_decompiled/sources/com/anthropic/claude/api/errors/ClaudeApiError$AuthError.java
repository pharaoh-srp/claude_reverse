package com.anthropic.claude.api.errors;

import defpackage.bj3;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.vi3;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/anthropic/claude/api/errors/ClaudeApiError$AuthError", "Lbj3;", "Claude.api:result"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final /* data */ class ClaudeApiError$AuthError implements bj3 {
    public final vi3 a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final String f;
    public final String g;

    public ClaudeApiError$AuthError(vi3 vi3Var, String str, String str2, String str3, Integer num, String str4, String str5) {
        this.a = vi3Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = num;
        this.f = str4;
        this.g = str5;
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
        if (!(obj instanceof ClaudeApiError$AuthError)) {
            return false;
        }
        ClaudeApiError$AuthError claudeApiError$AuthError = (ClaudeApiError$AuthError) obj;
        return this.a == claudeApiError$AuthError.a && x44.r(this.b, claudeApiError$AuthError.b) && x44.r(this.c, claudeApiError$AuthError.c) && x44.r(this.d, claudeApiError$AuthError.d) && x44.r(this.e, claudeApiError$AuthError.e) && x44.r(this.f, claudeApiError$AuthError.f) && x44.r(this.g, claudeApiError$AuthError.g);
    }

    @Override // defpackage.bj3
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final vi3 getA() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthError(type=");
        sb.append(this.a);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(", originalTypeString=");
        kgh.u(sb, this.c, ", originalMessage=", this.d, ", httpCode=");
        sb.append(this.e);
        sb.append(", originalCode=");
        sb.append(this.f);
        sb.append(", originalResource=");
        return ij0.m(sb, this.g, ")");
    }

    public /* synthetic */ ClaudeApiError$AuthError() {
        this(vi3.I, null, null, null, null, null, null);
    }
}
