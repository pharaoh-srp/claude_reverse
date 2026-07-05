package com.anthropic.claude.api.login;

import defpackage.bti;
import defpackage.cti;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\\\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u001b¨\u00066"}, d2 = {"Lcom/anthropic/claude/api/login/VerifyGoogleMobileRequest;", "", "", "token", "join_token", "login_token", "recaptcha_token", "recaptcha_site_key", "play_integrity_token", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/login/VerifyGoogleMobileRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/login/VerifyGoogleMobileRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToken", "getJoin_token", "getLogin_token", "getRecaptcha_token", "getRecaptcha_site_key", "getPlay_integrity_token", "getSource", "Companion", "bti", "cti", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VerifyGoogleMobileRequest {
    public static final int $stable = 0;
    public static final cti Companion = new cti();
    private final String join_token;
    private final String login_token;
    private final String play_integrity_token;
    private final String recaptcha_site_key;
    private final String recaptcha_token;
    private final String source;
    private final String token;

    public /* synthetic */ VerifyGoogleMobileRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, vnf vnfVar) {
        if (57 != (i & 57)) {
            gvj.f(i, 57, bti.a.getDescriptor());
            throw null;
        }
        this.token = str;
        if ((i & 2) == 0) {
            this.join_token = null;
        } else {
            this.join_token = str2;
        }
        if ((i & 4) == 0) {
            this.login_token = null;
        } else {
            this.login_token = str3;
        }
        this.recaptcha_token = str4;
        this.recaptcha_site_key = str5;
        this.play_integrity_token = str6;
        if ((i & 64) == 0) {
            this.source = "claude";
        } else {
            this.source = str7;
        }
    }

    public static /* synthetic */ VerifyGoogleMobileRequest copy$default(VerifyGoogleMobileRequest verifyGoogleMobileRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyGoogleMobileRequest.token;
        }
        if ((i & 2) != 0) {
            str2 = verifyGoogleMobileRequest.join_token;
        }
        if ((i & 4) != 0) {
            str3 = verifyGoogleMobileRequest.login_token;
        }
        if ((i & 8) != 0) {
            str4 = verifyGoogleMobileRequest.recaptcha_token;
        }
        if ((i & 16) != 0) {
            str5 = verifyGoogleMobileRequest.recaptcha_site_key;
        }
        if ((i & 32) != 0) {
            str6 = verifyGoogleMobileRequest.play_integrity_token;
        }
        if ((i & 64) != 0) {
            str7 = verifyGoogleMobileRequest.source;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return verifyGoogleMobileRequest.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public static final /* synthetic */ void write$Self$api(VerifyGoogleMobileRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.token);
        if (output.E(serialDesc) || self.join_token != null) {
            output.B(serialDesc, 1, srg.a, self.join_token);
        }
        if (output.E(serialDesc) || self.login_token != null) {
            output.B(serialDesc, 2, srg.a, self.login_token);
        }
        output.q(serialDesc, 3, self.recaptcha_token);
        output.q(serialDesc, 4, self.recaptcha_site_key);
        output.B(serialDesc, 5, srg.a, self.play_integrity_token);
        if (!output.E(serialDesc) && x44.r(self.source, "claude")) {
            return;
        }
        output.q(serialDesc, 6, self.source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJoin_token() {
        return this.join_token;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLogin_token() {
        return this.login_token;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRecaptcha_token() {
        return this.recaptcha_token;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRecaptcha_site_key() {
        return this.recaptcha_site_key;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPlay_integrity_token() {
        return this.play_integrity_token;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final VerifyGoogleMobileRequest copy(String token, String join_token, String login_token, String recaptcha_token, String recaptcha_site_key, String play_integrity_token, String source) {
        token.getClass();
        recaptcha_token.getClass();
        recaptcha_site_key.getClass();
        source.getClass();
        return new VerifyGoogleMobileRequest(token, join_token, login_token, recaptcha_token, recaptcha_site_key, play_integrity_token, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyGoogleMobileRequest)) {
            return false;
        }
        VerifyGoogleMobileRequest verifyGoogleMobileRequest = (VerifyGoogleMobileRequest) other;
        return x44.r(this.token, verifyGoogleMobileRequest.token) && x44.r(this.join_token, verifyGoogleMobileRequest.join_token) && x44.r(this.login_token, verifyGoogleMobileRequest.login_token) && x44.r(this.recaptcha_token, verifyGoogleMobileRequest.recaptcha_token) && x44.r(this.recaptcha_site_key, verifyGoogleMobileRequest.recaptcha_site_key) && x44.r(this.play_integrity_token, verifyGoogleMobileRequest.play_integrity_token) && x44.r(this.source, verifyGoogleMobileRequest.source);
    }

    public final String getJoin_token() {
        return this.join_token;
    }

    public final String getLogin_token() {
        return this.login_token;
    }

    public final String getPlay_integrity_token() {
        return this.play_integrity_token;
    }

    public final String getRecaptcha_site_key() {
        return this.recaptcha_site_key;
    }

    public final String getRecaptcha_token() {
        return this.recaptcha_token;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int iHashCode = this.token.hashCode() * 31;
        String str = this.join_token;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.login_token;
        int iL = kgh.l(kgh.l((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.recaptcha_token), 31, this.recaptcha_site_key);
        String str3 = this.play_integrity_token;
        return this.source.hashCode() + ((iL + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.token;
        String str2 = this.join_token;
        String str3 = this.login_token;
        String str4 = this.recaptcha_token;
        String str5 = this.recaptcha_site_key;
        String str6 = this.play_integrity_token;
        String str7 = this.source;
        StringBuilder sbR = kgh.r("VerifyGoogleMobileRequest(token=", str, ", join_token=", str2, ", login_token=");
        kgh.u(sbR, str3, ", recaptcha_token=", str4, ", recaptcha_site_key=");
        kgh.u(sbR, str5, ", play_integrity_token=", str6, ", source=");
        return ij0.m(sbR, str7, ")");
    }

    public VerifyGoogleMobileRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        ij0.z(str, str4, str5, str7);
        this.token = str;
        this.join_token = str2;
        this.login_token = str3;
        this.recaptcha_token = str4;
        this.recaptcha_site_key = str5;
        this.play_integrity_token = str6;
        this.source = str7;
    }

    public /* synthetic */ VerifyGoogleMobileRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, str5, str6, (i & 64) != 0 ? "claude" : str7);
    }
}
