package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public enum z6 {
    LOW(0.8f, 50000, 10),
    MEDIUM(1.0f, 75000, 30),
    HIGH(1.0f, 100000, 50);

    public final int bitRate;
    public final int screenshotQuality;
    public final float sizeScale;

    z6(float f, int i, int i2) {
        this.sizeScale = f;
        this.bitRate = i;
        this.screenshotQuality = i2;
    }

    public String serializedName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
