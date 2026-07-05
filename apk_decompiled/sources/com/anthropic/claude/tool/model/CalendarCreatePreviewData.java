package com.anthropic.claude.tool.model;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.o62;
import defpackage.onf;
import defpackage.p62;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/tool/model/CalendarCreatePreviewData;", "Lcom/anthropic/claude/tool/model/PreviewData;", "Lcom/anthropic/claude/tool/model/EventCreateV1Input;", "input", "<init>", "(Lcom/anthropic/claude/tool/model/EventCreateV1Input;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/tool/model/EventCreateV1Input;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$tool", "(Lcom/anthropic/claude/tool/model/CalendarCreatePreviewData;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/tool/model/EventCreateV1Input;", "copy", "(Lcom/anthropic/claude/tool/model/EventCreateV1Input;)Lcom/anthropic/claude/tool/model/CalendarCreatePreviewData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/tool/model/EventCreateV1Input;", "getInput", "Companion", "o62", "p62", "tool"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CalendarCreatePreviewData implements PreviewData {
    public static final int $stable = 0;
    public static final p62 Companion = new p62();
    private final EventCreateV1Input input;

    public /* synthetic */ CalendarCreatePreviewData(int i, EventCreateV1Input eventCreateV1Input, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.input = eventCreateV1Input;
        } else {
            gvj.f(i, 1, o62.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ CalendarCreatePreviewData copy$default(CalendarCreatePreviewData calendarCreatePreviewData, EventCreateV1Input eventCreateV1Input, int i, Object obj) {
        if ((i & 1) != 0) {
            eventCreateV1Input = calendarCreatePreviewData.input;
        }
        return calendarCreatePreviewData.copy(eventCreateV1Input);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EventCreateV1Input getInput() {
        return this.input;
    }

    public final CalendarCreatePreviewData copy(EventCreateV1Input input) {
        input.getClass();
        return new CalendarCreatePreviewData(input);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CalendarCreatePreviewData) && x44.r(this.input, ((CalendarCreatePreviewData) other).input);
    }

    public final EventCreateV1Input getInput() {
        return this.input;
    }

    public int hashCode() {
        return this.input.hashCode();
    }

    public String toString() {
        return "CalendarCreatePreviewData(input=" + this.input + ")";
    }

    public CalendarCreatePreviewData(EventCreateV1Input eventCreateV1Input) {
        eventCreateV1Input.getClass();
        this.input = eventCreateV1Input;
    }
}
