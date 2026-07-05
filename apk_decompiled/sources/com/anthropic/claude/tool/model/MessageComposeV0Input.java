package com.anthropic.claude.tool.model;

import com.anthropic.claude.api.login.VerifyResponse;
import defpackage.bfb;
import defpackage.cfb;
import defpackage.efb;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J<\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u00060"}, d2 = {"Lcom/anthropic/claude/tool/model/MessageComposeV0Input;", "", "", "body", "Lcom/anthropic/claude/tool/model/MessageComposeV0InputKind;", VerifyResponse.AuthenticationState.DISCRIMINATOR, "subject", "summary_title", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/tool/model/MessageComposeV0InputKind;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/tool/model/MessageComposeV0InputKind;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/MessageComposeV0Input;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/tool/model/MessageComposeV0InputKind;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/tool/model/MessageComposeV0InputKind;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/MessageComposeV0Input;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBody", "Lcom/anthropic/claude/tool/model/MessageComposeV0InputKind;", "getKind", "getSubject", "getSummary_title", "Companion", "bfb", "cfb", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageComposeV0Input {
    public static final cfb Companion = new cfb();
    private final String body;
    private final MessageComposeV0InputKind kind;
    private final String subject;
    private final String summary_title;

    public /* synthetic */ MessageComposeV0Input(int i, String str, MessageComposeV0InputKind messageComposeV0InputKind, String str2, String str3, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, bfb.a.getDescriptor());
            throw null;
        }
        this.body = str;
        this.kind = messageComposeV0InputKind;
        if ((i & 4) == 0) {
            this.subject = null;
        } else {
            this.subject = str2;
        }
        if ((i & 8) == 0) {
            this.summary_title = null;
        } else {
            this.summary_title = str3;
        }
    }

    public static /* synthetic */ MessageComposeV0Input copy$default(MessageComposeV0Input messageComposeV0Input, String str, MessageComposeV0InputKind messageComposeV0InputKind, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageComposeV0Input.body;
        }
        if ((i & 2) != 0) {
            messageComposeV0InputKind = messageComposeV0Input.kind;
        }
        if ((i & 4) != 0) {
            str2 = messageComposeV0Input.subject;
        }
        if ((i & 8) != 0) {
            str3 = messageComposeV0Input.summary_title;
        }
        return messageComposeV0Input.copy(str, messageComposeV0InputKind, str2, str3);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(MessageComposeV0Input self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.body);
        output.r(serialDesc, 1, efb.d, self.kind);
        if (output.E(serialDesc) || self.subject != null) {
            output.B(serialDesc, 2, srg.a, self.subject);
        }
        if (!output.E(serialDesc) && self.summary_title == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.summary_title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MessageComposeV0InputKind getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSummary_title() {
        return this.summary_title;
    }

    public final MessageComposeV0Input copy(String body, MessageComposeV0InputKind kind, String subject, String summary_title) {
        body.getClass();
        kind.getClass();
        return new MessageComposeV0Input(body, kind, subject, summary_title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageComposeV0Input)) {
            return false;
        }
        MessageComposeV0Input messageComposeV0Input = (MessageComposeV0Input) other;
        return x44.r(this.body, messageComposeV0Input.body) && this.kind == messageComposeV0Input.kind && x44.r(this.subject, messageComposeV0Input.subject) && x44.r(this.summary_title, messageComposeV0Input.summary_title);
    }

    public final String getBody() {
        return this.body;
    }

    public final MessageComposeV0InputKind getKind() {
        return this.kind;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final String getSummary_title() {
        return this.summary_title;
    }

    public int hashCode() {
        int iHashCode = (this.kind.hashCode() + (this.body.hashCode() * 31)) * 31;
        String str = this.subject;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.summary_title;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.body;
        MessageComposeV0InputKind messageComposeV0InputKind = this.kind;
        String str2 = this.subject;
        String str3 = this.summary_title;
        StringBuilder sb = new StringBuilder("MessageComposeV0Input(body=");
        sb.append(str);
        sb.append(", kind=");
        sb.append(messageComposeV0InputKind);
        sb.append(", subject=");
        return vb7.t(sb, str2, ", summary_title=", str3, ")");
    }

    public MessageComposeV0Input(String str, MessageComposeV0InputKind messageComposeV0InputKind, String str2, String str3) {
        str.getClass();
        messageComposeV0InputKind.getClass();
        this.body = str;
        this.kind = messageComposeV0InputKind;
        this.subject = str2;
        this.summary_title = str3;
    }

    public /* synthetic */ MessageComposeV0Input(String str, MessageComposeV0InputKind messageComposeV0InputKind, String str2, String str3, int i, mq5 mq5Var) {
        this(str, messageComposeV0InputKind, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
