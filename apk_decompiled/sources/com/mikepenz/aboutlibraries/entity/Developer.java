package com.mikepenz.aboutlibraries.entity;

import defpackage.f26;
import defpackage.g26;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006*"}, d2 = {"Lcom/mikepenz/aboutlibraries/entity/Developer;", "", "", "name", "organisationUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$aboutlibraries_core_release", "(Lcom/mikepenz/aboutlibraries/entity/Developer;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/mikepenz/aboutlibraries/entity/Developer;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getOrganisationUrl", "getOrganisationUrl$annotations", "Companion", "f26", "g26", "aboutlibraries-core_release"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
@onf
public final /* data */ class Developer {
    public static final g26 Companion = new g26();
    private final String name;
    private final String organisationUrl;

    public /* synthetic */ Developer(int i, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, f26.a.getDescriptor());
            throw null;
        }
        this.name = str;
        this.organisationUrl = str2;
    }

    public static /* synthetic */ Developer copy$default(Developer developer, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = developer.name;
        }
        if ((i & 2) != 0) {
            str2 = developer.organisationUrl;
        }
        return developer.copy(str, str2);
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getOrganisationUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$aboutlibraries_core_release(Developer self, vd4 output, SerialDescriptor serialDesc) {
        srg srgVar = srg.a;
        output.B(serialDesc, 0, srgVar, self.name);
        output.B(serialDesc, 1, srgVar, self.organisationUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrganisationUrl() {
        return this.organisationUrl;
    }

    public final Developer copy(String name, String organisationUrl) {
        return new Developer(name, organisationUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Developer)) {
            return false;
        }
        Developer developer = (Developer) other;
        return x44.r(this.name, developer.name) && x44.r(this.organisationUrl, developer.organisationUrl);
    }

    public final String getName() {
        return this.name;
    }

    public final String getOrganisationUrl() {
        return this.organisationUrl;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.organisationUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return ij0.l("Developer(name=", this.name, ", organisationUrl=", this.organisationUrl, ")");
    }

    public Developer(String str, String str2) {
        this.name = str;
        this.organisationUrl = str2;
    }
}
