package com.anthropic.claude.api.chat;

import com.anthropic.claude.api.chat.tool.ToolResultContent;
import com.anthropic.claude.types.strings.ToolUseId;
import defpackage.c1i;
import defpackage.e9e;
import defpackage.f9e;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rod;
import defpackage.sq6;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ4\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b\b\u0010\u001f¨\u00062"}, d2 = {"Lcom/anthropic/claude/api/chat/RecordToolResultRequest;", "", "Lcom/anthropic/claude/types/strings/ToolUseId;", "tool_use_id", "", "Lcom/anthropic/claude/api/chat/tool/ToolResultContent;", "content", "", "is_error", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;ZLvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/RecordToolResultRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-ERU6ZeY", "()Ljava/lang/String;", "component1", "component2", "()Ljava/util/List;", "component3", "()Z", "copy-MnFjuC8", "(Ljava/lang/String;Ljava/util/List;Z)Lcom/anthropic/claude/api/chat/RecordToolResultRequest;", "copy", "", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTool_use_id-ERU6ZeY", "Ljava/util/List;", "getContent", "Z", "Companion", "e9e", "f9e", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RecordToolResultRequest {
    public static final int $stable = 0;
    private final List<ToolResultContent> content;
    private final boolean is_error;
    private final String tool_use_id;
    public static final f9e Companion = new f9e();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new rod(26)), null};

    private /* synthetic */ RecordToolResultRequest(int i, String str, List list, boolean z, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, e9e.a.getDescriptor());
            throw null;
        }
        this.tool_use_id = str;
        this.content = list;
        this.is_error = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(ToolResultContent.Companion.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-MnFjuC8$default, reason: not valid java name */
    public static /* synthetic */ RecordToolResultRequest m268copyMnFjuC8$default(RecordToolResultRequest recordToolResultRequest, String str, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recordToolResultRequest.tool_use_id;
        }
        if ((i & 2) != 0) {
            list = recordToolResultRequest.content;
        }
        if ((i & 4) != 0) {
            z = recordToolResultRequest.is_error;
        }
        return recordToolResultRequest.m270copyMnFjuC8(str, list, z);
    }

    public static final /* synthetic */ void write$Self$api(RecordToolResultRequest self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, c1i.a, ToolUseId.m1157boximpl(self.tool_use_id));
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.content);
        output.p(serialDesc, 2, self.is_error);
    }

    /* JADX INFO: renamed from: component1-ERU6ZeY, reason: not valid java name and from getter */
    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    public final List<ToolResultContent> component2() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIs_error() {
        return this.is_error;
    }

    /* JADX INFO: renamed from: copy-MnFjuC8, reason: not valid java name */
    public final RecordToolResultRequest m270copyMnFjuC8(String tool_use_id, List<? extends ToolResultContent> content, boolean is_error) {
        tool_use_id.getClass();
        content.getClass();
        return new RecordToolResultRequest(tool_use_id, content, is_error, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordToolResultRequest)) {
            return false;
        }
        RecordToolResultRequest recordToolResultRequest = (RecordToolResultRequest) other;
        return ToolUseId.m1160equalsimpl0(this.tool_use_id, recordToolResultRequest.tool_use_id) && x44.r(this.content, recordToolResultRequest.content) && this.is_error == recordToolResultRequest.is_error;
    }

    public final List<ToolResultContent> getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: getTool_use_id-ERU6ZeY, reason: not valid java name */
    public final String m271getTool_use_idERU6ZeY() {
        return this.tool_use_id;
    }

    public int hashCode() {
        return Boolean.hashCode(this.is_error) + kgh.m(ToolUseId.m1161hashCodeimpl(this.tool_use_id) * 31, 31, this.content);
    }

    public final boolean is_error() {
        return this.is_error;
    }

    public String toString() {
        String strM1162toStringimpl = ToolUseId.m1162toStringimpl(this.tool_use_id);
        List<ToolResultContent> list = this.content;
        boolean z = this.is_error;
        StringBuilder sb = new StringBuilder("RecordToolResultRequest(tool_use_id=");
        sb.append(strM1162toStringimpl);
        sb.append(", content=");
        sb.append(list);
        sb.append(", is_error=");
        return sq6.v(")", sb, z);
    }

    public /* synthetic */ RecordToolResultRequest(String str, List list, boolean z, mq5 mq5Var) {
        this(str, list, z);
    }

    public /* synthetic */ RecordToolResultRequest(int i, String str, List list, boolean z, vnf vnfVar, mq5 mq5Var) {
        this(i, str, list, z, vnfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RecordToolResultRequest(String str, List<? extends ToolResultContent> list, boolean z) {
        str.getClass();
        list.getClass();
        this.tool_use_id = str;
        this.content = list;
        this.is_error = z;
    }
}
