package com.anthropic.claude.tool.model;

import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uni;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJd\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u001b¨\u00066"}, d2 = {"Lcom/anthropic/claude/tool/model/UserLocationV0OutputUserLocationResultGeocoded;", "", "", "address", "administrative_area", "country", "locality", "name", "postal_code", "sub_locality", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/UserLocationV0OutputUserLocationResultGeocoded;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/UserLocationV0OutputUserLocationResultGeocoded;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAddress", "getAdministrative_area", "getCountry", "getLocality", "getName", "getPostal_code", "getSub_locality", "Companion", "tni", "uni", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UserLocationV0OutputUserLocationResultGeocoded {
    public static final uni Companion = new uni();
    private final String address;
    private final String administrative_area;
    private final String country;
    private final String locality;
    private final String name;
    private final String postal_code;
    private final String sub_locality;

    public /* synthetic */ UserLocationV0OutputUserLocationResultGeocoded(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.address = null;
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.administrative_area = null;
        } else {
            this.administrative_area = str2;
        }
        if ((i & 4) == 0) {
            this.country = null;
        } else {
            this.country = str3;
        }
        if ((i & 8) == 0) {
            this.locality = null;
        } else {
            this.locality = str4;
        }
        if ((i & 16) == 0) {
            this.name = null;
        } else {
            this.name = str5;
        }
        if ((i & 32) == 0) {
            this.postal_code = null;
        } else {
            this.postal_code = str6;
        }
        if ((i & 64) == 0) {
            this.sub_locality = null;
        } else {
            this.sub_locality = str7;
        }
    }

    public static /* synthetic */ UserLocationV0OutputUserLocationResultGeocoded copy$default(UserLocationV0OutputUserLocationResultGeocoded userLocationV0OutputUserLocationResultGeocoded, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userLocationV0OutputUserLocationResultGeocoded.address;
        }
        if ((i & 2) != 0) {
            str2 = userLocationV0OutputUserLocationResultGeocoded.administrative_area;
        }
        if ((i & 4) != 0) {
            str3 = userLocationV0OutputUserLocationResultGeocoded.country;
        }
        if ((i & 8) != 0) {
            str4 = userLocationV0OutputUserLocationResultGeocoded.locality;
        }
        if ((i & 16) != 0) {
            str5 = userLocationV0OutputUserLocationResultGeocoded.name;
        }
        if ((i & 32) != 0) {
            str6 = userLocationV0OutputUserLocationResultGeocoded.postal_code;
        }
        if ((i & 64) != 0) {
            str7 = userLocationV0OutputUserLocationResultGeocoded.sub_locality;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return userLocationV0OutputUserLocationResultGeocoded.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(UserLocationV0OutputUserLocationResultGeocoded self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.address != null) {
            output.B(serialDesc, 0, srg.a, self.address);
        }
        if (output.E(serialDesc) || self.administrative_area != null) {
            output.B(serialDesc, 1, srg.a, self.administrative_area);
        }
        if (output.E(serialDesc) || self.country != null) {
            output.B(serialDesc, 2, srg.a, self.country);
        }
        if (output.E(serialDesc) || self.locality != null) {
            output.B(serialDesc, 3, srg.a, self.locality);
        }
        if (output.E(serialDesc) || self.name != null) {
            output.B(serialDesc, 4, srg.a, self.name);
        }
        if (output.E(serialDesc) || self.postal_code != null) {
            output.B(serialDesc, 5, srg.a, self.postal_code);
        }
        if (!output.E(serialDesc) && self.sub_locality == null) {
            return;
        }
        output.B(serialDesc, 6, srg.a, self.sub_locality);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAdministrative_area() {
        return this.administrative_area;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPostal_code() {
        return this.postal_code;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSub_locality() {
        return this.sub_locality;
    }

    public final UserLocationV0OutputUserLocationResultGeocoded copy(String address, String administrative_area, String country, String locality, String name, String postal_code, String sub_locality) {
        return new UserLocationV0OutputUserLocationResultGeocoded(address, administrative_area, country, locality, name, postal_code, sub_locality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserLocationV0OutputUserLocationResultGeocoded)) {
            return false;
        }
        UserLocationV0OutputUserLocationResultGeocoded userLocationV0OutputUserLocationResultGeocoded = (UserLocationV0OutputUserLocationResultGeocoded) other;
        return x44.r(this.address, userLocationV0OutputUserLocationResultGeocoded.address) && x44.r(this.administrative_area, userLocationV0OutputUserLocationResultGeocoded.administrative_area) && x44.r(this.country, userLocationV0OutputUserLocationResultGeocoded.country) && x44.r(this.locality, userLocationV0OutputUserLocationResultGeocoded.locality) && x44.r(this.name, userLocationV0OutputUserLocationResultGeocoded.name) && x44.r(this.postal_code, userLocationV0OutputUserLocationResultGeocoded.postal_code) && x44.r(this.sub_locality, userLocationV0OutputUserLocationResultGeocoded.sub_locality);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getAdministrative_area() {
        return this.administrative_area;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getLocality() {
        return this.locality;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPostal_code() {
        return this.postal_code;
    }

    public final String getSub_locality() {
        return this.sub_locality;
    }

    public int hashCode() {
        String str = this.address;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.administrative_area;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.locality;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.name;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.postal_code;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sub_locality;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        String str = this.address;
        String str2 = this.administrative_area;
        String str3 = this.country;
        String str4 = this.locality;
        String str5 = this.name;
        String str6 = this.postal_code;
        String str7 = this.sub_locality;
        StringBuilder sbR = kgh.r("UserLocationV0OutputUserLocationResultGeocoded(address=", str, ", administrative_area=", str2, ", country=");
        kgh.u(sbR, str3, ", locality=", str4, ", name=");
        kgh.u(sbR, str5, ", postal_code=", str6, ", sub_locality=");
        return ij0.m(sbR, str7, ")");
    }

    public UserLocationV0OutputUserLocationResultGeocoded() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (mq5) null);
    }

    public UserLocationV0OutputUserLocationResultGeocoded(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.address = str;
        this.administrative_area = str2;
        this.country = str3;
        this.locality = str4;
        this.name = str5;
        this.postal_code = str6;
        this.sub_locality = str7;
    }

    public /* synthetic */ UserLocationV0OutputUserLocationResultGeocoded(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
