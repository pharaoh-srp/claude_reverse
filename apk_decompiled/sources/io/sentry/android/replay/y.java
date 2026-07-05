package io.sentry.android.replay;

import defpackage.vb7;

/* JADX INFO: loaded from: classes3.dex */
public final class y {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;

    public y(int i, int i2, float f, float f2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a == yVar.a && this.b == yVar.b && Float.compare(this.c, yVar.c) == 0 && Float.compare(this.d, yVar.d) == 0 && this.e == yVar.e && this.f == yVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + vb7.c(this.e, vb7.b(this.d, vb7.b(this.c, vb7.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
        sb.append(this.a);
        sb.append(", recordingHeight=");
        sb.append(this.b);
        sb.append(", scaleFactorX=");
        sb.append(this.c);
        sb.append(", scaleFactorY=");
        sb.append(this.d);
        sb.append(", frameRate=");
        sb.append(this.e);
        sb.append(", bitRate=");
        return vb7.r(sb, this.f, ')');
    }
}
