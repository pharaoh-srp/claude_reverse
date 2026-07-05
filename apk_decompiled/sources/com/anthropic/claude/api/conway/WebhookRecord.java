package com.anthropic.claude.api.conway;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.fsh;
import defpackage.gid;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.p8j;
import defpackage.q8j;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBi\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJd\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b6\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b7\u0010\u001d¨\u0006;"}, d2 = {"Lcom/anthropic/claude/api/conway/WebhookRecord;", "", "", "token", "url", "trigger_word", "label", "created_at", "", "enabled", "auth_type", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/conway/WebhookRecord;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Z", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/conway/WebhookRecord;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToken", "getUrl", "getTrigger_word", "getLabel", "getCreated_at", "Z", "getEnabled", "getAuth_type", "getSource", "Companion", "p8j", "q8j", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class WebhookRecord {
    public static final int $stable = 0;
    public static final q8j Companion = new q8j();
    private final String auth_type;
    private final String created_at;
    private final boolean enabled;
    private final String label;
    private final String source;
    private final String token;
    private final String trigger_word;
    private final String url;

    public /* synthetic */ WebhookRecord(int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, p8j.a.getDescriptor());
            throw null;
        }
        this.token = str;
        this.url = str2;
        this.trigger_word = str3;
        this.label = str4;
        this.created_at = str5;
        this.enabled = z;
        if ((i & 64) == 0) {
            this.auth_type = null;
        } else {
            this.auth_type = str6;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.source = null;
        } else {
            this.source = str7;
        }
    }

    public static /* synthetic */ WebhookRecord copy$default(WebhookRecord webhookRecord, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webhookRecord.token;
        }
        if ((i & 2) != 0) {
            str2 = webhookRecord.url;
        }
        if ((i & 4) != 0) {
            str3 = webhookRecord.trigger_word;
        }
        if ((i & 8) != 0) {
            str4 = webhookRecord.label;
        }
        if ((i & 16) != 0) {
            str5 = webhookRecord.created_at;
        }
        if ((i & 32) != 0) {
            z = webhookRecord.enabled;
        }
        if ((i & 64) != 0) {
            str6 = webhookRecord.auth_type;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str7 = webhookRecord.source;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        boolean z2 = z;
        return webhookRecord.copy(str, str2, str3, str4, str10, z2, str8, str9);
    }

    public static final /* synthetic */ void write$Self$api(WebhookRecord self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.token);
        output.q(serialDesc, 1, self.url);
        output.q(serialDesc, 2, self.trigger_word);
        output.q(serialDesc, 3, self.label);
        output.q(serialDesc, 4, self.created_at);
        output.p(serialDesc, 5, self.enabled);
        if (output.E(serialDesc) || self.auth_type != null) {
            output.B(serialDesc, 6, srg.a, self.auth_type);
        }
        if (!output.E(serialDesc) && self.source == null) {
            return;
        }
        output.B(serialDesc, 7, srg.a, self.source);
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
    public final String getTrigger_word() {
        return this.trigger_word;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAuth_type() {
        return this.auth_type;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final WebhookRecord copy(String token, String url, String trigger_word, String label, String created_at, boolean enabled, String auth_type, String source) {
        token.getClass();
        url.getClass();
        trigger_word.getClass();
        label.getClass();
        created_at.getClass();
        return new WebhookRecord(token, url, trigger_word, label, created_at, enabled, auth_type, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebhookRecord)) {
            return false;
        }
        WebhookRecord webhookRecord = (WebhookRecord) other;
        return x44.r(this.token, webhookRecord.token) && x44.r(this.url, webhookRecord.url) && x44.r(this.trigger_word, webhookRecord.trigger_word) && x44.r(this.label, webhookRecord.label) && x44.r(this.created_at, webhookRecord.created_at) && this.enabled == webhookRecord.enabled && x44.r(this.auth_type, webhookRecord.auth_type) && x44.r(this.source, webhookRecord.source);
    }

    public final String getAuth_type() {
        return this.auth_type;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getTrigger_word() {
        return this.trigger_word;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iP = fsh.p(kgh.l(kgh.l(kgh.l(kgh.l(this.token.hashCode() * 31, 31, this.url), 31, this.trigger_word), 31, this.label), 31, this.created_at), 31, this.enabled);
        String str = this.auth_type;
        int iHashCode = (iP + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.token;
        String str2 = this.url;
        String str3 = this.trigger_word;
        String str4 = this.label;
        String str5 = this.created_at;
        boolean z = this.enabled;
        String str6 = this.auth_type;
        String str7 = this.source;
        StringBuilder sbR = kgh.r("WebhookRecord(token=", str, ", url=", str2, ", trigger_word=");
        kgh.u(sbR, str3, ", label=", str4, ", created_at=");
        gid.t(sbR, str5, ", enabled=", z, ", auth_type=");
        return vb7.t(sbR, str6, ", source=", str7, ")");
    }

    public WebhookRecord(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7) {
        y6a.s(str, str2, str3, str4, str5);
        this.token = str;
        this.url = str2;
        this.trigger_word = str3;
        this.label = str4;
        this.created_at = str5;
        this.enabled = z;
        this.auth_type = str6;
        this.source = str7;
    }

    public /* synthetic */ WebhookRecord(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i, mq5 mq5Var) {
        this(str, str2, str3, str4, str5, z, (i & 64) != 0 ? null : str6, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str7);
    }
}
