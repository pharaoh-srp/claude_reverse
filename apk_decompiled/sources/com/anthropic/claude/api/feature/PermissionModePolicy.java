package com.anthropic.claude.api.feature;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nxc;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0003*+,B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0016¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/feature/PermissionModePolicy;", "", "Lcom/anthropic/claude/api/feature/PermissionModePolicy$ModePolicy;", "autoPermissions", "bypassPermissions", "<init>", "(Lcom/anthropic/claude/api/feature/PermissionModePolicy$ModePolicy;Lcom/anthropic/claude/api/feature/PermissionModePolicy$ModePolicy;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/feature/PermissionModePolicy$ModePolicy;Lcom/anthropic/claude/api/feature/PermissionModePolicy$ModePolicy;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/feature/PermissionModePolicy;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/feature/PermissionModePolicy$ModePolicy;", "component2", "copy", "(Lcom/anthropic/claude/api/feature/PermissionModePolicy$ModePolicy;Lcom/anthropic/claude/api/feature/PermissionModePolicy$ModePolicy;)Lcom/anthropic/claude/api/feature/PermissionModePolicy;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/feature/PermissionModePolicy$ModePolicy;", "getAutoPermissions", "getAutoPermissions$annotations", "()V", "getBypassPermissions", "getBypassPermissions$annotations", "Companion", "ModePolicy", "com/anthropic/claude/api/feature/a", "nxc", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PermissionModePolicy {
    public static final int $stable = 0;
    public static final nxc Companion = new nxc();
    private final ModePolicy autoPermissions;
    private final ModePolicy bypassPermissions;

    public /* synthetic */ PermissionModePolicy(int i, ModePolicy modePolicy, ModePolicy modePolicy2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, a.a.getDescriptor());
            throw null;
        }
        this.autoPermissions = modePolicy;
        if ((i & 2) == 0) {
            this.bypassPermissions = null;
        } else {
            this.bypassPermissions = modePolicy2;
        }
    }

    public static /* synthetic */ PermissionModePolicy copy$default(PermissionModePolicy permissionModePolicy, ModePolicy modePolicy, ModePolicy modePolicy2, int i, Object obj) {
        if ((i & 1) != 0) {
            modePolicy = permissionModePolicy.autoPermissions;
        }
        if ((i & 2) != 0) {
            modePolicy2 = permissionModePolicy.bypassPermissions;
        }
        return permissionModePolicy.copy(modePolicy, modePolicy2);
    }

    public static /* synthetic */ void getAutoPermissions$annotations() {
    }

    public static /* synthetic */ void getBypassPermissions$annotations() {
    }

    public static final /* synthetic */ void write$Self$api(PermissionModePolicy self, vd4 output, SerialDescriptor serialDesc) {
        b bVar = b.a;
        output.r(serialDesc, 0, bVar, self.autoPermissions);
        if (!output.E(serialDesc) && self.bypassPermissions == null) {
            return;
        }
        output.B(serialDesc, 1, bVar, self.bypassPermissions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ModePolicy getAutoPermissions() {
        return this.autoPermissions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ModePolicy getBypassPermissions() {
        return this.bypassPermissions;
    }

    public final PermissionModePolicy copy(ModePolicy autoPermissions, ModePolicy bypassPermissions) {
        autoPermissions.getClass();
        return new PermissionModePolicy(autoPermissions, bypassPermissions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionModePolicy)) {
            return false;
        }
        PermissionModePolicy permissionModePolicy = (PermissionModePolicy) other;
        return x44.r(this.autoPermissions, permissionModePolicy.autoPermissions) && x44.r(this.bypassPermissions, permissionModePolicy.bypassPermissions);
    }

    public final ModePolicy getAutoPermissions() {
        return this.autoPermissions;
    }

    public final ModePolicy getBypassPermissions() {
        return this.bypassPermissions;
    }

    public int hashCode() {
        int iHashCode = this.autoPermissions.hashCode() * 31;
        ModePolicy modePolicy = this.bypassPermissions;
        return iHashCode + (modePolicy == null ? 0 : modePolicy.hashCode());
    }

    public String toString() {
        return "PermissionModePolicy(autoPermissions=" + this.autoPermissions + ", bypassPermissions=" + this.bypassPermissions + ")";
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/api/feature/PermissionModePolicy$ModePolicy;", "", "", "allowed", "managed", "<init>", "(ZZ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/feature/PermissionModePolicy$ModePolicy;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/anthropic/claude/api/feature/PermissionModePolicy$ModePolicy;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getAllowed", "getManaged", "Companion", "com/anthropic/claude/api/feature/b", "com/anthropic/claude/api/feature/c", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ModePolicy {
        public static final int $stable = 0;
        public static final c Companion = new c();
        private final boolean allowed;
        private final boolean managed;

        public /* synthetic */ ModePolicy(int i, boolean z, boolean z2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, b.a.getDescriptor());
                throw null;
            }
            this.allowed = z;
            this.managed = z2;
        }

        public static /* synthetic */ ModePolicy copy$default(ModePolicy modePolicy, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = modePolicy.allowed;
            }
            if ((i & 2) != 0) {
                z2 = modePolicy.managed;
            }
            return modePolicy.copy(z, z2);
        }

        public static final /* synthetic */ void write$Self$api(ModePolicy self, vd4 output, SerialDescriptor serialDesc) {
            output.p(serialDesc, 0, self.allowed);
            output.p(serialDesc, 1, self.managed);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getAllowed() {
            return this.allowed;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getManaged() {
            return this.managed;
        }

        public final ModePolicy copy(boolean allowed, boolean managed) {
            return new ModePolicy(allowed, managed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ModePolicy)) {
                return false;
            }
            ModePolicy modePolicy = (ModePolicy) other;
            return this.allowed == modePolicy.allowed && this.managed == modePolicy.managed;
        }

        public final boolean getAllowed() {
            return this.allowed;
        }

        public final boolean getManaged() {
            return this.managed;
        }

        public int hashCode() {
            return Boolean.hashCode(this.managed) + (Boolean.hashCode(this.allowed) * 31);
        }

        public String toString() {
            return "ModePolicy(allowed=" + this.allowed + ", managed=" + this.managed + ")";
        }

        public ModePolicy(boolean z, boolean z2) {
            this.allowed = z;
            this.managed = z2;
        }
    }

    public PermissionModePolicy(ModePolicy modePolicy, ModePolicy modePolicy2) {
        modePolicy.getClass();
        this.autoPermissions = modePolicy;
        this.bypassPermissions = modePolicy2;
    }

    public /* synthetic */ PermissionModePolicy(ModePolicy modePolicy, ModePolicy modePolicy2, int i, mq5 mq5Var) {
        this(modePolicy, (i & 2) != 0 ? null : modePolicy2);
    }
}
