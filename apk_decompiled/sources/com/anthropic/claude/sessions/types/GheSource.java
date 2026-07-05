package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.s48;
import defpackage.t48;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0018¨\u0006("}, d2 = {"Lcom/anthropic/claude/sessions/types/GheSource;", "", "", "configuration_id", "", "host", "<init>", "(ILjava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/GheSource;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/anthropic/claude/sessions/types/GheSource;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getConfiguration_id", "Ljava/lang/String;", "getHost", "Companion", "s48", "t48", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GheSource {
    public static final t48 Companion = new t48();
    private final int configuration_id;
    private final String host;

    public /* synthetic */ GheSource(int i, int i2, String str, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, s48.a.getDescriptor());
            throw null;
        }
        this.configuration_id = i2;
        this.host = str;
    }

    public static /* synthetic */ GheSource copy$default(GheSource gheSource, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = gheSource.configuration_id;
        }
        if ((i2 & 2) != 0) {
            str = gheSource.host;
        }
        return gheSource.copy(i, str);
    }

    public static final /* synthetic */ void write$Self$sessions(GheSource self, vd4 output, SerialDescriptor serialDesc) {
        output.l(0, self.configuration_id, serialDesc);
        output.q(serialDesc, 1, self.host);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getConfiguration_id() {
        return this.configuration_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    public final GheSource copy(int configuration_id, String host) {
        host.getClass();
        return new GheSource(configuration_id, host);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GheSource)) {
            return false;
        }
        GheSource gheSource = (GheSource) other;
        return this.configuration_id == gheSource.configuration_id && x44.r(this.host, gheSource.host);
    }

    public final int getConfiguration_id() {
        return this.configuration_id;
    }

    public final String getHost() {
        return this.host;
    }

    public int hashCode() {
        return this.host.hashCode() + (Integer.hashCode(this.configuration_id) * 31);
    }

    public String toString() {
        return "GheSource(configuration_id=" + this.configuration_id + ", host=" + this.host + ")";
    }

    public GheSource(int i, String str) {
        str.getClass();
        this.configuration_id = i;
        this.host = str;
    }
}
