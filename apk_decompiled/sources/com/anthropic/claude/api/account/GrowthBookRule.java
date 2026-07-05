package com.anthropic.claude.api.account;

import defpackage.eh9;
import defpackage.ij0;
import defpackage.jd7;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rd8;
import defpackage.srg;
import defpackage.ud8;
import defpackage.uo0;
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
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lcom/anthropic/claude/api/account/GrowthBookRule;", "", "Lkotlinx/serialization/json/JsonElement;", "force", "", "Lcom/anthropic/claude/api/account/GrowthBookTrack;", "tracks", "", "id", "<init>", "(Lkotlinx/serialization/json/JsonElement;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILkotlinx/serialization/json/JsonElement;Ljava/util/List;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/GrowthBookRule;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lkotlinx/serialization/json/JsonElement;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "copy", "(Lkotlinx/serialization/json/JsonElement;Ljava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/api/account/GrowthBookRule;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/JsonElement;", "getForce", "Ljava/util/List;", "getTracks", "Ljava/lang/String;", "getId", "Companion", "qd8", "rd8", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GrowthBookRule {
    public static final int $stable = 0;
    private final JsonElement force;
    private final String id;
    private final List<GrowthBookTrack> tracks;
    public static final rd8 Companion = new rd8();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new jd7(15)), null};

    public /* synthetic */ GrowthBookRule(int i, JsonElement jsonElement, List list, String str, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.force = null;
        } else {
            this.force = jsonElement;
        }
        if ((i & 2) == 0) {
            this.tracks = null;
        } else {
            this.tracks = list;
        }
        if ((i & 4) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(ud8.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GrowthBookRule copy$default(GrowthBookRule growthBookRule, JsonElement jsonElement, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonElement = growthBookRule.force;
        }
        if ((i & 2) != 0) {
            list = growthBookRule.tracks;
        }
        if ((i & 4) != 0) {
            str = growthBookRule.id;
        }
        return growthBookRule.copy(jsonElement, list, str);
    }

    public static final /* synthetic */ void write$Self$api(GrowthBookRule self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.force != null) {
            output.B(serialDesc, 0, eh9.a, self.force);
        }
        if (output.E(serialDesc) || self.tracks != null) {
            output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.tracks);
        }
        if (!output.E(serialDesc) && self.id == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JsonElement getForce() {
        return this.force;
    }

    public final List<GrowthBookTrack> component2() {
        return this.tracks;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final GrowthBookRule copy(JsonElement force, List<GrowthBookTrack> tracks, String id) {
        return new GrowthBookRule(force, tracks, id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GrowthBookRule)) {
            return false;
        }
        GrowthBookRule growthBookRule = (GrowthBookRule) other;
        return x44.r(this.force, growthBookRule.force) && x44.r(this.tracks, growthBookRule.tracks) && x44.r(this.id, growthBookRule.id);
    }

    public final JsonElement getForce() {
        return this.force;
    }

    public final String getId() {
        return this.id;
    }

    public final List<GrowthBookTrack> getTracks() {
        return this.tracks;
    }

    public int hashCode() {
        JsonElement jsonElement = this.force;
        int iHashCode = (jsonElement == null ? 0 : jsonElement.hashCode()) * 31;
        List<GrowthBookTrack> list = this.tracks;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.id;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        JsonElement jsonElement = this.force;
        List<GrowthBookTrack> list = this.tracks;
        String str = this.id;
        StringBuilder sb = new StringBuilder("GrowthBookRule(force=");
        sb.append(jsonElement);
        sb.append(", tracks=");
        sb.append(list);
        sb.append(", id=");
        return ij0.m(sb, str, ")");
    }

    public GrowthBookRule() {
        this((JsonElement) null, (List) null, (String) null, 7, (mq5) null);
    }

    public GrowthBookRule(JsonElement jsonElement, List<GrowthBookTrack> list, String str) {
        this.force = jsonElement;
        this.tracks = list;
        this.id = str;
    }

    public /* synthetic */ GrowthBookRule(JsonElement jsonElement, List list, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : jsonElement, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str);
    }
}
