package com.anthropic.claude.api.login;

import defpackage.fsh;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.ykf;
import defpackage.zkf;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J>\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010 ¨\u00064"}, d2 = {"Lcom/anthropic/claude/api/login/SendMagicLinkResponse;", "", "Lcom/anthropic/claude/api/login/CodeConfiguration;", "fallback_code_configuration", "", "sent", "", "sso_url", "magic_link_intent_available", "<init>", "(Lcom/anthropic/claude/api/login/CodeConfiguration;ZLjava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/login/CodeConfiguration;ZLjava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/login/SendMagicLinkResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/login/CodeConfiguration;", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Boolean;", "copy", "(Lcom/anthropic/claude/api/login/CodeConfiguration;ZLjava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/login/SendMagicLinkResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/login/CodeConfiguration;", "getFallback_code_configuration", "Z", "getSent", "Ljava/lang/String;", "getSso_url", "Ljava/lang/Boolean;", "getMagic_link_intent_available", "Companion", "ykf", "zkf", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SendMagicLinkResponse {
    public static final int $stable = 0;
    public static final zkf Companion = new zkf();
    private final CodeConfiguration fallback_code_configuration;
    private final Boolean magic_link_intent_available;
    private final boolean sent;
    private final String sso_url;

    public /* synthetic */ SendMagicLinkResponse(int i, CodeConfiguration codeConfiguration, boolean z, String str, Boolean bool, vnf vnfVar) {
        if (2 != (i & 2)) {
            gvj.f(i, 2, ykf.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.fallback_code_configuration = null;
        } else {
            this.fallback_code_configuration = codeConfiguration;
        }
        this.sent = z;
        if ((i & 4) == 0) {
            this.sso_url = null;
        } else {
            this.sso_url = str;
        }
        if ((i & 8) == 0) {
            this.magic_link_intent_available = null;
        } else {
            this.magic_link_intent_available = bool;
        }
    }

    public static /* synthetic */ SendMagicLinkResponse copy$default(SendMagicLinkResponse sendMagicLinkResponse, CodeConfiguration codeConfiguration, boolean z, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            codeConfiguration = sendMagicLinkResponse.fallback_code_configuration;
        }
        if ((i & 2) != 0) {
            z = sendMagicLinkResponse.sent;
        }
        if ((i & 4) != 0) {
            str = sendMagicLinkResponse.sso_url;
        }
        if ((i & 8) != 0) {
            bool = sendMagicLinkResponse.magic_link_intent_available;
        }
        return sendMagicLinkResponse.copy(codeConfiguration, z, str, bool);
    }

    public static final /* synthetic */ void write$Self$api(SendMagicLinkResponse self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.fallback_code_configuration != null) {
            output.B(serialDesc, 0, b.a, self.fallback_code_configuration);
        }
        output.p(serialDesc, 1, self.sent);
        if (output.E(serialDesc) || self.sso_url != null) {
            output.B(serialDesc, 2, srg.a, self.sso_url);
        }
        if (!output.E(serialDesc) && self.magic_link_intent_available == null) {
            return;
        }
        output.B(serialDesc, 3, zt1.a, self.magic_link_intent_available);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CodeConfiguration getFallback_code_configuration() {
        return this.fallback_code_configuration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSent() {
        return this.sent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSso_url() {
        return this.sso_url;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getMagic_link_intent_available() {
        return this.magic_link_intent_available;
    }

    public final SendMagicLinkResponse copy(CodeConfiguration fallback_code_configuration, boolean sent, String sso_url, Boolean magic_link_intent_available) {
        return new SendMagicLinkResponse(fallback_code_configuration, sent, sso_url, magic_link_intent_available);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendMagicLinkResponse)) {
            return false;
        }
        SendMagicLinkResponse sendMagicLinkResponse = (SendMagicLinkResponse) other;
        return x44.r(this.fallback_code_configuration, sendMagicLinkResponse.fallback_code_configuration) && this.sent == sendMagicLinkResponse.sent && x44.r(this.sso_url, sendMagicLinkResponse.sso_url) && x44.r(this.magic_link_intent_available, sendMagicLinkResponse.magic_link_intent_available);
    }

    public final CodeConfiguration getFallback_code_configuration() {
        return this.fallback_code_configuration;
    }

    public final Boolean getMagic_link_intent_available() {
        return this.magic_link_intent_available;
    }

    public final boolean getSent() {
        return this.sent;
    }

    public final String getSso_url() {
        return this.sso_url;
    }

    public int hashCode() {
        CodeConfiguration codeConfiguration = this.fallback_code_configuration;
        int iP = fsh.p((codeConfiguration == null ? 0 : codeConfiguration.hashCode()) * 31, 31, this.sent);
        String str = this.sso_url;
        int iHashCode = (iP + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.magic_link_intent_available;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "SendMagicLinkResponse(fallback_code_configuration=" + this.fallback_code_configuration + ", sent=" + this.sent + ", sso_url=" + this.sso_url + ", magic_link_intent_available=" + this.magic_link_intent_available + ")";
    }

    public SendMagicLinkResponse(CodeConfiguration codeConfiguration, boolean z, String str, Boolean bool) {
        this.fallback_code_configuration = codeConfiguration;
        this.sent = z;
        this.sso_url = str;
        this.magic_link_intent_available = bool;
    }

    public /* synthetic */ SendMagicLinkResponse(CodeConfiguration codeConfiguration, boolean z, String str, Boolean bool, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : codeConfiguration, z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bool);
    }
}
