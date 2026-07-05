package com.anthropic.claude.configs.flags;

import com.agog.mathdisplay.render.MTTypesetterKt;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.v0j;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/anthropic/claude/configs/flags/VoiceAdaptiveGainConfig;", "", "", "max_gain", "target_rms", "noise_floor_rms", "attack", BuildConfig.BUILD_TYPE, "<init>", "(FFFFF)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IFFFFFLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$configs", "(Lcom/anthropic/claude/configs/flags/VoiceAdaptiveGainConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()F", "component2", "component3", "component4", "component5", "copy", "(FFFFF)Lcom/anthropic/claude/configs/flags/VoiceAdaptiveGainConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getMax_gain", "getTarget_rms", "getNoise_floor_rms", "getAttack", "getRelease", "Companion", "v0j", "u0j", "configs"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceAdaptiveGainConfig {
    public static final int $stable = 0;
    public static final v0j Companion = new v0j();
    public static final float DEFAULT_ATTACK = 0.4f;
    public static final float DEFAULT_MAX_GAIN = 8.0f;
    public static final float DEFAULT_NOISE_FLOOR_RMS = 50.0f;
    public static final float DEFAULT_RELEASE = 0.6f;
    public static final float DEFAULT_TARGET_RMS = 1000.0f;
    public static final String FEATURE_KEY = "project_bell_android_adaptive_gain";
    private final float attack;
    private final float max_gain;
    private final float noise_floor_rms;
    private final float release;
    private final float target_rms;

    public /* synthetic */ VoiceAdaptiveGainConfig(int i, float f, float f2, float f3, float f4, float f5, vnf vnfVar) {
        this.max_gain = (i & 1) == 0 ? 8.0f : f;
        if ((i & 2) == 0) {
            this.target_rms = 1000.0f;
        } else {
            this.target_rms = f2;
        }
        if ((i & 4) == 0) {
            this.noise_floor_rms = 50.0f;
        } else {
            this.noise_floor_rms = f3;
        }
        if ((i & 8) == 0) {
            this.attack = 0.4f;
        } else {
            this.attack = f4;
        }
        if ((i & 16) == 0) {
            this.release = 0.6f;
        } else {
            this.release = f5;
        }
    }

    public static /* synthetic */ VoiceAdaptiveGainConfig copy$default(VoiceAdaptiveGainConfig voiceAdaptiveGainConfig, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 1) != 0) {
            f = voiceAdaptiveGainConfig.max_gain;
        }
        if ((i & 2) != 0) {
            f2 = voiceAdaptiveGainConfig.target_rms;
        }
        if ((i & 4) != 0) {
            f3 = voiceAdaptiveGainConfig.noise_floor_rms;
        }
        if ((i & 8) != 0) {
            f4 = voiceAdaptiveGainConfig.attack;
        }
        if ((i & 16) != 0) {
            f5 = voiceAdaptiveGainConfig.release;
        }
        float f6 = f5;
        float f7 = f3;
        return voiceAdaptiveGainConfig.copy(f, f2, f7, f4, f6);
    }

    public static final /* synthetic */ void write$Self$configs(VoiceAdaptiveGainConfig self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || Float.compare(self.max_gain, 8.0f) != 0) {
            output.k(serialDesc, 0, self.max_gain);
        }
        if (output.E(serialDesc) || Float.compare(self.target_rms, 1000.0f) != 0) {
            output.k(serialDesc, 1, self.target_rms);
        }
        if (output.E(serialDesc) || Float.compare(self.noise_floor_rms, 50.0f) != 0) {
            output.k(serialDesc, 2, self.noise_floor_rms);
        }
        if (output.E(serialDesc) || Float.compare(self.attack, 0.4f) != 0) {
            output.k(serialDesc, 3, self.attack);
        }
        if (!output.E(serialDesc) && Float.compare(self.release, 0.6f) == 0) {
            return;
        }
        output.k(serialDesc, 4, self.release);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getMax_gain() {
        return this.max_gain;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTarget_rms() {
        return this.target_rms;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getNoise_floor_rms() {
        return this.noise_floor_rms;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getAttack() {
        return this.attack;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getRelease() {
        return this.release;
    }

    public final VoiceAdaptiveGainConfig copy(float max_gain, float target_rms, float noise_floor_rms, float attack, float release) {
        return new VoiceAdaptiveGainConfig(max_gain, target_rms, noise_floor_rms, attack, release);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceAdaptiveGainConfig)) {
            return false;
        }
        VoiceAdaptiveGainConfig voiceAdaptiveGainConfig = (VoiceAdaptiveGainConfig) other;
        return Float.compare(this.max_gain, voiceAdaptiveGainConfig.max_gain) == 0 && Float.compare(this.target_rms, voiceAdaptiveGainConfig.target_rms) == 0 && Float.compare(this.noise_floor_rms, voiceAdaptiveGainConfig.noise_floor_rms) == 0 && Float.compare(this.attack, voiceAdaptiveGainConfig.attack) == 0 && Float.compare(this.release, voiceAdaptiveGainConfig.release) == 0;
    }

    public final float getAttack() {
        return this.attack;
    }

    public final float getMax_gain() {
        return this.max_gain;
    }

    public final float getNoise_floor_rms() {
        return this.noise_floor_rms;
    }

    public final float getRelease() {
        return this.release;
    }

    public final float getTarget_rms() {
        return this.target_rms;
    }

    public int hashCode() {
        return Float.hashCode(this.release) + vb7.b(this.attack, vb7.b(this.noise_floor_rms, vb7.b(this.target_rms, Float.hashCode(this.max_gain) * 31, 31), 31), 31);
    }

    public String toString() {
        return "VoiceAdaptiveGainConfig(max_gain=" + this.max_gain + ", target_rms=" + this.target_rms + ", noise_floor_rms=" + this.noise_floor_rms + ", attack=" + this.attack + ", release=" + this.release + ")";
    }

    public VoiceAdaptiveGainConfig(float f, float f2, float f3, float f4, float f5) {
        this.max_gain = f;
        this.target_rms = f2;
        this.noise_floor_rms = f3;
        this.attack = f4;
        this.release = f5;
    }

    public VoiceAdaptiveGainConfig() {
        this(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 31, (mq5) null);
    }

    public /* synthetic */ VoiceAdaptiveGainConfig(float f, float f2, float f3, float f4, float f5, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? 8.0f : f, (i & 2) != 0 ? 1000.0f : f2, (i & 4) != 0 ? 50.0f : f3, (i & 8) != 0 ? 0.4f : f4, (i & 16) != 0 ? 0.6f : f5);
    }
}
