package com.anthropic.claude.api.conway;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uii;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b+\u0010\u001b¨\u0006/"}, d2 = {"Lcom/anthropic/claude/api/conway/UpdateWebhookRequest;", "", "", "enabled", "", "label", "auth_type", "secret_header", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/conway/UpdateWebhookRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/conway/UpdateWebhookRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getEnabled", "Ljava/lang/String;", "getLabel", "getAuth_type", "getSecret_header", "Companion", "tii", "uii", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UpdateWebhookRequest {
    public static final int $stable = 0;
    public static final uii Companion = new uii();
    private final String auth_type;
    private final Boolean enabled;
    private final String label;
    private final String secret_header;

    public /* synthetic */ UpdateWebhookRequest(int i, Boolean bool, String str, String str2, String str3, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.enabled = null;
        } else {
            this.enabled = bool;
        }
        if ((i & 2) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        if ((i & 4) == 0) {
            this.auth_type = null;
        } else {
            this.auth_type = str2;
        }
        if ((i & 8) == 0) {
            this.secret_header = null;
        } else {
            this.secret_header = str3;
        }
    }

    public static /* synthetic */ UpdateWebhookRequest copy$default(UpdateWebhookRequest updateWebhookRequest, Boolean bool, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = updateWebhookRequest.enabled;
        }
        if ((i & 2) != 0) {
            str = updateWebhookRequest.label;
        }
        if ((i & 4) != 0) {
            str2 = updateWebhookRequest.auth_type;
        }
        if ((i & 8) != 0) {
            str3 = updateWebhookRequest.secret_header;
        }
        return updateWebhookRequest.copy(bool, str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$api(UpdateWebhookRequest self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.enabled != null) {
            output.B(serialDesc, 0, zt1.a, self.enabled);
        }
        if (output.E(serialDesc) || self.label != null) {
            output.B(serialDesc, 1, srg.a, self.label);
        }
        if (output.E(serialDesc) || self.auth_type != null) {
            output.B(serialDesc, 2, srg.a, self.auth_type);
        }
        if (!output.E(serialDesc) && self.secret_header == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.secret_header);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuth_type() {
        return this.auth_type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSecret_header() {
        return this.secret_header;
    }

    public final UpdateWebhookRequest copy(Boolean enabled, String label, String auth_type, String secret_header) {
        return new UpdateWebhookRequest(enabled, label, auth_type, secret_header);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateWebhookRequest)) {
            return false;
        }
        UpdateWebhookRequest updateWebhookRequest = (UpdateWebhookRequest) other;
        return x44.r(this.enabled, updateWebhookRequest.enabled) && x44.r(this.label, updateWebhookRequest.label) && x44.r(this.auth_type, updateWebhookRequest.auth_type) && x44.r(this.secret_header, updateWebhookRequest.secret_header);
    }

    public final String getAuth_type() {
        return this.auth_type;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSecret_header() {
        return this.secret_header;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.auth_type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secret_header;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.enabled;
        String str = this.label;
        String str2 = this.auth_type;
        String str3 = this.secret_header;
        StringBuilder sb = new StringBuilder("UpdateWebhookRequest(enabled=");
        sb.append(bool);
        sb.append(", label=");
        sb.append(str);
        sb.append(", auth_type=");
        return vb7.t(sb, str2, ", secret_header=", str3, ")");
    }

    public UpdateWebhookRequest() {
        this((Boolean) null, (String) null, (String) null, (String) null, 15, (mq5) null);
    }

    public UpdateWebhookRequest(Boolean bool, String str, String str2, String str3) {
        this.enabled = bool;
        this.label = str;
        this.auth_type = str2;
        this.secret_header = str3;
    }

    public /* synthetic */ UpdateWebhookRequest(Boolean bool, String str, String str2, String str3, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
