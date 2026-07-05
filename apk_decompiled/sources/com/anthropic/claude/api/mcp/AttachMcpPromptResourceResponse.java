package com.anthropic.claude.api.mcp;

import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.api.chat.MessageFile;
import defpackage.ew0;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.meb;
import defpackage.mq5;
import defpackage.onf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x11;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J4\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/mcp/AttachMcpPromptResourceResponse;", "", "", "Lcom/anthropic/claude/api/chat/MessageAttachment;", "attachments", "Lcom/anthropic/claude/api/chat/MessageFile;", "files", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/AttachMcpPromptResourceResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/api/mcp/AttachMcpPromptResourceResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAttachments", "getFiles", "Companion", "w11", "x11", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AttachMcpPromptResourceResponse {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final x11 Companion = new x11();
    private final List<MessageAttachment> attachments;
    private final List<MessageFile> files;

    static {
        ew0 ew0Var = new ew0(3);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, ew0Var), yb5.w(w1aVar, new ew0(4))};
    }

    public /* synthetic */ AttachMcpPromptResourceResponse(int i, List list, List list2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.attachments = null;
        } else {
            this.attachments = list;
        }
        if ((i & 2) == 0) {
            this.files = null;
        } else {
            this.files = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(meb.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(MessageFile.Companion.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AttachMcpPromptResourceResponse copy$default(AttachMcpPromptResourceResponse attachMcpPromptResourceResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = attachMcpPromptResourceResponse.attachments;
        }
        if ((i & 2) != 0) {
            list2 = attachMcpPromptResourceResponse.files;
        }
        return attachMcpPromptResourceResponse.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$api(AttachMcpPromptResourceResponse self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.attachments != null) {
            output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.attachments);
        }
        if (!output.E(serialDesc) && self.files == null) {
            return;
        }
        output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.files);
    }

    public final List<MessageAttachment> component1() {
        return this.attachments;
    }

    public final List<MessageFile> component2() {
        return this.files;
    }

    public final AttachMcpPromptResourceResponse copy(List<MessageAttachment> attachments, List<? extends MessageFile> files) {
        return new AttachMcpPromptResourceResponse(attachments, files);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachMcpPromptResourceResponse)) {
            return false;
        }
        AttachMcpPromptResourceResponse attachMcpPromptResourceResponse = (AttachMcpPromptResourceResponse) other;
        return x44.r(this.attachments, attachMcpPromptResourceResponse.attachments) && x44.r(this.files, attachMcpPromptResourceResponse.files);
    }

    public final List<MessageAttachment> getAttachments() {
        return this.attachments;
    }

    public final List<MessageFile> getFiles() {
        return this.files;
    }

    public int hashCode() {
        List<MessageAttachment> list = this.attachments;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<MessageFile> list2 = this.files;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "AttachMcpPromptResourceResponse(attachments=" + this.attachments + ", files=" + this.files + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachMcpPromptResourceResponse() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachMcpPromptResourceResponse(List<MessageAttachment> list, List<? extends MessageFile> list2) {
        this.attachments = list;
        this.files = list2;
    }

    public /* synthetic */ AttachMcpPromptResourceResponse(List list, List list2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
