package com.anthropic.claude.sessions.types;

import defpackage.c97;
import defpackage.gvj;
import defpackage.hne;
import defpackage.j48;
import defpackage.k48;
import defpackage.kw9;
import defpackage.m1g;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/anthropic/claude/sessions/types/GetShareStatusResponse;", "", "", "Lcom/anthropic/claude/sessions/types/ShareRecord;", "shares", "Lcom/anthropic/claude/sessions/types/ResolvedSharingSettings;", "sharing_settings", "<init>", "(Ljava/util/List;Lcom/anthropic/claude/sessions/types/ResolvedSharingSettings;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/anthropic/claude/sessions/types/ResolvedSharingSettings;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/GetShareStatusResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/anthropic/claude/sessions/types/ResolvedSharingSettings;", "copy", "(Ljava/util/List;Lcom/anthropic/claude/sessions/types/ResolvedSharingSettings;)Lcom/anthropic/claude/sessions/types/GetShareStatusResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getShares", "Lcom/anthropic/claude/sessions/types/ResolvedSharingSettings;", "getSharing_settings", "Companion", "j48", "k48", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GetShareStatusResponse {
    private final List<ShareRecord> shares;
    private final ResolvedSharingSettings sharing_settings;
    public static final k48 Companion = new k48();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new c97(17)), null};

    public /* synthetic */ GetShareStatusResponse(int i, List list, ResolvedSharingSettings resolvedSharingSettings, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, j48.a.getDescriptor());
            throw null;
        }
        this.shares = list;
        if ((i & 2) == 0) {
            this.sharing_settings = null;
        } else {
            this.sharing_settings = resolvedSharingSettings;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(m1g.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetShareStatusResponse copy$default(GetShareStatusResponse getShareStatusResponse, List list, ResolvedSharingSettings resolvedSharingSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getShareStatusResponse.shares;
        }
        if ((i & 2) != 0) {
            resolvedSharingSettings = getShareStatusResponse.sharing_settings;
        }
        return getShareStatusResponse.copy(list, resolvedSharingSettings);
    }

    public static final /* synthetic */ void write$Self$sessions(GetShareStatusResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.shares);
        if (!output.E(serialDesc) && self.sharing_settings == null) {
            return;
        }
        output.B(serialDesc, 1, hne.a, self.sharing_settings);
    }

    public final List<ShareRecord> component1() {
        return this.shares;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ResolvedSharingSettings getSharing_settings() {
        return this.sharing_settings;
    }

    public final GetShareStatusResponse copy(List<ShareRecord> shares, ResolvedSharingSettings sharing_settings) {
        shares.getClass();
        return new GetShareStatusResponse(shares, sharing_settings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetShareStatusResponse)) {
            return false;
        }
        GetShareStatusResponse getShareStatusResponse = (GetShareStatusResponse) other;
        return x44.r(this.shares, getShareStatusResponse.shares) && x44.r(this.sharing_settings, getShareStatusResponse.sharing_settings);
    }

    public final List<ShareRecord> getShares() {
        return this.shares;
    }

    public final ResolvedSharingSettings getSharing_settings() {
        return this.sharing_settings;
    }

    public int hashCode() {
        int iHashCode = this.shares.hashCode() * 31;
        ResolvedSharingSettings resolvedSharingSettings = this.sharing_settings;
        return iHashCode + (resolvedSharingSettings == null ? 0 : resolvedSharingSettings.hashCode());
    }

    public String toString() {
        return "GetShareStatusResponse(shares=" + this.shares + ", sharing_settings=" + this.sharing_settings + ")";
    }

    public GetShareStatusResponse(List<ShareRecord> list, ResolvedSharingSettings resolvedSharingSettings) {
        list.getClass();
        this.shares = list;
        this.sharing_settings = resolvedSharingSettings;
    }

    public /* synthetic */ GetShareStatusResponse(List list, ResolvedSharingSettings resolvedSharingSettings, int i, mq5 mq5Var) {
        this(list, (i & 2) != 0 ? null : resolvedSharingSettings);
    }
}
