package com.anthropic.claude.tool.model;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.jfb;
import defpackage.kfb;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J0\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lcom/anthropic/claude/tool/model/MessageComposeV1InputVariantsItem;", "", "", "body", "label", "subject", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/MessageComposeV1InputVariantsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/MessageComposeV1InputVariantsItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBody", "getLabel", "getSubject", "Companion", "jfb", "kfb", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageComposeV1InputVariantsItem {
    public static final kfb Companion = new kfb();
    private final String body;
    private final String label;
    private final String subject;

    public /* synthetic */ MessageComposeV1InputVariantsItem(int i, String str, String str2, String str3, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, jfb.a.getDescriptor());
            throw null;
        }
        this.body = str;
        this.label = str2;
        if ((i & 4) == 0) {
            this.subject = null;
        } else {
            this.subject = str3;
        }
    }

    public static /* synthetic */ MessageComposeV1InputVariantsItem copy$default(MessageComposeV1InputVariantsItem messageComposeV1InputVariantsItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageComposeV1InputVariantsItem.body;
        }
        if ((i & 2) != 0) {
            str2 = messageComposeV1InputVariantsItem.label;
        }
        if ((i & 4) != 0) {
            str3 = messageComposeV1InputVariantsItem.subject;
        }
        return messageComposeV1InputVariantsItem.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(MessageComposeV1InputVariantsItem self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.body);
        output.q(serialDesc, 1, self.label);
        if (!output.E(serialDesc) && self.subject == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.subject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    public final MessageComposeV1InputVariantsItem copy(String body, String label, String subject) {
        body.getClass();
        label.getClass();
        return new MessageComposeV1InputVariantsItem(body, label, subject);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageComposeV1InputVariantsItem)) {
            return false;
        }
        MessageComposeV1InputVariantsItem messageComposeV1InputVariantsItem = (MessageComposeV1InputVariantsItem) other;
        return x44.r(this.body, messageComposeV1InputVariantsItem.body) && x44.r(this.label, messageComposeV1InputVariantsItem.label) && x44.r(this.subject, messageComposeV1InputVariantsItem.subject);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSubject() {
        return this.subject;
    }

    public int hashCode() {
        int iL = kgh.l(this.body.hashCode() * 31, 31, this.label);
        String str = this.subject;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.body;
        String str2 = this.label;
        return ij0.m(kgh.r("MessageComposeV1InputVariantsItem(body=", str, ", label=", str2, ", subject="), this.subject, ")");
    }

    public MessageComposeV1InputVariantsItem(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.body = str;
        this.label = str2;
        this.subject = str3;
    }

    public /* synthetic */ MessageComposeV1InputVariantsItem(String str, String str2, String str3, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
