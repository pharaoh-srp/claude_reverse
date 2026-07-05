package com.anthropic.claude.api.experience;

import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.r87;
import defpackage.srg;
import defpackage.u87;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.x87;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceAsset;", "", "Lcom/anthropic/claude/api/experience/ExperienceAssetImageVariants;", "image", "Lcom/anthropic/claude/api/experience/ExperienceAssetResizeMode;", "resize_mode", "", "background_color", "<init>", "(Lcom/anthropic/claude/api/experience/ExperienceAssetImageVariants;Lcom/anthropic/claude/api/experience/ExperienceAssetResizeMode;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/experience/ExperienceAssetImageVariants;Lcom/anthropic/claude/api/experience/ExperienceAssetResizeMode;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/ExperienceAsset;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/experience/ExperienceAssetImageVariants;", "component2", "()Lcom/anthropic/claude/api/experience/ExperienceAssetResizeMode;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/anthropic/claude/api/experience/ExperienceAssetImageVariants;Lcom/anthropic/claude/api/experience/ExperienceAssetResizeMode;Ljava/lang/String;)Lcom/anthropic/claude/api/experience/ExperienceAsset;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/experience/ExperienceAssetImageVariants;", "getImage", "Lcom/anthropic/claude/api/experience/ExperienceAssetResizeMode;", "getResize_mode", "Ljava/lang/String;", "getBackground_color", "Companion", "q87", "r87", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ExperienceAsset {
    public static final int $stable = 0;
    public static final r87 Companion = new r87();
    private final String background_color;
    private final ExperienceAssetImageVariants image;
    private final ExperienceAssetResizeMode resize_mode;

    public /* synthetic */ ExperienceAsset(int i, ExperienceAssetImageVariants experienceAssetImageVariants, ExperienceAssetResizeMode experienceAssetResizeMode, String str, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.image = null;
        } else {
            this.image = experienceAssetImageVariants;
        }
        if ((i & 2) == 0) {
            this.resize_mode = ExperienceAssetResizeMode.FIXED;
        } else {
            this.resize_mode = experienceAssetResizeMode;
        }
        if ((i & 4) == 0) {
            this.background_color = null;
        } else {
            this.background_color = str;
        }
    }

    public static /* synthetic */ ExperienceAsset copy$default(ExperienceAsset experienceAsset, ExperienceAssetImageVariants experienceAssetImageVariants, ExperienceAssetResizeMode experienceAssetResizeMode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            experienceAssetImageVariants = experienceAsset.image;
        }
        if ((i & 2) != 0) {
            experienceAssetResizeMode = experienceAsset.resize_mode;
        }
        if ((i & 4) != 0) {
            str = experienceAsset.background_color;
        }
        return experienceAsset.copy(experienceAssetImageVariants, experienceAssetResizeMode, str);
    }

    public static final /* synthetic */ void write$Self$api(ExperienceAsset self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.image != null) {
            output.B(serialDesc, 0, u87.a, self.image);
        }
        if (output.E(serialDesc) || self.resize_mode != ExperienceAssetResizeMode.FIXED) {
            output.r(serialDesc, 1, x87.d, self.resize_mode);
        }
        if (!output.E(serialDesc) && self.background_color == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.background_color);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ExperienceAssetImageVariants getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ExperienceAssetResizeMode getResize_mode() {
        return this.resize_mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBackground_color() {
        return this.background_color;
    }

    public final ExperienceAsset copy(ExperienceAssetImageVariants image, ExperienceAssetResizeMode resize_mode, String background_color) {
        resize_mode.getClass();
        return new ExperienceAsset(image, resize_mode, background_color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExperienceAsset)) {
            return false;
        }
        ExperienceAsset experienceAsset = (ExperienceAsset) other;
        return x44.r(this.image, experienceAsset.image) && this.resize_mode == experienceAsset.resize_mode && x44.r(this.background_color, experienceAsset.background_color);
    }

    public final String getBackground_color() {
        return this.background_color;
    }

    public final ExperienceAssetImageVariants getImage() {
        return this.image;
    }

    public final ExperienceAssetResizeMode getResize_mode() {
        return this.resize_mode;
    }

    public int hashCode() {
        ExperienceAssetImageVariants experienceAssetImageVariants = this.image;
        int iHashCode = (this.resize_mode.hashCode() + ((experienceAssetImageVariants == null ? 0 : experienceAssetImageVariants.hashCode()) * 31)) * 31;
        String str = this.background_color;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        ExperienceAssetImageVariants experienceAssetImageVariants = this.image;
        ExperienceAssetResizeMode experienceAssetResizeMode = this.resize_mode;
        String str = this.background_color;
        StringBuilder sb = new StringBuilder("ExperienceAsset(image=");
        sb.append(experienceAssetImageVariants);
        sb.append(", resize_mode=");
        sb.append(experienceAssetResizeMode);
        sb.append(", background_color=");
        return ij0.m(sb, str, ")");
    }

    public ExperienceAsset() {
        this((ExperienceAssetImageVariants) null, (ExperienceAssetResizeMode) null, (String) null, 7, (mq5) null);
    }

    public ExperienceAsset(ExperienceAssetImageVariants experienceAssetImageVariants, ExperienceAssetResizeMode experienceAssetResizeMode, String str) {
        experienceAssetResizeMode.getClass();
        this.image = experienceAssetImageVariants;
        this.resize_mode = experienceAssetResizeMode;
        this.background_color = str;
    }

    public /* synthetic */ ExperienceAsset(ExperienceAssetImageVariants experienceAssetImageVariants, ExperienceAssetResizeMode experienceAssetResizeMode, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : experienceAssetImageVariants, (i & 2) != 0 ? ExperienceAssetResizeMode.FIXED : experienceAssetResizeMode, (i & 4) != 0 ? null : str);
    }
}
