package com.anthropic.claude.tool.model;

import com.anthropic.claude.api.login.VerifyResponse;
import defpackage.ffb;
import defpackage.gfb;
import defpackage.gid;
import defpackage.gvj;
import defpackage.ifb;
import defpackage.jfb;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rpa;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lcom/anthropic/claude/tool/model/MessageComposeV1Input;", "", "Lcom/anthropic/claude/tool/model/MessageComposeV1InputKind;", VerifyResponse.AuthenticationState.DISCRIMINATOR, "", "summary_title", "", "Lcom/anthropic/claude/tool/model/MessageComposeV1InputVariantsItem;", "variants", "<init>", "(Lcom/anthropic/claude/tool/model/MessageComposeV1InputKind;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/tool/model/MessageComposeV1InputKind;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/MessageComposeV1Input;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/tool/model/MessageComposeV1InputKind;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Lcom/anthropic/claude/tool/model/MessageComposeV1InputKind;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/tool/model/MessageComposeV1Input;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/tool/model/MessageComposeV1InputKind;", "getKind", "Ljava/lang/String;", "getSummary_title", "Ljava/util/List;", "getVariants", "Companion", "ffb", "gfb", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageComposeV1Input {
    private final MessageComposeV1InputKind kind;
    private final String summary_title;
    private final List<MessageComposeV1InputVariantsItem> variants;
    public static final gfb Companion = new gfb();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new rpa(19))};

    public /* synthetic */ MessageComposeV1Input(int i, MessageComposeV1InputKind messageComposeV1InputKind, String str, List list, vnf vnfVar) {
        if (5 != (i & 5)) {
            gvj.f(i, 5, ffb.a.getDescriptor());
            throw null;
        }
        this.kind = messageComposeV1InputKind;
        if ((i & 2) == 0) {
            this.summary_title = null;
        } else {
            this.summary_title = str;
        }
        this.variants = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(jfb.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageComposeV1Input copy$default(MessageComposeV1Input messageComposeV1Input, MessageComposeV1InputKind messageComposeV1InputKind, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            messageComposeV1InputKind = messageComposeV1Input.kind;
        }
        if ((i & 2) != 0) {
            str = messageComposeV1Input.summary_title;
        }
        if ((i & 4) != 0) {
            list = messageComposeV1Input.variants;
        }
        return messageComposeV1Input.copy(messageComposeV1InputKind, str, list);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(MessageComposeV1Input self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, ifb.d, self.kind);
        if (output.E(serialDesc) || self.summary_title != null) {
            output.B(serialDesc, 1, srg.a, self.summary_title);
        }
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.variants);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessageComposeV1InputKind getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSummary_title() {
        return this.summary_title;
    }

    public final List<MessageComposeV1InputVariantsItem> component3() {
        return this.variants;
    }

    public final MessageComposeV1Input copy(MessageComposeV1InputKind kind, String summary_title, List<MessageComposeV1InputVariantsItem> variants) {
        kind.getClass();
        variants.getClass();
        return new MessageComposeV1Input(kind, summary_title, variants);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageComposeV1Input)) {
            return false;
        }
        MessageComposeV1Input messageComposeV1Input = (MessageComposeV1Input) other;
        return this.kind == messageComposeV1Input.kind && x44.r(this.summary_title, messageComposeV1Input.summary_title) && x44.r(this.variants, messageComposeV1Input.variants);
    }

    public final MessageComposeV1InputKind getKind() {
        return this.kind;
    }

    public final String getSummary_title() {
        return this.summary_title;
    }

    public final List<MessageComposeV1InputVariantsItem> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        int iHashCode = this.kind.hashCode() * 31;
        String str = this.summary_title;
        return this.variants.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        MessageComposeV1InputKind messageComposeV1InputKind = this.kind;
        String str = this.summary_title;
        List<MessageComposeV1InputVariantsItem> list = this.variants;
        StringBuilder sb = new StringBuilder("MessageComposeV1Input(kind=");
        sb.append(messageComposeV1InputKind);
        sb.append(", summary_title=");
        sb.append(str);
        sb.append(", variants=");
        return gid.q(sb, list, ")");
    }

    public MessageComposeV1Input(MessageComposeV1InputKind messageComposeV1InputKind, String str, List<MessageComposeV1InputVariantsItem> list) {
        messageComposeV1InputKind.getClass();
        list.getClass();
        this.kind = messageComposeV1InputKind;
        this.summary_title = str;
        this.variants = list;
    }

    public /* synthetic */ MessageComposeV1Input(MessageComposeV1InputKind messageComposeV1InputKind, String str, List list, int i, mq5 mq5Var) {
        this(messageComposeV1InputKind, (i & 2) != 0 ? null : str, list);
    }
}
