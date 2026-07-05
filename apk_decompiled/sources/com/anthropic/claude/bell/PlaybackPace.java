package com.anthropic.claude.bell;

import defpackage.blc;
import defpackage.fq6;
import defpackage.k6d;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.onf;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/bell/PlaybackPace;", "", "", "speedFactor", "<init>", "(Ljava/lang/String;IF)V", "F", "getSpeedFactor", "()F", "Companion", "k6d", "SLOW", "NORMAL", "FAST", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class PlaybackPace {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ PlaybackPace[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final k6d Companion;
    private static final PlaybackPace DEFAULT;
    public static final PlaybackPace FAST;
    public static final PlaybackPace NORMAL;
    public static final PlaybackPace SLOW = new PlaybackPace("SLOW", 0, 0.8f);
    private final float speedFactor;

    private static final /* synthetic */ PlaybackPace[] $values() {
        return new PlaybackPace[]{SLOW, NORMAL, FAST};
    }

    static {
        PlaybackPace playbackPace = new PlaybackPace("NORMAL", 1, 1.0f);
        NORMAL = playbackPace;
        FAST = new PlaybackPace("FAST", 2, 1.2f);
        PlaybackPace[] playbackPaceArr$values = $values();
        $VALUES = playbackPaceArr$values;
        $ENTRIES = wd6.n0(playbackPaceArr$values);
        Companion = new k6d();
        DEFAULT = playbackPace;
        $cachedSerializer$delegate = yb5.w(w1a.F, new blc(25));
    }

    private PlaybackPace(String str, int i, float f) {
        this.speedFactor = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        PlaybackPace[] playbackPaceArrValues = values();
        playbackPaceArrValues.getClass();
        return new lq6("com.anthropic.claude.bell.PlaybackPace", (Enum[]) playbackPaceArrValues);
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static PlaybackPace valueOf(String str) {
        return (PlaybackPace) Enum.valueOf(PlaybackPace.class, str);
    }

    public static PlaybackPace[] values() {
        return (PlaybackPace[]) $VALUES.clone();
    }

    public final float getSpeedFactor() {
        return this.speedFactor;
    }
}
