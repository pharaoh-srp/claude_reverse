package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ocf;
import defpackage.onf;
import defpackage.pcf;
import defpackage.ryh;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000 %2\u00020\u0001:\u0002&'B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b\t\u0010$¨\u0006("}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkToolResultContent;", "Lcom/anthropic/claude/sessions/types/SdkMessageContent;", "", "type", "tool_use_id", "", "Lcom/anthropic/claude/sessions/types/ToolResult;", "content", "", "is_error", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkToolResultContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getTool_use_id", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "getContent$annotations", "()V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Companion", "ocf", "pcf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkToolResultContent implements SdkMessageContent {
    public static final pcf Companion = new pcf();
    private final List<ToolResult> content;
    private final Boolean is_error;
    private final String tool_use_id;
    private final String type;

    public /* synthetic */ SdkToolResultContent(int i, String str, String str2, List list, Boolean bool, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, ocf.a.getDescriptor());
            throw null;
        }
        this.type = str;
        this.tool_use_id = str2;
        if ((i & 4) == 0) {
            this.content = lm6.E;
        } else {
            this.content = list;
        }
        if ((i & 8) == 0) {
            this.is_error = null;
        } else {
            this.is_error = bool;
        }
    }

    @onf(with = ryh.class)
    public static /* synthetic */ void getContent$annotations() {
    }

    public static final /* synthetic */ void write$Self$sessions(SdkToolResultContent self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.getType());
        output.q(serialDesc, 1, self.tool_use_id);
        if (output.E(serialDesc) || !x44.r(self.content, lm6.E)) {
            output.r(serialDesc, 2, ryh.a, self.content);
        }
        if (!output.E(serialDesc) && self.is_error == null) {
            return;
        }
        output.B(serialDesc, 3, zt1.a, self.is_error);
    }

    public final List<ToolResult> getContent() {
        return this.content;
    }

    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    @Override // com.anthropic.claude.sessions.types.SdkMessageContent
    public String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: is_error, reason: from getter */
    public final Boolean getIs_error() {
        return this.is_error;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SdkToolResultContent(String str, String str2, List<? extends ToolResult> list, Boolean bool) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.type = str;
        this.tool_use_id = str2;
        this.content = list;
        this.is_error = bool;
    }

    public /* synthetic */ SdkToolResultContent(String str, String str2, List list, Boolean bool, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? lm6.E : list, (i & 8) != 0 ? null : bool);
    }
}
