package defpackage;

import android.media.AudioManager;
import android.media.AudioPlaybackConfiguration;
import android.media.AudioRecordingConfiguration;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gwk {
    public static final aci A;
    public static final o54 B;
    public static final o54 C;
    public static final q0g D;
    public static final o54 E;
    public static final o54 a = o54.W;
    public static final float b = 568.0f;
    public static final q0g c = q0g.E;
    public static final float d = 360.0f;
    public static final float e = 40.0f;
    public static final q0g f;
    public static final float g;
    public static final aci h;
    public static final o54 i;
    public static final o54 j;
    public static final o54 k;
    public static final float l;
    public static final o54 m;
    public static final o54 n;
    public static final float o;
    public static final o54 p;
    public static final aci q;
    public static final o54 r;
    public static final aci s;
    public static final o54 t;
    public static final o54 u;
    public static final o54 v;
    public static final o54 w;
    public static final aci x;
    public static final float y;
    public static final float z;

    static {
        q0g q0gVar = q0g.I;
        f = q0gVar;
        g = 40.0f;
        aci aciVar = aci.E;
        h = aciVar;
        o54 o54Var = o54.P;
        i = o54Var;
        o54 o54Var2 = o54.I;
        j = o54Var2;
        k = o54Var;
        l = 1.0f;
        m = o54Var;
        o54 o54Var3 = o54.L;
        n = o54Var3;
        o = 120.0f;
        o54 o54Var4 = o54.M;
        p = o54Var4;
        q = aci.H;
        r = o54Var4;
        s = aci.J;
        t = o54.T;
        u = o54.K;
        v = o54Var4;
        w = o54Var3;
        x = aciVar;
        y = 36.0f;
        z = 72.0f;
        A = aciVar;
        B = o54Var;
        C = o54Var2;
        D = q0gVar;
        E = o54Var4;
    }

    public gwk(rgg rggVar) {
        rggVar.getClass();
    }

    public static final void a(boolean z2, ta4 ta4Var, ld4 ld4Var, int i2, int i3) {
        int i4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1809443348);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (e18Var.g(z2) ? 4 : 2) | i2;
        }
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                z2 = true;
            }
            xe4 xe4Var = uif.a;
            sif sifVar = (sif) e18Var.j(xe4Var);
            if (z2) {
                sifVar = null;
            }
            j8.c(xe4Var.a(sifVar), ta4Var, e18Var, 48);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new gn3(z2, ta4Var, i2, i3);
        }
    }

    public static int b(int i2, int i3, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i3, i2);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            h5b h5bVar = (h5b) list.get(i4);
            float F = dch.F(dch.D(h5bVar));
            if (F == MTTypesetterKt.kLineSkipLimitMultiplier) {
                int iMin2 = Math.min(h5bVar.o(Integer.MAX_VALUE), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, h5bVar.a(iMin2));
            } else if (F > MTTypesetterKt.kLineSkipLimitMultiplier) {
                f2 += F;
            }
        }
        int iRound = f2 == MTTypesetterKt.kLineSkipLimitMultiplier ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - iMin, 0) / f2);
        int size2 = list2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            h5b h5bVar2 = (h5b) list.get(i5);
            float F2 = dch.F(dch.D(h5bVar2));
            if (F2 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                iMax = Math.max(iMax, h5bVar2.a(iRound != Integer.MAX_VALUE ? Math.round(iRound * F2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public static int c(int i2, int i3, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            h5b h5bVar = (h5b) list.get(i5);
            float F = dch.F(dch.D(h5bVar));
            int iO = h5bVar.o(i2);
            if (F == MTTypesetterKt.kLineSkipLimitMultiplier) {
                i4 += iO;
            } else if (F > MTTypesetterKt.kLineSkipLimitMultiplier) {
                f2 += F;
                iMax = Math.max(iMax, Math.round(iO / F));
            }
        }
        return ((list.size() - 1) * i3) + Math.round(iMax * f2) + i4;
    }

    public static int d(int i2, int i3, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i3, i2);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            h5b h5bVar = (h5b) list.get(i4);
            float F = dch.F(dch.D(h5bVar));
            if (F == MTTypesetterKt.kLineSkipLimitMultiplier) {
                int iMin2 = Math.min(h5bVar.o(Integer.MAX_VALUE), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, h5bVar.Q(iMin2));
            } else if (F > MTTypesetterKt.kLineSkipLimitMultiplier) {
                f2 += F;
            }
        }
        int iRound = f2 == MTTypesetterKt.kLineSkipLimitMultiplier ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - iMin, 0) / f2);
        int size2 = list2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            h5b h5bVar2 = (h5b) list.get(i5);
            float F2 = dch.F(dch.D(h5bVar2));
            if (F2 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                iMax = Math.max(iMax, h5bVar2.Q(iRound != Integer.MAX_VALUE ? Math.round(iRound * F2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public static int e(int i2, int i3, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            h5b h5bVar = (h5b) list.get(i5);
            float F = dch.F(dch.D(h5bVar));
            int iL = h5bVar.l(i2);
            if (F == MTTypesetterKt.kLineSkipLimitMultiplier) {
                i4 += iL;
            } else if (F > MTTypesetterKt.kLineSkipLimitMultiplier) {
                f2 += F;
                iMax = Math.max(iMax, Math.round(iL / F));
            }
        }
        return ((list.size() - 1) * i3) + Math.round(iMax * f2) + i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.yih r59, final defpackage.iqb r60, defpackage.bt7 r61, boolean r62, final java.lang.String r63, defpackage.tkh r64, long r65, long r67, long r69, long r71, long r73, defpackage.mnc r75, defpackage.e0g r76, defpackage.ld4 r77, final int r78, final int r79) {
        /*
            Method dump skipped, instruction units count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwk.f(yih, iqb, bt7, boolean, java.lang.String, tkh, long, long, long, long, long, mnc, e0g, ld4, int, int):void");
    }

    public static int g(int i2, int i3, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            h5b h5bVar = (h5b) list.get(i5);
            float F = dch.F(dch.D(h5bVar));
            int iA = h5bVar.a(i2);
            if (F == MTTypesetterKt.kLineSkipLimitMultiplier) {
                i4 += iA;
            } else if (F > MTTypesetterKt.kLineSkipLimitMultiplier) {
                f2 += F;
                iMax = Math.max(iMax, Math.round(iA / F));
            }
        }
        return ((list.size() - 1) * i3) + Math.round(iMax * f2) + i4;
    }

    public static int h(int i2, int i3, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i3, i2);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            h5b h5bVar = (h5b) list.get(i4);
            float F = dch.F(dch.D(h5bVar));
            if (F == MTTypesetterKt.kLineSkipLimitMultiplier) {
                int iMin2 = Math.min(h5bVar.a(Integer.MAX_VALUE), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, h5bVar.o(iMin2));
            } else if (F > MTTypesetterKt.kLineSkipLimitMultiplier) {
                f2 += F;
            }
        }
        int iRound = f2 == MTTypesetterKt.kLineSkipLimitMultiplier ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - iMin, 0) / f2);
        int size2 = list2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            h5b h5bVar2 = (h5b) list.get(i5);
            float F2 = dch.F(dch.D(h5bVar2));
            if (F2 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                iMax = Math.max(iMax, h5bVar2.o(iRound != Integer.MAX_VALUE ? Math.round(iRound * F2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public static int i(int i2, int i3, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            h5b h5bVar = (h5b) list.get(i5);
            float F = dch.F(dch.D(h5bVar));
            int iQ = h5bVar.Q(i2);
            if (F == MTTypesetterKt.kLineSkipLimitMultiplier) {
                i4 += iQ;
            } else if (F > MTTypesetterKt.kLineSkipLimitMultiplier) {
                f2 += F;
                iMax = Math.max(iMax, Math.round(iQ / F));
            }
        }
        return ((list.size() - 1) * i3) + Math.round(iMax * f2) + i4;
    }

    public static int j(int i2, int i3, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i3, i2);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            h5b h5bVar = (h5b) list.get(i4);
            float F = dch.F(dch.D(h5bVar));
            if (F == MTTypesetterKt.kLineSkipLimitMultiplier) {
                int iMin2 = Math.min(h5bVar.a(Integer.MAX_VALUE), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, h5bVar.l(iMin2));
            } else if (F > MTTypesetterKt.kLineSkipLimitMultiplier) {
                f2 += F;
            }
        }
        int iRound = f2 == MTTypesetterKt.kLineSkipLimitMultiplier ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - iMin, 0) / f2);
        int size2 = list2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            h5b h5bVar2 = (h5b) list.get(i5);
            float F2 = dch.F(dch.D(h5bVar2));
            if (F2 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                iMax = Math.max(iMax, h5bVar2.l(iRound != Integer.MAX_VALUE ? Math.round(iRound * F2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public static final List k(AudioManager audioManager) {
        audioManager.getClass();
        try {
            List<AudioPlaybackConfiguration> activePlaybackConfigurations = audioManager.getActivePlaybackConfigurations();
            activePlaybackConfigurations.getClass();
            List<AudioPlaybackConfiguration> list = activePlaybackConfigurations;
            ArrayList arrayList = new ArrayList(x44.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m(((AudioPlaybackConfiguration) it.next()).getAudioAttributes().getUsage()));
            }
            return arrayList;
        } catch (Exception unused) {
            return lm6.E;
        }
    }

    public static final List l(AudioManager audioManager) {
        String strP;
        audioManager.getClass();
        try {
            List<AudioRecordingConfiguration> activeRecordingConfigurations = audioManager.getActiveRecordingConfigurations();
            activeRecordingConfigurations.getClass();
            List<AudioRecordingConfiguration> list = activeRecordingConfigurations;
            ArrayList arrayList = new ArrayList(x44.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int clientAudioSource = ((AudioRecordingConfiguration) it.next()).getClientAudioSource();
                switch (clientAudioSource) {
                    case 0:
                        strP = "DEFAULT";
                        break;
                    case 1:
                        strP = "MIC";
                        break;
                    case 2:
                        strP = "VOICE_UPLINK";
                        break;
                    case 3:
                        strP = "VOICE_DOWNLINK";
                        break;
                    case 4:
                        strP = "VOICE_CALL";
                        break;
                    case 5:
                        strP = "CAMCORDER";
                        break;
                    case 6:
                        strP = "VOICE_RECOGNITION";
                        break;
                    case 7:
                        strP = "VOICE_COMMUNICATION";
                        break;
                    case 8:
                    default:
                        strP = grc.p(clientAudioSource, "SOURCE_");
                        break;
                    case 9:
                        strP = "UNPROCESSED";
                        break;
                    case 10:
                        strP = "VOICE_PERFORMANCE";
                        break;
                }
                arrayList.add(strP);
            }
            return arrayList;
        } catch (Exception unused) {
            return lm6.E;
        }
    }

    public static final String m(int i2) {
        switch (i2) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
            case 8:
            case 9:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            default:
                return grc.p(i2, "USAGE_");
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    public static final int n(int i2) {
        if (i2 == 0) {
            throw null;
        }
        int iF = sq6.F(i2);
        if (iF == 0) {
            return 3;
        }
        if (iF == 1) {
            return 1;
        }
        if (iF == 2) {
            return 2;
        }
        wg6.i();
        return 0;
    }

    public boolean o() {
        throw null;
    }
}
