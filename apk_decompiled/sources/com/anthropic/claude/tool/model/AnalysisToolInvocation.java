package com.anthropic.claude.tool.model;

import com.anthropic.claude.types.strings.MessageId;
import defpackage.ehb;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sq6;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vw;
import defpackage.ww;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b\u0007\u0010\u001d¨\u0006."}, d2 = {"Lcom/anthropic/claude/tool/model/AnalysisToolInvocation;", "", "Lcom/anthropic/claude/types/strings/MessageId;", "messageId", "", "body", "", "isComplete", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/AnalysisToolInvocation;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-PStrttk", "()Ljava/lang/String;", "component1", "component2", "component3", "()Z", "copy--u6Mals", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/anthropic/claude/tool/model/AnalysisToolInvocation;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessageId-PStrttk", "getBody", "Z", "Companion", "vw", "ww", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AnalysisToolInvocation {
    public static final ww Companion = new ww();
    private final String body;
    private final boolean isComplete;
    private final String messageId;

    private /* synthetic */ AnalysisToolInvocation(int i, String str, String str2, boolean z, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, vw.a.getDescriptor());
            throw null;
        }
        this.messageId = str;
        this.body = str2;
        this.isComplete = z;
    }

    /* JADX INFO: renamed from: copy--u6Mals$default, reason: not valid java name */
    public static /* synthetic */ AnalysisToolInvocation m939copyu6Mals$default(AnalysisToolInvocation analysisToolInvocation, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = analysisToolInvocation.messageId;
        }
        if ((i & 2) != 0) {
            str2 = analysisToolInvocation.body;
        }
        if ((i & 4) != 0) {
            z = analysisToolInvocation.isComplete;
        }
        return analysisToolInvocation.m941copyu6Mals(str, str2, z);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(AnalysisToolInvocation self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, ehb.a, MessageId.m1051boximpl(self.messageId));
        output.q(serialDesc, 1, self.body);
        output.p(serialDesc, 2, self.isComplete);
    }

    /* JADX INFO: renamed from: component1-PStrttk, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    /* JADX INFO: renamed from: copy--u6Mals, reason: not valid java name */
    public final AnalysisToolInvocation m941copyu6Mals(String messageId, String body, boolean isComplete) {
        messageId.getClass();
        body.getClass();
        return new AnalysisToolInvocation(messageId, body, isComplete, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalysisToolInvocation)) {
            return false;
        }
        AnalysisToolInvocation analysisToolInvocation = (AnalysisToolInvocation) other;
        return MessageId.m1054equalsimpl0(this.messageId, analysisToolInvocation.messageId) && x44.r(this.body, analysisToolInvocation.body) && this.isComplete == analysisToolInvocation.isComplete;
    }

    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: getMessageId-PStrttk, reason: not valid java name */
    public final String m942getMessageIdPStrttk() {
        return this.messageId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isComplete) + kgh.l(MessageId.m1055hashCodeimpl(this.messageId) * 31, 31, this.body);
    }

    public final boolean isComplete() {
        return this.isComplete;
    }

    public String toString() {
        String strM1056toStringimpl = MessageId.m1056toStringimpl(this.messageId);
        String str = this.body;
        return sq6.v(")", kgh.r("AnalysisToolInvocation(messageId=", strM1056toStringimpl, ", body=", str, ", isComplete="), this.isComplete);
    }

    public /* synthetic */ AnalysisToolInvocation(String str, String str2, boolean z, mq5 mq5Var) {
        this(str, str2, z);
    }

    public /* synthetic */ AnalysisToolInvocation(int i, String str, String str2, boolean z, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, z, vnfVar);
    }

    private AnalysisToolInvocation(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.messageId = str;
        this.body = str2;
        this.isComplete = z;
    }
}
