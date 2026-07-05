package com.anthropic.claude.api.conway;

import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wii;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/conway/UpdateWebhookResponse;", "", "", "signing_secret", "secret_header", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/conway/UpdateWebhookResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/conway/UpdateWebhookResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSigning_secret", "getSecret_header", "Companion", "vii", "wii", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UpdateWebhookResponse {
    public static final int $stable = 0;
    public static final wii Companion = new wii();
    private final String secret_header;
    private final String signing_secret;

    public /* synthetic */ UpdateWebhookResponse(int i, String str, String str2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.signing_secret = null;
        } else {
            this.signing_secret = str;
        }
        if ((i & 2) == 0) {
            this.secret_header = null;
        } else {
            this.secret_header = str2;
        }
    }

    public static /* synthetic */ UpdateWebhookResponse copy$default(UpdateWebhookResponse updateWebhookResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateWebhookResponse.signing_secret;
        }
        if ((i & 2) != 0) {
            str2 = updateWebhookResponse.secret_header;
        }
        return updateWebhookResponse.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$api(UpdateWebhookResponse self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.signing_secret != null) {
            output.B(serialDesc, 0, srg.a, self.signing_secret);
        }
        if (!output.E(serialDesc) && self.secret_header == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.secret_header);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSigning_secret() {
        return this.signing_secret;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSecret_header() {
        return this.secret_header;
    }

    public final UpdateWebhookResponse copy(String signing_secret, String secret_header) {
        return new UpdateWebhookResponse(signing_secret, secret_header);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateWebhookResponse)) {
            return false;
        }
        UpdateWebhookResponse updateWebhookResponse = (UpdateWebhookResponse) other;
        return x44.r(this.signing_secret, updateWebhookResponse.signing_secret) && x44.r(this.secret_header, updateWebhookResponse.secret_header);
    }

    public final String getSecret_header() {
        return this.secret_header;
    }

    public final String getSigning_secret() {
        return this.signing_secret;
    }

    public int hashCode() {
        String str = this.signing_secret;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secret_header;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return ij0.l("UpdateWebhookResponse(signing_secret=", this.signing_secret, ", secret_header=", this.secret_header, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateWebhookResponse() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public UpdateWebhookResponse(String str, String str2) {
        this.signing_secret = str;
        this.secret_header = str2;
    }

    public /* synthetic */ UpdateWebhookResponse(String str, String str2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
