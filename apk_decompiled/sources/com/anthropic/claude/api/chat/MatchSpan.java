package com.anthropic.claude.api.chat;

import defpackage.gvj;
import defpackage.iva;
import defpackage.jva;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/chat/MatchSpan;", "", "", "start", "end", "<init>", "(II)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IIILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/MatchSpan;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "copy", "(II)Lcom/anthropic/claude/api/chat/MatchSpan;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStart", "getEnd", "Companion", "iva", "jva", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MatchSpan {
    public static final int $stable = 0;
    public static final jva Companion = new jva();
    private final int end;
    private final int start;

    public /* synthetic */ MatchSpan(int i, int i2, int i3, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, iva.a.getDescriptor());
            throw null;
        }
        this.start = i2;
        this.end = i3;
    }

    public static /* synthetic */ MatchSpan copy$default(MatchSpan matchSpan, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = matchSpan.start;
        }
        if ((i3 & 2) != 0) {
            i2 = matchSpan.end;
        }
        return matchSpan.copy(i, i2);
    }

    public static final /* synthetic */ void write$Self$api(MatchSpan self, vd4 output, SerialDescriptor serialDesc) {
        output.l(0, self.start, serialDesc);
        output.l(1, self.end, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    public final MatchSpan copy(int start, int end) {
        return new MatchSpan(start, end);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchSpan)) {
            return false;
        }
        MatchSpan matchSpan = (MatchSpan) other;
        return this.start == matchSpan.start && this.end == matchSpan.end;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return Integer.hashCode(this.end) + (Integer.hashCode(this.start) * 31);
    }

    public String toString() {
        return vb7.q("MatchSpan(start=", ", end=", this.start, this.end, ")");
    }

    public MatchSpan(int i, int i2) {
        this.start = i;
        this.end = i2;
    }
}
