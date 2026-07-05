package com.anthropic.claude.tool.model;

import defpackage.e79;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.k0d;
import defpackage.l0d;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.n0d;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006/"}, d2 = {"Lcom/anthropic/claude/tool/model/PhoneCallCompletedOutputTranscriptItem;", "", "", "relative_ms", "Lcom/anthropic/claude/tool/model/PhoneCallCompletedOutputTranscriptItemSpeaker;", "speaker", "", "text", "<init>", "(Ljava/lang/Integer;Lcom/anthropic/claude/tool/model/PhoneCallCompletedOutputTranscriptItemSpeaker;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lcom/anthropic/claude/tool/model/PhoneCallCompletedOutputTranscriptItemSpeaker;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/PhoneCallCompletedOutputTranscriptItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Lcom/anthropic/claude/tool/model/PhoneCallCompletedOutputTranscriptItemSpeaker;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Lcom/anthropic/claude/tool/model/PhoneCallCompletedOutputTranscriptItemSpeaker;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/PhoneCallCompletedOutputTranscriptItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getRelative_ms", "Lcom/anthropic/claude/tool/model/PhoneCallCompletedOutputTranscriptItemSpeaker;", "getSpeaker", "Ljava/lang/String;", "getText", "Companion", "k0d", "l0d", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PhoneCallCompletedOutputTranscriptItem {
    public static final l0d Companion = new l0d();
    private final Integer relative_ms;
    private final PhoneCallCompletedOutputTranscriptItemSpeaker speaker;
    private final String text;

    public /* synthetic */ PhoneCallCompletedOutputTranscriptItem(int i, Integer num, PhoneCallCompletedOutputTranscriptItemSpeaker phoneCallCompletedOutputTranscriptItemSpeaker, String str, vnf vnfVar) {
        if (6 != (i & 6)) {
            gvj.f(i, 6, k0d.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.relative_ms = null;
        } else {
            this.relative_ms = num;
        }
        this.speaker = phoneCallCompletedOutputTranscriptItemSpeaker;
        this.text = str;
    }

    public static /* synthetic */ PhoneCallCompletedOutputTranscriptItem copy$default(PhoneCallCompletedOutputTranscriptItem phoneCallCompletedOutputTranscriptItem, Integer num, PhoneCallCompletedOutputTranscriptItemSpeaker phoneCallCompletedOutputTranscriptItemSpeaker, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = phoneCallCompletedOutputTranscriptItem.relative_ms;
        }
        if ((i & 2) != 0) {
            phoneCallCompletedOutputTranscriptItemSpeaker = phoneCallCompletedOutputTranscriptItem.speaker;
        }
        if ((i & 4) != 0) {
            str = phoneCallCompletedOutputTranscriptItem.text;
        }
        return phoneCallCompletedOutputTranscriptItem.copy(num, phoneCallCompletedOutputTranscriptItemSpeaker, str);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(PhoneCallCompletedOutputTranscriptItem self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.relative_ms != null) {
            output.B(serialDesc, 0, e79.a, self.relative_ms);
        }
        output.r(serialDesc, 1, n0d.d, self.speaker);
        output.q(serialDesc, 2, self.text);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getRelative_ms() {
        return this.relative_ms;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PhoneCallCompletedOutputTranscriptItemSpeaker getSpeaker() {
        return this.speaker;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final PhoneCallCompletedOutputTranscriptItem copy(Integer relative_ms, PhoneCallCompletedOutputTranscriptItemSpeaker speaker, String text) {
        speaker.getClass();
        text.getClass();
        return new PhoneCallCompletedOutputTranscriptItem(relative_ms, speaker, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneCallCompletedOutputTranscriptItem)) {
            return false;
        }
        PhoneCallCompletedOutputTranscriptItem phoneCallCompletedOutputTranscriptItem = (PhoneCallCompletedOutputTranscriptItem) other;
        return x44.r(this.relative_ms, phoneCallCompletedOutputTranscriptItem.relative_ms) && this.speaker == phoneCallCompletedOutputTranscriptItem.speaker && x44.r(this.text, phoneCallCompletedOutputTranscriptItem.text);
    }

    public final Integer getRelative_ms() {
        return this.relative_ms;
    }

    public final PhoneCallCompletedOutputTranscriptItemSpeaker getSpeaker() {
        return this.speaker;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        Integer num = this.relative_ms;
        int iHashCode = num == null ? 0 : num.hashCode();
        return this.text.hashCode() + ((this.speaker.hashCode() + (iHashCode * 31)) * 31);
    }

    public String toString() {
        Integer num = this.relative_ms;
        PhoneCallCompletedOutputTranscriptItemSpeaker phoneCallCompletedOutputTranscriptItemSpeaker = this.speaker;
        String str = this.text;
        StringBuilder sb = new StringBuilder("PhoneCallCompletedOutputTranscriptItem(relative_ms=");
        sb.append(num);
        sb.append(", speaker=");
        sb.append(phoneCallCompletedOutputTranscriptItemSpeaker);
        sb.append(", text=");
        return ij0.m(sb, str, ")");
    }

    public PhoneCallCompletedOutputTranscriptItem(Integer num, PhoneCallCompletedOutputTranscriptItemSpeaker phoneCallCompletedOutputTranscriptItemSpeaker, String str) {
        phoneCallCompletedOutputTranscriptItemSpeaker.getClass();
        str.getClass();
        this.relative_ms = num;
        this.speaker = phoneCallCompletedOutputTranscriptItemSpeaker;
        this.text = str;
    }

    public /* synthetic */ PhoneCallCompletedOutputTranscriptItem(Integer num, PhoneCallCompletedOutputTranscriptItemSpeaker phoneCallCompletedOutputTranscriptItemSpeaker, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : num, phoneCallCompletedOutputTranscriptItemSpeaker, str);
    }
}
