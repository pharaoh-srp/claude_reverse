package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class n30 implements zfa {
    public final boolean a(sfa sfaVar, String str) {
        return sfaVar.E >= 2;
    }

    public final void b(sfa sfaVar, String str, String str2) {
        int iMin;
        int i = sfaVar.E;
        if (str2.length() < 4000) {
            if (i == 7) {
                Log.wtf(str, str2);
                return;
            } else {
                Log.println(i, str, str2);
                return;
            }
        }
        int length = str2.length();
        int i2 = 0;
        while (i2 < length) {
            int iF0 = bsg.F0(str2, '\n', i2, 4);
            if (iF0 == -1) {
                iF0 = length;
            }
            while (true) {
                iMin = Math.min(iF0, i2 + 4000);
                String strSubstring = str2.substring(i2, iMin);
                if (i == 7) {
                    Log.wtf(str, strSubstring);
                } else {
                    Log.println(i, str, strSubstring);
                }
                if (iMin >= iF0) {
                    break;
                } else {
                    i2 = iMin;
                }
            }
            i2 = iMin + 1;
        }
    }
}
