package com.mikepenz.aboutlibraries.entity;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.q3a;
import defpackage.r3a;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 JT\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010 R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010 R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b6\u0010,\u001a\u0004\b5\u0010 ¨\u0006:"}, d2 = {"Lcom/mikepenz/aboutlibraries/entity/License;", "", "", "name", "url", "year", "spdxId", "licenseContent", "hash", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$aboutlibraries_core_release", "(Lcom/mikepenz/aboutlibraries/entity/License;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/mikepenz/aboutlibraries/entity/License;", "toString", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getUrl", "getUrl$annotations", "getYear", "getYear$annotations", "getSpdxId", "getSpdxId$annotations", "getLicenseContent", "getLicenseContent$annotations", "getHash", "getHash$annotations", "Companion", "q3a", "r3a", "aboutlibraries-core_release"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
@onf
public final /* data */ class License {
    public static final r3a Companion = new r3a();
    private final String hash;
    private final String licenseContent;
    private final String name;
    private final String spdxId;
    private final String url;
    private final String year;

    public /* synthetic */ License(int i, String str, String str2, String str3, String str4, String str5, String str6, vnf vnfVar) {
        if (35 != (i & 35)) {
            gvj.f(i, 35, q3a.a.getDescriptor());
            throw null;
        }
        this.name = str;
        this.url = str2;
        if ((i & 4) == 0) {
            this.year = null;
        } else {
            this.year = str3;
        }
        if ((i & 8) == 0) {
            this.spdxId = null;
        } else {
            this.spdxId = str4;
        }
        if ((i & 16) == 0) {
            this.licenseContent = null;
        } else {
            this.licenseContent = str5;
        }
        this.hash = str6;
    }

    public static /* synthetic */ License copy$default(License license, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = license.name;
        }
        if ((i & 2) != 0) {
            str2 = license.url;
        }
        if ((i & 4) != 0) {
            str3 = license.year;
        }
        if ((i & 8) != 0) {
            str4 = license.spdxId;
        }
        if ((i & 16) != 0) {
            str5 = license.licenseContent;
        }
        if ((i & 32) != 0) {
            str6 = license.hash;
        }
        String str7 = str5;
        String str8 = str6;
        return license.copy(str, str2, str3, str4, str7, str8);
    }

    public static /* synthetic */ void getHash$annotations() {
    }

    public static /* synthetic */ void getLicenseContent$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getSpdxId$annotations() {
    }

    public static /* synthetic */ void getUrl$annotations() {
    }

    public static /* synthetic */ void getYear$annotations() {
    }

    public static final /* synthetic */ void write$Self$aboutlibraries_core_release(License self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.name);
        srg srgVar = srg.a;
        output.B(serialDesc, 1, srgVar, self.url);
        if (output.E(serialDesc) || self.year != null) {
            output.B(serialDesc, 2, srgVar, self.year);
        }
        if (output.E(serialDesc) || self.spdxId != null) {
            output.B(serialDesc, 3, srgVar, self.spdxId);
        }
        if (output.E(serialDesc) || self.licenseContent != null) {
            output.B(serialDesc, 4, srgVar, self.licenseContent);
        }
        output.q(serialDesc, 5, self.hash);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSpdxId() {
        return this.spdxId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLicenseContent() {
        return this.licenseContent;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    public final License copy(String name, String url, String year, String spdxId, String licenseContent, String hash) {
        name.getClass();
        hash.getClass();
        return new License(name, url, year, spdxId, licenseContent, hash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return other != null && License.class == other.getClass() && x44.r(this.hash, ((License) other).hash);
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getLicenseContent() {
        return this.licenseContent;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSpdxId() {
        return this.spdxId;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getYear() {
        return this.year;
    }

    public int hashCode() {
        return this.hash.hashCode();
    }

    public String toString() {
        String str = this.name;
        String str2 = this.url;
        String str3 = this.year;
        String str4 = this.spdxId;
        String str5 = this.licenseContent;
        String str6 = this.hash;
        StringBuilder sbR = kgh.r("License(name=", str, ", url=", str2, ", year=");
        kgh.u(sbR, str3, ", spdxId=", str4, ", licenseContent=");
        return vb7.t(sbR, str5, ", hash=", str6, ")");
    }

    public License(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str6.getClass();
        this.name = str;
        this.url = str2;
        this.year = str3;
        this.spdxId = str4;
        this.licenseContent = str5;
        this.hash = str6;
    }

    public /* synthetic */ License(String str, String str2, String str3, String str4, String str5, String str6, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6);
    }
}
