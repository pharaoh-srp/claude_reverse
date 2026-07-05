package com.anthropic.claude.api.mobile;

import defpackage.c97;
import defpackage.f7a;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.nea;
import defpackage.onf;
import defpackage.p48;
import defpackage.q48;
import defpackage.srg;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0018\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0017¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/mobile/GetTranslationsResponse;", "", "", "", "Lcom/anthropic/claude/api/mobile/LocalizedString;", "translations", "<init>", "(Ljava/util/Map;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Map;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mobile/GetTranslationsResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/anthropic/claude/api/mobile/GetTranslationsResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getTranslations", "Companion", "p48", "q48", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GetTranslationsResponse {
    public static final int $stable = 0;
    private final Map<String, LocalizedString> translations;
    public static final q48 Companion = new q48();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new c97(18))};

    public /* synthetic */ GetTranslationsResponse(int i, Map map, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.translations = map;
        } else {
            gvj.f(i, 1, p48.a.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f7a(srg.a, nea.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetTranslationsResponse copy$default(GetTranslationsResponse getTranslationsResponse, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = getTranslationsResponse.translations;
        }
        return getTranslationsResponse.copy(map);
    }

    public final Map<String, LocalizedString> component1() {
        return this.translations;
    }

    public final GetTranslationsResponse copy(Map<String, LocalizedString> translations) {
        return new GetTranslationsResponse(translations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetTranslationsResponse) && x44.r(this.translations, ((GetTranslationsResponse) other).translations);
    }

    public final Map<String, LocalizedString> getTranslations() {
        return this.translations;
    }

    public int hashCode() {
        Map<String, LocalizedString> map = this.translations;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return "GetTranslationsResponse(translations=" + this.translations + ")";
    }

    public GetTranslationsResponse(Map<String, LocalizedString> map) {
        this.translations = map;
    }
}
