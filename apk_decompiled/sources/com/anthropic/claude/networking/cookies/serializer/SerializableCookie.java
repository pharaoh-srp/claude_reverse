package com.anthropic.claude.networking.cookies.serializer;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.fsh;
import defpackage.gid;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.snf;
import defpackage.tnf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xka;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0081\b\u0018\u0000 ;2\u00020\u0001:\u0002<=BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eBe\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010%Jb\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b9\u0010%R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b:\u0010%¨\u0006>"}, d2 = {"Lcom/anthropic/claude/networking/cookies/serializer/SerializableCookie;", "", "", "name", ExperienceToggle.DEFAULT_PARAM_KEY, "", "expiresAt", "domain", "path", "", "secure", "httpOnly", "hostOnly", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$networking", "(Lcom/anthropic/claude/networking/cookies/serializer/SerializableCookie;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "component4", "component5", "component6", "()Z", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/anthropic/claude/networking/cookies/serializer/SerializableCookie;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getValue", "Ljava/lang/Long;", "getExpiresAt", "getDomain", "getPath", "Z", "getSecure", "getHttpOnly", "getHostOnly", "Companion", "snf", "tnf", "networking"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SerializableCookie {
    public static final tnf Companion = new tnf();
    private final String domain;
    private final Long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean secure;
    private final String value;

    public /* synthetic */ SerializableCookie(int i, String str, String str2, Long l, String str3, String str4, boolean z, boolean z2, boolean z3, vnf vnfVar) {
        if (255 != (i & 255)) {
            gvj.f(i, 255, snf.a.getDescriptor());
            throw null;
        }
        this.name = str;
        this.value = str2;
        this.expiresAt = l;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.hostOnly = z3;
    }

    public static /* synthetic */ SerializableCookie copy$default(SerializableCookie serializableCookie, String str, String str2, Long l, String str3, String str4, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serializableCookie.name;
        }
        if ((i & 2) != 0) {
            str2 = serializableCookie.value;
        }
        if ((i & 4) != 0) {
            l = serializableCookie.expiresAt;
        }
        if ((i & 8) != 0) {
            str3 = serializableCookie.domain;
        }
        if ((i & 16) != 0) {
            str4 = serializableCookie.path;
        }
        if ((i & 32) != 0) {
            z = serializableCookie.secure;
        }
        if ((i & 64) != 0) {
            z2 = serializableCookie.httpOnly;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            z3 = serializableCookie.hostOnly;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        String str5 = str4;
        boolean z6 = z;
        return serializableCookie.copy(str, str2, l, str3, str5, z6, z4, z5);
    }

    public static final /* synthetic */ void write$Self$networking(SerializableCookie self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.name);
        output.q(serialDesc, 1, self.value);
        output.B(serialDesc, 2, xka.a, self.expiresAt);
        output.q(serialDesc, 3, self.domain);
        output.q(serialDesc, 4, self.path);
        output.p(serialDesc, 5, self.secure);
        output.p(serialDesc, 6, self.httpOnly);
        output.p(serialDesc, 7, self.hostOnly);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getHostOnly() {
        return this.hostOnly;
    }

    public final SerializableCookie copy(String name, String value, Long expiresAt, String domain, String path, boolean secure, boolean httpOnly, boolean hostOnly) {
        name.getClass();
        value.getClass();
        domain.getClass();
        path.getClass();
        return new SerializableCookie(name, value, expiresAt, domain, path, secure, httpOnly, hostOnly);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SerializableCookie)) {
            return false;
        }
        SerializableCookie serializableCookie = (SerializableCookie) other;
        return x44.r(this.name, serializableCookie.name) && x44.r(this.value, serializableCookie.value) && x44.r(this.expiresAt, serializableCookie.expiresAt) && x44.r(this.domain, serializableCookie.domain) && x44.r(this.path, serializableCookie.path) && this.secure == serializableCookie.secure && this.httpOnly == serializableCookie.httpOnly && this.hostOnly == serializableCookie.hostOnly;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final Long getExpiresAt() {
        return this.expiresAt;
    }

    public final boolean getHostOnly() {
        return this.hostOnly;
    }

    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getSecure() {
        return this.secure;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iL = kgh.l(this.name.hashCode() * 31, 31, this.value);
        Long l = this.expiresAt;
        return Boolean.hashCode(this.hostOnly) + fsh.p(fsh.p(kgh.l(kgh.l((iL + (l == null ? 0 : l.hashCode())) * 31, 31, this.domain), 31, this.path), 31, this.secure), 31, this.httpOnly);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.value;
        Long l = this.expiresAt;
        String str3 = this.domain;
        String str4 = this.path;
        boolean z = this.secure;
        boolean z2 = this.httpOnly;
        boolean z3 = this.hostOnly;
        StringBuilder sbR = kgh.r("SerializableCookie(name=", str, ", value=", str2, ", expiresAt=");
        sbR.append(l);
        sbR.append(", domain=");
        sbR.append(str3);
        sbR.append(", path=");
        gid.t(sbR, str4, ", secure=", z, ", httpOnly=");
        sbR.append(z2);
        sbR.append(", hostOnly=");
        sbR.append(z3);
        sbR.append(")");
        return sbR.toString();
    }

    public SerializableCookie(String str, String str2, Long l, String str3, String str4, boolean z, boolean z2, boolean z3) {
        ij0.z(str, str2, str3, str4);
        this.name = str;
        this.value = str2;
        this.expiresAt = l;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.hostOnly = z3;
    }
}
