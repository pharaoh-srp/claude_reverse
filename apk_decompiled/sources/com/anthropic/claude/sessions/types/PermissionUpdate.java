package com.anthropic.claude.sessions.types;

import defpackage.ayc;
import defpackage.byc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002()B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J2\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lcom/anthropic/claude/sessions/types/PermissionUpdate;", "", "", "type", "mode", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/PermissionUpdate;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/PermissionUpdate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getMode", "getDestination", "Companion", "byc", "ayc", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PermissionUpdate {
    public static final byc Companion = new byc();
    private final String destination;
    private final String mode;
    private final String type;

    public /* synthetic */ PermissionUpdate(int i, String str, String str2, String str3, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, ayc.a.getDescriptor());
            throw null;
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.mode = null;
        } else {
            this.mode = str2;
        }
        if ((i & 4) == 0) {
            this.destination = null;
        } else {
            this.destination = str3;
        }
    }

    public static /* synthetic */ PermissionUpdate copy$default(PermissionUpdate permissionUpdate, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permissionUpdate.type;
        }
        if ((i & 2) != 0) {
            str2 = permissionUpdate.mode;
        }
        if ((i & 4) != 0) {
            str3 = permissionUpdate.destination;
        }
        return permissionUpdate.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$sessions(PermissionUpdate self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.type);
        if (output.E(serialDesc) || self.mode != null) {
            output.B(serialDesc, 1, srg.a, self.mode);
        }
        if (!output.E(serialDesc) && self.destination == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDestination() {
        return this.destination;
    }

    public final PermissionUpdate copy(String type, String mode, String destination) {
        type.getClass();
        return new PermissionUpdate(type, mode, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionUpdate)) {
            return false;
        }
        PermissionUpdate permissionUpdate = (PermissionUpdate) other;
        return x44.r(this.type, permissionUpdate.type) && x44.r(this.mode, permissionUpdate.mode) && x44.r(this.destination, permissionUpdate.destination);
    }

    public final String getDestination() {
        return this.destination;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.mode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.destination;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.mode;
        return ij0.m(kgh.r("PermissionUpdate(type=", str, ", mode=", str2, ", destination="), this.destination, ")");
    }

    public PermissionUpdate(String str, String str2, String str3) {
        str.getClass();
        this.type = str;
        this.mode = str2;
        this.destination = str3;
    }

    public /* synthetic */ PermissionUpdate(String str, String str2, String str3, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
