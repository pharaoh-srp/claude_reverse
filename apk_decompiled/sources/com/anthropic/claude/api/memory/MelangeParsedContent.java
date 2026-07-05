package com.anthropic.claude.api.memory;

import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.r9b;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001d¨\u0006/"}, d2 = {"Lcom/anthropic/claude/api/memory/MelangeParsedContent;", "", "", "name", "description", "body", "", "body_has_rewritten_wikilinks", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/memory/MelangeParsedContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/memory/MelangeParsedContent;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getDescription", "getBody", "Ljava/lang/Boolean;", "getBody_has_rewritten_wikilinks", "Companion", "q9b", "r9b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MelangeParsedContent {
    public static final int $stable = 0;
    public static final r9b Companion = new r9b();
    private final String body;
    private final Boolean body_has_rewritten_wikilinks;
    private final String description;
    private final String name;

    public /* synthetic */ MelangeParsedContent(int i, String str, String str2, String str3, Boolean bool, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.body = null;
        } else {
            this.body = str3;
        }
        if ((i & 8) == 0) {
            this.body_has_rewritten_wikilinks = null;
        } else {
            this.body_has_rewritten_wikilinks = bool;
        }
    }

    public static /* synthetic */ MelangeParsedContent copy$default(MelangeParsedContent melangeParsedContent, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = melangeParsedContent.name;
        }
        if ((i & 2) != 0) {
            str2 = melangeParsedContent.description;
        }
        if ((i & 4) != 0) {
            str3 = melangeParsedContent.body;
        }
        if ((i & 8) != 0) {
            bool = melangeParsedContent.body_has_rewritten_wikilinks;
        }
        return melangeParsedContent.copy(str, str2, str3, bool);
    }

    public static final /* synthetic */ void write$Self$api(MelangeParsedContent self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.name != null) {
            output.B(serialDesc, 0, srg.a, self.name);
        }
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 1, srg.a, self.description);
        }
        if (output.E(serialDesc) || self.body != null) {
            output.B(serialDesc, 2, srg.a, self.body);
        }
        if (!output.E(serialDesc) && self.body_has_rewritten_wikilinks == null) {
            return;
        }
        output.B(serialDesc, 3, zt1.a, self.body_has_rewritten_wikilinks);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getBody_has_rewritten_wikilinks() {
        return this.body_has_rewritten_wikilinks;
    }

    public final MelangeParsedContent copy(String name, String description, String body, Boolean body_has_rewritten_wikilinks) {
        return new MelangeParsedContent(name, description, body, body_has_rewritten_wikilinks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MelangeParsedContent)) {
            return false;
        }
        MelangeParsedContent melangeParsedContent = (MelangeParsedContent) other;
        return x44.r(this.name, melangeParsedContent.name) && x44.r(this.description, melangeParsedContent.description) && x44.r(this.body, melangeParsedContent.body) && x44.r(this.body_has_rewritten_wikilinks, melangeParsedContent.body_has_rewritten_wikilinks);
    }

    public final String getBody() {
        return this.body;
    }

    public final Boolean getBody_has_rewritten_wikilinks() {
        return this.body_has_rewritten_wikilinks;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.body;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.body_has_rewritten_wikilinks;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.description;
        String str3 = this.body;
        Boolean bool = this.body_has_rewritten_wikilinks;
        StringBuilder sbR = kgh.r("MelangeParsedContent(name=", str, ", description=", str2, ", body=");
        sbR.append(str3);
        sbR.append(", body_has_rewritten_wikilinks=");
        sbR.append(bool);
        sbR.append(")");
        return sbR.toString();
    }

    public MelangeParsedContent() {
        this((String) null, (String) null, (String) null, (Boolean) null, 15, (mq5) null);
    }

    public MelangeParsedContent(String str, String str2, String str3, Boolean bool) {
        this.name = str;
        this.description = str2;
        this.body = str3;
        this.body_has_rewritten_wikilinks = bool;
    }

    public /* synthetic */ MelangeParsedContent(String str, String str2, String str3, Boolean bool, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool);
    }
}
