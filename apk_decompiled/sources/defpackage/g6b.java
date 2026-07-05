package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class g6b {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public g6b(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = gkb.j(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(tpi.e(i, widthAlignment) * widthAlignment, tpi.e(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.g6b i(java.lang.String r11, java.lang.String r12, java.lang.String r13, android.media.MediaCodecInfo.CodecCapabilities r14, boolean r15, boolean r16, boolean r17) {
        /*
            g6b r0 = new g6b
            java.lang.String r1 = "adaptive-playback"
            boolean r8 = r14.isFeatureSupported(r1)
            java.lang.String r1 = "tunneled-playback"
            r14.isFeatureSupported(r1)
            java.lang.String r1 = "secure-playback"
            boolean r9 = r14.isFeatureSupported(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 < r2) goto L58
            java.lang.String r1 = "detached-surface"
            boolean r1 = r14.isFeatureSupported(r1)
            if (r1 == 0) goto L58
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r2 = "Xiaomi"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L58
            java.lang.String r2 = "OPPO"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L58
            java.lang.String r2 = "realme"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L58
            java.lang.String r2 = "motorola"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L58
            java.lang.String r2 = "LENOVO"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4c
            goto L58
        L4c:
            r1 = 1
        L4d:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r10 = r1
            r1 = r11
            goto L5a
        L58:
            r1 = 0
            goto L4d
        L5a:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6b.i(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean):g6b");
    }

    public final to5 b(jw7 jw7Var, jw7 jw7Var2) {
        jw7 jw7Var3;
        jw7 jw7Var4;
        int i;
        String str = jw7Var.o;
        f54 f54Var = jw7Var.E;
        String str2 = jw7Var2.o;
        f54 f54Var2 = jw7Var2.E;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (jw7Var.A != jw7Var2.A) {
                i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
            }
            boolean z = (jw7Var.v == jw7Var2.v && jw7Var.w == jw7Var2.w) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            if ((!f54.e(f54Var) || !f54.e(f54Var2)) && !Objects.equals(f54Var, f54Var2)) {
                i2 |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !jw7Var.b(jw7Var2)) {
                i2 |= 2;
            }
            int i3 = jw7Var.x;
            if (i3 != -1 && (i = jw7Var.y) != -1 && i3 == jw7Var2.x && i == jw7Var2.y && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(jw7Var2.o, "video/dolby-vision")) {
                Pair pairB = q34.b(jw7Var);
                Pair pairB2 = q34.b(jw7Var2);
                if (pairB == null || pairB2 == null || !((Integer) pairB.first).equals(pairB2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new to5(this.a, jw7Var, jw7Var2, jw7Var.b(jw7Var2) ? 3 : 2, 0);
            }
            jw7Var3 = jw7Var;
            jw7Var4 = jw7Var2;
        } else {
            jw7Var3 = jw7Var;
            jw7Var4 = jw7Var2;
            if (jw7Var3.G != jw7Var4.G) {
                i2 |= FreeTypeConstants.FT_LOAD_MONOCHROME;
            }
            if (jw7Var3.H != jw7Var4.H) {
                i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
            }
            if (jw7Var3.I != jw7Var4.I) {
                i2 |= 16384;
            }
            String str3 = this.b;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair pairB3 = q34.b(jw7Var3);
                Pair pairB4 = q34.b(jw7Var4);
                if (pairB3 != null && pairB4 != null) {
                    int iIntValue = ((Integer) pairB3.first).intValue();
                    int iIntValue2 = ((Integer) pairB4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new to5(this.a, jw7Var3, jw7Var4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && pairB3.equals(pairB4)) {
                        return new to5(this.a, jw7Var3, jw7Var4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new to5(this.a, jw7Var3, jw7Var4, 3, 0);
            }
            if (!jw7Var3.b(jw7Var4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new to5(this.a, jw7Var3, jw7Var4, 1, 0);
            }
        }
        return new to5(this.a, jw7Var3, jw7Var4, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.content.Context r17, defpackage.jw7 r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6b.c(android.content.Context, jw7, boolean):boolean");
    }

    public final boolean d(jw7 jw7Var) {
        return (Objects.equals(jw7Var.o, "audio/flac") && jw7Var.I == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(Context context, jw7 jw7Var) {
        int i;
        String str = jw7Var.o;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(s6b.c(jw7Var))) || !c(context, jw7Var, true) || !d(jw7Var)) {
            return false;
        }
        if (this.i) {
            int i2 = jw7Var.v;
            if (i2 > 0 && (i = jw7Var.w) > 0) {
                return g(jw7Var.z, i2, i);
            }
        } else {
            int i3 = jw7Var.H;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i3 != -1) {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    h("sampleRate.support, " + i3);
                    return false;
                }
            }
            int i4 = jw7Var.G;
            if (i4 != -1) {
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                    int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    StringBuilder sbP = ij0.p("AssumedMaxChannelAdjustment: ", this.a, maxInputChannelCount, ", [", " to ");
                    sbP.append(i5);
                    sbP.append("]");
                    ysj.u("MediaCodecInfo", sbP.toString());
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    h("channelCount.support, " + i4);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(jw7 jw7Var) {
        if (this.i) {
            return this.e;
        }
        Pair pairB = q34.b(jw7Var);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(double r12, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6b.g(double, int, int):boolean");
    }

    public final void h(String str) {
        StringBuilder sbX = sq6.x("NoSupport [", str, "] [");
        sbX.append(this.a);
        sbX.append(", ");
        sbX.append(this.b);
        sbX.append("] [");
        sbX.append(tpi.a);
        sbX.append("]");
        ysj.i(sbX.toString());
    }

    public final String toString() {
        return this.a;
    }
}
