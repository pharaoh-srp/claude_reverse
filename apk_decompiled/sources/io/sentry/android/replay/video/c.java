package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import defpackage.bsg;
import defpackage.ts9;
import defpackage.zy7;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends ts9 implements zy7 {
    public static final c F = new c(0);

    @Override // defpackage.zy7
    public final Object a() {
        boolean z = false;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        codecInfos.getClass();
        int length = codecInfos.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String name = codecInfos[i].getName();
            name.getClass();
            if (bsg.u0(name, "c2.exynos", false)) {
                z = true;
                break;
            }
            i++;
        }
        return Boolean.valueOf(z);
    }
}
