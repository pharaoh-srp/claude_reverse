package com.anthropic.claude.models.organization.configtypes;

import com.anthropic.claude.api.login.VerifyResponse;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.teb;
import defpackage.ueb;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u00060"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/MessageComposeInputDescriptions;", "", "", "tool_description", "body", VerifyResponse.AuthenticationState.DISCRIMINATOR, "subject", "summary_title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/MessageComposeInputDescriptions;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/MessageComposeInputDescriptions;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTool_description", "getBody", "getKind", "getSubject", "getSummary_title", "Companion", "teb", "ueb", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageComposeInputDescriptions {
    public static final int $stable = 0;
    public static final ueb Companion = new ueb();
    private final String body;
    private final String kind;
    private final String subject;
    private final String summary_title;
    private final String tool_description;

    public /* synthetic */ MessageComposeInputDescriptions(int i, String str, String str2, String str3, String str4, String str5, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, teb.a.getDescriptor());
            throw null;
        }
        this.tool_description = str;
        this.body = str2;
        this.kind = str3;
        this.subject = str4;
        this.summary_title = str5;
    }

    public static /* synthetic */ MessageComposeInputDescriptions copy$default(MessageComposeInputDescriptions messageComposeInputDescriptions, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageComposeInputDescriptions.tool_description;
        }
        if ((i & 2) != 0) {
            str2 = messageComposeInputDescriptions.body;
        }
        if ((i & 4) != 0) {
            str3 = messageComposeInputDescriptions.kind;
        }
        if ((i & 8) != 0) {
            str4 = messageComposeInputDescriptions.subject;
        }
        if ((i & 16) != 0) {
            str5 = messageComposeInputDescriptions.summary_title;
        }
        String str6 = str5;
        String str7 = str3;
        return messageComposeInputDescriptions.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$models(MessageComposeInputDescriptions self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.tool_description);
        output.q(serialDesc, 1, self.body);
        output.q(serialDesc, 2, self.kind);
        output.q(serialDesc, 3, self.subject);
        output.q(serialDesc, 4, self.summary_title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTool_description() {
        return this.tool_description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSummary_title() {
        return this.summary_title;
    }

    public final MessageComposeInputDescriptions copy(String tool_description, String body, String kind, String subject, String summary_title) {
        tool_description.getClass();
        body.getClass();
        kind.getClass();
        subject.getClass();
        summary_title.getClass();
        return new MessageComposeInputDescriptions(tool_description, body, kind, subject, summary_title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageComposeInputDescriptions)) {
            return false;
        }
        MessageComposeInputDescriptions messageComposeInputDescriptions = (MessageComposeInputDescriptions) other;
        return x44.r(this.tool_description, messageComposeInputDescriptions.tool_description) && x44.r(this.body, messageComposeInputDescriptions.body) && x44.r(this.kind, messageComposeInputDescriptions.kind) && x44.r(this.subject, messageComposeInputDescriptions.subject) && x44.r(this.summary_title, messageComposeInputDescriptions.summary_title);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final String getSummary_title() {
        return this.summary_title;
    }

    public final String getTool_description() {
        return this.tool_description;
    }

    public int hashCode() {
        return this.summary_title.hashCode() + kgh.l(kgh.l(kgh.l(this.tool_description.hashCode() * 31, 31, this.body), 31, this.kind), 31, this.subject);
    }

    public String toString() {
        String str = this.tool_description;
        String str2 = this.body;
        String str3 = this.kind;
        String str4 = this.subject;
        String str5 = this.summary_title;
        StringBuilder sbR = kgh.r("MessageComposeInputDescriptions(tool_description=", str, ", body=", str2, ", kind=");
        kgh.u(sbR, str3, ", subject=", str4, ", summary_title=");
        return ij0.m(sbR, str5, ")");
    }

    public MessageComposeInputDescriptions(String str, String str2, String str3, String str4, String str5) {
        y6a.s(str, str2, str3, str4, str5);
        this.tool_description = str;
        this.body = str2;
        this.kind = str3;
        this.subject = str4;
        this.summary_title = str5;
    }
}
