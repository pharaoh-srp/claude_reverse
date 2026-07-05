package com.anthropic.claude.api.sync;

import defpackage.ew0;
import defpackage.fvh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.s61;
import defpackage.v08;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b\u0003\u0010\u0018R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001a¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/sync/AuthStatus;", "", "", "is_authenticated", "", "Lcom/anthropic/claude/api/sync/GHEConnectionStatus;", "ghe_connections", "<init>", "(ZLjava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/sync/AuthStatus;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/util/List;", "copy", "(ZLjava/util/List;)Lcom/anthropic/claude/api/sync/AuthStatus;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/util/List;", "getGhe_connections", "getGhe_connections$annotations", "()V", "Companion", "r61", "s61", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AuthStatus {
    public static final int $stable = 0;
    private final List<GHEConnectionStatus> ghe_connections;
    private final boolean is_authenticated;
    public static final s61 Companion = new s61();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new ew0(5))};

    public /* synthetic */ AuthStatus(int i, boolean z, List list, vnf vnfVar) {
        this.is_authenticated = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.ghe_connections = null;
        } else {
            this.ghe_connections = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new fvh(v08.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthStatus copy$default(AuthStatus authStatus, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = authStatus.is_authenticated;
        }
        if ((i & 2) != 0) {
            list = authStatus.ghe_connections;
        }
        return authStatus.copy(z, list);
    }

    @onf(with = fvh.class)
    public static /* synthetic */ void getGhe_connections$annotations() {
    }

    public static final /* synthetic */ void write$Self$api(AuthStatus self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.is_authenticated) {
            output.p(serialDesc, 0, self.is_authenticated);
        }
        if (!output.E(serialDesc) && self.ghe_connections == null) {
            return;
        }
        output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.ghe_connections);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIs_authenticated() {
        return this.is_authenticated;
    }

    public final List<GHEConnectionStatus> component2() {
        return this.ghe_connections;
    }

    public final AuthStatus copy(boolean is_authenticated, List<GHEConnectionStatus> ghe_connections) {
        return new AuthStatus(is_authenticated, ghe_connections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthStatus)) {
            return false;
        }
        AuthStatus authStatus = (AuthStatus) other;
        return this.is_authenticated == authStatus.is_authenticated && x44.r(this.ghe_connections, authStatus.ghe_connections);
    }

    public final List<GHEConnectionStatus> getGhe_connections() {
        return this.ghe_connections;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.is_authenticated) * 31;
        List<GHEConnectionStatus> list = this.ghe_connections;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final boolean is_authenticated() {
        return this.is_authenticated;
    }

    public String toString() {
        return "AuthStatus(is_authenticated=" + this.is_authenticated + ", ghe_connections=" + this.ghe_connections + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthStatus() {
        this(false, (List) null, 3, (mq5) (0 == true ? 1 : 0));
    }

    public AuthStatus(boolean z, List<GHEConnectionStatus> list) {
        this.is_authenticated = z;
        this.ghe_connections = list;
    }

    public /* synthetic */ AuthStatus(boolean z, List list, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list);
    }
}
