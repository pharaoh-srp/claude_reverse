package com.anthropic.claude.api.chat.tool;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.t2i;
import defpackage.u2i;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/TopSourceDomain;", "", "", "icon_url", "name", "", "count", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/TopSourceDomain;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/anthropic/claude/api/chat/tool/TopSourceDomain;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon_url", "getName", "I", "getCount", "Companion", "t2i", "u2i", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class TopSourceDomain {
    public static final int $stable = 0;
    public static final u2i Companion = new u2i();
    private final int count;
    private final String icon_url;
    private final String name;

    public /* synthetic */ TopSourceDomain(int i, String str, String str2, int i2, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, t2i.a.getDescriptor());
            throw null;
        }
        this.icon_url = str;
        this.name = str2;
        this.count = i2;
    }

    public static /* synthetic */ TopSourceDomain copy$default(TopSourceDomain topSourceDomain, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = topSourceDomain.icon_url;
        }
        if ((i2 & 2) != 0) {
            str2 = topSourceDomain.name;
        }
        if ((i2 & 4) != 0) {
            i = topSourceDomain.count;
        }
        return topSourceDomain.copy(str, str2, i);
    }

    public static final /* synthetic */ void write$Self$api(TopSourceDomain self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.icon_url);
        output.q(serialDesc, 1, self.name);
        output.l(2, self.count, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon_url() {
        return this.icon_url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final TopSourceDomain copy(String icon_url, String name, int count) {
        icon_url.getClass();
        name.getClass();
        return new TopSourceDomain(icon_url, name, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopSourceDomain)) {
            return false;
        }
        TopSourceDomain topSourceDomain = (TopSourceDomain) other;
        return x44.r(this.icon_url, topSourceDomain.icon_url) && x44.r(this.name, topSourceDomain.name) && this.count == topSourceDomain.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Integer.hashCode(this.count) + kgh.l(this.icon_url.hashCode() * 31, 31, this.name);
    }

    public String toString() {
        return vb7.l(this.count, ")", kgh.r("TopSourceDomain(icon_url=", this.icon_url, ", name=", this.name, ", count="));
    }

    public TopSourceDomain(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.icon_url = str;
        this.name = str2;
        this.count = i;
    }
}
