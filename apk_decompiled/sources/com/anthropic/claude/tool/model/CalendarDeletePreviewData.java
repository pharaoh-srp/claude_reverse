package com.anthropic.claude.tool.model;

import defpackage.by6;
import defpackage.ebh;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.ll1;
import defpackage.mdj;
import defpackage.onf;
import defpackage.r62;
import defpackage.s62;
import defpackage.uo0;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/tool/model/CalendarDeletePreviewData;", "Lcom/anthropic/claude/tool/model/PreviewData;", "", "Lcom/anthropic/claude/tool/model/EventDeleteDetails;", "eventsToDelete", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$tool", "(Lcom/anthropic/claude/tool/model/CalendarDeletePreviewData;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/anthropic/claude/tool/model/CalendarDeletePreviewData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEventsToDelete", "Companion", "r62", "s62", "tool"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CalendarDeletePreviewData implements PreviewData {
    public static final int $stable = 0;
    private final List<EventDeleteDetails> eventsToDelete;
    public static final s62 Companion = new s62();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new ll1(16))};

    public /* synthetic */ CalendarDeletePreviewData(int i, List list, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.eventsToDelete = list;
        } else {
            gvj.f(i, 1, r62.a.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(by6.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalendarDeletePreviewData copy$default(CalendarDeletePreviewData calendarDeletePreviewData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = calendarDeletePreviewData.eventsToDelete;
        }
        return calendarDeletePreviewData.copy(list);
    }

    public final List<EventDeleteDetails> component1() {
        return this.eventsToDelete;
    }

    public final CalendarDeletePreviewData copy(List<EventDeleteDetails> eventsToDelete) {
        eventsToDelete.getClass();
        return new CalendarDeletePreviewData(eventsToDelete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CalendarDeletePreviewData) && x44.r(this.eventsToDelete, ((CalendarDeletePreviewData) other).eventsToDelete);
    }

    public final List<EventDeleteDetails> getEventsToDelete() {
        return this.eventsToDelete;
    }

    public int hashCode() {
        return this.eventsToDelete.hashCode();
    }

    public String toString() {
        return ebh.n("CalendarDeletePreviewData(eventsToDelete=", ")", this.eventsToDelete);
    }

    public CalendarDeletePreviewData(List<EventDeleteDetails> list) {
        list.getClass();
        this.eventsToDelete = list;
    }
}
