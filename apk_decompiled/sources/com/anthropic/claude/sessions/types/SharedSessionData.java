package com.anthropic.claude.sessions.types;

import defpackage.fbf;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.stf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.y1g;
import defpackage.y2g;
import defpackage.yb5;
import defpackage.z2g;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0002=>BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fBe\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b(\u0010#Jd\u0010)\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010#J\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b7\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b:\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b;\u0010#¨\u0006?"}, d2 = {"Lcom/anthropic/claude/sessions/types/SharedSessionData;", "", "", "Lcom/anthropic/claude/sessions/types/SdkEvent;", "data", "Lcom/anthropic/claude/sessions/types/SessionResource;", "session", "", "sharer_display_name", "type", "", "has_more", "first_id", "last_id", "<init>", "(Ljava/util/List;Lcom/anthropic/claude/sessions/types/SessionResource;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/anthropic/claude/sessions/types/SessionResource;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SharedSessionData;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/anthropic/claude/sessions/types/SessionResource;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Z", "component6", "component7", "copy", "(Ljava/util/List;Lcom/anthropic/claude/sessions/types/SessionResource;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/SharedSessionData;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getData", "Lcom/anthropic/claude/sessions/types/SessionResource;", "getSession", "Ljava/lang/String;", "getSharer_display_name", "getType", "Z", "getHas_more", "getFirst_id", "getLast_id", "Companion", "y2g", "z2g", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SharedSessionData {
    private final List<SdkEvent> data;
    private final String first_id;
    private final boolean has_more;
    private final String last_id;
    private final SessionResource session;
    private final String sharer_display_name;
    private final String type;
    public static final z2g Companion = new z2g();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new y1g(9)), null, null, null, null, null, null};

    public /* synthetic */ SharedSessionData(int i, List list, SessionResource sessionResource, String str, String str2, boolean z, String str3, String str4, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, y2g.a.getDescriptor());
            throw null;
        }
        this.data = list;
        this.session = sessionResource;
        if ((i & 4) == 0) {
            this.sharer_display_name = null;
        } else {
            this.sharer_display_name = str;
        }
        if ((i & 8) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        if ((i & 16) == 0) {
            this.has_more = false;
        } else {
            this.has_more = z;
        }
        if ((i & 32) == 0) {
            this.first_id = null;
        } else {
            this.first_id = str3;
        }
        if ((i & 64) == 0) {
            this.last_id = null;
        } else {
            this.last_id = str4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(fbf.c, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharedSessionData copy$default(SharedSessionData sharedSessionData, List list, SessionResource sessionResource, String str, String str2, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sharedSessionData.data;
        }
        if ((i & 2) != 0) {
            sessionResource = sharedSessionData.session;
        }
        if ((i & 4) != 0) {
            str = sharedSessionData.sharer_display_name;
        }
        if ((i & 8) != 0) {
            str2 = sharedSessionData.type;
        }
        if ((i & 16) != 0) {
            z = sharedSessionData.has_more;
        }
        if ((i & 32) != 0) {
            str3 = sharedSessionData.first_id;
        }
        if ((i & 64) != 0) {
            str4 = sharedSessionData.last_id;
        }
        String str5 = str3;
        String str6 = str4;
        boolean z2 = z;
        String str7 = str;
        return sharedSessionData.copy(list, sessionResource, str7, str2, z2, str5, str6);
    }

    public static final /* synthetic */ void write$Self$sessions(SharedSessionData self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.data);
        output.r(serialDesc, 1, stf.a, self.session);
        if (output.E(serialDesc) || self.sharer_display_name != null) {
            output.B(serialDesc, 2, srg.a, self.sharer_display_name);
        }
        if (output.E(serialDesc) || self.type != null) {
            output.B(serialDesc, 3, srg.a, self.type);
        }
        if (output.E(serialDesc) || self.has_more) {
            output.p(serialDesc, 4, self.has_more);
        }
        if (output.E(serialDesc) || self.first_id != null) {
            output.B(serialDesc, 5, srg.a, self.first_id);
        }
        if (!output.E(serialDesc) && self.last_id == null) {
            return;
        }
        output.B(serialDesc, 6, srg.a, self.last_id);
    }

    public final List<SdkEvent> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SessionResource getSession() {
        return this.session;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSharer_display_name() {
        return this.sharer_display_name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getHas_more() {
        return this.has_more;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFirst_id() {
        return this.first_id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLast_id() {
        return this.last_id;
    }

    public final SharedSessionData copy(List<? extends SdkEvent> data, SessionResource session, String sharer_display_name, String type, boolean has_more, String first_id, String last_id) {
        data.getClass();
        session.getClass();
        return new SharedSessionData(data, session, sharer_display_name, type, has_more, first_id, last_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedSessionData)) {
            return false;
        }
        SharedSessionData sharedSessionData = (SharedSessionData) other;
        return x44.r(this.data, sharedSessionData.data) && x44.r(this.session, sharedSessionData.session) && x44.r(this.sharer_display_name, sharedSessionData.sharer_display_name) && x44.r(this.type, sharedSessionData.type) && this.has_more == sharedSessionData.has_more && x44.r(this.first_id, sharedSessionData.first_id) && x44.r(this.last_id, sharedSessionData.last_id);
    }

    public final List<SdkEvent> getData() {
        return this.data;
    }

    public final String getFirst_id() {
        return this.first_id;
    }

    public final boolean getHas_more() {
        return this.has_more;
    }

    public final String getLast_id() {
        return this.last_id;
    }

    public final SessionResource getSession() {
        return this.session;
    }

    public final String getSharer_display_name() {
        return this.sharer_display_name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.session.hashCode() + (this.data.hashCode() * 31)) * 31;
        String str = this.sharer_display_name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iP = fsh.p((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.has_more);
        String str3 = this.first_id;
        int iHashCode3 = (iP + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.last_id;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        List<SdkEvent> list = this.data;
        SessionResource sessionResource = this.session;
        String str = this.sharer_display_name;
        String str2 = this.type;
        boolean z = this.has_more;
        String str3 = this.first_id;
        String str4 = this.last_id;
        StringBuilder sb = new StringBuilder("SharedSessionData(data=");
        sb.append(list);
        sb.append(", session=");
        sb.append(sessionResource);
        sb.append(", sharer_display_name=");
        kgh.u(sb, str, ", type=", str2, ", has_more=");
        sb.append(z);
        sb.append(", first_id=");
        sb.append(str3);
        sb.append(", last_id=");
        return ij0.m(sb, str4, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SharedSessionData(List<? extends SdkEvent> list, SessionResource sessionResource, String str, String str2, boolean z, String str3, String str4) {
        list.getClass();
        sessionResource.getClass();
        this.data = list;
        this.session = sessionResource;
        this.sharer_display_name = str;
        this.type = str2;
        this.has_more = z;
        this.first_id = str3;
        this.last_id = str4;
    }

    public /* synthetic */ SharedSessionData(List list, SessionResource sessionResource, String str, String str2, boolean z, String str3, String str4, int i, mq5 mq5Var) {
        this(list, sessionResource, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }
}
