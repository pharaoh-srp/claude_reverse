package com.anthropic.claude.api.chat.tool;

import defpackage.e1i;
import defpackage.f1i;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/ToolUseInput;", "", "", "partial_json", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/api/chat/tool/ToolUseInput;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPartial_json", "Companion", "e1i", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = f1i.class)
public final /* data */ class ToolUseInput {
    public static final int $stable = 0;
    public static final e1i Companion = new e1i();
    private final String partial_json;

    public ToolUseInput(String str) {
        str.getClass();
        this.partial_json = str;
    }

    public static /* synthetic */ ToolUseInput copy$default(ToolUseInput toolUseInput, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolUseInput.partial_json;
        }
        return toolUseInput.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPartial_json() {
        return this.partial_json;
    }

    public final ToolUseInput copy(String partial_json) {
        partial_json.getClass();
        return new ToolUseInput(partial_json);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ToolUseInput) && x44.r(this.partial_json, ((ToolUseInput) other).partial_json);
    }

    public final String getPartial_json() {
        return this.partial_json;
    }

    public int hashCode() {
        return this.partial_json.hashCode();
    }

    public String toString() {
        return ij0.j("ToolUseInput(partial_json=", this.partial_json, ")");
    }
}
