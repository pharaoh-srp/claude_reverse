package com.anthropic.claude.api.account;

import defpackage.gvj;
import defpackage.h3a;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sd8;
import defpackage.srg;
import defpackage.td8;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234BF\u0012%\u0010\t\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBE\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001d\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"JQ\u0010#\u001a\u00020\u00002'\b\u0002\u0010\t\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R6\u0010\t\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010\"¨\u00065"}, d2 = {"Lcom/anthropic/claude/api/account/GrowthBookSchema;", "", "", "", "Lcom/anthropic/claude/api/account/GrowthBookFeature;", "Lcom/anthropic/claude/api/account/GrowthBookFeatureMap;", "Lonf;", "with", "Lh3a;", "features", "hashing_algorithm", "Lkotlinx/serialization/json/JsonObject;", "user", "<init>", "(Ljava/util/Map;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/GrowthBookSchema;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Map;", "component2", "()Ljava/lang/String;", "component3", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/util/Map;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/api/account/GrowthBookSchema;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getFeatures", "Ljava/lang/String;", "getHashing_algorithm", "Lkotlinx/serialization/json/JsonObject;", "getUser", "Companion", "sd8", "td8", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GrowthBookSchema {
    public static final int $stable = 0;
    public static final td8 Companion = new td8();
    private final Map<String, GrowthBookFeature> features;
    private final String hashing_algorithm;
    private final JsonObject user;

    public /* synthetic */ GrowthBookSchema(int i, Map map, String str, JsonObject jsonObject, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, sd8.a.getDescriptor());
            throw null;
        }
        this.features = map;
        if ((i & 2) == 0) {
            this.hashing_algorithm = null;
        } else {
            this.hashing_algorithm = str;
        }
        if ((i & 4) == 0) {
            this.user = null;
        } else {
            this.user = jsonObject;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GrowthBookSchema copy$default(GrowthBookSchema growthBookSchema, Map map, String str, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            map = growthBookSchema.features;
        }
        if ((i & 2) != 0) {
            str = growthBookSchema.hashing_algorithm;
        }
        if ((i & 4) != 0) {
            jsonObject = growthBookSchema.user;
        }
        return growthBookSchema.copy(map, str, jsonObject);
    }

    public static final /* synthetic */ void write$Self$api(GrowthBookSchema self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, h3a.a, self.features);
        if (output.E(serialDesc) || self.hashing_algorithm != null) {
            output.B(serialDesc, 1, srg.a, self.hashing_algorithm);
        }
        if (!output.E(serialDesc) && self.user == null) {
            return;
        }
        output.B(serialDesc, 2, uh9.a, self.user);
    }

    public final Map<String, GrowthBookFeature> component1() {
        return this.features;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHashing_algorithm() {
        return this.hashing_algorithm;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonObject getUser() {
        return this.user;
    }

    public final GrowthBookSchema copy(Map<String, GrowthBookFeature> features, String hashing_algorithm, JsonObject user) {
        features.getClass();
        return new GrowthBookSchema(features, hashing_algorithm, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GrowthBookSchema)) {
            return false;
        }
        GrowthBookSchema growthBookSchema = (GrowthBookSchema) other;
        return x44.r(this.features, growthBookSchema.features) && x44.r(this.hashing_algorithm, growthBookSchema.hashing_algorithm) && x44.r(this.user, growthBookSchema.user);
    }

    public final Map<String, GrowthBookFeature> getFeatures() {
        return this.features;
    }

    public final String getHashing_algorithm() {
        return this.hashing_algorithm;
    }

    public final JsonObject getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.features.hashCode() * 31;
        String str = this.hashing_algorithm;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        JsonObject jsonObject = this.user;
        return iHashCode2 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public String toString() {
        return "GrowthBookSchema(features=" + this.features + ", hashing_algorithm=" + this.hashing_algorithm + ", user=" + this.user + ")";
    }

    public GrowthBookSchema(Map<String, GrowthBookFeature> map, String str, JsonObject jsonObject) {
        map.getClass();
        this.features = map;
        this.hashing_algorithm = str;
        this.user = jsonObject;
    }

    public /* synthetic */ GrowthBookSchema(Map map, String str, JsonObject jsonObject, int i, mq5 mq5Var) {
        this(map, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : jsonObject);
    }
}
