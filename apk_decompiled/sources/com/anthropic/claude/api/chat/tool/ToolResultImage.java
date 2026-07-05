package com.anthropic.claude.api.chat.tool;

import com.anthropic.claude.types.strings.FileId;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.oi7;
import defpackage.onf;
import defpackage.tyh;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/api/chat/tool/ToolResultImage;", "Lcom/anthropic/claude/api/chat/tool/ToolResultContent;", "Lcom/anthropic/claude/types/strings/FileId;", "file_uuid", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/ToolResultImage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-4Lkzfcw", "()Ljava/lang/String;", "component1", "copy-Zo75dqc", "(Ljava/lang/String;)Lcom/anthropic/claude/api/chat/tool/ToolResultImage;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFile_uuid-4Lkzfcw", "Companion", "syh", "tyh", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ToolResultImage implements ToolResultContent {
    public static final int $stable = 0;
    public static final tyh Companion = new tyh();
    private final String file_uuid;

    private /* synthetic */ ToolResultImage(int i, String str, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.file_uuid = null;
        } else {
            this.file_uuid = str;
        }
    }

    /* JADX INFO: renamed from: copy-Zo75dqc$default, reason: not valid java name */
    public static /* synthetic */ ToolResultImage m311copyZo75dqc$default(ToolResultImage toolResultImage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolResultImage.file_uuid;
        }
        return toolResultImage.m313copyZo75dqc(str);
    }

    public static final /* synthetic */ void write$Self$api(ToolResultImage self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.file_uuid == null) {
            return;
        }
        oi7 oi7Var = oi7.a;
        String str = self.file_uuid;
        output.B(serialDesc, 0, oi7Var, str != null ? FileId.m1014boximpl(str) : null);
    }

    /* JADX INFO: renamed from: component1-4Lkzfcw, reason: not valid java name and from getter */
    public final String getFile_uuid() {
        return this.file_uuid;
    }

    /* JADX INFO: renamed from: copy-Zo75dqc, reason: not valid java name */
    public final ToolResultImage m313copyZo75dqc(String file_uuid) {
        return new ToolResultImage(file_uuid, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.anthropic.claude.api.chat.tool.ToolResultImage
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.chat.tool.ToolResultImage r4 = (com.anthropic.claude.api.chat.tool.ToolResultImage) r4
            java.lang.String r3 = r3.file_uuid
            java.lang.String r4 = r4.file_uuid
            if (r3 != 0) goto L18
            if (r4 != 0) goto L16
            r3 = r0
            goto L1f
        L16:
            r3 = r2
            goto L1f
        L18:
            if (r4 != 0) goto L1b
            goto L16
        L1b:
            boolean r3 = com.anthropic.claude.types.strings.FileId.m1017equalsimpl0(r3, r4)
        L1f:
            if (r3 != 0) goto L22
            return r2
        L22:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.chat.tool.ToolResultImage.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getFile_uuid-4Lkzfcw, reason: not valid java name */
    public final String m314getFile_uuid4Lkzfcw() {
        return this.file_uuid;
    }

    public int hashCode() {
        String str = this.file_uuid;
        if (str == null) {
            return 0;
        }
        return FileId.m1018hashCodeimpl(str);
    }

    public String toString() {
        String str = this.file_uuid;
        return ij0.j("ToolResultImage(file_uuid=", str == null ? "null" : FileId.m1019toStringimpl(str), ")");
    }

    public /* synthetic */ ToolResultImage(String str, mq5 mq5Var) {
        this(str);
    }

    public /* synthetic */ ToolResultImage(int i, String str, vnf vnfVar, mq5 mq5Var) {
        this(i, str, vnfVar);
    }

    private ToolResultImage(String str) {
        this.file_uuid = str;
    }

    public /* synthetic */ ToolResultImage(String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, null);
    }
}
