package com.anthropic.claude.api.experience;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y87;
import defpackage.z87;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceAssetScaledImage;", "", "", "url", "", "scale", "<init>", "(Ljava/lang/String;F)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;FLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/ExperienceAssetScaledImage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()F", "copy", "(Ljava/lang/String;F)Lcom/anthropic/claude/api/experience/ExperienceAssetScaledImage;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "F", "getScale", "Companion", "y87", "z87", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ExperienceAssetScaledImage {
    public static final int $stable = 0;
    public static final z87 Companion = new z87();
    private final float scale;
    private final String url;

    public /* synthetic */ ExperienceAssetScaledImage(int i, String str, float f, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, y87.a.getDescriptor());
            throw null;
        }
        this.url = str;
        if ((i & 2) == 0) {
            this.scale = 1.0f;
        } else {
            this.scale = f;
        }
    }

    public static /* synthetic */ ExperienceAssetScaledImage copy$default(ExperienceAssetScaledImage experienceAssetScaledImage, String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = experienceAssetScaledImage.url;
        }
        if ((i & 2) != 0) {
            f = experienceAssetScaledImage.scale;
        }
        return experienceAssetScaledImage.copy(str, f);
    }

    public static final /* synthetic */ void write$Self$api(ExperienceAssetScaledImage self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.url);
        if (!output.E(serialDesc) && Float.compare(self.scale, 1.0f) == 0) {
            return;
        }
        output.k(serialDesc, 1, self.scale);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    public final ExperienceAssetScaledImage copy(String url, float scale) {
        url.getClass();
        return new ExperienceAssetScaledImage(url, scale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExperienceAssetScaledImage)) {
            return false;
        }
        ExperienceAssetScaledImage experienceAssetScaledImage = (ExperienceAssetScaledImage) other;
        return x44.r(this.url, experienceAssetScaledImage.url) && Float.compare(this.scale, experienceAssetScaledImage.scale) == 0;
    }

    public final float getScale() {
        return this.scale;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Float.hashCode(this.scale) + (this.url.hashCode() * 31);
    }

    public String toString() {
        return "ExperienceAssetScaledImage(url=" + this.url + ", scale=" + this.scale + ")";
    }

    public ExperienceAssetScaledImage(String str, float f) {
        str.getClass();
        this.url = str;
        this.scale = f;
    }

    public /* synthetic */ ExperienceAssetScaledImage(String str, float f, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? 1.0f : f);
    }
}
