package com.mikepenz.aboutlibraries.entity;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bsg;
import defpackage.fzc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.jce;
import defpackage.k7f;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.l3a;
import defpackage.m3a;
import defpackage.m99;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mz8;
import defpackage.onf;
import defpackage.rz8;
import defpackage.srg;
import defpackage.v8d;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.zjc;
import defpackage.znf;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0002`aB\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016B\u009b\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u009c\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001dJ\u0010\u0010/\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010>\u0012\u0004\bC\u0010A\u001a\u0004\bB\u0010\u001dR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010>\u0012\u0004\bE\u0010A\u001a\u0004\bD\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010>\u0012\u0004\bG\u0010A\u001a\u0004\bF\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010>\u0012\u0004\bI\u0010A\u001a\u0004\bH\u0010\u001dR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010J\u0012\u0004\bL\u0010A\u001a\u0004\bK\u0010#R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010M\u0012\u0004\bO\u0010A\u001a\u0004\bN\u0010%R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010P\u0012\u0004\bR\u0010A\u001a\u0004\bQ\u0010'R&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010S\u0012\u0004\bU\u0010A\u001a\u0004\bT\u0010)R&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010S\u0012\u0004\bW\u0010A\u001a\u0004\bV\u0010)R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010>\u0012\u0004\bY\u0010A\u001a\u0004\bX\u0010\u001dR\u0011\u0010[\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bZ\u0010\u001dR\u0011\u0010^\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006b"}, d2 = {"Lcom/mikepenz/aboutlibraries/entity/Library;", "", "", "uniqueId", "artifactVersion", "name", "description", "website", "Lmz8;", "Lcom/mikepenz/aboutlibraries/entity/Developer;", "developers", "Lcom/mikepenz/aboutlibraries/entity/Organization;", "organization", "Lcom/mikepenz/aboutlibraries/entity/Scm;", "scm", "Lrz8;", "Lcom/mikepenz/aboutlibraries/entity/License;", "licenses", "Lcom/mikepenz/aboutlibraries/entity/Funding;", "funding", "tag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmz8;Lcom/mikepenz/aboutlibraries/entity/Organization;Lcom/mikepenz/aboutlibraries/entity/Scm;Lrz8;Lrz8;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmz8;Lcom/mikepenz/aboutlibraries/entity/Organization;Lcom/mikepenz/aboutlibraries/entity/Scm;Lrz8;Lrz8;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lmz8;", "component7", "()Lcom/mikepenz/aboutlibraries/entity/Organization;", "component8", "()Lcom/mikepenz/aboutlibraries/entity/Scm;", "component9", "()Lrz8;", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmz8;Lcom/mikepenz/aboutlibraries/entity/Organization;Lcom/mikepenz/aboutlibraries/entity/Scm;Lrz8;Lrz8;Ljava/lang/String;)Lcom/mikepenz/aboutlibraries/entity/Library;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$aboutlibraries_core_release", "(Lcom/mikepenz/aboutlibraries/entity/Library;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUniqueId", "getUniqueId$annotations", "()V", "getArtifactVersion", "getArtifactVersion$annotations", "getName", "getName$annotations", "getDescription", "getDescription$annotations", "getWebsite", "getWebsite$annotations", "Lmz8;", "getDevelopers", "getDevelopers$annotations", "Lcom/mikepenz/aboutlibraries/entity/Organization;", "getOrganization", "getOrganization$annotations", "Lcom/mikepenz/aboutlibraries/entity/Scm;", "getScm", "getScm$annotations", "Lrz8;", "getLicenses", "getLicenses$annotations", "getFunding", "getFunding$annotations", "getTag", "getTag$annotations", "getArtifactId", "artifactId", "getOpenSource", "()Z", "openSource", "Companion", "l3a", "m3a", "aboutlibraries-core_release"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
@onf
public final /* data */ class Library {
    private static final kw9[] $childSerializers;
    public static final m3a Companion = new m3a();
    private final String artifactVersion;
    private final String description;
    private final mz8 developers;
    private final rz8 funding;
    private final rz8 licenses;
    private final String name;
    private final Organization organization;
    private final Scm scm;
    private final String tag;
    private final String uniqueId;
    private final String website;

    static {
        m99 m99Var = new m99(6);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, null, yb5.w(w1aVar, m99Var), null, null, yb5.w(w1aVar, new m99(7)), yb5.w(w1aVar, new m99(8)), null};
    }

    public Library(int i, String str, String str2, String str3, String str4, String str5, mz8 mz8Var, Organization organization, Scm scm, rz8 rz8Var, rz8 rz8Var2, String str6, vnf vnfVar) {
        if (255 != (i & 255)) {
            gvj.f(i, 255, l3a.a.getDescriptor());
            throw null;
        }
        this.uniqueId = str;
        this.artifactVersion = str2;
        this.name = str3;
        this.description = str4;
        this.website = str5;
        this.developers = mz8Var;
        this.organization = organization;
        this.scm = scm;
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.licenses = fzc.H;
        } else {
            this.licenses = rz8Var;
        }
        if ((i & 512) == 0) {
            this.funding = fzc.H;
        } else {
            this.funding = rz8Var2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.tag = null;
        } else {
            this.tag = str6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        return new v8d(jce.a.b(mz8.class), new Annotation[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$0() {
        return new v8d(jce.a.b(rz8.class), new Annotation[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$1() {
        return new v8d(jce.a.b(rz8.class), new Annotation[0]);
    }

    public static /* synthetic */ Library copy$default(Library library, String str, String str2, String str3, String str4, String str5, mz8 mz8Var, Organization organization, Scm scm, rz8 rz8Var, rz8 rz8Var2, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = library.uniqueId;
        }
        if ((i & 2) != 0) {
            str2 = library.artifactVersion;
        }
        if ((i & 4) != 0) {
            str3 = library.name;
        }
        if ((i & 8) != 0) {
            str4 = library.description;
        }
        if ((i & 16) != 0) {
            str5 = library.website;
        }
        if ((i & 32) != 0) {
            mz8Var = library.developers;
        }
        if ((i & 64) != 0) {
            organization = library.organization;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            scm = library.scm;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            rz8Var = library.licenses;
        }
        if ((i & 512) != 0) {
            rz8Var2 = library.funding;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            str6 = library.tag;
        }
        rz8 rz8Var3 = rz8Var2;
        String str7 = str6;
        Scm scm2 = scm;
        rz8 rz8Var4 = rz8Var;
        mz8 mz8Var2 = mz8Var;
        Organization organization2 = organization;
        String str8 = str5;
        String str9 = str3;
        return library.copy(str, str2, str9, str4, str8, mz8Var2, organization2, scm2, rz8Var4, rz8Var3, str7);
    }

    public static /* synthetic */ void getArtifactVersion$annotations() {
    }

    public static /* synthetic */ void getDescription$annotations() {
    }

    public static /* synthetic */ void getDevelopers$annotations() {
    }

    public static /* synthetic */ void getFunding$annotations() {
    }

    public static /* synthetic */ void getLicenses$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getOrganization$annotations() {
    }

    public static /* synthetic */ void getScm$annotations() {
    }

    public static /* synthetic */ void getTag$annotations() {
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }

    public static /* synthetic */ void getWebsite$annotations() {
    }

    public static final void write$Self$aboutlibraries_core_release(Library self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.uniqueId);
        srg srgVar = srg.a;
        output.B(serialDesc, 1, srgVar, self.artifactVersion);
        output.q(serialDesc, 2, self.name);
        output.B(serialDesc, 3, srgVar, self.description);
        output.B(serialDesc, 4, srgVar, self.website);
        output.r(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.developers);
        output.B(serialDesc, 6, zjc.a, self.organization);
        output.B(serialDesc, 7, k7f.a, self.scm);
        if (output.E(serialDesc) || !x44.r(self.licenses, fzc.H)) {
            output.r(serialDesc, 8, (znf) kw9VarArr[8].getValue(), self.licenses);
        }
        if (output.E(serialDesc) || !x44.r(self.funding, fzc.H)) {
            output.r(serialDesc, 9, (znf) kw9VarArr[9].getValue(), self.funding);
        }
        if (!output.E(serialDesc) && self.tag == null) {
            return;
        }
        output.B(serialDesc, 10, srgVar, self.tag);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUniqueId() {
        return this.uniqueId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final rz8 getFunding() {
        return this.funding;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getArtifactVersion() {
        return this.artifactVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWebsite() {
        return this.website;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final mz8 getDevelopers() {
        return this.developers;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Organization getOrganization() {
        return this.organization;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Scm getScm() {
        return this.scm;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final rz8 getLicenses() {
        return this.licenses;
    }

    public final Library copy(String uniqueId, String artifactVersion, String name, String description, String website, mz8 developers, Organization organization, Scm scm, rz8 licenses, rz8 funding, String tag) {
        uniqueId.getClass();
        name.getClass();
        developers.getClass();
        licenses.getClass();
        funding.getClass();
        return new Library(uniqueId, artifactVersion, name, description, website, developers, organization, scm, licenses, funding, tag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Library)) {
            return false;
        }
        Library library = (Library) other;
        return x44.r(this.uniqueId, library.uniqueId) && x44.r(this.artifactVersion, library.artifactVersion) && x44.r(this.name, library.name) && x44.r(this.description, library.description) && x44.r(this.website, library.website) && x44.r(this.developers, library.developers) && x44.r(this.organization, library.organization) && x44.r(this.scm, library.scm) && x44.r(this.licenses, library.licenses) && x44.r(this.funding, library.funding) && x44.r(this.tag, library.tag);
    }

    public final String getArtifactId() {
        String str = this.uniqueId;
        String str2 = this.artifactVersion;
        if (str2 == null) {
            str2 = "";
        }
        return ij0.C(str, ":", str2);
    }

    public final String getArtifactVersion() {
        return this.artifactVersion;
    }

    public final String getDescription() {
        return this.description;
    }

    public final mz8 getDevelopers() {
        return this.developers;
    }

    public final rz8 getFunding() {
        return this.funding;
    }

    public final rz8 getLicenses() {
        return this.licenses;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getOpenSource() {
        String url;
        Scm scm = this.scm;
        return (scm == null || (url = scm.getUrl()) == null || !(bsg.I0(url) ^ true)) ? false : true;
    }

    public final Organization getOrganization() {
        return this.organization;
    }

    public final Scm getScm() {
        return this.scm;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final String getWebsite() {
        return this.website;
    }

    public int hashCode() {
        int iHashCode = this.uniqueId.hashCode() * 31;
        String str = this.artifactVersion;
        int iL = kgh.l((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.name);
        String str2 = this.description;
        int iHashCode2 = (iL + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.website;
        int iHashCode3 = (this.developers.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        Organization organization = this.organization;
        int iHashCode4 = (iHashCode3 + (organization == null ? 0 : organization.hashCode())) * 31;
        Scm scm = this.scm;
        int iHashCode5 = (this.funding.hashCode() + ((this.licenses.hashCode() + ((iHashCode4 + (scm == null ? 0 : scm.hashCode())) * 31)) * 31)) * 31;
        String str4 = this.tag;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.uniqueId;
        String str2 = this.artifactVersion;
        String str3 = this.name;
        String str4 = this.description;
        String str5 = this.website;
        mz8 mz8Var = this.developers;
        Organization organization = this.organization;
        Scm scm = this.scm;
        rz8 rz8Var = this.licenses;
        rz8 rz8Var2 = this.funding;
        String str6 = this.tag;
        StringBuilder sbR = kgh.r("Library(uniqueId=", str, ", artifactVersion=", str2, ", name=");
        kgh.u(sbR, str3, ", description=", str4, ", website=");
        sbR.append(str5);
        sbR.append(", developers=");
        sbR.append(mz8Var);
        sbR.append(", organization=");
        sbR.append(organization);
        sbR.append(", scm=");
        sbR.append(scm);
        sbR.append(", licenses=");
        sbR.append(rz8Var);
        sbR.append(", funding=");
        sbR.append(rz8Var2);
        sbR.append(", tag=");
        return ij0.m(sbR, str6, ")");
    }

    public Library(String str, String str2, String str3, String str4, String str5, mz8 mz8Var, Organization organization, Scm scm, rz8 rz8Var, rz8 rz8Var2, String str6) {
        str.getClass();
        str3.getClass();
        mz8Var.getClass();
        rz8Var.getClass();
        rz8Var2.getClass();
        this.uniqueId = str;
        this.artifactVersion = str2;
        this.name = str3;
        this.description = str4;
        this.website = str5;
        this.developers = mz8Var;
        this.organization = organization;
        this.scm = scm;
        this.licenses = rz8Var;
        this.funding = rz8Var2;
        this.tag = str6;
    }

    public Library(String str, String str2, String str3, String str4, String str5, mz8 mz8Var, Organization organization, Scm scm, rz8 rz8Var, rz8 rz8Var2, String str6, int i, mq5 mq5Var) {
        this(str, str2, str3, str4, str5, mz8Var, organization, scm, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? fzc.H : rz8Var, (i & 512) != 0 ? fzc.H : rz8Var2, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : str6);
    }
}
