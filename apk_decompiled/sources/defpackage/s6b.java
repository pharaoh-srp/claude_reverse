package defpackage;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s6b {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        int i = 1;
        if ("audio/raw".equals(str)) {
            Collections.sort(arrayList, new u84(i, new rl7(21)));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((g6b) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((g6b) arrayList.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String c(jw7 jw7Var) {
        Pair pairB;
        String str = jw7Var.o;
        String str2 = jw7Var.o;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairB = q34.b(jw7Var)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                f54 f54Var = jw7Var.E;
                if (f54Var != null && f54Var.c == 6 && f54Var.b == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String d(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static synchronized List e(String str, boolean z, boolean z2) {
        try {
            q6b q6bVar = new q6b(str, z, z2);
            HashMap map = a;
            List list = (List) map.get(q6bVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListF = f(q6bVar, new at(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                arrayListF.isEmpty();
            }
            a(str, arrayListF);
            nz8 nz8VarQ = nz8.q(arrayListF);
            map.put(q6bVar, nz8VarQ);
            return nz8VarQ;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(defpackage.q6b r19, defpackage.at r20) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6b.f(q6b, at):java.util.ArrayList");
    }

    public static vde g(wg6 wg6Var, jw7 jw7Var, boolean z, boolean z2) {
        List listE = wg6Var.e(jw7Var.o, z, z2);
        String strC = c(jw7Var);
        List listE2 = strC == null ? vde.I : wg6Var.e(strC, z, z2);
        hz8 hz8VarO = nz8.o();
        hz8VarO.c(listE);
        hz8VarO.c(listE2);
        return hz8VarO.g();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (gkb.g(str)) {
            return true;
        }
        String strM = auk.m(mediaCodecInfo.getName());
        if (strM.startsWith("arc.")) {
            return false;
        }
        if (strM.startsWith("omx.google.") || strM.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strM.startsWith("omx.sec.") && strM.contains(".sw.")) || strM.equals("omx.qcom.video.decoder.hevcswvdec") || strM.startsWith("c2.android.") || strM.startsWith("c2.google.")) {
            return true;
        }
        return (strM.startsWith("omx.") || strM.startsWith("c2.")) ? false : true;
    }
}
