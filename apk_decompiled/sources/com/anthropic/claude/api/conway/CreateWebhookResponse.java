package com.anthropic.claude.api.conway;

import defpackage.f95;
import defpackage.g95;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JH\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u00060"}, d2 = {"Lcom/anthropic/claude/api/conway/CreateWebhookResponse;", "", "", "token", "url", "auth_type", "secret_header", "signing_secret", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/conway/CreateWebhookResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/conway/CreateWebhookResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToken", "getUrl", "getAuth_type", "getSecret_header", "getSigning_secret", "Companion", "f95", "g95", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CreateWebhookResponse {
    public static final int $stable = 0;
    public static final g95 Companion = new g95();
    private final String auth_type;
    private final String secret_header;
    private final String signing_secret;
    private final String token;
    private final String url;

    public /* synthetic */ CreateWebhookResponse(int i, String str, String str2, String str3, String str4, String str5, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, f95.a.getDescriptor());
            throw null;
        }
        this.token = str;
        this.url = str2;
        if ((i & 4) == 0) {
            this.auth_type = null;
        } else {
            this.auth_type = str3;
        }
        if ((i & 8) == 0) {
            this.secret_header = null;
        } else {
            this.secret_header = str4;
        }
        if ((i & 16) == 0) {
            this.signing_secret = null;
        } else {
            this.signing_secret = str5;
        }
    }

    public static /* synthetic */ CreateWebhookResponse copy$default(CreateWebhookResponse createWebhookResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createWebhookResponse.token;
        }
        if ((i & 2) != 0) {
            str2 = createWebhookResponse.url;
        }
        if ((i & 4) != 0) {
            str3 = createWebhookResponse.auth_type;
        }
        if ((i & 8) != 0) {
            str4 = createWebhookResponse.secret_header;
        }
        if ((i & 16) != 0) {
            str5 = createWebhookResponse.signing_secret;
        }
        String str6 = str5;
        String str7 = str3;
        return createWebhookResponse.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$api(CreateWebhookResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.token);
        output.q(serialDesc, 1, self.url);
        if (output.E(serialDesc) || self.auth_type != null) {
            output.B(serialDesc, 2, srg.a, self.auth_type);
        }
        if (output.E(serialDesc) || self.secret_header != null) {
            output.B(serialDesc, 3, srg.a, self.secret_header);
        }
        if (!output.E(serialDesc) && self.signing_secret == null) {
            return;
        }
        output.B(serialDesc, 4, srg.a, self.signing_secret);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuth_type() {
        return this.auth_type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSecret_header() {
        return this.secret_header;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSigning_secret() {
        return this.signing_secret;
    }

    public final CreateWebhookResponse copy(String token, String url, String auth_type, String secret_header, String signing_secret) {
        token.getClass();
        url.getClass();
        return new CreateWebhookResponse(token, url, auth_type, secret_header, signing_secret);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateWebhookResponse)) {
            return false;
        }
        CreateWebhookResponse createWebhookResponse = (CreateWebhookResponse) other;
        return x44.r(this.token, createWebhookResponse.token) && x44.r(this.url, createWebhookResponse.url) && x44.r(this.auth_type, createWebhookResponse.auth_type) && x44.r(this.secret_header, createWebhookResponse.secret_header) && x44.r(this.signing_secret, createWebhookResponse.signing_secret);
    }

    public final String getAuth_type() {
        return this.auth_type;
    }

    public final String getSecret_header() {
        return this.secret_header;
    }

    public final String getSigning_secret() {
        return this.signing_secret;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iL = kgh.l(this.token.hashCode() * 31, 31, this.url);
        String str = this.auth_type;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secret_header;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.signing_secret;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.token;
        String str2 = this.url;
        String str3 = this.auth_type;
        String str4 = this.secret_header;
        String str5 = this.signing_secret;
        StringBuilder sbR = kgh.r("CreateWebhookResponse(token=", str, ", url=", str2, ", auth_type=");
        kgh.u(sbR, str3, ", secret_header=", str4, ", signing_secret=");
        return ij0.m(sbR, str5, ")");
    }

    public CreateWebhookResponse(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        this.token = str;
        this.url = str2;
        this.auth_type = str3;
        this.secret_header = str4;
        this.signing_secret = str5;
    }

    public /* synthetic */ CreateWebhookResponse(String str, String str2, String str3, String str4, String str5, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
