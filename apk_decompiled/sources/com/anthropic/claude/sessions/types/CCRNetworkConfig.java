package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.h32;
import defpackage.i32;
import defpackage.kw9;
import defpackage.ll1;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.onf;
import defpackage.srg;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Lcom/anthropic/claude/sessions/types/CCRNetworkConfig;", "", "", "", "allowed_hosts", "", "allow_default_hosts", "<init>", "(Ljava/util/List;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/CCRNetworkConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/anthropic/claude/sessions/types/CCRNetworkConfig;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAllowed_hosts", "Z", "getAllow_default_hosts", "Companion", "i32", "h32", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CCRNetworkConfig {
    private static final CCRNetworkConfig FULL_ACCESS;
    private static final CCRNetworkConfig NO_ACCESS;
    private static final CCRNetworkConfig TRUSTED_ACCESS;
    private final boolean allow_default_hosts;
    private final List<String> allowed_hosts;
    public static final i32 Companion = new i32();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new ll1(13)), null};

    static {
        lm6 lm6Var = lm6.E;
        NO_ACCESS = new CCRNetworkConfig(lm6Var, false);
        TRUSTED_ACCESS = new CCRNetworkConfig(lm6Var, true);
        FULL_ACCESS = new CCRNetworkConfig(x44.W("*"), true);
    }

    public /* synthetic */ CCRNetworkConfig(int i, List list, boolean z, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, h32.a.getDescriptor());
            throw null;
        }
        this.allowed_hosts = list;
        this.allow_default_hosts = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CCRNetworkConfig copy$default(CCRNetworkConfig cCRNetworkConfig, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cCRNetworkConfig.allowed_hosts;
        }
        if ((i & 2) != 0) {
            z = cCRNetworkConfig.allow_default_hosts;
        }
        return cCRNetworkConfig.copy(list, z);
    }

    public static final /* synthetic */ void write$Self$sessions(CCRNetworkConfig self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.allowed_hosts);
        output.p(serialDesc, 1, self.allow_default_hosts);
    }

    public final List<String> component1() {
        return this.allowed_hosts;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAllow_default_hosts() {
        return this.allow_default_hosts;
    }

    public final CCRNetworkConfig copy(List<String> allowed_hosts, boolean allow_default_hosts) {
        allowed_hosts.getClass();
        return new CCRNetworkConfig(allowed_hosts, allow_default_hosts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CCRNetworkConfig)) {
            return false;
        }
        CCRNetworkConfig cCRNetworkConfig = (CCRNetworkConfig) other;
        return x44.r(this.allowed_hosts, cCRNetworkConfig.allowed_hosts) && this.allow_default_hosts == cCRNetworkConfig.allow_default_hosts;
    }

    public final boolean getAllow_default_hosts() {
        return this.allow_default_hosts;
    }

    public final List<String> getAllowed_hosts() {
        return this.allowed_hosts;
    }

    public int hashCode() {
        return Boolean.hashCode(this.allow_default_hosts) + (this.allowed_hosts.hashCode() * 31);
    }

    public String toString() {
        return "CCRNetworkConfig(allowed_hosts=" + this.allowed_hosts + ", allow_default_hosts=" + this.allow_default_hosts + ")";
    }

    public CCRNetworkConfig(List<String> list, boolean z) {
        list.getClass();
        this.allowed_hosts = list;
        this.allow_default_hosts = z;
    }
}
