package com.anthropic.claude.chat.parse;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.lcb;
import defpackage.mcb;
import defpackage.mdj;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/chat/parse/MemoryToolSummary;", "", "", "breadcrumb", "summary", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_chat_parse", "(Lcom/anthropic/claude/chat/parse/MemoryToolSummary;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/chat/parse/MemoryToolSummary;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBreadcrumb", "getSummary", "Companion", "lcb", "mcb", "Claude.chat:parse"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MemoryToolSummary {
    public static final int $stable = 0;
    public static final mcb Companion = new mcb();
    private final String breadcrumb;
    private final String summary;

    public /* synthetic */ MemoryToolSummary(int i, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, lcb.a.getDescriptor());
            throw null;
        }
        this.breadcrumb = str;
        this.summary = str2;
    }

    public static /* synthetic */ MemoryToolSummary copy$default(MemoryToolSummary memoryToolSummary, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memoryToolSummary.breadcrumb;
        }
        if ((i & 2) != 0) {
            str2 = memoryToolSummary.summary;
        }
        return memoryToolSummary.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$Claude_chat_parse(MemoryToolSummary self, vd4 output, SerialDescriptor serialDesc) {
        srg srgVar = srg.a;
        output.B(serialDesc, 0, srgVar, self.breadcrumb);
        output.B(serialDesc, 1, srgVar, self.summary);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBreadcrumb() {
        return this.breadcrumb;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    public final MemoryToolSummary copy(String breadcrumb, String summary) {
        return new MemoryToolSummary(breadcrumb, summary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemoryToolSummary)) {
            return false;
        }
        MemoryToolSummary memoryToolSummary = (MemoryToolSummary) other;
        return x44.r(this.breadcrumb, memoryToolSummary.breadcrumb) && x44.r(this.summary, memoryToolSummary.summary);
    }

    public final String getBreadcrumb() {
        return this.breadcrumb;
    }

    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        String str = this.breadcrumb;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.summary;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return ij0.l("MemoryToolSummary(breadcrumb=", this.breadcrumb, ", summary=", this.summary, ")");
    }

    public MemoryToolSummary(String str, String str2) {
        this.breadcrumb = str;
        this.summary = str2;
    }
}
