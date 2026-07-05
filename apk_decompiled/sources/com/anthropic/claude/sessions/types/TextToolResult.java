package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.ukh;
import defpackage.vd4;
import defpackage.vkh;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bB\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/anthropic/claude/sessions/types/TextToolResult;", "Lcom/anthropic/claude/sessions/types/ToolResult;", "", "type", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/TextToolResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getText", "Companion", "ukh", "vkh", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class TextToolResult implements ToolResult {
    public static final vkh Companion = new vkh();
    private final String text;
    private final String type;

    public /* synthetic */ TextToolResult(int i, String str, String str2, vnf vnfVar) {
        if (2 != (i & 2)) {
            gvj.f(i, 2, ukh.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.type = "text";
        } else {
            this.type = str;
        }
        this.text = str2;
    }

    public static final /* synthetic */ void write$Self$sessions(TextToolResult self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.getType(), "text")) {
            output.q(serialDesc, 0, self.getType());
        }
        output.q(serialDesc, 1, self.text);
    }

    public final String getText() {
        return this.text;
    }

    @Override // com.anthropic.claude.sessions.types.ToolResult
    public String getType() {
        return this.type;
    }

    public TextToolResult(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.type = str;
        this.text = str2;
    }

    public /* synthetic */ TextToolResult(String str, String str2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "text" : str, str2);
    }
}
