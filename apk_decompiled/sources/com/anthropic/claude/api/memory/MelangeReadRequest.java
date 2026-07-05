package com.anthropic.claude.api.memory;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.s9b;
import defpackage.t9b;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0019¨\u0006)"}, d2 = {"Lcom/anthropic/claude/api/memory/MelangeReadRequest;", "", "", "path", "", "resolve_wikilinks", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/memory/MelangeReadRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/memory/MelangeReadRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "Ljava/lang/Boolean;", "getResolve_wikilinks", "Companion", "s9b", "t9b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MelangeReadRequest {
    public static final int $stable = 0;
    public static final t9b Companion = new t9b();
    private final String path;
    private final Boolean resolve_wikilinks;

    public /* synthetic */ MelangeReadRequest(int i, String str, Boolean bool, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, s9b.a.getDescriptor());
            throw null;
        }
        this.path = str;
        if ((i & 2) == 0) {
            this.resolve_wikilinks = null;
        } else {
            this.resolve_wikilinks = bool;
        }
    }

    public static /* synthetic */ MelangeReadRequest copy$default(MelangeReadRequest melangeReadRequest, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = melangeReadRequest.path;
        }
        if ((i & 2) != 0) {
            bool = melangeReadRequest.resolve_wikilinks;
        }
        return melangeReadRequest.copy(str, bool);
    }

    public static final /* synthetic */ void write$Self$api(MelangeReadRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.path);
        if (!output.E(serialDesc) && self.resolve_wikilinks == null) {
            return;
        }
        output.B(serialDesc, 1, zt1.a, self.resolve_wikilinks);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getResolve_wikilinks() {
        return this.resolve_wikilinks;
    }

    public final MelangeReadRequest copy(String path, Boolean resolve_wikilinks) {
        path.getClass();
        return new MelangeReadRequest(path, resolve_wikilinks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MelangeReadRequest)) {
            return false;
        }
        MelangeReadRequest melangeReadRequest = (MelangeReadRequest) other;
        return x44.r(this.path, melangeReadRequest.path) && x44.r(this.resolve_wikilinks, melangeReadRequest.resolve_wikilinks);
    }

    public final String getPath() {
        return this.path;
    }

    public final Boolean getResolve_wikilinks() {
        return this.resolve_wikilinks;
    }

    public int hashCode() {
        int iHashCode = this.path.hashCode() * 31;
        Boolean bool = this.resolve_wikilinks;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "MelangeReadRequest(path=" + this.path + ", resolve_wikilinks=" + this.resolve_wikilinks + ")";
    }

    public MelangeReadRequest(String str, Boolean bool) {
        str.getClass();
        this.path = str;
        this.resolve_wikilinks = bool;
    }

    public /* synthetic */ MelangeReadRequest(String str, Boolean bool, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : bool);
    }
}
