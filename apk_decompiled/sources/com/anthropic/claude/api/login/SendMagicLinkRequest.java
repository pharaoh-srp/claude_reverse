package com.anthropic.claude.api.login;

import com.anthropic.claude.types.strings.EmailAddress;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ok6;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wkf;
import defpackage.x44;
import defpackage.xkf;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJX\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u001cJ\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010!J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b1\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b4\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b5\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b6\u0010\u001c¨\u0006:"}, d2 = {"Lcom/anthropic/claude/api/login/SendMagicLinkRequest;", "", "Lcom/anthropic/claude/types/strings/EmailAddress;", "email_address", "", "recaptcha_token", "recaptcha_site_key", "", "utc_offset", "source", "client", "login_intent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/login/SendMagicLinkRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-ZiuLfiY", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()I", "component5", "component6", "component7", "copy-4SpFqtY", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/login/SendMagicLinkRequest;", "copy", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmail_address-ZiuLfiY", "getRecaptcha_token", "getRecaptcha_site_key", "I", "getUtc_offset", "getSource", "getClient", "getLogin_intent", "Companion", "wkf", "xkf", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SendMagicLinkRequest {
    public static final int $stable = 0;
    public static final xkf Companion = new xkf();
    private final String client;
    private final String email_address;
    private final String login_intent;
    private final String recaptcha_site_key;
    private final String recaptcha_token;
    private final String source;
    private final int utc_offset;

    private /* synthetic */ SendMagicLinkRequest(int i, String str, String str2, String str3, int i2, String str4, String str5, String str6, vnf vnfVar) {
        if (9 != (i & 9)) {
            gvj.f(i, 9, wkf.a.getDescriptor());
            throw null;
        }
        this.email_address = str;
        if ((i & 2) == 0) {
            this.recaptcha_token = "xxx";
        } else {
            this.recaptcha_token = str2;
        }
        if ((i & 4) == 0) {
            this.recaptcha_site_key = "xxx";
        } else {
            this.recaptcha_site_key = str3;
        }
        this.utc_offset = i2;
        if ((i & 16) == 0) {
            this.source = "claude";
        } else {
            this.source = str4;
        }
        if ((i & 32) == 0) {
            this.client = "android";
        } else {
            this.client = str5;
        }
        if ((i & 64) == 0) {
            this.login_intent = null;
        } else {
            this.login_intent = str6;
        }
    }

    /* JADX INFO: renamed from: copy-4SpFqtY$default, reason: not valid java name */
    public static /* synthetic */ SendMagicLinkRequest m315copy4SpFqtY$default(SendMagicLinkRequest sendMagicLinkRequest, String str, String str2, String str3, int i, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sendMagicLinkRequest.email_address;
        }
        if ((i2 & 2) != 0) {
            str2 = sendMagicLinkRequest.recaptcha_token;
        }
        if ((i2 & 4) != 0) {
            str3 = sendMagicLinkRequest.recaptcha_site_key;
        }
        if ((i2 & 8) != 0) {
            i = sendMagicLinkRequest.utc_offset;
        }
        if ((i2 & 16) != 0) {
            str4 = sendMagicLinkRequest.source;
        }
        if ((i2 & 32) != 0) {
            str5 = sendMagicLinkRequest.client;
        }
        if ((i2 & 64) != 0) {
            str6 = sendMagicLinkRequest.login_intent;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str3;
        return sendMagicLinkRequest.m317copy4SpFqtY(str, str2, str10, i, str9, str7, str8);
    }

    public static final /* synthetic */ void write$Self$api(SendMagicLinkRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, ok6.a, EmailAddress.m1006boximpl(self.email_address));
        if (output.E(serialDesc) || !x44.r(self.recaptcha_token, "xxx")) {
            output.q(serialDesc, 1, self.recaptcha_token);
        }
        if (output.E(serialDesc) || !x44.r(self.recaptcha_site_key, "xxx")) {
            output.q(serialDesc, 2, self.recaptcha_site_key);
        }
        output.l(3, self.utc_offset, serialDesc);
        if (output.E(serialDesc) || !x44.r(self.source, "claude")) {
            output.q(serialDesc, 4, self.source);
        }
        if (output.E(serialDesc) || !x44.r(self.client, "android")) {
            output.q(serialDesc, 5, self.client);
        }
        if (!output.E(serialDesc) && self.login_intent == null) {
            return;
        }
        output.B(serialDesc, 6, srg.a, self.login_intent);
    }

    /* JADX INFO: renamed from: component1-ZiuLfiY, reason: not valid java name and from getter */
    public final String getEmail_address() {
        return this.email_address;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRecaptcha_token() {
        return this.recaptcha_token;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRecaptcha_site_key() {
        return this.recaptcha_site_key;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUtc_offset() {
        return this.utc_offset;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getClient() {
        return this.client;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLogin_intent() {
        return this.login_intent;
    }

    /* JADX INFO: renamed from: copy-4SpFqtY, reason: not valid java name */
    public final SendMagicLinkRequest m317copy4SpFqtY(String email_address, String recaptcha_token, String recaptcha_site_key, int utc_offset, String source, String client, String login_intent) {
        email_address.getClass();
        recaptcha_token.getClass();
        recaptcha_site_key.getClass();
        source.getClass();
        client.getClass();
        return new SendMagicLinkRequest(email_address, recaptcha_token, recaptcha_site_key, utc_offset, source, client, login_intent, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendMagicLinkRequest)) {
            return false;
        }
        SendMagicLinkRequest sendMagicLinkRequest = (SendMagicLinkRequest) other;
        return EmailAddress.m1009equalsimpl0(this.email_address, sendMagicLinkRequest.email_address) && x44.r(this.recaptcha_token, sendMagicLinkRequest.recaptcha_token) && x44.r(this.recaptcha_site_key, sendMagicLinkRequest.recaptcha_site_key) && this.utc_offset == sendMagicLinkRequest.utc_offset && x44.r(this.source, sendMagicLinkRequest.source) && x44.r(this.client, sendMagicLinkRequest.client) && x44.r(this.login_intent, sendMagicLinkRequest.login_intent);
    }

    public final String getClient() {
        return this.client;
    }

    /* JADX INFO: renamed from: getEmail_address-ZiuLfiY, reason: not valid java name */
    public final String m318getEmail_addressZiuLfiY() {
        return this.email_address;
    }

    public final String getLogin_intent() {
        return this.login_intent;
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

    public final int getUtc_offset() {
        return this.utc_offset;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l(vb7.c(this.utc_offset, kgh.l(kgh.l(EmailAddress.m1010hashCodeimpl(this.email_address) * 31, 31, this.recaptcha_token), 31, this.recaptcha_site_key), 31), 31, this.source), 31, this.client);
        String str = this.login_intent;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String strM1012toStringimpl = EmailAddress.m1012toStringimpl(this.email_address);
        String str = this.recaptcha_token;
        String str2 = this.recaptcha_site_key;
        int i = this.utc_offset;
        String str3 = this.source;
        String str4 = this.client;
        String str5 = this.login_intent;
        StringBuilder sbR = kgh.r("SendMagicLinkRequest(email_address=", strM1012toStringimpl, ", recaptcha_token=", str, ", recaptcha_site_key=");
        sbR.append(str2);
        sbR.append(", utc_offset=");
        sbR.append(i);
        sbR.append(", source=");
        kgh.u(sbR, str3, ", client=", str4, ", login_intent=");
        return ij0.m(sbR, str5, ")");
    }

    private SendMagicLinkRequest(String str, String str2, String str3, int i, String str4, String str5, String str6) {
        y6a.s(str, str2, str3, str4, str5);
        this.email_address = str;
        this.recaptcha_token = str2;
        this.recaptcha_site_key = str3;
        this.utc_offset = i;
        this.source = str4;
        this.client = str5;
        this.login_intent = str6;
    }

    public /* synthetic */ SendMagicLinkRequest(String str, String str2, String str3, int i, String str4, String str5, String str6, mq5 mq5Var) {
        this(str, str2, str3, i, str4, str5, str6);
    }

    public /* synthetic */ SendMagicLinkRequest(int i, String str, String str2, String str3, int i2, String str4, String str5, String str6, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, i2, str4, str5, str6, vnfVar);
    }

    public /* synthetic */ SendMagicLinkRequest(String str, String str2, String str3, int i, String str4, String str5, String str6, int i2, mq5 mq5Var) {
        this(str, (i2 & 2) != 0 ? "xxx" : str2, (i2 & 4) != 0 ? "xxx" : str3, i, (i2 & 16) != 0 ? "claude" : str4, (i2 & 32) != 0 ? "android" : str5, (i2 & 64) != 0 ? null : str6, null);
    }
}
