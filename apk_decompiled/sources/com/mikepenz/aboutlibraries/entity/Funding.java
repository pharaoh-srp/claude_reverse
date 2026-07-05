package com.mikepenz.aboutlibraries.entity;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.o08;
import defpackage.onf;
import defpackage.p08;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006*"}, d2 = {"Lcom/mikepenz/aboutlibraries/entity/Funding;", "", "", "platform", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$aboutlibraries_core_release", "(Lcom/mikepenz/aboutlibraries/entity/Funding;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/mikepenz/aboutlibraries/entity/Funding;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlatform", "getPlatform$annotations", "()V", "getUrl", "getUrl$annotations", "Companion", "o08", "p08", "aboutlibraries-core_release"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
@onf
public final /* data */ class Funding {
    public static final p08 Companion = new p08();
    private final String platform;
    private final String url;

    public /* synthetic */ Funding(int i, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, o08.a.getDescriptor());
            throw null;
        }
        this.platform = str;
        this.url = str2;
    }

    public static /* synthetic */ Funding copy$default(Funding funding, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = funding.platform;
        }
        if ((i & 2) != 0) {
            str2 = funding.url;
        }
        return funding.copy(str, str2);
    }

    public static /* synthetic */ void getPlatform$annotations() {
    }

    public static /* synthetic */ void getUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$aboutlibraries_core_release(Funding self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.platform);
        output.q(serialDesc, 1, self.url);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final Funding copy(String platform, String url) {
        platform.getClass();
        url.getClass();
        return new Funding(platform, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Funding)) {
            return false;
        }
        Funding funding = (Funding) other;
        return x44.r(this.platform, funding.platform) && x44.r(this.url, funding.url);
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (this.platform.hashCode() * 31);
    }

    public String toString() {
        return ij0.l("Funding(platform=", this.platform, ", url=", this.url, ")");
    }

    public Funding(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.platform = str;
        this.url = str2;
    }
}
