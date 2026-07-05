package com.anthropic.claude.api.chat.messages;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.s4j;
import defpackage.t4j;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/VoiceNoteDelta;", "Lcom/anthropic/claude/api/chat/messages/ContentBlockDelta;", "", "partial_text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/VoiceNoteDelta;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/api/chat/messages/VoiceNoteDelta;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPartial_text", "Companion", "s4j", "t4j", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceNoteDelta implements ContentBlockDelta {
    public static final int $stable = 0;
    public static final t4j Companion = new t4j();
    private final String partial_text;

    public /* synthetic */ VoiceNoteDelta(int i, String str, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.partial_text = str;
        } else {
            gvj.f(i, 1, s4j.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ VoiceNoteDelta copy$default(VoiceNoteDelta voiceNoteDelta, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceNoteDelta.partial_text;
        }
        return voiceNoteDelta.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPartial_text() {
        return this.partial_text;
    }

    public final VoiceNoteDelta copy(String partial_text) {
        partial_text.getClass();
        return new VoiceNoteDelta(partial_text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VoiceNoteDelta) && x44.r(this.partial_text, ((VoiceNoteDelta) other).partial_text);
    }

    public final String getPartial_text() {
        return this.partial_text;
    }

    public int hashCode() {
        return this.partial_text.hashCode();
    }

    public String toString() {
        return ij0.j("VoiceNoteDelta(partial_text=", this.partial_text, ")");
    }

    public VoiceNoteDelta(String str) {
        str.getClass();
        this.partial_text = str;
    }
}
